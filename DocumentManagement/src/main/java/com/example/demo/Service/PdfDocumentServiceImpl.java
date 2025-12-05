package com.example.demo.Service;

public class PdfDocumentServiceImpl implements DocumentService{

	@Override
	public void ReadData() {
		// TODO Auto-generated method stub
		System.out.println("Read Data from Database");
	}

	@Override
	public void ProcessData() {
		// TODO Auto-generated method stub
		System.out.println("Process Data for PDF");
	}

	@Override
	public String PrintData() {
		// TODO Auto-generated method stub
		System.out.println("Print Data for PDF");
		return "pdf";
	}
}
