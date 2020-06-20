package com.cyser.challenge.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyser.challenge.entity.TransactionDataEntity;

@Repository
public interface TransactionDataRepository extends JpaRepository<TransactionDataEntity, Long>{

	TransactionDataEntity findByIdAndUserId(long id, long user_id);
	ArrayList<TransactionDataEntity> findByUserIdOrderByDateAsc(long user_id);
}
