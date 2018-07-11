package com.studiomediatech.rmsg;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class RestMessage {

	private final Long id;
	private final String href;

	public RestMessage(Long id, String href) {
		this.id = id;
		this.href = href;
	}

	public Long getId() {
		return id;
	}

	public String getHref() {
		return href;
	}

}
