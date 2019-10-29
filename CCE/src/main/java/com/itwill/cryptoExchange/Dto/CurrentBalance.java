package com.itwill.cryptoExchange.Dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="cur_bal")
public class CurrentBalance {
	
	@ManyToOne(targetEntity=Account.class,
			cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
	@JoinColumn(name="Account_a_no")
	private int a_no;
	
	@ManyToOne(targetEntity=Product.class, cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
	@JoinColumn(name="Product_p_no")
	private int p_no;
	
	@Column(name="c_quantity")
	private int c_quantity;
	
	public CurrentBalance() {
		
	}
	
	
	
	public CurrentBalance(int a_no, int p_no, int c_quantity) {
		super();
		this.a_no = a_no;
		this.p_no = p_no;
		this.c_quantity = c_quantity;
	}
	
	
	
	@Override
	public String toString() {
		return "CurrentBalance [a_no=" + a_no + ", p_no=" + p_no + ", c_quantity=" + c_quantity + "]";
	}


	public int getA_no() {
		return a_no;
	}
	public void setA_no(int a_no) {
		this.a_no = a_no;
	}
	public int getP_no() {
		return p_no;
	}
	public void setP_no(int p_no) {
		this.p_no = p_no;
	}
	public int getC_quantity() {
		return c_quantity;
	}
	public void setC_quantity(int c_quantity) {
		this.c_quantity = c_quantity;
	}
	
	
}
