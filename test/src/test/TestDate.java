package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestDate {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.HOUR_OF_DAY, 0);
		SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddHH");
		System.out.println(sf.format(cal.getTime()));
	}
}
