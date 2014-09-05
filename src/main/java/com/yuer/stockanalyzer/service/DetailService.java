package com.yuer.stockanalyzer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yuer.stockanalyzer.model.Detail;
import com.yuer.stockanalyzer.persistence.DetailMapper;

@Service("DetailService")
@Transactional(value = "isap", rollbackFor = Exception.class)
public class DetailService {

	@Autowired
	private DetailMapper detailMapper;

	public Integer insert(Detail detail) {
		return detailMapper.insert(detail);
	}

}
