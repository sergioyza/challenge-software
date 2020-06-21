package com.cyser.challenge.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class TransactionReportResponseDto {

	private long id;
	private String weekStart;
	private String weekFinish;
	private int Quantity;
	private float ammount;
	private float totalAmount;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getWeekStart() {
		return weekStart;
	}
	public void setWeekStart(String weekStart) {
		this.weekStart = weekStart;
	}
	public String getWeekFinish() {
		return weekFinish;
	}
	public void setWeekFinish(String weekFinish) {
		this.weekFinish = weekFinish;
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
		return "TransactionReportResponseDto [id=" + id + ", weekStart=" + weekStart + ", weeekFinish=" + weekFinish
				+ ", Quantity=" + Quantity + ", ammount=" + ammount + ", totalAmount=" + totalAmount + "]";
	}

	
}
