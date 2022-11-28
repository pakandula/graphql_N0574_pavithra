package com.app.gqassignment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<UsersModel, Long> {

	UsersModel findByUsername(String username);

	UsersModel findByEmail(String email);
}
