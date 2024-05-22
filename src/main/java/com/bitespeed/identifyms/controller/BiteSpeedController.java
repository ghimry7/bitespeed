package com.bitespeed.identifyms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitespeed.identifyms.entity.Request;
import com.bitespeed.identifyms.entity.Response;
import com.bitespeed.identifyms.service.IBiteSpeedService;

@RestController
@RequestMapping("/bitespeed")
public class BiteSpeedController {

	@Autowired
	private IBiteSpeedService biteService;

	@GetMapping("/identify")
	public Response getIdentifyDetails(@RequestBody Request request) {

		return biteService.getDetails(request);

	}

}
