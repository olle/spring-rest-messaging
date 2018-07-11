package com.studiomediatech.rmsg;

import java.util.Collection;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class RestMessages {

	private final Collection<RestMessage> messages;

	public RestMessages(Collection<RestMessage> messages) {

		this.messages = messages;
	}

	public Collection<RestMessage> getMessages() {
		return messages;
	}

}
