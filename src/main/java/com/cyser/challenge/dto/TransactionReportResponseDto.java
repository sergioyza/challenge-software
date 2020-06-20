package com.cyser.challenge.dto;

import java.util.Date;

public class TransactionReportResponseDto {

	private long id;
	private Date weekStart;
	private Date weeekFinish;
	private int Quantity;
	private float ammount;
	private float totalAmount;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getWeekStart() {
		return weekStart;
	}
	public void setWeekStart(Date weekStart) {
		this.weekStart = weekStart;
	}
	public Date getWeeekFinish() {
		return weeekFinish;
	}
	public void setWeeekFinish(Date weeekFinish) {
		this.weeekFinish = weeekFinish;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public float getAmmount() {
		return ammount;
	}
	public void setAmmount(float ammount) {
		this.ammount = ammount;
	}
	public float getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}
	@Override
	public String toString() {
		return "TransactionReportResponseDto [id=" + id + ", weekStart=" + weekStart + ", weeekFinish=" + weeekFinish
				+ ", Quantity=" + Quantity + ", ammount=" + ammount + ", totalAmount=" + totalAmount + "]";
	}

	
}
