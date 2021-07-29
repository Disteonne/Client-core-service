package com.disteonne.application.rest;

import com.disteonne.application.core.model.Client;
import com.disteonne.application.core.model.ClientBuilder;
import org.apache.catalina.connector.Response;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static com.disteonne.application.core.ApiConstants.*;

@RestController
@RequestMapping(CLIENT_CORE_SERVICE + V1 + CLIENT_MANAGEMENT + CLIENT)
public class ClientResource {

    @RequestMapping(value = SLASH + ID, method = RequestMethod.GET)
    public @ResponseBody
    Client getClientById(@PathVariable(name = "id") String id, HttpServletRequest request) {
        return null;
    }

    @RequestMapping(value = SLASH, method = RequestMethod.GET)
    public @ResponseBody
    List<Client> getAllClients(HttpServletRequest request) {
        return null;
    }

    @RequestMapping(value = SLASH, method = RequestMethod.POST)
    public @ResponseBody
    Client createClient(@RequestBody Client client) {
        return null;
    }

    @RequestMapping(value = SLASH, method = RequestMethod.PATCH)
    public @ResponseBody
    Client patchClient(@RequestBody Client client) {
        return null;
    }

    @RequestMapping(value = SLASH + ID, method = RequestMethod.DELETE)
    public Response deleteClientById(@PathVariable(name = "id") String id, HttpServletRequest request) {
        return null;
    }
}
