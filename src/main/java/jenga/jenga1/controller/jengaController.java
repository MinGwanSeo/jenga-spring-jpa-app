package jenga.jenga1.controller;

import jenga.jenga1.model.JengaVO;
import jenga.jenga1.service.jengaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Map;

@RestController // json 형태 겨로가값을 반환해줌, @ResponseBody가 필요없음
@RequiredArgsConstructor // final 객체를 Constructor Injection 해줌.
@RequestMapping("/jenga/v1")
public class jengaController {

    @Autowired
    private jengaService jengaService;


    @GetMapping("/getStringMethod")
    public String getRequest() {
        return "jenga Start!";
    }

    @GetMapping("/getParam")
    public String getParameter(@RequestParam(name = "parm1") String parm1) {
        return "parm1 : " + parm1;
    }

    @GetMapping("/user")
    public JengaVO getUser(@RequestParam(name = "username") String user_name) {

        JengaVO jengaVO = jengaService.getJengaData();
        jengaVO.setApi_version("1.0");
        jengaVO.setUpdated(LocalDate.of(2023, 2, 15));
        jengaVO.setResult(true);

        return jengaVO;
    }
}
