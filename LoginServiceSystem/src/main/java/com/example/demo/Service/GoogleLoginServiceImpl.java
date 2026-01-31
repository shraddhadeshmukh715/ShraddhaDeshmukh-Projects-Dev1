package com.example.demo.Service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.Constants.MessageConstants;

@Service
@Primary
public class GoogleLoginServiceImpl implements LoginService{

	@Override
	public String authenticate() {
		// TODO Auto-generated method stub
		return MessageConstants.GOGGLE_AUTHENTICATE;
	}

	@Override
	public String fetchProfile() {
		// TODO Auto-generated method stub
		return MessageConstants.GOGGLE_FETCH_PROFILE;
	}

	@Override
	public String logout() {
		// TODO Auto-generated method stub
		return MessageConstants.GOGGLE_LOGOUT;
	}

}
