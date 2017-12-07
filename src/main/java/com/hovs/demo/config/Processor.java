package com.hovs.demo.config;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.hovs.demo.repo.Benefit;

@Component
public class Processor implements ItemProcessor<Benefit, Benefit> {

	@Override
	public Benefit process(Benefit benefit) throws Exception {
		return benefit;
	}

}