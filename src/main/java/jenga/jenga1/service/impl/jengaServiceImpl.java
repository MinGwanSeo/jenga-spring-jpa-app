package jenga.jenga1.service.impl;

import jenga.jenga1.service.jengaService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class jengaServiceImpl implements jengaService {

    @Override
    public Map<String, Object> getJengaData() {
        Map<String, Object> jsonObject = new HashMap<>();
        jsonObject.put("apiVersion", "1.0.0");
        jsonObject.put("updated", "2023-02-08");
        jsonObject.put("result", true);
        jsonObject.put("status", 200);
        jsonObject.put("around_users_number", 10);

        Map<String, Object> userData = new HashMap<>();

//        Map<String, Object> usersAllData = new HashMap<>();

//        usersAllData .put("user", );
//        jsonObject.put("data", usersAllData );

        return jsonObject;
    }
}
