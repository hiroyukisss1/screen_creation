package com.example.demo.domain.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.user.model.MUser;
import com.example.demo.domain.user.service.UserService;
import com.example.demo.repository.UserMapper;

//*Mapperのメソッドを呼び出す
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper mapper;
	
	//*ユーザー登録
	@Override
	public void signup(MUser user) {
		user.setDepartmentId(1); //部署
		user.setRole("ROLE_GENERAL");  //ロール
		mapper.insertOne(user);
	}
}
