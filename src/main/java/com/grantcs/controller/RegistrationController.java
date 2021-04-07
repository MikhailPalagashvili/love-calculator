package com.grantcs.controller;

import com.grantcs.api.UserRegistrationDTO;
import com.grantcs.propertyeditor.NamePropertyEditor;
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
public class RegistrationController {
    @RequestMapping("/register")
    public String showRegistrationPage(@ModelAttribute("userReg") UserRegistrationDTO userRegistrationDTO) {
        return "user-registration-page";
    }

    @RequestMapping("/registeration-success")
    public String processUserRegisteration(@Valid @ModelAttribute("userReg") UserRegistrationDTO userRegistrationDTO,
                                           BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println("my page has errors");
            List<ObjectError> allErrors = bindingResult.getAllErrors();
            for (ObjectError objectError : allErrors) System.out.println(objectError);
            return "user-registration-page";

        }
        System.out.println("Uppercased name is " + userRegistrationDTO.getName());
        return "registration-success";
    }

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        System.out.println("inside init binder...");
        NamePropertyEditor namePropertyEditor = new NamePropertyEditor();
        webDataBinder.registerCustomEditor(String.class, "name", namePropertyEditor);
    }
}
