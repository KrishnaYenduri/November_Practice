package com.jsp.ms.user.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.ms.beans.User;

@RestController
@RequestMapping("/users")
public class UserController {

	@ResponseBody
	@RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json")
	public List<User> getAllUsers() {
		return Arrays.asList(new User(1, "KRISHNA", "9791064265", "dev.krishnasai@gmail.com"),
				new User(2, "SAI", "9791064265", "tech.krishnayenduri@gmail.com"));
	}

}
