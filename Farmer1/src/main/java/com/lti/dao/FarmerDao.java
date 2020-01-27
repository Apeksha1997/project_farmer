package com.lti.dao;



import com.lti.model.DetailsFarmer;
import com.lti.model.Farmer;


public interface FarmerDao {
	//public int createFarmer(Farmer farmer);
	public int detailsFarmer(DetailsFarmer  farmer);
	/*public Student readStudentByRollNumber(int rollNumber);
	public int deleteStudentByRollNumber(int rollNumber);
	public int updateStudentByStudentName( int rollNumber,String studentName);
	public int updateStudentByStudentScore(int rollNumber, double studentScore);
	public List<Student> ViewAllStudents();
	*/
}