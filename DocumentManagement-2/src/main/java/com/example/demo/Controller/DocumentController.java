package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Factory.Factor;
import com.example.demo.Service.DocumentService;

@RestController
public class DocumentController {
	
	@GetMapping("print/{type}")

	public String PrintInvoice(@PathVariable String type)
	{
		DocumentService Ds = Factor.CreateObject(type);
		
		Ds.ReadData();
		Ds.ProcessData();
		return Ds.PrintData();
	}
}
