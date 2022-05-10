package nathany3g.aidememoires.springboot.topics.responsecodes;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("some-resource")
public class ResourceController {    
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED) // Return HTTP status code of 201 (Created) instead of 200 (OK)
    public UUID createResource() {
        return UUID.randomUUID();
    }
}
