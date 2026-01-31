package com.example.demo.Sevice;

import com.example.demo.Constant.MessageConstants;

public class YoutubeAppServiceImpl implements AppService{

	@Override
	public String openApp() {
		// TODO Auto-generated method stub
		return MessageConstants.YOUTUBE_OPEN;
	}

	@Override
	public String processApp() {
		// TODO Auto-generated method stub
		return MessageConstants.YOUTUBE_PROCESS;
	}

	@Override
	public String closeApp() {
		// TODO Auto-generated method stub
		return MessageConstants.YOUTUBE_CLOSE;
	}

}
