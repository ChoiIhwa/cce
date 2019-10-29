package com.itwill.cryptoExchange.Dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Booking")
public class Booking {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="b_no")
	private int b_no;
	
	@ManyToOne(targetEntity=Members.class, cascade= CascadeType.ALL)
	@JoinColumn(name="Member_m_no")
	private int m_no;
	
	@ManyToOne(targetEntity=Product.class, cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
	@JoinColumn(name="Product_p_no")
	private int p_no;
	
	@Column(name="b_price")
	private int b_price;
	
	@Column(name="b_orderPrice")
	private int b_orderPrice;
	
	@Column(name="b_type")
	private	int b_type;
	
	public Booking() {
		
	}
	
	
	public Booking(int m_no, int p_no, int b_price, int b_orderPrice, int b_type) {
		super();
		this.m_no = m_no;
		this.p_no = p_no;
		this.b_price = b_price;
		this.b_orderPrice = b_orderPrice;
		this.b_type = b_type;
	}
	
	
	@Override
	public String toString() {
		return "Booking [m_no=" + m_no + ", p_no=" + p_no + ", b_price=" + b_price + ", b_orderPrice=" + b_orderPrice
				+ ", b_type=" + b_type + "]";
	}


	public int getM_no() {
		return m_no;
	}
	public void setM_no(int m_no) {
		this.m_no = m_no;
	}
	public int getP_no() {
		return p_no;
	}
	public void setP_no(int p_no) {
		this.p_no = p_no;
	}
	public int getB_price() {
		return b_price;
	}
	public void setB_price(int b_price) {
		this.b_price = b_price;
	}
	public int getB_orderPrice() {
		return b_orderPrice;
	}
	public void setB_orderPrice(int b_orderPrice) {
		this.b_orderPrice = b_orderPrice;
	}
	public int getB_type() {
		return b_type;
	}
	public void setB_type(int b_type) {
		this.b_type = b_type;
	}
	
}
