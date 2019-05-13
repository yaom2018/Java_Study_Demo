package cn.sarariman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 定义通用类
 */
@Controller
public class MainController {
    /**
     * 登录页面
     * @return
     */
    @RequestMapping("/userLogin")
    public String login() {
        return "login";
    }

    /**
     * 错误页面
     * @return
     */
    @RequestMapping("/error")
    public String error(){
        return "error";
    }
}
