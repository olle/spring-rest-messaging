package com.studiomediatech.rmsg;

import java.util.stream.Collectors;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

public interface RestMessagingService {

	RestMessages getMessages();
}

@Component
class RestMessagingServiceImpl implements RestMessagingService {

	private final RestMessageEntityRepository repo;
	private final Converter<RestMessageEntity, RestMessage> converter;

	public RestMessagingServiceImpl(RestMessageEntityRepository repo,
			Converter<RestMessageEntity, RestMessage> converter) {

		this.repo = repo;
		this.converter = converter;
	}

	@Override
	public RestMessages getMessages() {

		return repo.findAll().stream().map(converter::convert)
				.collect(Collectors.collectingAndThen(Collectors.toList(), RestMessages::new));
	}
}