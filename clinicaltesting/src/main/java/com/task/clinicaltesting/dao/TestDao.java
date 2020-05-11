package com.task.clinicaltesting.dao;

import com.task.clinicaltesting.dto.Testdto;

public interface TestDao {
	
	public void openConnection();
	
	public Testdto getTestingById(String testingId);

	public void closeConnection();

	public Testdto saveTesting(Testdto testdto);

}
