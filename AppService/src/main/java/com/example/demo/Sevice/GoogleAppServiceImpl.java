package com.example.demo.Sevice;

import com.example.demo.Constant.MessageConstants;

public class GoogleAppServiceImpl implements AppService {

	@Override
	public String openApp() {
		// TODO Auto-generated method stub
		return MessageConstants.GOGGLE_OPEN;
	}

	@Override
	public String processApp() {
		// TODO Auto-generated method stub
		return MessageConstants.GOGGLE_PROCESS;
	}

	@Override
	public String closeApp() {
		// TODO Auto-generated method stub
		return MessageConstants.GOGGLE_CLOSE;
	}

}
