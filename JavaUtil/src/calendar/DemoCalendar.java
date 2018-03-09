package calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DemoCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		Date date = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("E dd - MM - yyyy");
		System.out.println("Ngay gioi hien tai: "+ft.format(calendar.getTime()));
		calendar.add(Calendar.DATE, 15);
		System.out.println("15 ngay sau: "+ft.format(calendar.getTime()));
		calendar.add(Calendar.MONTH, 11);
		System.out.println("11 thang sau: "+ft.format(calendar.getTime()));
		calendar.add(Calendar.YEAR, 1);
		System.out.println("20 nam sau: "+ft.format(calendar.getTime()));
		
		
		//Phuong thuc get
		System.out.println("Day: "+calendar.get(Calendar.DATE));
		System.out.println("Month: "+calendar.get(Calendar.MONTH));
		System.out.println("Year: "+calendar.get(Calendar.YEAR));
		System.out.println("Week of month: "+calendar.get(Calendar.WEEK_OF_MONTH));
		
		//phuong thuc get Maximum
		System.out.println();
		int maximum = calendar.getMaximum(Calendar.DAY_OF_WEEK);
		System.out.println("Gia tri max cua so ngay trong tuan: "+maximum);
		maximum = calendar.getMaximum(Calendar.WEEK_OF_YEAR);
		System.out.println("Gia tri max cua so tuan trong nam: "+maximum);
		

	}

}
