package com.cyser.challenge.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "transactions")
public class TransactionDataEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private float amount;
	private String description;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date;
	@Column(name = "user_id", nullable = false)
	private long userId;


	public long getId() {
		return id;
	}

	public void setTransaction_id(long id) {
		this.id = id;
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

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "TransactionDataEntity [transaction_id=" + id + ", amount=" + amount + ", description="
				+ description + ", date=" + date + ", user_id=" + userId + "]";
	}
	
	
	
	
	
	
}
