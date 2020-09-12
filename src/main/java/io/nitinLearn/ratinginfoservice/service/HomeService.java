package io.nitinLearn.ratinginfoservice.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import io.nitinLearn.ratinginfoservice.bean.Rating;
import io.nitinLearn.ratinginfoservice.bean.UserRating;

@Service
public class HomeService {
	

	private final Logger log = Logger.getLogger(this.getClass());

	public Rating getRating(String movieId) {
		// TODO Auto-generated method stub
		log.info("called into rating service "+movieId);
		return new Rating(movieId , 5);
	}

	public UserRating getUserRating(String userId) {
		// TODO Auto-generated method stub
		List<Rating> ratings = new ArrayList<Rating>();
		
		
		//db opertaion can happen . fetch all the movies of the user and rating
		ratings.add(new Rating("550", 3));
		ratings.add(new Rating("350", 3));
		UserRating userRating = new UserRating();
		userRating.setUserRating(ratings);
		return userRating;
	}

}
