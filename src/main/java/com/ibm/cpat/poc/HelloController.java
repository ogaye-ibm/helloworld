package com.ibm.cpat.poc;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
@Slf4j
public class HelloController {

    @Value("${demo.name}")
    private String name;

    private String greeting;

    @GetMapping(path = "/hello")
    public String sayHello() {

        greeting = String.format("Hello %s", name);
        log.info("************** {}", greeting);

        return greeting;
    }
}
