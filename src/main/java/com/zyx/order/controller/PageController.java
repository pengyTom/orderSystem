package com.zyx.order.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * 专门用于显示页面的控制器
 */
@Controller
@RequestMapping("/back")
public class PageController {

    /**
     * 后台主页页面
     *
     * @return
     */
    @RequestMapping("/index")
    public String index() {
        return "/index";
    }

    /**
     * 后台登陆页面
     *
     * @return
     */
    @RequestMapping(value = "/login")
    public String login() {
        return "/login";
    }

    /**
     * 后台退出页面
     *
     * @return
     */
    @RequestMapping(value = "/isLogout")
    public String logOut(HttpSession session) {
        session.invalidate();
        return "/index";
    }


    /**
     * 无权限页面
     *
     * @return
     */
    @RequestMapping("/unauthorized")
    public String noPerms() {
        return "unauthorized";
    }


}
