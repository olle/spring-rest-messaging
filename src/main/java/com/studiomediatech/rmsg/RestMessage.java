package com.studiomediatech.rmsg;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class RestMessage {

	private final Long id;
	private final Long segment;
	private final String rel;
	private final String link;

	public RestMessage(Long id, Long segment, String rel, String link) {

		this.id = id;
		this.segment = segment;
		this.rel = rel;
		this.link = link;
	}

	public Long getId() {
		return id;
	}

	public Long getSegment() {
		return segment;
	}

	public String getRel() {
		return rel;
	}

	public String getLink() {
		return link;
	}

}
