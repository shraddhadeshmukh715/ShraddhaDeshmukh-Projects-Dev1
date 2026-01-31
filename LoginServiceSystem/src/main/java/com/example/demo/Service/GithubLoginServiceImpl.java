package com.example.demo.Service;

import org.springframework.stereotype.Service;

import com.example.demo.Constants.MessageConstants;

@Service
public class GithubLoginServiceImpl implements LoginService{

	@Override
	public String authenticate() {
		// TODO Auto-generated method stub
		return MessageConstants.GITHUB_AUTHENTICATE;
	}

	@Override
	public String fetchProfile() {
		// TODO Auto-generated method stub
		return MessageConstants.GITHUB_FETCH_PROFILE;
	}

	@Override
	public String logout() {
		// TODO Auto-generated method stub
		return MessageConstants.GITHUB_LOGOUT;
	}

}

