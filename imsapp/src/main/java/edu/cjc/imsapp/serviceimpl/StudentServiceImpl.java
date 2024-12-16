package edu.cjc.imsapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cjc.imsapp.model.Student;
import edu.cjc.imsapp.repository.StudentRepository;
import edu.cjc.imsapp.servicei.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired 
	  StudentRepository sr;

	@Override
	public void saveStudentdetails(Student stu) {
		sr.save(stu);	
	}

	@Override
	public List<Student> getAllStudents() {
		
		return (List<Student>) sr.findAll();
	}

	@Override
	public List<Student> searchBatch(String batchNumber) {
		
		return sr.findAllByBatchNumber(batchNumber);
	}

	@Override
	public Student getSingleStudent(int id) {

		return sr.findById(id).get();
	}

	@Override
	public List<Student> updateStudentfees(int studentid, float amount) {
	Student s=	sr.findById(studentid).get();
	float paidfees=Float.parseFloat(s.getFeesPaid())+amount;
	s.setFeesPaid(String.valueOf(paidfees));
		sr.save(s);
		return (List<Student>) sr.findAll();
	}

	@Override
	public void removeDelete(int id) {
		sr.deleteById(id);
		
	}

	@Override
	public List<Student> updateStudentBatch(int studentid, String batchNumber) {
		Student s=	sr.findById(studentid).get();
		s.setBatchNumber(batchNumber);
		sr.save(s);
		return (List<Student>) sr.findAll();
	}

//	@Override
//	public List<Student> getBatches() {
//		
//		return (List<Student>) sr.findAll();
//	}
	
	


}
