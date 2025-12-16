package com.example.demo.Service;

public abstract class DocumentServiceAB implements DocumentService {

	@Override
	public void ReadData() {
		// TODO Auto-generated method stub
		System.out.println("Read Data From DataBase");
		
	}

	
	@Override
	public String CollectData() {
		// TODO Auto-generated method stub
		System.out.println("Collect Data");
		ReadData();
		ProcessData();
		return PrintData();
	}

	

}
