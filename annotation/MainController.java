package com.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MainController {

    @Value("${test-project.value1:default}")
    private String propertyValue;

    @GetMapping("/")
    public String mainMethod() {
        return propertyValue;
    }

}
