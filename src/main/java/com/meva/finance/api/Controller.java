package com.meva.finance.api;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.meva.finance.model.InfoDTO;
import com.meva.finance.service.OpenChromeDriver;
import com.meva.finance.service.ReadExcelService;

@RestController
public class Controller {

	@Autowired
	ReadExcelService readExcelService;
	@Autowired
	OpenChromeDriver chrome;

	@PostMapping("/load")
	private void loadDataExcel(@RequestBody InfoDTO info) throws IOException, InterruptedException {
		List<Long> loadDataExcel = readExcelService.loadDataExcel(info.getNameSheet());

		for (Long number : loadDataExcel) {
			chrome.sendMessage(number, info.getSegundos(), info.getMsg());
		}

	}

}
