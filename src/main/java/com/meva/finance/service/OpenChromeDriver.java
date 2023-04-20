package com.meva.finance.service;

import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meva.finance.utils.Utils;

@Service
public class OpenChromeDriver {

	@Autowired
	private WebDriver driver;

	@PostConstruct
	public void sendMessageWhatsappWeb() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://web.whatsapp.com");

	}

	public void sendMessage(Long number, int segundos, String msg) throws InterruptedException {
		try {
			driver.navigate().to(
					"https://web.whatsapp.com/send?phone=+" + number + "&text=" + Utils.converterMsgInWhatSappMsg(msg));
			TimeUnit.SECONDS.sleep(segundos);
			driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[2]/button"))
					.click();
		} catch (Exception e) {
			TimeUnit.SECONDS.sleep(segundos);
			this.sendMessage(number, segundos, msg);
		}

	}

}
