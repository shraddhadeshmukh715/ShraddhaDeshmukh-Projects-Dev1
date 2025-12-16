package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.DocumentService;
import com.example.demo.Service.DocumentServiceAB;
import com.example.demo.Service.ExcelDocumentServiceImpl;
import com.example.demo.Service.PdfDocumentServiceImpl;
import com.example.demo.Service.WordDocumentServiceImpl;

@RestController
public class DocumentController {

@GetMapping("print/{type}")
public String PrintInvoice(@PathVariable String type)
{
	DocumentService Ds = null;
	
	if(type.equals("pdf"))
	{
	 Ds = new PdfDocumentServiceImpl();
	}
	if(type.equals("word"))
	{
		Ds = new WordDocumentServiceImpl();
	}
	if(type.equals("excel"))
	{
		Ds = new ExcelDocumentServiceImpl();
	}
	
	Ds.ReadData();
	Ds.ProcessData();
	Ds.CollectData();
	return Ds.PrintData();
}

}
