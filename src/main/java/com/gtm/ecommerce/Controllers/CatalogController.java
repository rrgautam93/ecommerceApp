package com.gtm.ecommerce.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogController {

    @RequestMapping("/")
    public String home(){
        return "Yay";
    }
    //get all products



}
