package contact.v1.service.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Data
public class CTRequest {
    @NotBlank(message = "you cannot empty image")
    private String image;
    @NotBlank(message = "you cannot empty firstname")
    private String firstname;
    @NotBlank(message = "you cannot empty lastname")
    private String lastname;
    @NotBlank(message = "you cannot empty middle name")
    private String middle_name;
    @NotBlank(message = "you cannot empty address")
    private String address;
    @NotBlank(message = "you cannot empty description")
    private String description;
    @NotNull(message = "you cannot empty message")
    private Integer age;
    @NotNull(message = "you cannot empty phone number")
    private Long phone_number;
    @NotBlank(message = "you cannot empty email")
    private String email;

    public CTRequest(String image, String firstname, String lastname, String middle_name, Integer age, String address, String description,  Long phone_number, String email) {
        this.image = image;
        this.firstname = firstname;
        this.lastname = lastname;
        this.middle_name = middle_name;
        this.age = age;
        this.address = address;
        this.description = description;
        this.phone_number = phone_number;
        this.email = email;

    }

}
