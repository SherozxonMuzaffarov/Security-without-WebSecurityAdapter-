package uzvagontamir.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import uzvagontamir.repository.UserRepository;
import uzvagontamir.service.DatabaseLoader;

@Controller
public class MainController {

    @Autowired
    DatabaseLoader databaseLoader;

    @Autowired
    UserRepository userRepository;

    @GetMapping("")
    public String viewHomePage(){
        return "index";
    }

    @GetMapping("/admin/login")
    public String viewAdminLoginPage(){
        return "admin_login";
    }

    @GetMapping("/user/login")
    public String viewUserLoginPage(){
        return "user_login";
    }

    @GetMapping("/admin/home")
    public String viewAdminHomePage(){

        return "admin_home";
    }
    @GetMapping("/user/home")
    public String viewUserHomePage(){
        return "user_home";
    }
    @GetMapping("/admin/users")
    public String viewAllUser(Model model){
        model.addAttribute("users",userRepository.findAll());
        return "all_users";
    }

//    @GetMapping("/")
//    public String loginPage(Model model){
//       LoginDto loginDto  = new LoginDto();
//       model.addAttribute(loginDto);
//       return "loginPage";
//    }

//    @PreAuthorize(value = "hasRole('ROLE_ADMIN')")
//    @GetMapping("/api/main")
//    public String home( Model model){
//        return "main";
//    }
//
////    @PreAuthorize(value = "hasRole('ADMIN')")
//    @GetMapping("/api/myProfil")
//    public String myProfil(HttpServletRequest request, Model model){
//        return "profil";
//    }

}
