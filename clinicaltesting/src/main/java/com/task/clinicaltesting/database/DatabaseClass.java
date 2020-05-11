package com.task.clinicaltesting.database;

import java.util.HashMap;
import java.util.Map;

import com.task.clinicaltesting.model.request.RegistrationRequest;
public class DatabaseClass {
	
	private static Map<Integer, RegistrationRequest> tests = new HashMap<>();
	 
	public static Map<Integer, RegistrationRequest> getTests() {
		return tests;
	}

}
