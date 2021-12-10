package com.MTwo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity (name="CEO")
public class MD 
{
	
 @Id
 @Column(name="USN")
 private int eid;
 
 @Column(name="NAME", nullable=false)
 private String ename;
 
// @Transient //(if we use transient, even if we write setPlace, it doesn't take
 
 @Column(name="place")
 private String  eplace;
 
 @Temporal(TemporalType.DATE) //if you only need date/time use @temporal
 private Date currentTime;
 
public Date getCurrentTime() {
	return currentTime;
}
public void setCurrentTime(Date currentTime) {
	this.currentTime = currentTime;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getEplace() {
	return eplace;
}
public void setEplace(String eplace) {
	this.eplace = eplace;
}
 
 
 
}
