package com.example.demo.Service;

public class PdfDocumentServiceImpl extends DocumentServiceAB{

	@Override
	public void ProcessData() {
		// TODO Auto-generated method stub
		System.out.println("Process Data For Pdf");
	}

	@Override
	public String PrintData() {
		// TODO Auto-generated method stub
		System.out.println("Print Data For Pdf");
		return "Pdf";
	}

}
