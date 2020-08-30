package io.nitinLearn.ratinginfoservice.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.nitinLearn.ratinginfoservice.service.HomeService;


@RestController
public class HomeController {
	
	@Autowired
	HomeService homeService;
	
	private final Logger log = Logger.getLogger(this.getClass());
	
	@GetMapping(value = "/")
	public String getTest() {
		return "ratingInfo";
	}
}
