package com.example.demo.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService userService;
	
	@GetMapping
	public List<User> findAll(){
		return userService.findAllUsers();
	}
	
	@GetMapping(value = "{id}")
	public Optional<User> findById(@PathVariable("id") Long id) {
		return userService.findByIdUser(id);
	}
	
	@PostMapping
	public void insert(@RequestBody User dadosUsuario) {
		userService.insert(dadosUsuario);
	}
	
	@DeleteMapping(value = "{id}")
	public void delete(@PathVariable("id") Long id) {
		userService.delete(id);
	}
	
	@PutMapping
	public void update(@RequestBody User dadosUsuario) {
		userService.update(dadosUsuario);
	}
}
