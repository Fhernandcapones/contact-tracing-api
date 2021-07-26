package contact.v1.controller;


import contact.v1.controller.dto.HttpCTResponse;
import contact.v1.controller.mapper.CTSaveMapper;
import contact.v1.service.CTService;
import contact.v1.service.dto.CTRequest;
import io.reactivex.rxjava3.core.Single;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;


@RestController
@RequestMapping("/api/CTapi")
@CrossOrigin(origins = {"http://localhost:9085",}, maxAge = 3000)
public class CTController {
    private final static Logger log = LoggerFactory.getLogger(CTController.class);
    @Autowired
    private CTSaveMapper mapper;
    @Autowired
    private CTService ctService;


    @PostMapping("/save")
    public Single<ResponseEntity<HttpCTResponse>> createCt(@Valid @RequestBody CTRequest request){



       if (request == null){
            log.error("Invalid input");
           HttpCTResponse createUserResponse = mapper.failResponse();
           return Single.just(new ResponseEntity<>(createUserResponse, HttpStatus.OK));
   }

           log.info("Save successfully");
           System.out.println("Save Successfully");
           return ctService.saveUser(new CTRequest(
                   request.getImage(),
                   request.getFirstname(),
                   request.getLastname(),
                   request.getMiddle_name(),
                   request.getAge(),
                   request.getAddress(),
                   request.getDescription(),
                   request.getPhone_number(),
                   request.getEmail()
           ))
                   .flatMap(response ->{

                       HttpCTResponse createUserResponse = mapper.successResponse();
                       return Single.just(new ResponseEntity<>(createUserResponse, HttpStatus.OK));
                   });



       }




}





