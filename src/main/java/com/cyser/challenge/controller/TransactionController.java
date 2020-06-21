package com.cyser.challenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cyser.challenge.dto.TransactionDataRequestDto;
import com.cyser.challenge.service.TransactionInterface;

@RestController
@RequestMapping("/transaction")
@CrossOrigin("http://localhost:4200")
public class TransactionController {

	@Autowired
	TransactionInterface TransactionServiceImp;
	
	@PostMapping("")
	public ResponseEntity<?> addTransacion(@RequestBody TransactionDataRequestDto transactionDataRequestDto){
		return TransactionServiceImp.addTransaction(transactionDataRequestDto);
	}
	
	@GetMapping("/{transaction_id}/user/{user_id}")
	public ResponseEntity<?> showTransaction(@PathVariable long transaction_id,@PathVariable long user_id){
		return TransactionServiceImp.showTransaction(transaction_id,user_id);
	}
	
	@GetMapping("/user/{user_id}")
	public ResponseEntity<?> ListTransaction(@PathVariable long user_id){
		return TransactionServiceImp.listTransaction(user_id);
	}
	
	@GetMapping("/user/{user_id}/sum")
	public ResponseEntity<?> SumTransaction(@PathVariable long user_id){
		return TransactionServiceImp.sumTransaction(user_id);
	}
	
	@GetMapping("/user/{user_id}/report")
	public ResponseEntity<?> ReportTransaction(@PathVariable long user_id){
		return TransactionServiceImp.reportTransaction(user_id);
	}
}
