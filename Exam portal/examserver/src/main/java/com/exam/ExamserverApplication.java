package com.exam;

import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner {
	@Autowired
	public UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println("starting code");
//		User user=new User();
//		user.setFirstname("Binod");
//		user.setLastname("kathayat");
//		user.setEmail("er.binod7@gmail.com");
//		user.setPassword("abc");
//		user.setProfile("default.png");
//		user.setUsername("BinodK");
//		user.setPhone("7878978789");
//		user.setEnabled(true);
//
//		Role role1=new Role();
//		role1.setRoleID(44L);
//		role1.setRoleName("ADMIN");
//
//		Set<UserRole> userRoleSet=new HashSet<>();
//		UserRole userRole=new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//		userRoleSet.add(userRole);
//		User user1=this.userService.createUser(user,userRoleSet);
//		System.out.println(user1.getUsername());
	}
}
