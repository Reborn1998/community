package com.dcj.community;

import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
class CommunityApplicationTests implements ApplicationContextAware {
	private ApplicationContext app;
	@Test
	void contextLoads() {
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.app = applicationContext;
	}
	@Test
	public void testA() {
//		System.out.println(app);
//		Alpha alpha = app.getBean(Alpha.class);
//		System.out.println(alpha.select());
//		AlphaService alphaService = app.getBean(AlphaService.class);
//		System.out.println(alphaService);
//		SimpleDateFormat simpleDateFormat = app.getBean(SimpleDateFormat.class);
//		System.out.println(simpleDateFormat.format(new Date()));
	}
}
