package com.techelevator.amyooz.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.npgeek.model.SurveyResponse;
import com.techelevator.npgeek.model.SurveyResult;
import com.techelevator.npgeek.model.SurveyResultDAO;


@Controller 
public class AmyoozController {

//	@Autowired
//	SurveyResultDAO surveyResultDao;
	
	
	@RequestMapping(path="/home",method=RequestMethod.GET)
	public String displayHomePage(Model modelHolder) {

		if(!modelHolder.containsAttribute("survey")) {
//			modelHolder.addAttribute("survey", new SurveyResult()); 
		}
		
		
		return "home";
	}

		
		// POST: /home
		// Validate the model and redirect to confirmation(your profile page if successful) or return
		// home page (if validation fails)
		@RequestMapping(path = "/home", method = RequestMethod.POST)
		public String submitSurvey(@Valid @ModelAttribute("survey") 
				SurveyResult surveyFormValues, 
				BindingResult result, 
				RedirectAttributes flash,
				@RequestParam String parkCode,
				@RequestParam String emailAddress,
				@RequestParam String state,
				@RequestParam String activityLevel) {
			
			if(result.hasErrors()) {
				flash.addFlashAttribute("survey", surveyFormValues); 
				flash.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX + "survey", result); 
				return "redirect:/home";
			}
			
			flash.addFlashAttribute("message", "You have successfully registered.");
			
//			
//			SurveyResult post = new SurveyResult(); 
//			
//			post.setParkCode(parkCode);
//			post.setEmailAddress(emailAddress);
//			post.setState(state);
//			post.setActivityLevel(activityLevel);
//			
//			surveyResultDao.save(post);
			return "redirect:/personalPage";
		}
		
		
		@RequestMapping(path="/personalPage", method=RequestMethod.GET)
		public String showSurveyConfirmationPage(ModelMap modelHolder) {
			
			
			// make a DAO for personal ride preferences... I think this is totally over my head at this point
//			
//			List<Ride> posts = surveyResultDao.getAllPosts(); 
//			modelHolder.put("allPosts", posts); 
			
			return "personalPage";
		}
	
	
}
