package com.example.demo.Service;

public class ExcelDocumentServiceImpl implements DocumentService{

	@Override
	public void ReadData() {
		// TODO Auto-generated method stub
		System.out.println("Read Data From Database");
	}

	@Override
	public void ProcessData() {
		// TODO Auto-generated method stub
		System.out.println("Process Data For Excel");
	}

	@Override
	public String PrintData() {
		// TODO Auto-generated method stub
		System.out.println("Print Data For Excel");
		return "excel";
	}

}
