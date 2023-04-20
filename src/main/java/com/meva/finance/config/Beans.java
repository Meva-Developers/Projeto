package com.meva.finance.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
public class Beans {
	
	@Bean @RequestScope(proxyMode = ScopedProxyMode.TARGET_CLASS)
	public WebDriver webDriver() {
		ChromeOptions options = new ChromeOptions()
				.addArguments("--no-sandbox")
				.setHeadless(true);
		
		ChromeDriver driver = new ChromeDriver(options);
		
		return driver;
	}

}
