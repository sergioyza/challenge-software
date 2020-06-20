package com.cyser.challenge.util;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cyser.challenge.dto.TransactionReportResponseDto;
import com.cyser.challenge.entity.TransactionDataEntity;

@Component
public class TransactionUtil {

	@Autowired
	WeeksUtil weeks;
	
	public Object historialInfo(int valor,ArrayList<TransactionReportResponseDto> listTransactionReportResponseDto,ArrayList<TransactionDataEntity> listTransactionDataEntity,float total) {
		//logica de negocio
				try {
					if(listTransactionDataEntity.isEmpty()) {
						System.out.println("la transacccion esta vacia");
						return listTransactionReportResponseDto;
					}
				System.out.println("listTransactionDataEntity: "+listTransactionDataEntity);
				TransactionDataEntity transactionDataEntity = listTransactionDataEntity.stream().findFirst().get();
				Calendar mainCalendar = Calendar.getInstance();
				mainCalendar.setTime(transactionDataEntity.getDate());
				Date startWeek = weeks.startFridayOrFirstMonth(mainCalendar);
				Calendar lastDayWeek = Calendar.getInstance();
				lastDayWeek.setTime(startWeek);
				Date endCalendar = weeks.EndWeek(lastDayWeek,true); 
				System.out.println("startWeek: "+startWeek);
				System.out.println("endCalendar: "+endCalendar);
				
				ArrayList<TransactionDataEntity> listTransactionDataEntityTarget = new ArrayList<TransactionDataEntity>();
				
				listTransactionDataEntity.forEach(
						(TransactionDataEntity transactionDataEntityItem)-> 
							{
								System.out.println("Accion: "+transactionDataEntityItem);
								if(transactionDataEntityItem.getDate().before(endCalendar)) {
									listTransactionDataEntityTarget.add(transactionDataEntityItem);
								}
								
							}
						);
				
				//remove from main List;
				
				listTransactionDataEntityTarget.forEach(
						(TransactionDataEntity transactionDataEntityItem)-> 
							{
								listTransactionDataEntity.remove(transactionDataEntityItem);
								
							}
						);
				//sum amount form user id
				float ammountUnit= (float) listTransactionDataEntityTarget.stream()
						.mapToDouble(o -> o.getAmount())
						.sum();
				
				TransactionReportResponseDto transactionReportResponseDto = new TransactionReportResponseDto();
				transactionReportResponseDto.setId(transactionDataEntity.getUserId());
				transactionReportResponseDto.setWeekStart(startWeek);
				transactionReportResponseDto.setWeeekFinish(endCalendar);
				transactionReportResponseDto.setQuantity(listTransactionDataEntityTarget.size());
				transactionReportResponseDto.setAmmount(ammountUnit);
				transactionReportResponseDto.setTotalAmount(total);
				listTransactionReportResponseDto.add(transactionReportResponseDto);
				
				total = total+ammountUnit;
				valor--;
				if(valor==0) {
					return null;
				}
				return historialInfo(valor,listTransactionReportResponseDto,listTransactionDataEntity,total);
				}catch (Exception e) {
					System.out.println("Error: "+e.getStackTrace());
					return e;
				}
	}
}
