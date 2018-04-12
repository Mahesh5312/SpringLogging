package com.logging.spring.SpringLogging;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    @Value("classpath:thermopylae.log")
    private Resource res;
    @Autowired
    private Logger countWords;

    @Override
    public void run(String... args) throws Exception {

    List<RawTestResult> comments =  countWords.getLogTests(res);
    
  
    }
    
    
}