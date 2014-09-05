package com.yuer.stockanalyzer.persistence;

import com.yuer.stockanalyzer.model.Detail;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

public interface DetailMapper {

    Integer insert(Detail detail);

    Detail getByTime(@Param("stockId") Integer stockId, @Param("time") Date time);

    Integer countByStock(@Param("stockId") Integer stockId);

}
