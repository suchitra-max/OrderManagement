package com.example.OrderItemService;

public class OrderItemBean {

	String Pcode;
	String pname;
	int quantity;
	public String getPcode() {
		return Pcode;
	}
	public void setPcode(String pcode) {
		Pcode = pcode;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
