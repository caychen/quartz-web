package org.com.cay.controller;

import java.io.UnsupportedEncodingException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

	@RequestMapping(value="/login",produces="text/html;charset=utf-8")
	@ResponseBody
	public String hello(String username, String password) throws UnsupportedEncodingException{
		//tomcat默认使用iso-8859-1编码
		//也可以修改tomcat的server.xml文件的63行，添加URIEncoding=UTF-8
		username = new String(username.getBytes("iso-8859-1"), "utf-8");
		return "Hello " + username + ", Your password is " + password;
	}
}
