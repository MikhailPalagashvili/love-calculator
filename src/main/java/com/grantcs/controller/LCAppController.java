package com.grantcs.controller;

import com.grantcs.api.UserInfoDTO;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class LCAppController {

    @RequestMapping("/")
    public String showHomePage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO) {
        return "home-page";
    }

    @RequestMapping("/process-homepage")
    public String processHomePage(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            List<ObjectError> allErrors = bindingResult.getAllErrors();
            for (ObjectError objectError : allErrors)
                System.out.println(objectError);
            return "home-page";
        }

        System.out.println("No errors...");
        return "result-page";
    }

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        System.out.println("inside initBinder method");
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(false);
        webDataBinder.registerCustomEditor(String.class, "userName", stringTrimmerEditor);
        webDataBinder.registerCustomEditor(String.class, "crushName", stringTrimmerEditor);
    }
}
