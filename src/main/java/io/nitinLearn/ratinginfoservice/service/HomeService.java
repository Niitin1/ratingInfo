package io.nitinLearn.ratinginfoservice.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import io.nitinLearn.ratinginfoservice.bean.Rating;

@Service
public class HomeService {
	

	private final Logger log = Logger.getLogger(this.getClass());

	public Rating getRating(String movieId) {
		// TODO Auto-generated method stub
		log.info("called into rating service "+movieId);
		return new Rating(movieId , 5);
	}

}
