/********************************************************************************************************2*4*w*
 * File:  StudentPojo.java Course materials CST8277
 *
 * @author Teddy Yap
 * @author Shahriar (Shawn) Emami
 * @author (original) Mike Norman
 */
package databank.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import javax.faces.view.ViewScoped;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * TODO 14.1 - Complete the @Entity with correct name.<br>
 * TODO 14.2 - Complete the two @NamedQueries.<br>
 * TODO 15 - Use the correct table name.<br>
 * TODO 16 - Fix the AccessType.<br>
 * TODO 17 - Make StudentPojoListener be the listener of this class.  Refer to:
 * https://www.logicbig.com/tutorials/java-ee-tutorial/jpa/entity-listeners.html<br>
 * TODO 18.1 - Add the program field, add getter and setter, and update toString method to include the program field.<br>
 * TODO 18.2 - Add the remaining @Basic and @Column to all the fields.<br>
 * TODO 19 - Use @Version on the correct field.  This annotation helps keeping track of what version of entity we are
 * working with.<br>
 * TODO 20 - Dates (LocalDateTime) are to be mapped and 'editable' field is not to be mapped.
 */
@ViewScoped
@Entity(name = "some-name")
@Table(name = "some-name", catalog = "databank", schema = "")
@Access(AccessType.SOME_TYPE)
@NamedQuery(name = StudentPojo.STUDENT_FIND_ALL, query = "SELECT something")
@NamedQuery(name = StudentPojo.STUDENT_FIND_ID, query = "SELECT something")
public class StudentPojo implements Serializable {
	private static final long serialVersionUID = 1L;

	public static final String STUDENT_FIND_ALL = "Student.findAll";
	public static final String STUDENT_FIND_ID = "Student.findById";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	private String lastName;
	
	private String firstName;

	private String email;

	private String phoneNumber;

	private LocalDateTime created;

	private LocalDateTime updated;

	private int version = 1;

	private boolean editable;

	public StudentPojo() {
		super();
	}
	
	public boolean getEditable() {
		return editable;
	}
	
	public void setEditable(boolean editable) {
		this.editable = editable;
	}

	public int getId() {
		return id;
	}
	
	/**
	 * @param id new value for id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the value for lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName new value for lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the value for firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName new value for firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDateTime getCreated() {
		return created;
	}
	
	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	public LocalDateTime getUpdated() {
		return updated;
	}
	
	public void setUpdated(LocalDateTime updated) {
		this.updated = updated;
	}

	public int getVersion() {
		return version;
	}
	
	public void setVersion(int version) {
		this.version = version;
	}

	/**
	 * Very important:  Use getter's for member variables because JPA sometimes needs to intercept those calls<br/>
	 * and go to the database to retrieve the value.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		// Only include member variables that really contribute to an object's identity
		// i.e. if variables like version/updated/name/etc. change throughout an object's lifecycle,
		// they shouldn't be part of the hashCode calculation
		return prime * result + Objects.hash(getId());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}

		/* Enhanced instanceof - yeah!
		 * As of JDK 14, no need for additional 'silly' cast:
		    if (animal instanceof Cat) {
		        Cat cat = (Cat) animal;
		        cat.meow();
                // Other class Cat operations ...
            }
         * Technically, 'otherStudentPojo' is a <i>pattern</i> that becomes an in-scope variable binding.
         * Note:  Need to watch out just-in-case there is already a 'otherStudentPojo' variable in-scope!
		 */
		if (obj instanceof StudentPojo otherStudentPojo) {
			// See comment (above) in hashCode():  compare using only member variables that are
			// truly part of an object's identity.
			return Objects.equals(this.getId(), otherStudentPojo.getId());
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [id = ").append(getId());
		if (getLastName() != null) {
			builder.append(", ").append("lastName = ").append(getLastName());
		}
		if (getFirstName() != null) {
			builder.append(", ").append("firstName = ").append(getFirstName());
		}
		if (getPhoneNumber() != null) {
			builder.append(", ").append("phoneNumber = ").append(getPhoneNumber());
		}
		if (getEmail() != null) {
			builder.append(", ").append("email = ").append(getEmail());
		}
		if (getCreated() != null) {
			builder.append(", ").append("created = ").append(getCreated());
		}
		if (getUpdated() != null) {
			builder.append(", ").append("updated = ").append(getUpdated());
		}
		builder.append("]");
		return builder.toString();
	}

}
