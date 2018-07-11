package com.studiomediatech.rmsg;

import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestMessagingController {

	private static final RestMessages FIXTURE = new RestMessages(
			Arrays.asList(new RestMessage(42L, 0L, "resource", "http://some-url-you-better-believe-it")));

	@GetMapping(path = "/")
	public RestMessages getRestMessagesJson() {

		return FIXTURE;
	}

}
