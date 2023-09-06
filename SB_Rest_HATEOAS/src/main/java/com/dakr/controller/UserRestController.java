package com.dakr.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import com.dakr.binding.Users;

@RestController
public class UserRestController {

	@GetMapping("/user")
	public ResponseEntity<Users> getUser() {

		Users user = new Users(101, "Ranjan", "ranjan@gmail.com");
		
		//To build an link on our object...
		user.add(linkTo(methodOn(UserRestController.class).getUser()).withSelfRel());

		
		return new ResponseEntity<>(user, HttpStatus.OK);
	}
}
