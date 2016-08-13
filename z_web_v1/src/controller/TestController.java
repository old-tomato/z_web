package controller;

import mode.LoginCommand;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.logging.Logger;

/**
 * Created by zkl on 2016/8/13.
 */
@Controller
@RequestMapping("/view")
public class TestController {
    @RequestMapping(value = "/login")
    public ModelAndView loginPage() {
        Logger logger = Logger.getLogger("zkl");
        logger.info("login!!!!!!!!!!!!!!!");
        return new ModelAndView("/jsp/login");
    }

    @RequestMapping(value = "/loginCheck" , method = RequestMethod.POST)
    public ModelAndView loginCheck(HttpServletRequest request, LoginCommand loginCommand) {
        String password = loginCommand.getPassword();
        System.out.printf("password ==> " + password);
        return new ModelAndView("main");
    }
}
