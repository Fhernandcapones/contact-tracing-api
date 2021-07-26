package contact.v1.service.Impl;


import contact.v1.domain.CTEntity;
import contact.v1.mapper.CTCreateMapper;
import contact.v1.repository.CTRepository;
import contact.v1.service.CTService;
import contact.v1.service.dto.CTRequest;
import contact.v1.service.dto.CTResponse;
import contact.v1.service.mapper.CTServiceMapper;
import io.reactivex.rxjava3.core.Single;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CTServiceImpl implements CTService {

    @Autowired
    private CTRepository ctRepository;
    @Autowired
    private CTCreateMapper saveMapper;
    @Autowired
    private CTServiceMapper mapper;

    @Override
    public Single<CTResponse> saveUser(CTRequest request) {
        CTEntity users = this.saveMapper.fromCTDtoToCTEntity(request);
        CTEntity createdUser = this.ctRepository.save(users);
        CTResponse createUserResponse = mapper.createUserResponse(createdUser);
        return Single.just(createUserResponse)
                .flatMap(response -> {
                    CTResponse userResponse = new CTResponse();
                    userResponse.setImage(response.getImage());
                    userResponse.setFirstName(response.getFirstName());
                    userResponse.setLastName(response.getLastName());
                    userResponse.setMiddle_name(response.getMiddle_name());
                    userResponse.setAge(response.getAge());
                    userResponse.setAddress(response.getAddress());
                    userResponse.setDescription(response.getDescription());
                    userResponse.setPhoneNumber(response.getPhoneNumber());
                    userResponse.setEmail(response.getEmail());
                    return Single.just(userResponse);
                });

    }


}
