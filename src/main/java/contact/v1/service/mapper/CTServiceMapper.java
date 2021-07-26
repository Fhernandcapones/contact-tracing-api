package contact.v1.service.mapper;


import contact.v1.domain.CTEntity;
import contact.v1.service.dto.CTResponse;
import org.springframework.stereotype.Component;

@Component
public class CTServiceMapper {
    public CTResponse createUserResponse(CTEntity createdUser){
        CTResponse response = new CTResponse();
        response.setFirstName(createdUser.getFirstname());
        response.setLastName(createdUser.getLastname());
        response.setMiddle_name(createdUser.getMiddle_name());
        response.setAge(createdUser.getAge());
        response.setAddress(createdUser.getAddress());
        response.setImage(createdUser.getImage_path());
        response.setPhoneNumber(createdUser.getPhone_number());
        response.setCreated(createdUser.getDate_created());
        response.setDescription(createdUser.getDescription());
        response.setEmail(createdUser.getEmail());
        return response;
    }



}
