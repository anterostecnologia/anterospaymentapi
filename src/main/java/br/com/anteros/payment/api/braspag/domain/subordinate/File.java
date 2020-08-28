package br.com.anteros.payment.api.braspag.domain.subordinate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class File {
	
	@JsonProperty("Name")
	private String name;
	
	@JsonProperty("FileType")
	private FileType fileType;
	
	@JsonProperty("Data")
	private String data;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public FileType getFileType() {
		return fileType;
	}

	public void setFileType(FileType fileType) {
		this.fileType = fileType;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
