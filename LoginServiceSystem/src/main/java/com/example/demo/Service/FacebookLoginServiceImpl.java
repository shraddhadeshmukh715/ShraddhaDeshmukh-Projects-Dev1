package com.example.demo.Service;

import org.springframework.stereotype.Service;

import com.example.demo.Constants.MessageConstants;

@Service
public class FacebookLoginServiceImpl implements LoginService {

	@Override
	public String authenticate() {
		// TODO Auto-generated method stub
		return MessageConstants.FACEBOOK_AUTHENTICATE;
	}

	@Override
	public String fetchProfile() {
		// TODO Auto-generated method stub
		return MessageConstants.FACEBOOK_FETCH_PROFILE;
	}

	@Override
	public String logout() {
		// TODO Auto-generated method stub
		return MessageConstants.FACEBOOK_LOGOUT;
	}

}
