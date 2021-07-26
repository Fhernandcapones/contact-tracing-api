package contact.v1.mapper;


import contact.v1.domain.CTEntity;
import contact.v1.service.dto.CTRequest;
import org.springframework.stereotype.Component;

@Component
public class CTCreateMapper {


    public CTEntity fromCTDtoToCTEntity(CTRequest request) {
        CTEntity userss = new CTEntity();
        userss.setImage_path(request.getImage());
        userss.setFirstname(request.getFirstname());
        userss.setLastname(request.getLastname());
        userss.setMiddle_name(request.getMiddle_name());
        userss.setAge(request.getAge());
        userss.setAddress(request.getAddress());
        userss.setDescription(request.getDescription());
        userss.setPhone_number(request.getPhone_number());
        userss.setEmail(request.getEmail());
        return userss;
    }
}

