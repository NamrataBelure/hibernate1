package com.java.hibernate1.hibernate1;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="student_info")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name="which_obj_record")
//@DiscriminatorValue(value="studentInfo")
public class studentInfo {
    @Id
    @GeneratedValue(strategy=GenerationType.TABLE)
    @Column(name="id")
    private int id;
    @Column(name=" frist_Name")
  	private String frist_Name;
    @Column(name=" last_Name")
	private String last_Name;
    @Column(name="email")
	private String email;
	
	public studentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param frist_Name
	 * @param last_Name
	 * @param email
	 * @param sport 
	 * @param noOfStudent 
	 */
	public studentInfo(int id, String frist_Name, String last_Name, String email) {
		super();
		this.id = id;
		this.frist_Name = frist_Name;
		this.last_Name = last_Name;
		this.email = email;
	}
	@Override
	public String toString() {
		return "\n studentInfo [id=" + id + ", frist_Name=" + frist_Name + ", last_Name=" + last_Name + ", email=" + email
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFrist_Name() {
		return frist_Name;
	}

	public void setFrist_Name(String frist_Name) {
		this.frist_Name = frist_Name;
	}

	public String getLast_Name() {
		return last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
