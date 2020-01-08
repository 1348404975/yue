package com.yk.service;

import java.util.List;

import com.yk.pojo.User;

public interface UserService {
	//列表测试
	List<User> list();
	//根据名字查询
	User selectByName(String username);

}
