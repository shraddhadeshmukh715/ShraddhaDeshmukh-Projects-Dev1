package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Sevice.AppService;
import com.example.demo.Sevice.GithubAppServiceImpl;
import com.example.demo.Sevice.GoogleAppServiceImpl;
import com.example.demo.Sevice.LinkedInAppServiceImpl;
import com.example.demo.Sevice.YoutubeAppServiceImpl;

@RestController
@RequestMapping("app")
public class ServiceController {

	private GithubAppServiceImpl githubAppService;
	private GoogleAppServiceImpl googleAppService;
	private LinkedInAppServiceImpl linkedInAppService;
	private YoutubeAppServiceImpl youtubeAppService;
	
	ServiceController(GithubAppServiceImpl githubAppService,
				GoogleAppServiceImpl googleAppService,
				LinkedInAppServiceImpl linkedInAppService,
				YoutubeAppServiceImpl youtubeAppService)
	{
		this.githubAppService = githubAppService;
		this.googleAppService = googleAppService;
		this.linkedInAppService = linkedInAppService;
		this.youtubeAppService = youtubeAppService;
	}
	
	@GetMapping("{type}")
	public String showAppPhases(@PathVariable String type)
	{
		AppService appService = null;
		
		switch(type)
		{
		case "github":
			appService = githubAppService;
			break;
			
		case "goggle":
			appService = googleAppService;
			break;
			
		case "linkedIn":
			appService = linkedInAppService;
			break;
			
		case "youTube":
			appService = youtubeAppService;
			break;
			
		default:
			return "Invalid" +type;
		}
		
		return appService.openApp() +""+ appService.processApp()+"" + appService.closeApp();
	}
	
	
}
