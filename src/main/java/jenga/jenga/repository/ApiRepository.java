package jenga.jenga.repository;

import jenga.jenga.dto.Response;
import jenga.jenga.enums.HttpStatusCode;
import jenga.jenga.enums.StatusMessage;
import org.springframework.stereotype.Repository;

@Repository
public class ApiRepository {
    public static final String apiVersion = "1.0";
    public static final String updated = "2023-02-25";
    public Response getResponse() {
        Response response = new Response(apiVersion,  updated, StatusMessage.OK, HttpStatusCode.$200);
        return response;
    }
}
