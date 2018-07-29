package com.wlgdo.swagger.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "auth", method = RequestMethod.GET)
    public Object auth(String authMsg) {

        logger.info("This is a auth test......");
        return authMsg;
    }
}
