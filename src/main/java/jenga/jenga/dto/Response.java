package jenga.jenga.dto;

import jenga.jenga.enums.HttpStatusCode;
import jenga.jenga.enums.StatusMessage;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Response {
    private String apiVersion;
    private String updated;
    private StatusMessage statusMessage;
    private HttpStatusCode statusCode;
    private ErrorMessage errorMessage;
    private Object data;

    public Response(String apiVersion, String updated, StatusMessage statusMessage, HttpStatusCode statusCode) {
        this.apiVersion = apiVersion;
        this.updated = updated;
        this.statusMessage = statusMessage;
        this.statusCode = statusCode;
    }
}
