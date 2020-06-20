package com.cyser.challenge.service;

import org.springframework.http.ResponseEntity;

import com.cyser.challenge.dto.TransactionDataRequestDto;

public interface TransactionInterface {

	public ResponseEntity<?> addTransaction(TransactionDataRequestDto transactionDataRequestDto);

	public ResponseEntity<?> showTransaction(long transaction_id, long user_id);

	public ResponseEntity<?> listTransaction(long user_id);

	public ResponseEntity<?> sumTransaction(long user_id);

	public ResponseEntity<?> reportTransaction(long user_id);
}
