package com.futao.mybatis.cache.dao;

import com.futao.mybatis.cache.entity.TempEntity;
import org.apache.ibatis.annotations.Param;

public interface TempDap {
    TempEntity byId(@Param("id") String id);
}
