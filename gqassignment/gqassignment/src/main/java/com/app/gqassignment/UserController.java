package com.app.gqassignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Application")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	// Adding a New User
	@SchemaMapping(typeName = "Mutation", field = "createuser")
	public UsersModel createuser(@Argument String name, @Argument String email, @Argument String username) {
		UsersModel usersModel = new UsersModel();
		usersModel.setName(name);
		usersModel.setEmail(email);
		usersModel.setUsername(username);
		return userRepository.save(usersModel);
	}

	// Getting All Users List
	@QueryMapping
	Iterable<UsersModel> users() {
		return userRepository.findAll();
	}

	// Finding a User with Username
	@QueryMapping
	UsersModel userByUsername(@Argument String username) {
		return userRepository.findByUsername(username);
	}

	// Updating Username With Email ID
	@MutationMapping
	public UsersModel updateuser(@Argument String email, @Argument String username) {
		UsersModel um = userRepository.findByEmail(email);
		um.setUsername(username);
		return userRepository.save(um);
	}

}
