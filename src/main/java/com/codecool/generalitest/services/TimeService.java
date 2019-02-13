package com.codecool.generalitest.services;

import java.time.LocalTime;

import org.springframework.stereotype.Service;


@Service("timeService")
public class TimeService{
	
	 public String GetTime() {
		 LocalTime localtime = LocalTime.now();
		 return localtime.toString();
	 }
}
