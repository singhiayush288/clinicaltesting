package com.task.clinicaltesting.dao.impl;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.BeanUtils;

import com.task.clinicaltesting.dao.TestDao;
import com.task.clinicaltesting.dao.entity.TestEntity;
import com.task.clinicaltesting.dto.Testdto;
import com.task.clinicaltesting.hibernate.utils.HibernateUtils;

public class Testdaoimpl implements TestDao{
	
	Session session;

	@Override
	public void openConnection() {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		session= sessionFactory.openSession();
		
	}

	@Override
	public Testdto getTestingById(String testingId) {
		// TODO Auto-generated method stub
		Testdto testdto = new Testdto();
		
		long testId = Long.parseLong(testingId);
		
		CriteriaBuilder crb= session.getCriteriaBuilder();
		
		CriteriaQuery<TestEntity> cquery= crb.createQuery(TestEntity.class);
		
		Root<TestEntity> root= cquery.from(TestEntity.class);
		
		cquery.select(root);
		
		cquery.where(crb.equal(root.get("id"), testId));
		
		Query<TestEntity> query= session.createQuery(cquery);
		
		TestEntity testEntity = query.uniqueResult();
		
		BeanUtils.copyProperties(testEntity, testdto);
		
		return testdto;
		
	}

	
	@Override
	public void closeConnection() {
		// TODO Auto-generated method stub
		if(session!=null)
			session.close();
	}

	@Override
	public Testdto saveTesting(Testdto testdto) {
		// TODO Auto-generated method stub
		Testdto savedTest=null;
		TestEntity testEntity= new TestEntity();
		
		BeanUtils.copyProperties(testdto, testEntity);
		 
		openConnection();
		session.beginTransaction();
		session.save(testEntity);
		session.getTransaction().commit();
		closeConnection();
		
		savedTest= new Testdto();
		BeanUtils.copyProperties(testEntity, savedTest);
		
		return savedTest;
	
	}

}

