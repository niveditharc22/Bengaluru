package com.MTwo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="CEO1")
public class MD1 
{
	
 @Id
 @Column(name="USN")
 private int eid;
 
 @Column(name="NAME")
 private String ename;
 
// @Transient //(if we use transient, even if we write setPlace, it doesn't take
 @Column(name="place")
 private String  eplace;
 
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
