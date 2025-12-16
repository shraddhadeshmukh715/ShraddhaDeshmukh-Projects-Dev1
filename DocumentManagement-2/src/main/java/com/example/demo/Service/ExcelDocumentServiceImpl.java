package com.example.demo.Service;

public class ExcelDocumentServiceImpl extends DocumentServiceAB{

	@Override
	public void ProcessData() {
		// TODO Auto-generated method stub
		System.out.println("Process Data For Excel");
	}

	@Override
	public String PrintData() {
		// TODO Auto-generated method stub
		System.out.println("Print Data For Excel");
		return "Excel";
	}

}
