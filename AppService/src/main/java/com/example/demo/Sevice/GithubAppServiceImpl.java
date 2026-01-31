package com.example.demo.Sevice;

import com.example.demo.Constant.MessageConstants;

public class GithubAppServiceImpl implements AppService{

	@Override
	public String openApp() {
		// TODO Auto-generated method stub
		return MessageConstants.GITHUB_OPEN;
	}

	@Override
	public String processApp() {
		// TODO Auto-generated method stub
		return MessageConstants.GITHUB_PROCESS;
	}

	@Override
	public String closeApp() {
		// TODO Auto-generated method stub
		return MessageConstants.GITHUB_CLOSE;
	}

}
