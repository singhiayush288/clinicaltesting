package com.task.clinicaltesting.dto;

public class Testdto {
	private long id;
	private String testname;
	private String testdoneby;
	private String testdoneto;
	private String clinicaldeviceused;
	private String testsummary;
	
	public Testdto(long id, String testname, String testdoneby, String testdoneto, String clinicaldeviceused, String testsummary) {
		super();
		this.id = id;
		this.testname = testname;
		this.testdoneby = testdoneby;
		this.testdoneto = testdoneto;
		this.clinicaldeviceused = clinicaldeviceused;
		this.testsummary = testsummary;
	}
	
	public Testdto() {
		// TODO Auto-generated constructor stub
	}
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
