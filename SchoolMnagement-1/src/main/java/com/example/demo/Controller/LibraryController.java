package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Constant.MessageConstant;
import com.example.demo.Entity.Library;
import com.example.demo.Service.LibraryService;

@RestController
@RequestMapping("library")
public class LibraryController {

	@Autowired 
	LibraryService libraryService;
	
	@PostMapping("/add")
	public String addLibrary(@RequestBody Library library)
	{
		libraryService.saveLibrary(library);
		return MessageConstant.LIBRARY_ADDED_IN_DB;
	}
	
	@GetMapping
	public List<Library> getAllLibrary()
	{
		return libraryService.getAllLibrary();
	}
	
	@GetMapping("/get/{id}")
	Library getLibraryById(int id)
	{
		return libraryService.getLibraryByID(id);
	}
	
	@PostMapping("/delete/{id}")
	void deleteLibraryById(int id)
	{
		libraryService.deleteLibrary(id);
	}
}
