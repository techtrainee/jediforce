package com.aa.hackwars.jediforce.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aa.hackwars.jediforce.model.AWB;

@RestController
public class ApiRestController {

	@Autowired
	private AWBController awbController;
	
	@RequestMapping("/getAWBList/{fltnum}/{fltdat}/{org}/{dst}")
	public List<AWB> getAWBList(@PathVariable String fltnum,String fltdat,String org,String dst){
		System.out.println("Entering");
		return awbController.getAWBList(fltnum,fltdat,org,dst);
	}
	
	@RequestMapping("/hello")
    String getMessage(@RequestParam(value = "name") String name) {
        String rsp = "Hi " + name + " : responded on - " + new Date();
        System.out.println(rsp);
        return rsp;
    }
	
}