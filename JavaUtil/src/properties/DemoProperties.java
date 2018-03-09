package properties;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class DemoProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties capitals = new Properties();
		Set states;
		String str;
		capitals.put("Ha Noi", "Viet Nam");
		capitals.put("BangKok", "Thai Lan");
		capitals.put("Pnompenh", "Lao");
		capitals.put("Seoul", "Han Quoc");
		capitals.put("Tokyo", "Nhat");
		states = capitals.keySet();
		Iterator itr = states.iterator();
		while (itr.hasNext()) {
			str = (String)itr.next();
			System.out.println("Thanh pho cua: "+capitals.getProperty(str) +" la: "+ str);
		}
		System.out.println();
		//Tim kiem state khong có trong list
		str = capitals.getProperty("America","Not Found");
		System.out.println("Thanh pho cua America la: "+str+".");
	}

}
