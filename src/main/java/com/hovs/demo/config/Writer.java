package com.hovs.demo.config;
import java.util.List;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import com.hovs.demo.repo.Benefit;
 
@Component
public class Writer implements ItemWriter<Benefit> {
 
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public void write(List<? extends Benefit> benefits) throws Exception {
		System.out.println("#Writer Step: " + benefits.size());
		for(Benefit msg : benefits){
			System.out.println("#Writer Step: " + msg);
		}
	}
	
}