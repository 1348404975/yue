package com.yk.controller;

import java.util.List;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yk.pojo.User;
import com.yk.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Reference
	UserService userService;
	/**
	 * 测试列表
	 * @return
	 */
	@RequestMapping("/list")
	public List<User> list(){
		return userService.list();
	}
	/**
	 * 根据名字查询
	 * @return
	 */
	@RequestMapping("/findName")
	public User findName(){
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		User list=userService.selectByName(name);
		return list;
	}
}
