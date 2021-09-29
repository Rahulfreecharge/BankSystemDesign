package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	@GetMapping("/")
	void getuser() {
		System.out.println("called..");
	}
	@GetMapping("/{id}")
	void getUser(@PathVariable Integer id) {
		System.out.println("called.."+id);
		
	}
	@PostMapping
    String saveUser(@RequestBody User user) {
		userService.save(user);
		System.out.println("got user "+user.getName());
		return "post called";
		
	}
	@PutMapping
	void handlePutMapping() {
		
	}

}
