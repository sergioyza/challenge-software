package com.cyser.challenge.dbconexion;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.cyser.challenge.dto.ExceptionResponseDto;
import com.cyser.challenge.dto.TransactionDataRequestDto;
import com.cyser.challenge.entity.TransactionDataEntity;
import com.cyser.challenge.repository.TransactionDataRepository;
import com.cyser.challenge.util.TransactionUtil;

@Component
public class TransactionDBConexion {

	@Autowired
	TransactionDataRepository transactionDataRepository;
	@Autowired
	TransactionUtil transactionUtil;

	public ResponseEntity<?> addTransaction(TransactionDataRequestDto transactionDataRequestDto) {
		
		ExceptionResponseDto responseExceptionDto= new ExceptionResponseDto();
		
		try {		
		TransactionDataEntity newTransaction = new TransactionDataEntity();
		newTransaction.setAmount(transactionDataRequestDto.getAmount());
		newTransaction.setDate(transactionDataRequestDto.getDate());
		newTransaction.setDescription(transactionDataRequestDto.getDescription());
		newTransaction.setUserId(transactionDataRequestDto.getUser_id());
		transactionDataRepository.save(newTransaction);
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(newTransaction);
		
		} catch (Exception e) {
			responseExceptionDto.setStatus(e.getStackTrace().toString());
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(responseExceptionDto);
		}
	}

	public ResponseEntity<?> showTransaction(long transaction_id, long user_id) {
		
		ExceptionResponseDto responseExceptionDto= new ExceptionResponseDto();
		
		try {		
			
			TransactionDataEntity transactionDataEntity= transactionDataRepository.findByIdAndUserId(transaction_id, user_id);

				if (transactionDataEntity==null) {
					responseExceptionDto.setStatus("not found");
					return ResponseEntity.status(HttpStatus.NOT_FOUND).body(responseExceptionDto);
				}
			
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(transactionDataEntity);
			
			} catch (Exception e) {
				responseExceptionDto.setStatus(e.getStackTrace().toString());
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(responseExceptionDto);
			}
	}

	public ResponseEntity<?> listTransaction(long user_id) {
ExceptionResponseDto responseExceptionDto= new ExceptionResponseDto();
		
		try {		
			
			ArrayList<TransactionDataEntity> listTransactionDataEntity= transactionDataRepository.findByUserIdOrderByDateAsc(user_id);
			
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(listTransactionDataEntity);
			
			} catch (Exception e) {
				responseExceptionDto.setStatus(e.getStackTrace().toString());
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(responseExceptionDto);
			}
	}
}
