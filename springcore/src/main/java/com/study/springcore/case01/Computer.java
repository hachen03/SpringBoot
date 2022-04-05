package com.study.springcore.case01;

public class Computer {
  private CPU cpu;
  private Ram ram;
  private HD hd;
public Computer(CPU cpu, Ram ram, HD hd) {
	super();
	this.cpu = cpu;
	this.ram = ram;
	this.hd = hd;
}
public Computer() {
	super();
}
public CPU getCpu() {
	return cpu;
}
public void setCpu(CPU cpu) {
	this.cpu = cpu;
}
public Ram getRam() {
	return ram;
}
public void setRam(Ram ram) {
	this.ram = ram;
}
public HD getHd() {
	return hd;
}
public void setHd(HD hd) {
	this.hd = hd;
}
public Double getPrice() {
	return cpu.getGhz()*8000+ram.getGb()*150+hd.getHd()*20;
}
public String toString() {
	return "Computer [cpu=" + cpu + ", ram=" + ram + ", hd=" + hd + "]"+getPrice();
}
}
