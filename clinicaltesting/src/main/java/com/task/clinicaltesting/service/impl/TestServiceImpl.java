package com.task.clinicaltesting.service.impl;

import java.util.List;
import java.util.Map;

import com.task.clinicaltesting.dao.TestDao;
import com.task.clinicaltesting.dao.impl.Testdaoimpl;
import com.task.clinicaltesting.dto.Testdto;
import com.task.clinicaltesting.database.DatabaseClass;
import com.task.clinicaltesting.model.request.RegistrationRequest;
import com.task.clinicaltesting.service.TestService;

public class TestServiceImpl implements TestService{

	TestDao testDao = new Testdaoimpl();
	
	@Override
	public Testdto getTestingByTestingId(String testingId) {

		// TODO Auto-generated method stub
		Testdto testdto = getTesting(testingId);
		return testdto;
	}



	private Testdto getTesting(String testingId) {
		// TODO Auto-generated method stub

		Testdto testdto;
		try {
			testDao.openConnection();
			testdto= testDao.getTestingById(testingId);
		}
		finally {
			testDao.closeConnection();

		}
		return testdto;

	}

	



	



}
