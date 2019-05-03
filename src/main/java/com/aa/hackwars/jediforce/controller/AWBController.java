package com.aa.hackwars.jediforce.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

import com.aa.hackwars.jediforce.model.AWB;

@Controller
public class AWBController {

	public List<AWB> getAWBList(@PathVariable String fltnum,String fltdat,String org,String dst){
		
		AWB awbList=new AWB();
		awbList.setAwbNo(12345678);
		
		return Arrays.asList(awbList);
	}
}
