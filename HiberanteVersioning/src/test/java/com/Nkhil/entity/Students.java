package com.Nkhil.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="STUDENT")
public class Students 
{
	@Id
	@Column(name="SID")
	private int sid;
	
	@Column(name="SNAME")
	private String sname;
	
	@Temporal(TemporalType.DATE)
	@Column(name="Date")
	private  Date dt1;
	
	@Temporal(TemporalType.TIME)
	@Column(name="Time")
	private  Date dt2;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="daytime")
	private Date dt3;
	
	public Students()
	{
		System.out.println("USED BY HIBERNATE INDIRECTLY....::"+this);
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Date getDt1() {
		return dt1;
	}
	public void setDt1(Date dt1) {
		this.dt1 = dt1;
	}
	public Date getDt2() {
		return dt2;
	}
	public void setDt2(Date dt2) {
		this.dt2 = dt2;
	}
	public Date getDt3() {
		return dt3;
	}
	public void setDt3(Date dt3) {
		this.dt3 = dt3;
	}
	@Override
	public String toString() {
		return "Students [sid=" + sid + ", sname=" + sname + ", dt1=" + dt1 + ", dt2=" + dt2 + ", dt3=" + dt3 + "]";
	}
	
	
	
}
