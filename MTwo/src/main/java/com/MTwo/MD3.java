package com.MTwo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//if you just do @generatedvalue.. it'll go like 1,2,3.. auto: +1, sequence: 1,2,30,31..


@Entity 
@Table(name="CEO3")
public class MD3 
{
	
 @Id @GeneratedValue(strategy=GenerationType.SEQUENCE)
 @Column(name="USN")
 private int eid;
 
 @Column(name="NAME")
 private String ename;

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
