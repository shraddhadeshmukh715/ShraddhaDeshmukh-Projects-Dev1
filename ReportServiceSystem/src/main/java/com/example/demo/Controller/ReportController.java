package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.CSVReportServiceImpl;
import com.example.demo.Service.ExcelReportServiceImpl;
import com.example.demo.Service.PDFReportServiceImpl;
import com.example.demo.Service.ReportService;

@RestController
public class ReportController {

	@Autowired
	CSVReportServiceImpl csvReportServiceImpl;
	
	@Autowired
	PDFReportServiceImpl pdfReportServiceImpl;
	
	@Autowired
	ExcelReportServiceImpl excelReportServiceImpl;
	
	@Autowired 
	ReportService reportService;
	
	@GetMapping("report/{type}")
	public String ReportStatus(@PathVariable String type)
	{
		switch(type)
		{
			case "csv":
				reportService = csvReportServiceImpl;
				break;
				
			case "pdf":
				reportService = pdfReportServiceImpl;
				break;
				
			case "excel":
				reportService = excelReportServiceImpl;
				break;
				
			default:
				return "Invalid";
		}
		
		return reportService.generateReport() + " " + reportService.downloadReport() 
		+ ""+ reportService.archiveReport();
	}
	
}
