package com.example.demo.Service;

import org.springframework.stereotype.Service;

import com.example.demo.Constants.MessageConstants;

@Service
public class PDFReportServiceImpl implements ReportService{

	@Override
	public String generateReport() {
		// TODO Auto-generated method stub
		return MessageConstants.PDF_GENERATE;
	}

	@Override
	public String downloadReport() {
		// TODO Auto-generated method stub
		return MessageConstants.EXCEL_DOWNLOAD;
	}

	@Override
	public String archiveReport() {
		// TODO Auto-generated method stub
		return MessageConstants.PDF_ARCHIVE;
	}

}
