package com.itwill.cryptoExchange.Dto;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Embeddable
@Table(name="jumun_detail")
public class JumunDetail {
	
	@ManyToOne(targetEntity=Account.class,  
			cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
	@JoinColumn(name="Account_a_no")
	private int a_no;
	
	@ManyToOne(targetEntity=Product.class, cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
	@JoinColumn(name="Product_p_no")
	private int p_no;
	
	@Column(name="jd_price")
	private int jd_price;
	
	@Column(name="jd_date")
	private Date jd_date;
	
	@Column(name="jd_quantity")
	private int jd_quantity;
	
	@Column(name="jd_type")
	private int jd_type;
	
	
	public JumunDetail() {
		
	}
	
	
	public JumunDetail(int a_no, int p_no, int jd_price, Date jd_date, int jd_quantity, int jd_type) {
		super();
		this.a_no = a_no;
		this.p_no = p_no;
		this.jd_price = jd_price;
		this.jd_date = jd_date;
		this.jd_quantity = jd_quantity;
		this.jd_type = jd_type;
	}
	
	
	
	@Override
	public String toString() {
		return "JumunDetail [a_no=" + a_no + ", p_no=" + p_no + ", jd_price=" + jd_price + ", jd_date=" + jd_date
				+ ", jd_quantity=" + jd_quantity + ", jd_type=" + jd_type + "]";
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
	public int getJd_price() {
		return jd_price;
	}
	public void setJd_price(int jd_price) {
		this.jd_price = jd_price;
	}
	public Date getJd_date() {
		return jd_date;
	}
	public void setJd_date(Date jd_date) {
		this.jd_date = jd_date;
	}
	public int getJd_quantity() {
		return jd_quantity;
	}
	public void setJd_quantity(int jd_quantity) {
		this.jd_quantity = jd_quantity;
	}
	public int getJd_type() {
		return jd_type;
	}
	public void setJd_type(int jd_type) {
		this.jd_type = jd_type;
	}
	
	
}
