package edu.cjc.imsapp.servicei;

import java.util.List;

import edu.cjc.imsapp.model.Student;

public interface StudentService  {
	
	public void saveStudentdetails(Student stu);
	public List<Student> getAllStudents();
	public List<Student> searchBatch(String batchNumber);
	public Student getSingleStudent(int id);
	public List<Student> updateStudentfees(int studentid, float amount);
	public void removeDelete(int id);
	
}
