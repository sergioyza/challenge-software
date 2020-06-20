package com.cyser.challenge.util;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class WeeksUtil {

	public Date startFridayOrFirstMonth(Calendar calendar) {
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		
		System.out.println("ya es primero: "+dayOfMonth);
		if(dayOfMonth==1) {
			calendar.set(Calendar.HOUR_OF_DAY, 0);
			return calendar.getTime();
		}
		
		if(dayOfWeek==6) {
			
			calendar.set(Calendar.HOUR_OF_DAY, 0);
			return calendar.getTime();
		}
		calendar.add(Calendar.DATE, -1);
		return startFridayOrFirstMonth(calendar);
	}
	
	public Date EndWeek(Calendar calendar,boolean first) {

		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		if(dayOfMonth==1 && !first) {
			calendar.add(Calendar.DATE,-1);
			calendar.set(Calendar.HOUR,23);
			calendar.set(Calendar.MINUTE,59);
			calendar.set(Calendar.SECOND,59);
			return calendar.getTime();
		}
		if(dayOfWeek==5) {
			calendar.set(Calendar.HOUR,23);
			calendar.set(Calendar.MINUTE,59);
			calendar.set(Calendar.SECOND,59);
			return calendar.getTime();
			
		}
		
		calendar.add(Calendar.DATE,1);
		return EndWeek(calendar,false);	
	}
	
	
	
	
	
}
