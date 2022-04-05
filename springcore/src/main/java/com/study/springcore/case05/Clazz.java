package com.study.springcore.case05;
//課程
public class Clazz {
      private Integer id;//編號
      private String name;//學名
      private Integer credit;//學分
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCredit() {
		return credit;
	}
	public void setCredit(Integer credit) {
		this.credit = credit;
	}
	@Override
	public String toString() {
		return "Clazz [id=" + id + ", name=" + name + ", credit=" + credit + "]";
	}
}
