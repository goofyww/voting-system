package com.example.gf.serviceimpl;

import java.io.IOException;
import java.util.List;

import com.example.gf.Common.ServerResponse;
import com.example.gf.mapper.VSubjectMapper;
import com.example.gf.pojo.VSubject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.gf.exception.DataException;
import com.example.gf.service.SubjectService;
import org.springframework.util.ObjectUtils;

@Service("subjectService")
@Transactional(readOnly = true)
public class SubjectServiceImpl implements SubjectService {

	@Autowired
	private VSubjectMapper subjectMapper;

	public ServerResponse<List<VSubject>> findAll() throws DataException,IOException{
		List<VSubject> subjects = subjectMapper.selectAll();
		if(ObjectUtils.isEmpty(subjects.toArray())){
			return ServerResponse.creatByErrorMsg("获取信息失败");
		}
			return ServerResponse.creatBySuccess("获取信息成功",subjects);
	}

}
