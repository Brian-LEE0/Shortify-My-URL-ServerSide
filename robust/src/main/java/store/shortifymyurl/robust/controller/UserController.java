package store.shortifymyurl.robust.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import store.shortifymyurl.robust.dto.UserDTO;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

	@PostMapping(value = "/signup")
	public UserDTO signup(@RequestBody UserDTO userInfo) {
		// TODO: process POST request

		return userInfo;
	}

	@PostMapping(value = "/signin")
	public UserDTO signin(@RequestBody UserDTO userInfo) {
		// TODO: process Post request

		return userInfo;
	}

}