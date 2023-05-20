package com.example.demo.service.Impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.example.demo.com.Log;
import com.example.demo.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	private static Logger logger = LogManager.getLogger(TestServiceImpl.class);

	@Override
	public void Example1() {
		logger.info(Log.START_APPLICATION);
	}

}
