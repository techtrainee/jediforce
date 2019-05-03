package com.aa.hackwars.jediforce.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PathVariable;

import com.aa.hackwars.jediforce.model.AWB;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class AWBController {
	private static final String DATABASE = "database";
	private static final String FILE = "file";
	private static final String FILE_PATH = "filepath";
	private static final String DATA_SOURCE = "datasource";

	@Autowired
	private Environment environment;

	public List<AWB> getAWBList(@PathVariable String flightNumber, String flightDate, String origin,
			String destination) {
		String dataSource = environment.getProperty(DATA_SOURCE);
		System.out.println("DataSource: " + dataSource);
		List<AWB> awbDetails = null;
		switch (dataSource) {
		case FILE:
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(Feature.AUTO_CLOSE_SOURCE, true);
			String jsonFilePath = environment.getProperty(FILE_PATH);
			System.out.println("Reading from :" + jsonFilePath);
			try {
				
				System.out.println("TestING");
				//awbDetails = mapper.readValue(new File(jsonFilePath), new TypeReference<List<AWB>>() {});
				//System.out.println("AWB Details Read....");
				
				//File file = new File(getClass().getResource(jsonFilePath).getFile());
				//awbDetails = mapper.readValue(file, new TypeReference<List<AWB>>() {});
				
				
				
				System.out.println("Reading....");
				InputStream is = new ClassPathResource(jsonFilePath).getInputStream();
				try {
				    String contents = new String(FileCopyUtils.copyToByteArray(is), StandardCharsets.UTF_8);
				    System.out.println(contents); // do something with the content here
				    is.close();
				} catch (IOException e) {
				    e.printStackTrace();
				}
				
		
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Ending getAWBDetails....");
			break;
		case DATABASE:
			break;
		}
		return awbDetails;
	}
}
