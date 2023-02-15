package jenga.jenga1.model;


import java.time.LocalDate;

public class JengaVO {
    private String api_version;
    private LocalDate updated;
    private Boolean result;
//    private RequestNumer status;
    private Object data;  // "data" : { ... }

    public JengaVO() {
    }

    public JengaVO(String api_version, LocalDate updated) {
        this.api_version = api_version;
        this.updated = updated;
    }

    public String getApi_version() {
        return api_version;
    }

    public void setApi_version(String api_version) {
        this.api_version = api_version;
    }

    public LocalDate getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDate updated) {
        this.updated = updated;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
