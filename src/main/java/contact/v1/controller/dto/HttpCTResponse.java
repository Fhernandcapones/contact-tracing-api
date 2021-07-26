package contact.v1.controller.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HttpCTResponse {
    private HttpCTResponseBody
            response;

}
