/********************************************************************************************************2*4*w*
 * File:  StudentDao.java Course materials CST8277
 *
 * @author Teddy Yap
 * @author Shahriar (Shawn) Emami
 * @author (original) Mike Norman
 */
package databank.dao;

import java.util.List;

import databank.model.StudentPojo;

/**
 * Description:  API for the database C-R-U-D operations
 */
public interface StudentDao {

	List<StudentPojo> readAllStudents();

	// C
	StudentPojo createStudent(StudentPojo student);

	// R
	StudentPojo readStudentById(int studentId);

	// U
	StudentPojo updateStudent(StudentPojo student);

	// D
	void deleteStudentById(int studentId);

}
