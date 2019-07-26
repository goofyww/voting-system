package com.example.gf.mapper;

import com.example.gf.pojo.VOption;

public interface VOptionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(VOption record);

    int insertSelective(VOption record);

    VOption selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(VOption record);

    int updateByPrimaryKey(VOption record);
}