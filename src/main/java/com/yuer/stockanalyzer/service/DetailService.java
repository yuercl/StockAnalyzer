package com.yuer.stockanalyzer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yuer.stockanalyzer.model.Detail;
import com.yuer.stockanalyzer.persistence.DetailMapper;

import java.util.Date;

@Service("DetailService")
@Transactional(value = "isap", rollbackFor = Exception.class)
public class DetailService {

    @Autowired
    private DetailMapper detailMapper;

    public Integer insert(Detail detail) {
        return detailMapper.insert(detail);
    }

    public Detail getByTime(Integer stockId, Date time) {
        return detailMapper.getByTime(stockId, time);
    }

    public Integer countByStock(Integer stockId) {
        return detailMapper.countByStock(stockId);
    }


}
