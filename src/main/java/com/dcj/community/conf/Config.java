package com.dcj.community.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

@Configuration
public class Config {
    @Bean
    public SimpleDateFormat simpleDateFormat() {
        return new SimpleDateFormat(("yyyy-mm-dd"));
    }
}
