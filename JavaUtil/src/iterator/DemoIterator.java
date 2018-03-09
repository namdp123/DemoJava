package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class DemoIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> array = new ArrayList<String>();
		array.add("Xuan");
		array.add("Ha");
		array.add("Thu");
		array.add("Dong");
		
		
		//su dung iterator de hin thi noi dung cua list
		System.out.println("Danh sach cac mua la: ");
		Iterator itr = array.iterator();
		while (itr.hasNext()) {
			Object element = itr.next();
			System.out.println(element);

		}
		//sua doi cac dong sau khi da lap qua
		System.out.println();
		ListIterator litr = array.listIterator();
		while(litr.hasNext()) {
			Object element = litr.next();
			litr.set("Mua " + element);
		}
		System.out.println("Noi dung sau khi sua doi: ");
		itr = array.iterator();
		while(itr.hasNext()) {
			Object element = itr.next();
			System.out.println(element);
		}
		
		//Hien thi danh sach theo chieu nguoc lai
		System.out.println();
		System.out.println("Hien thi danh sach theo chieu nguoc lai: ");
		while(litr.hasPrevious()) {
			Object element = litr.previous();
			System.out.println(element);
		}
	}

}
