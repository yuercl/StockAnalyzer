package com.yuer.stockanalyzer.persistence;

import java.util.List;

import com.yuer.stockanalyzer.model.User;

public interface UserMapper {
	/**
	 * 也可以这样写，就不需要在xml里面写了
	 */
	User get(Integer id);

	List<User> selectAll();
}
