package date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date =new Date();
		System.out.println(date);
		SimpleDateFormat ft = new SimpleDateFormat("E dd - MM - yyyy 'at' hh.mm.ss a zzz");
		System.out.println("Day hien tai: "+ft.format(date));
		String input = args.length == 0 ? "15 - 11 - 1996" : args[0];
		System.out.println(input +" Duoc parse thanh cong");
		Date  t;
		try {
			t = ft.parse(input);
			System.out.println(t);
		} catch (ParseException e) {
			// TODO: handle exception
			System.out.println("khong the parse duoc boi su dung: "+ft.hashCode());
		}
		
		
		//Dinh chi thoi gian
		System.out.println();
		try {
			System.out.println(new Date() + "\n");
			Thread.sleep(5*60*10);
			System.out.println(new Date() + "\n");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Nhan mot exeption: ");
		}
		
		//Do luong thoi gian da troi qua
		try {
			long start = System.currentTimeMillis();
			System.out.println(new Date() + "\n");
			Thread.sleep(5*10*60);
			System.out.println(new Date()+ " \n");
			long end = System.currentTimeMillis();
			long diff = end - start;
			System.out.println("Khac nhau la: "+diff);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Co mot Exeption");
		}
	}

}
