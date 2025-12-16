package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Library;
import com.example.demo.Repositary.LibraryRepositary;

@Service
public class LibraryServiceImpl implements LibraryService{

	@Autowired
	LibraryRepositary libraryRepositary;
	
	@Override
	public void saveLibrary(Library library) {
		// TODO Auto-generated method stub
		libraryRepositary.save(library);
	}

	@Override
	public List<Library> getAllLibrary() {
		// TODO Auto-generated method stub
		return libraryRepositary.findAll();
	}

	@Override
	public Library getLibraryByID(int id) {
		// TODO Auto-generated method stub
		return libraryRepositary.findById(id).get();
	}

	@Override
	public void deleteLibrary(int id) {
		// TODO Auto-generated method stub
		libraryRepositary.deleteById(id);
	}

}
