package org.expert.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class adminController {
    @RequestMapping("/admin")
    public String admin(){
        return "/backs/admins/admin";
    }
}
