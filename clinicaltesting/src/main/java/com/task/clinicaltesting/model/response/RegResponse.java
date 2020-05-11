package com.task.clinicaltesting.model.response;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RegResponse {
	
	private long id;
	private String testname;
	private String testdoneby;
	private String testdoneto;
	private String clinicaldeviceused;
	private String testsummary;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String gettestname() {
		return testname;
	}

	public void settestname(String testname) {
		this.testname = testname;
	}

	public String gettestdoneby() {
		return testdoneby;
	}

	public void settestdoneby(String testdoneby) {
		this.testdoneby = testdoneby;
	}

	public String gettestdoneto() {
		return testdoneto;
	}

	public void settestdoneto(String testdoneto) {
		this.testdoneto = testdoneto;
	}

	public String getclinicaldeviceused() {
		return clinicaldeviceused;
	}

	public void setclinicaldeviceused(String clinicaldeviceused) {
		this.clinicaldeviceused = clinicaldeviceused;
	}

	public String gettestsummary() {
		return testsummary;
	}

	public void settestsummary(String testsummary) {
		this.testsummary = testsummary;
	}


	
}
