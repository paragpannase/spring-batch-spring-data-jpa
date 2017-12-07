package com.hovs.demo.config;

import java.io.Serializable;

import org.springframework.batch.core.JobParameter;
import org.springframework.stereotype.Component;


public class CustomJobParameter<T extends Serializable> extends JobParameter {
	private T customParam;

	public CustomJobParameter(T customParam) {
		super("");
		this.customParam = customParam;
	}

	public T getValue() {
		return customParam;
	}
}