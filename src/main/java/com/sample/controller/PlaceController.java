package com.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("place")
public class PlaceController {

    @GetMapping
    String list(Model model){
        model.addAttribute("placeList", "placeList");
        return "place/list";
    }

}
