package com.itwill.cryptoExchange.Dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Members")
public class Members {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="m_no")
	private int m_no;
	
	@Column(name="m_id")
	private String m_id;
	
	@Column(name="m_password")
	private String m_password;
	
	@Column(name="m_name")
	private String m_name;
	
	@Column(name="m_email")
	private String m_email;
	
	@Column(name="m_ssn")
	private	int m_ssn;
	
	@Column(name="m_phon")
	private int m_phon;
	
	@OneToMany(mappedBy="m_no" ,cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
	private List<Booking> booking;
	
	
	public Members() {
		
	}
	
	

	public Members(int m_no, String m_id, String m_password, String m_name, String m_email, int m_ssn, int m_phon) {
		super();
		this.m_no = m_no;
		this.m_id = m_id;
		this.m_password = m_password;
		this.m_name = m_name;
		this.m_email = m_email;
		this.m_ssn = m_ssn;
		this.m_phon = m_phon;
	}



	public Members(String m_id, String m_password, String m_name, String m_email, int m_ssn, int m_phon) {
		super();
		this.m_id = m_id;
		this.m_password = m_password;
		this.m_name = m_name;
		this.m_email = m_email;
		this.m_ssn = m_ssn;
		this.m_phon = m_phon;
	}



	@Override
	public String toString() {
		return "Member [m_no=" + m_no + ", m_id=" + m_id + ", m_password=" + m_password + ", m_name=" + m_name
				+ ", m_email=" + m_email + ", m_ssn=" + m_ssn + ", m_phon=" + m_phon + "]";
	}



	public int getM_no() {
		return m_no;
	}

	public void setM_no(int m_no) {
		this.m_no = m_no;
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String getM_password() {
		return m_password;
	}

	public void setM_password(String m_password) {
		this.m_password = m_password;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_email() {
		return m_email;
	}

	public void setM_email(String m_email) {
		this.m_email = m_email;
	}

	public int getM_ssn() {
		return m_ssn;
	}

	public void setM_ssn(int m_ssn) {
		this.m_ssn = m_ssn;
	}

	public int getM_phon() {
		return m_phon;
	}

	public void setM_phon(int m_phon) {
		this.m_phon = m_phon;
	}
	
	
}
