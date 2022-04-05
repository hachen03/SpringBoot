package com.study.springcore.case01;

public class CPU {
      private Double ghz;
  	  public CPU() {
  		  System.out.println("建立CPU");
	 }
	  public CPU(Double ghz) {
		super();
		this.ghz = ghz;
	 }
	public Double getGhz() {
		return ghz;
	}
	public void setGhz(Double ghz) {
		this.ghz = ghz;
	}
	public String toString() {
		return "CPU [ghz=" + ghz + "]";
	}

}
