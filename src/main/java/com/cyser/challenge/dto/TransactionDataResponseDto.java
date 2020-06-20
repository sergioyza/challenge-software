package com.cyser.challenge.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class TransactionDataResponseDto {

	private long transaction_id;
	private float amount;
	private String description;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date;
	private long user_id;
	public long getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(long transaction_id) {
		this.transaction_id = transaction_id;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	
	
}
