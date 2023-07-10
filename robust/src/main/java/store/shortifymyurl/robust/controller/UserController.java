package store.shortifymyurl.robust.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import store.shortifymyurl.robust.dto.User.UserInfo;
import store.shortifymyurl.robust.dto.User.UserSignIn;
import store.shortifymyurl.robust.dto.User.UserSignUp;

import java.util.Date;
import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

	@PostMapping(value = "/signup")
	public UserInfo signup(@Valid @RequestBody UserSignUp usu) {
		UserInfo new_userinfo = new UserInfo(
				UUID.randomUUID(),
				usu.getEmail(),
				usu.getPwd(),
				usu.getName(),
				0,
				new Date(System.currentTimeMillis() + 365 * 24 * 60 * 60 * 1000));

		return new_userinfo;
	}

	@PostMapping(value = "/signin")
	public UserInfo signin(@Valid @RequestBody UserSignIn usi) {
		// TODO: process Post request

		return UserInfo.fromUserSignIn(usi);
	}

}