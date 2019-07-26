package com.example.gf.mapper;

import com.example.gf.pojo.VSubject;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("subjectMapper")
public interface VSubjectMapper {

    int deleteByPrimaryKey(Long id);

    int insert(VSubject record);

    int insertSelective(VSubject record);

    VSubject selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(VSubject record);

    int updateByPrimaryKey(VSubject record);

    List<VSubject> selectAll();
}