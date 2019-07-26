package com.example.gf.service;

import com.example.gf.Common.ServerResponse;
import com.example.gf.exception.DataException;
import com.example.gf.pojo.VSubject;

import java.io.IOException;
import java.util.List;

public interface SubjectService {

	ServerResponse<List<VSubject>> findAll()throws DataException,IOException;
	
}
