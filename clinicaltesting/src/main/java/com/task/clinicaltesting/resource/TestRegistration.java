package com.task.clinicaltesting.resource;

import java.util.List;

import org.springframework.beans.BeanUtils;

import com.task.clinicaltesting.service.TestService;
import com.task.clinicaltesting.service.impl.TestServiceImpl;
import com.task.clinicaltesting.dao.TestDao;
import com.task.clinicaltesting.dao.impl.Testdaoimpl;
import com.task.clinicaltesting.dto.Testdto;
import com.task.clinicaltesting.model.request.RegistrationRequest;
import com.task.clinicaltesting.model.response.RegResponse;


import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("/summary")
public class TestRegistration {
	
	@GET
	@Path("/{testingId}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public RegResponse getTestingById(@PathParam("testingId") String testingId) {
		RegResponse response= new RegResponse();
		//Rertrieve booking details

			TestService testService= new TestServiceImpl();
			Testdto testdto = testService.getTestingByTestingId(testingId);
		//prepare response

			BeanUtils.copyProperties(testdto, response);

		return response;

	}
/*
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public List<RegResponse> getTestingPerPage(@DefaultValue("0") @QueryParam("start") int start,
			@DefaultValue("1") @QueryParam("limit") int limit) {

		List<RegResponse> response= new ArrayList<RegResponse>();
		//Retrieve all booking details per page

			TestService testService= new TestServiceImpl();
			List<Testdto> testdtoList = testService.getBookings(start, limit);
		//prepare response

			for(Testdto testdto: testdtoList) {
				RegResponse eachresponse= new RegResponse();
				BeanUtils.copyProperties(testdto, eachresponse);
				eachresponse.setHref("/summary/"+eachresponse.getTestingId());
				response.add(eachresponse);
			}
		return response;

	}
*/
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public RegResponse addTestInfo(RegistrationRequest request) {
		
		RegResponse response = new RegResponse();
		//prepare bookingdto
				Testdto testdto = new Testdto();
				BeanUtils.copyProperties(request, testdto);
				
				//create booking
				TestDao testdao= new Testdaoimpl();
				Testdto createdtestdto = testdao.saveTesting(testdto);
				
				//prepare response
				BeanUtils.copyProperties(createdtestdto, response);
		
		
		return response;
		
		//return patientService.addPatient(request);
	}
	
	//@GET
		//@Produces(MediaType.APPLICATION_JSON)
		//public List<RegistrationRequest> getAllTestInfo() {
			//return testService.getAllTests();
		//}
		
		//@GET
		//@Path("/{id}")
		//@Produces(MediaType.APPLICATION_JSON)
		//public RegistrationRequest getSingleTestInfo(@PathParam("id") int id) {
			//return testService.getTest(id);
		//}
		


}