package com.yuer.stockanalyzer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yuer.stockanalyzer.model.User;
import com.yuer.stockanalyzer.persistence.UserMapper;

@Service("UserService")
@Transactional(value = "isap", rollbackFor = Exception.class)
public class UserService {

	@Autowired
	private UserMapper userMapper;

	/**
	 * @return
	 */
	public List<User> list() {
		return userMapper.selectAll();
	}

}
