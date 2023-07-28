package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HttpClientWrapper {

    @Autowired
	RestTemplate restTemplate;

    void getEmployees() {
		final String uri = "https://www.bing.com";
		String result = restTemplate.getForObject(uri, String.class);
		result.indexOf("Lokesh");
	}

}
