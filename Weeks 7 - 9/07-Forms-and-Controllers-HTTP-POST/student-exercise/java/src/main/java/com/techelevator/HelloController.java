package com.techelevator;

import java.time.LocalDateTime;
import java.util.List;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.model.Review;
import com.techelevator.model.ReviewDao;

@Controller
public class HelloController {

	@Autowired
	ReviewDao reviewDao;
	
	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public String displayGreeting(HttpSession session, ModelMap modelHolder) {
		List<Review> reviews= reviewDao.getAllReviews();
		modelHolder.put("allReviews", reviews);
		return "homePage";
	}
	
	
	@RequestMapping(path = "/reviewForm", method = RequestMethod.GET)
	public String displayForm() {

		return "reviewForm";
	}
	
	@RequestMapping(path="/reviewForm", method=RequestMethod.POST)
	public String newReviewSubmission(
			@RequestParam String username,
			@RequestParam int rating,
			@RequestParam String title,
			@RequestParam String text)  {
		
		Review review = new Review(); 
		
		review.setUsername(username);
		review.setTitle(title);
		review.setText(text);
		review.setRating(rating);
		review.setDateSubmitted(LocalDateTime.now());
		
		reviewDao.save(review);
		return "redirect:/home";
	}
	
	
}
