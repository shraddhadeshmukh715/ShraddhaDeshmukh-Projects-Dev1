package com.example.demo.Service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.Constants.MessageConstants;

@Service
@Primary
public class CSVReportServiceImpl implements ReportService{

	@Override
	public String generateReport() {
		// TODO Auto-generated method stub
		return MessageConstants.CSV_GENERATE;
	}

	@Override
	public String downloadReport() {
		// TODO Auto-generated method stub
		return MessageConstants.CSV_DOWNLOAD;
	}

	@Override
	public String archiveReport() {
		// TODO Auto-generated method stub
		return MessageConstants.CSV_ARCHIVE;
	}

}
