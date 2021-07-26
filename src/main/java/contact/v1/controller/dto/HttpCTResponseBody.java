package contact.v1.controller.dto;

import lombok.Data;

@Data
public class HttpCTResponseBody {
    private String
            resultStatus,
            statusCode;
    private HttpCTbody
            body;
}
