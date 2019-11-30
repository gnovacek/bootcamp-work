package com.techelevator.ssg.controller;

import java.time.LocalDateTime;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.ssg.model.calculator.AgeCalculator;
import com.techelevator.ssg.model.calculator.TravelCalculator;
import com.techelevator.ssg.model.calculator.WeightCalculator;

import com.techelevator.ssg.model.forum.ForumDao;
import com.techelevator.ssg.model.forum.ForumPost;
import com.techelevator.ssg.model.forum.JdbcForumDao;
import com.techelevator.ssg.model.store.Product;
import com.techelevator.ssg.model.store.ProductDao;
import com.techelevator.ssg.model.store.ShoppingCart;


@Controller
public class HomeController {
	
	@Autowired
	private ForumDao forumDao;
	
	@Autowired
	private ProductDao productDao;

	@RequestMapping("/")
	public String displayHomePage() {
		return "homePage";
	}
	
	
	@RequestMapping("/alienAge")
	public String showAlienAgeCalculatorInputPage() {
		return "alienAgeCalculator";
	}

	@RequestMapping("/alienAgeResult")
	public String showAlienAgeCalculatorResults(@RequestParam String planetChoice, @RequestParam double earthAge, ModelMap modelHolder) {
		
		AgeCalculator calculator = new AgeCalculator(planetChoice, earthAge);

		modelHolder.put("calculator", calculator);

		return "ageResult";
	}
	
	@RequestMapping("/alienWeight")
	public String showAlienWeightCalculatorInputPage() {
		return "alienWeightCalculator";
	}

	@RequestMapping("/alienWeightResult")
	public String showAlienWeightCalculatorResults(@RequestParam String planetChoice, @RequestParam double earthWeight, ModelMap modelHolder) {
		
		WeightCalculator calculator = new WeightCalculator(planetChoice, earthWeight);

		modelHolder.put("calculator", calculator);

		return "weightResult";
	}
	
	@RequestMapping("/alienTravel")
	public String showAlienTravelCalculatorInputPage() {
		return "alienTravelCalculator";
	}

	@RequestMapping("/alienTravelResult")
	public String showAlienTravelCalculatorResults(@RequestParam String planetChoice, @RequestParam String travelType, @RequestParam double earthAge, ModelMap modelHolder) {
		
		TravelCalculator calculator = new TravelCalculator(planetChoice, travelType, earthAge);

		modelHolder.put("calculator", calculator);

		return "travelResult";
	}
	
	@RequestMapping(path="/newPost", method=RequestMethod.GET)
	public String showSpaceForum() {
		return "newPost";
	}
	
	@RequestMapping(path="/newPost", method=RequestMethod.POST)
	public String forumSubmission(@RequestParam String username,
								  @RequestParam String subject,
								  @RequestParam String message) {   
		
		ForumPost post = new ForumPost();
		post.setUsername(username);
		post.setSubject(subject);
		post.setMessage(message);
		post.setDatePosted(LocalDateTime.now());
		forumDao.save(post);
	
		return "redirect:/spaceForum";  
		
	}
	
		@RequestMapping(path = "/spaceForum", method = RequestMethod.GET)
		public String displayAllPosts(HttpSession session, ModelMap modelHolder) {
			List<ForumPost> posts= forumDao.getAllPosts();
			modelHolder.put("allPosts", posts);
			return "allPosts";
		}
		
		
		@RequestMapping(path = "/spaceStore", method = RequestMethod.GET)
		public String displayAllProducts(HttpSession session, ModelMap modelHolder) {
			List<Product> products= productDao.getAllProducts();
			modelHolder.put("allProducts", products);
			return "spaceStore";
		}
		
		
		@RequestMapping(path="/spaceStore/detail", method=RequestMethod.GET)
		public String showproductDetail(@RequestParam long id, ModelMap modelHolder) {
			
			Product product = productDao.getProductById(id);
			modelHolder.put("product", product); 
			
			return "productDetails";
		}
		
		
		@RequestMapping(path="/shoppingCart", method=RequestMethod.POST)
		public String selectQuantity(@RequestParam Integer quantity, 
									  @RequestParam long id, 
									  HttpSession session) {   
			
//		cart is what we will call our Shopping Cart object 
//  	Checking Application Controller reference for this part 
			if(session.getAttribute("cart") == null) {
				ShoppingCart shoppingCart = new ShoppingCart(); 
				shoppingCart.addItemToCart(productDao.getProductById(id), quantity);		
				session.setAttribute("cart", shoppingCart);
			} else {
				ShoppingCart shoppingCart = (ShoppingCart) session.getAttribute("cart"); 
				shoppingCart.addItemToCart(productDao.getProductById(id), quantity);		
				session.setAttribute("cart", shoppingCart);
			}
			
			return "redirect:/shoppingCart";  
			
		}
		
	
		@RequestMapping(path = "/shoppingCart", method = RequestMethod.GET)
		public String displayShoppingCartProducts(HttpSession session) {
			

			return "shoppingCart";
		}
		
		
		
}
