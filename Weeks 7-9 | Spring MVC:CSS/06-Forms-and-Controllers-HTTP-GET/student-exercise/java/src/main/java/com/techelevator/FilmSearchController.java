package com.techelevator;

import com.techelevator.dao.FilmDao;
import com.techelevator.dao.model.Customer;
import com.techelevator.dao.model.Film;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * FilmSearchController
 */
@Controller
public class FilmSearchController {

    @Autowired
    FilmDao filmDao;

    @RequestMapping("/films")
    public String showFilmSearchForm() {
        return "filmList";
    }

    @RequestMapping("/filmResults")
    public String searchFilms(@RequestParam String genre, @RequestParam int minLength, @RequestParam int maxLength, ModelMap modelHolder) {
        
    	List<Film> results = filmDao.getFilmsBetween(genre, minLength, maxLength); 
		
		modelHolder.put("films", results); 
    	
    	return "filmList";
    }

}

