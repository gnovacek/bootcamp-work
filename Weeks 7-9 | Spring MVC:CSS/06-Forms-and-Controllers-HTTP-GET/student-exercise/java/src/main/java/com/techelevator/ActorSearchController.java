package com.techelevator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.dao.ActorDao;
import com.techelevator.dao.model.Actor;

@Controller
public class ActorSearchController {

	@Autowired
	private ActorDao actorDao;

	@RequestMapping("/actors")
	public String showSearchActorForm() {
		
		return "actorList";
		
	}

	@RequestMapping("/actorResults")
	public String searchActors(@RequestParam String lastName, ModelMap modelHolder){
		/* Call the model and pass values to the jsp */
//		use lastName to call the DAO and put the resulting actor list onto the model map
		
		List<Actor> results = actorDao.getMatchingActors(lastName); 
		
		modelHolder.put("actors", results); 
		
		return "actorList";
	}
}
