package com.codecool.generalitest.endpoints;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codecool.generalitest.services.TimeService;


@SuppressWarnings("restriction")
@Service("timeServiceEndpoint")
@WebService(serviceName="TimeService")
public class TimeServiceEndpoint{
	
	
	private Logger logger = Logger.getLogger(TimeServiceEndpoint.class);
	
	@Autowired
	 private TimeService timeService;
	  
	 @WebMethod
	 public String displayTime() {
		 String time = timeService.GetTime();
		 logger.info(time);
		 return time;
	 }
}
