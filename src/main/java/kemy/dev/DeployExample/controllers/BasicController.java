package kemy.dev.DeployExample.controllers;

import kemy.dev.DeployExample.services.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/random-numbers")
public class BasicController {
    @Autowired
    BasicService basicService;

    @GetMapping("/sum")
    public String sumRandomNumbers(){
        return basicService.sumRandomNumbers();
    }
}
