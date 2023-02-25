package jenga.jenga.controller;

import jenga.jenga.dto.Response;
import jenga.jenga.service.ApiService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/jenga/")
public class IndexController {

    @Autowired
    private ApiService apiService;

    @GetMapping("")
    public Response index() {
        return apiService.getResponseBody();
    }

}
