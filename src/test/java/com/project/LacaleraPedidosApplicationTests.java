package com.project;

import com.project.models.User;
import com.project.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class projectDeliveryTests {

	@Autowired
	private UserRepository userDAO;

	@Autowired
	private BCryptPasswordEncoder encoder;

	@Test
	void createUser() {
		User us = new User();
		us.setUsername("kamaly");
		us.setPassword(encoder.encode("kamaly"));

		User resolve = userDAO.save(us);

		assert(resolve.getPassword().equals(us.getPassword()));

	}

}
