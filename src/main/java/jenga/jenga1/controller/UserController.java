package jenga.jenga1.controller;

import jenga.jenga1.dto.UserDTO;
import jenga.jenga1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/api/v1/jenga-user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/user")
    public UserDTO getUser(@RequestParam Map<String, String> param) {
        String[] userParamArray = new String[] {"userName", "aroundUserNumber"};
        param.forEach((key, value) -> {
            System.out.println(key);
            System.out.println(value);
        });

        Set<String> set = param.keySet();
        String tmp = null;
        if (!set.contains(userParamArray[0])) { // url parms 에서
//            TODO : 예외처리 필요함.
            tmp ="error! userName 이 없습니다.";
            System.out.println(tmp);
        }

        if (set.contains(userParamArray[1])) {
//            user 1명 정보 불러오기

        } else {
//            user 1명 + aroundUserNumber 수만큼 정보 불러오기
        }

        return userService.getUserData(param.get(userParamArray[0]));
    }
}
