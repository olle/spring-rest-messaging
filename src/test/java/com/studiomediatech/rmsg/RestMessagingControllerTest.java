package com.studiomediatech.rmsg;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(MockitoJUnitRunner.class)
public class RestMessagingControllerTest {

	@Mock
	RestMessagingService service;
	
	@InjectMocks
	RestMessagingController controller;
	
	@Test
	public void ensureChecksForMessageAtService() throws Exception {
		
		MockMvcBuilders.standaloneSetup(controller).build().perform(get("/")).andDo(_h -> {
			verify(service).getMessages();
		}).andExpect(status().isOk());
	}

}
