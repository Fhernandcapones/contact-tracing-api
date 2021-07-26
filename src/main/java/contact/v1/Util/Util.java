package contact.v1.Util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class Util {
    private final static Logger log = LoggerFactory.getLogger(Util.class);




    public String timeStamp(){

         LocalDateTime timestamp;
         DateTimeFormatter dateTimeFormatter;

        timestamp = LocalDateTime.now();
        dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        log.info("TimeStamp ni business logic: "+timestamp.format(dateTimeFormatter));
        return timestamp.format(dateTimeFormatter);
    }
}
