package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Farmer;


@Repository
public class StudentDaoImpl implements StudentDao {
	@PersistenceContext
	private EntityManager entityManager;
	
	public StudentDaoImpl() {
	}
/*
	@Override
	@Transactional
	
	@Override
	public Student readStudentByRollNumber(int rollNumber) {
		return entityManager.find(Student.class, rollNumber);
	}

	@Override
	@Transactional
	public int deleteStudentByRollNumber(int rollNumber) {
	Query query = entityManager.createQuery("delete from Student where rollNumber=:rollNumber");
	query.setParameter("rollNumber", rollNumber);	
	int result = query.executeUpdate();
	return result;
	}

	@Override
	@Transactional
	public int updateStudentByStudentName(int rollNumber, String studentName) {
		Query query1=entityManager.createQuery("update Student set studentName=:studentName where rollNumber=:rollNumber");
		query1.setParameter("studentName", studentName);
		query1.setParameter("rollNumber",rollNumber);
		int result = query1.executeUpdate();
		return result;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public int updateStudentByStudentScore(int rollNumber, double studentScore) {
		Query query1=entityManager.createQuery("update Student set studentScore=:studentScore where rollNumber=:rollNumber");
		query1.setParameter("studentScore", studentScore);
		query1.setParameter("rollNumber",rollNumber);
		int result = query1.executeUpdate();
		return result;	
	}

	@Override
	public List<Student> ViewAllStudents() {
		String jpql="from Student";
		TypedQuery<Student> tquery=entityManager.createQuery(jpql, Student.class);
		return tquery.getResultList();
	}
*/
@Transactional
	@Override
	public int createFarmer(Farmer farmer) {
		entityManager.persist(farmer);
		return 1;
	}
}
