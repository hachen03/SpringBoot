package com.study.springcore.case04;

public class JPY extends CurrencyImpl {
	@Override
	public void setValue(double value) {
		this.value = value;
	}
	@Override
	public double getValue() {
		return value;
	}

}
