package com.Namdeo.SportyShoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.Namdeo.SportyShoes.entity.Login;
import com.Namdeo.SportyShoes.service.LoginService;
@Controller
public class LoginController {
@Autowired
private LoginService ls;
@GetMapping("/")
public ModelAndView login() {
ModelAndView mav = new ModelAndView("login");
mav.addObject("user", new Login());
return mav;
}
@PostMapping("/adminlogin")
public String signUp(@ModelAttribute("user") Login user ) {
Login oauthUser = null;
System.out.println("from login"+ user);
if(user.getPassword() != "" ) {
System.out.println("logging in");
oauthUser = ls.signgin(user.getUsername(), user.getPassword());
return "menu";
} else {
if (user.getNewPassword() != "" ) {
System.out.println("Changing new password");
oauthUser = ls.changePassword(user.getUsername(), user.getNewPassword());
if(oauthUser == null ) {
return "invalid_credentials";
}
return "menu";
}
return "invalid_credentials";
} 
}
@RequestMapping("/logout")
public String logoutDo()
{
return "conform_logout";
}
/* @GetMapping("/forgotpw")
public String resetPassword1(@ModelAttribute("change") Login change ) {
System.out.println("from login"+ change);
Boolean oauthUser = ls.changePassword(change.getUsername(), change.getPassword());
System.out.print(oauthUser);
if(Objects.nonNull(oauthUser)) 
{
return "menu";
} else {
return "invalid_credentials";
}}*/
}