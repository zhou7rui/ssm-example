/*
 * Copyright (C) zhourui Company, 2017.All Rights Reserved.
 */

package xyz.zrui.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("")
    public String index(){
        return  "index";
    }

}
