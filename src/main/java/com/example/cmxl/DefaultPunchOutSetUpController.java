package com.example.cmxl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.logging.Logger;

@RestController
@RequestMapping(value = "/punchout/cxml/setup")
public class DefaultPunchOutSetUpController {

    @RequestMapping(method = { RequestMethod.POST, RequestMethod.GET }, produces = { "application/xml;charset=UTF-8", "text/xml;charset=UTF-8" })
    public Object handlePunchOutSetUpRequest(@RequestBody final String requestBody) throws IOException {
        return requestBody.toString();
    }
}
