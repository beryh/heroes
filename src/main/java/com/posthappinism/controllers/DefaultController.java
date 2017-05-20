package com.posthappinism.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by yh958 on 2017-05-20.
 */
@Controller
public class DefaultController {
    public String homepage2(ModelMap model, HttpServletRequest request, HttpServletResponse response){
        return "mainpage";
    }
}