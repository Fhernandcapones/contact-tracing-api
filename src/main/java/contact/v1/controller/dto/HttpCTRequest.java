package contact.v1.controller.dto;

import lombok.Data;

import java.util.Date;


@Data
public class HttpCTRequest {
    private String
            firstName,
            lastName,
            address,
            middle_name,
            description,
            email;
    private Date
            date_created;
    private Integer age;
    private Long phoneNumber;
}
