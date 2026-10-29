package org.dev.loging_using_slf4j.Controller;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class DemoController {
//    private static final Logger log = LoggerFactory.getLogger(DemoController.class);

    @GetMapping("/")
    public String demo(){
        log.info("Demo started");
        return "Welcome back...";

    }
}
