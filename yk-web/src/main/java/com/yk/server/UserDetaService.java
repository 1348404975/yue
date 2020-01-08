package com.yk.server;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.yk.pojo.User;
import com.yk.service.UserService;

public class UserDetaService implements UserDetailsService{
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		List<GrantedAuthority> list = new ArrayList<GrantedAuthority>();
		list.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
		User u=userService.selectByName(username);
		if(u!=null){
			return new org.springframework.security.core.userdetails.User(username, u.getPassword(), list);
		}
		return null;
	}

}
