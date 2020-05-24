package lalaLand.main.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class mainController {
    @RequestMapping(value="/main.do")
    public String mainPage(HttpServletRequest request, ModelMap model)throws Exception{
        System.out.println("??");
        return "/web/main";
    }
}
