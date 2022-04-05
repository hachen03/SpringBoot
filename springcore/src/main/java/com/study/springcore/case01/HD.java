package com.study.springcore.case01;

public class HD {
   private Integer hd;

public HD(Integer hd) {
	super();
	this.hd = hd;
}
public HD() {
	super();
}

public Integer getHd() {
	return hd;
}

public void setHd(Integer hd) {
	this.hd = hd;
}
@Override
public String toString() {
	return "HD [hd=" + hd + "]";
}

}
