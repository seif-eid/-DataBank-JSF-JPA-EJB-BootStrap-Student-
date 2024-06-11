/********************************************************************************************************2*4*w*
 * File:  StudentPojoListener.java Course materials CST8277
 *
 * @author Teddy Yap
 * @author Shahriar (Shawn) Emami
 * @author (original) Mike Norman
 */
package databank.model;

import java.time.LocalDateTime;

/**
 * TODO 21 - What annotations should be used on these methods?
 * https://www.logicbig.com/tutorials/java-ee-tutorial/jpa/entity-listeners.html<br>
 */
public class StudentPojoListener {

	//TODO 22 - Called before persist to add the dates
	public void setCreatedOnDate(StudentPojo student) {
		LocalDateTime now = LocalDateTime.now();
		student.setCreated(now);
		//Might as well call setUpdated as well
		student.setUpdated(now);
	}

	//TODO 23 - Called before update to update the date
	public void setUpdatedDate(StudentPojo student) {
		student.setUpdated(LocalDateTime.now());
	}

}
