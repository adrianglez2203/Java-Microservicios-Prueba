package com.example.demo.user;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	private final UserRepository userRepository;
	
	@Autowired
	public UserService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}


	public List<User> getUsers(){
		return userRepository.findAll();
	}


	public void addNewUser(User user) {
		Optional<User> userByEmail = userRepository.findUserByEmail(user.getEmail());
		if (userByEmail.isPresent()) {
			throw new IllegalStateException("Email Taken");
		}
		userRepository.save(user);
		System.out.println(user);
	
	}


	public void deleteUser(Long userId) {
		// TODO Auto-generated method stub
		boolean exist = userRepository.existsById(userId);
		if (!exist) {
			throw new IllegalStateException("User no Exist");
			
		}
		userRepository.deleteById(userId);
	}

	@Transactional
	public void updateUser(Long userId, String name, String email) {
		// TODO Auto-generated method stub
		User user = userRepository.findById(userId).orElseThrow(( ) -> new IllegalStateException("User with id" + userId + "does not exist"));
		
		if (name != null && name.length()>0 && !Objects.equals(user.getName(), name)) {
			user.setName(name);
			
			
		}
		if (email != null && email.length() > 0 && !Objects.equals(email, user.getEmail())) {
			Optional<User> userOptional = userRepository.findUserByEmail(email);
			if (userOptional.isPresent()) {
				throw new IllegalStateException("Email Taken");
			}
			user.setEmail(email);
		}
		
	}
		
}
