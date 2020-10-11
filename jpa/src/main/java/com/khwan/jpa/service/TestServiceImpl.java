package com.khwan.jpa.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khwan.jpa.model.entity.testEntity;
import com.khwan.jpa.repository.testRepository;


@Service("TestServiceImpl")
public class TestServiceImpl  {
	
	@Autowired
	private testRepository testre;
	
	
	public List<testEntity> getTest() throws Exception {
		
		List<testEntity> testEnti = testre.findAll();
		
		return testEnti;
	}
	
	public void setTest(testEntity entity) throws Exception {
		
		testre.save(entity);
		
	}

}
