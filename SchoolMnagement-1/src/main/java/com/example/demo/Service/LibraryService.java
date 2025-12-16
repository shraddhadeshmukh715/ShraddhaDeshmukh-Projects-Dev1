package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Library;

public interface LibraryService {

	void saveLibrary(Library library);
	
	List<Library> getAllLibrary();
	
	Library getLibraryByID(int id);
	
	void deleteLibrary(int id);
	
}

