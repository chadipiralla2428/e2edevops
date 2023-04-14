package com.example.e2edevops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/devops")
public class DevopsController {
    @GetMapping()
    public String demo(){
        return "welcome to devops demo";
    }
}
