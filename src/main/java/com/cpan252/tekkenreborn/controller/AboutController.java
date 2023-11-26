package com.cpan252.tekkenreborn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
/**
 * This request mapping annotation shows that all requests to the /about
 * endpoint will be mapped to
 * this controller
 */
@RequestMapping("/about")
public class AboutController {

    @GetMapping
    public String about() {
        return "about";
    }
}
