package cn.appsys.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.appsys.pojo.dev_User;
import cn.appsys.service.dev_User.UserService;

@Controller
public class UserController {
	private Logger log = Logger.getLogger(UserController.class);
	@Resource
	private UserService userService;

	@RequestMapping(value="/deng.html",method = RequestMethod.POST)
	public String deng(@RequestParam String devCode,
			@RequestParam String devPassword, HttpServletRequest request,
			HttpSession session){
		dev_User user = userService.deng(devCode, devPassword);
		if (null != user) {
			session.setAttribute("userSession", user);
			return "frame";
		} else {
			request.setAttribute("error", "用户名或密码错误");	
			return "../login";
		}
	}
}
