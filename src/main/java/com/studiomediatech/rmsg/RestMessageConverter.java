package com.studiomediatech.rmsg;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
class RestMessageConverter implements Converter<RestMessageEntity, RestMessage> {

	@Override
	public RestMessage convert(RestMessageEntity source) {

		return new RestMessage(source.getId(), source.getHref());
	}
}
