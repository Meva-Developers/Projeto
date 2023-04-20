package com.meva.finance.model;

import javax.validation.constraints.NotBlank;

public class InfoDTO {

	@NotBlank
	private String msg;

	@NotBlank
	private int segundos;

	@NotBlank
	private String nameSheet;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	public String getNameSheet() {
		return nameSheet;
	}

	public void setNameSheet(String nameSheet) {
		this.nameSheet = nameSheet;
	}

}
