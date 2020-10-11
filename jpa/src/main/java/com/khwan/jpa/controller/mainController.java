package com.khwan.jpa.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.khwan.jpa.model.entity.testEntity;
import com.khwan.jpa.service.TestServiceImpl;



@RestController
public class mainController {
	
	
	@Autowired
	private TestServiceImpl testServiceImpl;
	
	@RequestMapping(value="/")
	public String view(Model model) {
		
		return "index";
	}
	
	@RequestMapping(path = "/set", method= RequestMethod.POST)
	public void setTest(HttpServletRequest request,@Valid @RequestBody  testEntity setTest) throws Exception {
		testServiceImpl.setTest(setTest);
		
	}
	
	@RequestMapping(path = "/get", method= RequestMethod.GET)
	public List<testEntity> getTest(HttpServletRequest request,   testEntity setTest) throws Exception {
		List<testEntity> testEntity = 	testServiceImpl.getTest();
		
		return testEntity;
		
	}

}
