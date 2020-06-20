package com.cyser.challenge.dto;

public class ResponseSumDto {

	private long user_id;
	private float suma;
	
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public float getSuma() {
		return suma;
	}
	public void setSuma(float suma) {
		this.suma = suma;
	}
	@Override
	public String toString() {
		return "ResponseSumDto [user_id=" + user_id + ", suma=" + suma + "]";
	}
	
	
}
