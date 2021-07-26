package contact.v1.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class CTValidation {
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
    private String message;
}
