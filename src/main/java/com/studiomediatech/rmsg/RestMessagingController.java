package com.studiomediatech.rmsg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestMessagingController {

	private final RestMessagingService service;

	public RestMessagingController(RestMessagingService service) {
		this.service = service;
	}

	@GetMapping(path = "/")
	public RestMessages getRestMessagesJson() {

		return service.getMessages();
	}

}
