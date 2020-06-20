package com.cyser.challenge.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {

	@GetMapping("")
	public Map<String,String> Health_check(){
		Map<String,String> versionProyect  = new HashMap<>();
		versionProyect.put("version","1.0.0");
		versionProyect.put("status","200");
		return versionProyect;
	}
	
}
