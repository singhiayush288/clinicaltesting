package com.task.clinicaltesting.model.request;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RegistrationRequest {
	
	private String testname;
	private String testdoneby;
	private String testdoneto;
	private String clinicaldeviceused;
	private String testsummary;
	
	public RegistrationRequest() {
		
	}
	public RegistrationRequest(long id, String testname, String testdoneby, String testdoneto, String clinicaldeviceused, String testsummary) {
		super();
		this.testname = testname;
		this.testdoneby = testdoneby;
		this.testdoneto = testdoneto;
		this.clinicaldeviceused = clinicaldeviceused;
		this.testsummary = testsummary;
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
