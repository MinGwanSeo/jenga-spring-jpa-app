package jenga.jenga1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Set;

@RestController // json 형태 결과 값을 반환해줌
@RequestMapping("/jenga-api/v1")
public class jengaController {

    @Autowired


    @GetMapping(value = "/getStringMethod")
    public String getRequest() {
        return "jenga Start!";
    }

    @GetMapping(value = "/user")
    public String getUser(@RequestParam Map<String, String> param) {
        String[] userParamArray = new String[] {"userName", "aroundUserNumber"};
        param.forEach((key, value) -> {
            System.out.println(key);
            System.out.println(value);
        });
        Set<String> set = param.keySet();
        if (set.contains(userParamArray[0])) { // url parms 에서
//            TODO : 예외처리 필요함.
            System.out.println("error! userName 이 없습니다.");
        } else {

        }
    }

}
