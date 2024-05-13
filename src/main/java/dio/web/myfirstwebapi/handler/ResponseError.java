package dio.web.myfirstwebapi.handler;

import lombok.Data;

import java.util.Date;

@Data
public class ResponseError {
    private Date timestamp = new Date();
    private String status = "error";
    private int statusCode = 400;
    private String error;
}
