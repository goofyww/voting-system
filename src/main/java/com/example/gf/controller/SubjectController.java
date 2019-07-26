package com.example.gf.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.example.gf.Common.Const;
import com.example.gf.Common.ServerResponse;
import com.example.gf.pojo.VSubject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.gf.exception.DataException;
import com.example.gf.service.SubjectService;

@Controller
@RequestMapping("/subject/")
public class SubjectController {

	@Autowired
	private SubjectService subjectService;

	@RequestMapping(value = "showAll.do", method = RequestMethod.GET)
	@ResponseBody
	public ServerResponse<List<VSubject>> showAll(HttpServletRequest request) throws IOException, DataException {
		ServerResponse<List<VSubject>> response = subjectService.findAll();
		if(response.isSuccess()){
			request.setAttribute(Const.SUBJECT_LIST,response.getData());
		}
		return response;
	}

}
