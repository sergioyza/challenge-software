package com.cyser.challenge.dto;

import java.util.ArrayList;

import com.cyser.challenge.entity.TransactionDataEntity;

public class TransactionEntityAndReportDto {

	private TransactionDataEntity transactionDataEntity;
	private ArrayList<TransactionReportResponseDto> TransactionReportResponseDto;
	public TransactionDataEntity getTransactionDataEntity() {
		return transactionDataEntity;
	}
	public void setTransactionDataEntity(TransactionDataEntity transactionDataEntity) {
		this.transactionDataEntity = transactionDataEntity;
	}
	public ArrayList<TransactionReportResponseDto> getTransactionReportResponseDto() {
		return TransactionReportResponseDto;
	}
	public void setTransactionReportResponseDto(ArrayList<TransactionReportResponseDto> transactionReportResponseDto) {
		TransactionReportResponseDto = transactionReportResponseDto;
	}
	@Override
	public String toString() {
		return "TransactionEntityAndReportDto [transactionDataEntity=" + transactionDataEntity
				+ ", TransactionReportResponseDto=" + TransactionReportResponseDto + "]";
	}

	
}
