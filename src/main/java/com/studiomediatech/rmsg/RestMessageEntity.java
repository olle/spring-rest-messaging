package com.studiomediatech.rmsg;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name = "messages")
final class RestMessageEntity extends AbstractPersistable<Long> {

	@Column(name = "href", length = 1024, nullable = false)
	private String href;

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}
}
