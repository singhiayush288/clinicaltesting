package com.task.clinicaltesting.service;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;

//import com.task.clinicaltesting.database.DatabaseClass;
//import com.task.clinicaltesting.model.request.RegistrationRequest;
import com.task.clinicaltesting.dto.Testdto;

public interface TestService {
	
	public Testdto getTestingByTestingId(String testingId);

	/*private Map<Integer, RegistrationRequest> tests = DatabaseClass.getTests();
	
	public TestService() {
//		patients.put(1, new RegistrationRequest("1","6ft 2inch","80Kg","85C","180/120","50.5", "80"));
//		patients.put(2, new RegistrationRequest("2","5ft 9inch","65Kg","82C","170/110","45.5", "90"));
	}
	
	public List<RegistrationRequest> getAllTests(){
		return  new ArrayList<RegistrationRequest>(tests.values());
		
	}
	public RegistrationRequest getTest(int id) {
		return tests.get(id);
	}
	public RegistrationRequest addTest(RegistrationRequest request) {
//		request.setId(Integer.toString(patients.size() + 1));
//		patients.put(Integer.parseInt(request.getId()), request);
		return request;
	}*/
	

}

