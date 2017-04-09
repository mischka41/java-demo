package de.kuperberg;

import java.util.Calendar;
import java.util.Date;

public class Geburtstagschecker {
	public static void main(String[] args) {
		Object SemionIomdin = new Object();
	
		Calendar cal = Calendar.getInstance();
		if(			cal.get(Calendar.DAY_OF_MONTH)==7
				&& 	cal.get(Calendar.MONTH)==3 /*0 is January*/){
			congratulate(SemionIomdin);
		}
	
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.MONTH)); //January is 0
		Date date = new Date();
		System.out.println(date.getMonth());
	}

	private static void congratulate(Object semionIomdin) {
		System.out.println(semionIomdin.getClass());
	}
}