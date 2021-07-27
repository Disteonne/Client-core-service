package com.disteonne.application.rest;

import com.disteonne.application.core.ApiConstants;
import com.disteonne.application.core.model.Client;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

import static com.disteonne.application.core.ApiConstants.*;

@RestController
@RequestMapping(CLIENT_CORE_SERVICE + V1 + CLIENT)
public class ClientResource {

    @RequestMapping(value = SLASH, method = RequestMethod.GET)
    public Client get() {
        return new Client("name",16, List.of("first"), LocalDate.now(),LocalDate.now(), ApiConstants.Roles.ROLE_USER);
    }
    //get
    //set
    //patch
    //delete
}
