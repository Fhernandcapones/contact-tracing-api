package contact.v1.controller.mapper;

import contact.v1.controller.dto.HttpCTResponse;
import contact.v1.controller.dto.HttpCTResponseBody;
import contact.v1.controller.dto.HttpCTbody;
import org.springframework.stereotype.Component;

@Component
public class CTSaveMapper {

    public HttpCTResponse failResponse (){
        HttpCTbody body = new HttpCTbody();

        body.setMessage("INVALID INPUT");
        HttpCTResponseBody responseBody = new HttpCTResponseBody();
        responseBody.setResultStatus("FAIL");
        responseBody.setStatusCode("422");
        responseBody.setBody(body);

        HttpCTResponse createResponse = new HttpCTResponse();
        createResponse.setResponse(responseBody);
        return createResponse;
    }
    public HttpCTResponse successResponse(){
        HttpCTbody body = new HttpCTbody();
        body.setMessage("Save successfully!");
        HttpCTResponseBody responseBody = new HttpCTResponseBody();
        responseBody.setResultStatus("SUCCESS");
        responseBody.setStatusCode("200");
        responseBody.setBody(body);
        HttpCTResponse createResponse = new HttpCTResponse();
        createResponse.setResponse(responseBody);
        return createResponse;
    }
}
