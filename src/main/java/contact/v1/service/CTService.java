package contact.v1.service;


import contact.v1.service.dto.CTRequest;
import contact.v1.service.dto.CTResponse;
import io.reactivex.rxjava3.core.Single;

public interface CTService {
    Single<CTResponse> saveUser(CTRequest createUserDto);
}
