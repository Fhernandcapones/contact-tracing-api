package contact.v1.service.dto;

import lombok.Data;

import java.util.Date;


@Data
public class CTResponse {
    private String
            firstName,
            lastName,
            address,
            image,
            description,
            email,
            middle_name;
    private Date
          created;
    private Integer
            age;
    private Long
            phoneNumber;

}
