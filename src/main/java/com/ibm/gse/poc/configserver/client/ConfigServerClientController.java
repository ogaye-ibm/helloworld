package com.ibm.gse.poc.configserver.client;


import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
@Slf4j
public class ConfigServerClientController {

    private String greeting;
    @GetMapping(path = "hello")
    public String sayHello(@RequestParam(value = "name", required = false) String name) {
        greeting = StringUtils.isEmpty(name)? "Hello stranger!!!" : String.format("Hello %s", name);
        log.info("************** {}", greeting);
        return greeting;
    }
}
