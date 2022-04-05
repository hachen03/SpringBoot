package com.study.springcore.case01;

public class Ram {
 private Integer gb;
 public Ram() {
	 
	}
public Ram(Integer gb) {
	super();
	this.gb = gb;
}

public Integer getGb() {
	return gb;
}

public void setGb(Integer gb) {
	this.gb = gb;
}
public String toString() {
	return "RAM [gb=" + gb + "]";
}
}
