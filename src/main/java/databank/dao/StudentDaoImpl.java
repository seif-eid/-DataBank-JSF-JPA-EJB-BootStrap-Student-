/********************************************************************************************************2*4*w*
 * File:  StudentDaoImpl.java Course materials CST8277
 *
 * @author Teddy Yap
 * @author Shahriar (Shawn) Emami
 * @author (original) Mike Norman
 */
package databank.dao;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import databank.model.StudentPojo;

/**
 * Description:  Implements the C-R-U-D API for the database
 * 
 * TODO 01 - Some components are managed by CDI.<br>
 * TODO 02 - Methods which perform DML need @Transactional annotation.<br>
 * TODO 03 - Fix the syntax errors to correct methods. <br>
 * TODO 04 - Refactor this class.  Move all the method bodies and EntityManager to a new service class (e.g. StudentService) which is a
 * singleton (EJB).<br>
 * TODO 05 - Inject the service class using EJB.<br>
 * TODO 06 - Call all the methods of service class from each appropriate method here.
 */
@Named
@ApplicationScoped
public class StudentDaoImpl implements StudentDao, Serializable {
	/** explicitly set serialVersionUID */
	private static final long serialVersionUID = 1L;

	//Get the log4j2 logger for this class
	private static final Logger LOG = LogManager.getLogger();

	protected EntityManager em;

	@Override
	public List<StudentPojo> readAllStudents() {
		LOG.debug("reading all students");
		//Use the named JPQL query from the StudentPojo class to grab all the students
		TypedQuery<StudentPojo> allStudentsQuery = em.createNamedQuery(StudentPojo.STUDENT_FIND_ALL, StudentPojo.class);
		//Execute the query and return the result/s.
		return allStudentsQuery.getResultList();
	}

	@Override
	public StudentPojo createStudent(StudentPojo student) {
		LOG.debug("creating a student = {}", student);
		em.something(student);
		return student;
	}

	@Override
	public StudentPojo readStudentById(int studentId) {
		LOG.debug("read a specific student = {}", studentId);
		return em.something(StudentPojo.class, studentId);
	}

	@Override
	public StudentPojo updateStudent(StudentPojo studentWithUpdates) {
		LOG.debug("updating a specific student = {}", studentWithUpdates);
		StudentPojo mergedStudentPojo = em.something(studentWithUpdates);
		return mergedStudentPojo;
	}

	@Override
	public void deleteStudentById(int studentId) {
		LOG.debug("deleting a specific studentID = {}", studentId);
		StudentPojo student = readStudentById(studentId);
		LOG.debug("deleting a specific student = {}", student);
		if (student != null) {
			em.refresh(student);
			em.remove(student);
		}
	}

}
