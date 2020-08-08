package com.springboot.bug;


import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/token")
@Validated
public class TokenController {

    @GetMapping("/base")
    public String getBaseToken() {
        return "success";
    }


}
