package jenga.jenga1.controller;

import jenga.jenga1.service.jengaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class jengaController {

    private jengaService jengaService;

    @GetMapping("/jenga")
    public Map<String, Object> jengaController() {
        return jengaService.getJengaData();
    }
}
