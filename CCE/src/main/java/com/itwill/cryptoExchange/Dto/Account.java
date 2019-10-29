package com.itwill.cryptoExchange.Dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="Account")
public class Account {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="a_no")
	private int a_no;
	
	@OneToOne(targetEntity = Members.class)
	@JoinColumn(name="Member_m_no")
	private int m_no;
	
	@Column(name="a_bal")
	private int a_bal;
	
	
	@OneToMany(mappedBy="a_no" ,cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
	private List<CurrentBalance> currentBalance;
	
	
	@OneToMany(mappedBy="a_no" ,cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
	private List<JumunDetail> jumunDetail;
	
	
	public Account() {
		
	}
	
	
	public Account(int m_no, int a_bal) {
		super();
		this.m_no = m_no;
		this.a_bal = a_bal;
	}


	@Override
	public String toString() {
		return "Account [a_no=" + a_no + ", m_no=" + m_no + ", a_bal=" + a_bal + "]";
	}
	
	
	public int getA_no() {
		return a_no;
	}
	public void setA_no(int a_no) {
		this.a_no = a_no;
	}
	public int getM_no() {
		return m_no;
	}
	public void setM_no(int m_no) {
		this.m_no = m_no;
	}
	public int getA_bal() {
		return a_bal;
	}
	public void setA_bal(int a_bal) {
		this.a_bal = a_bal;
	}

	
	

}
