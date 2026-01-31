package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.FacebookLoginServiceImpl;
import com.example.demo.Service.GithubLoginServiceImpl;
import com.example.demo.Service.GoogleLoginServiceImpl;
import com.example.demo.Service.LoginService;

@RestController
public class LoginController {

	private GoogleLoginServiceImpl googleServiceImpl;
	private FacebookLoginServiceImpl facebookServiceImpl;
	private GithubLoginServiceImpl githubServiceImpl;
	
	private LoginService logService;
	
	@Autowired
	public void setGoggleService(GoogleLoginServiceImpl googleServiceImpl)
	{
		this.googleServiceImpl = googleServiceImpl;
	}
	
	@Autowired
	public void setFacebookService(FacebookLoginServiceImpl facebookServiceImpl)
	{
		this.facebookServiceImpl = facebookServiceImpl;
	}
	
	@Autowired
	public void setGithubService(GithubLoginServiceImpl githubServiceImpl)
	{
		this.githubServiceImpl = githubServiceImpl;
	}
	
	@Autowired
	public void setLoginService(LoginService logService)
	{
		this.logService = logService;
	}
	
	@GetMapping("login/{type}")
	public String LoginUpdates(@PathVariable String type)
	{
		switch(type)
		{
		case "goggle":
			logService = googleServiceImpl;
			break;
			
		case "facebook"	:
			logService = facebookServiceImpl;
			break;
			
		case "github":
			logService = githubServiceImpl;
			break;
			
		default:
			return "INVALID";
		}
		return logService.authenticate() + "" + logService.fetchProfile() + "" 
		+ logService.logout();
	}
}
