package com.yk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.yk.mapper.UserMapper;
import com.yk.pojo.User;
import com.yk.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserMapper UserMapper;
	/**
	 * 列表测试
	 */
	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		return UserMapper.selectByExample(null);
	}
	/**
	 * 根据名字找数据
	 */
	@Override
	public User selectByName(String username) {
		// TODO Auto-generated method stub
		return UserMapper.selectByName(username);
	}
	
}
