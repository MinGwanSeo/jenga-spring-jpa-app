package jenga.jenga.service;

import jenga.jenga.dto.Response;
import jenga.jenga.repository.ApiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApiService {

    @Autowired
    private ApiRepository apiRepository;

    public Response getResponseBody() {
        return apiRepository.getResponse();
    }

}
