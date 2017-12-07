package com.hovs.demo.config;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hovs.demo.repo.Benefit;
import com.hovs.demo.repo.BenefitRepository;

@Component
public class Reader implements ItemReader<Benefit> {

	private String[] messages = { "Hello World!", "Welcome to Spring Batch!,Hello World!",
			"Welcome to Spring Batch!,Hello World!", "Welcome to Spring Batch!" };

	private int count = 0;

	Logger logger = LoggerFactory.getLogger(this.getClass());

	List<Benefit> benefits = null;

	@Autowired
	private BenefitRepository benefitRepository;

	@Override
	public Benefit read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {

		if (benefits == null) {
			benefits = benefitRepository.findAll();
			System.err.println(benefits.size());
		}
		if (count < benefits.size()) {
			return benefits.get(count++);
		} else {
			count = 0;
		}
		return null;
	}

}
