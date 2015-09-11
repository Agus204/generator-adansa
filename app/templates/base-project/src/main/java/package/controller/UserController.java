package <%= properties.packageName %>.controller;

import java.security.Principal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/me")
    public Principal me(Principal user) {
        return user;
    }
}
