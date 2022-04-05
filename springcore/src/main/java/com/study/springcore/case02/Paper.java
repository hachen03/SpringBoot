package com.study.springcore.case02;

public class Paper {
private Color color;
private Size size;
public Size getSize() {
	return size;
}
public void setSize(Size size) {
	this.size = size;
}
public Paper(Color color,Size size) {
	super();
	this.color = color;
	this.size= size;
}
public Paper() {
	super();

}

public Color getColor() {
	return color;
}

public void setColor(Color color) {
	this.color = color;
}
@Override
public String toString() {
	return "Paper [color=" + color + ", size=" + size + "]";
}

}
