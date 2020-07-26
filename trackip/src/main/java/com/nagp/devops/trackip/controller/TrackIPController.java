package com.nagp.devops.trackip.controller;

import java.net.InetAddress;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/")
public class TrackIPController {
	
	@GetMapping
	public String knowYourIP() throws Exception {
		InetAddress inetAddress = InetAddress.getLocalHost();
		System.out.println("IP Address: " + inetAddress.getHostAddress());
		System.out.println("Host Name: " + inetAddress.getHostName());
		return ("IP Address: " + inetAddress.getHostAddress() + "for HostName: " + inetAddress.getHostName());
	}
}
