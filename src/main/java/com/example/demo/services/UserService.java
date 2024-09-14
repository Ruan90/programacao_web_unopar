package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAllUsers(){
		return userRepository.findAll();
	}
	
	public Optional<User> findByIdUser(Long id) {
		return userRepository.findById(id);
	}
	
	public void insert(User user) {
		userRepository.save(user);
	}
	
	public void delete(Long id) {
		userRepository.deleteById(id);
	}
	
	public void update(User dadosUsuario) {
		User usuario = userRepository.getReferenceById(dadosUsuario.getId());
		usuario.atualizaInformacoes(dadosUsuario);
		userRepository.save(usuario);
	}
}
