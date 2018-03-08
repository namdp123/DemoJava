package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class DemoIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("PHP");
		list.add("Java");
		list.add("C#");
		list.add("Python");
		list.add("C++");
		list.add(0,"Ruby");
		System.out.println("Phan tu thu 2 la: " +list.get(1));
		ListIterator<String> itr = list.listIterator();
		System.out.println("Duyen danh sach tu dau den cuoi");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Duyen danh sach cuoi ve dau");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		List<String> listAdd = new ArrayList<String>();
		listAdd.add("Java script");
		listAdd.addAll(list);
		System.out.println("Danh sach list add all" +listAdd);
		
		//Sua phan tu trong danh sach
		listAdd.set(3, "C++");
		System.out.println("Danh sach sau khi thay doi");
		System.out.println(listAdd);
		
		//Xoa phan tu trong danh sach
		listAdd.remove(0);
		System.out.println("Danh sach sau khi xoa: "+listAdd);
		listAdd.remove("C#");
		System.out.println("Danh sach sau khi xoa: " +listAdd);
		
		//Tim kiem phan tu
		if(listAdd.contains("Python")) {
			System.out.println(" Co phan tu python trong list");
		}
		else {
			System.out.println("Khong tim thay phan tu nay");
		}
		if(listAdd.contains(2)) {
			System.out.println("Phan tu thu 2 trong list la" + listAdd.get(2));
		}
		else {
			System.out.println("Khong co phan tu nay");
		}
		int firstIndex = listAdd.indexOf("C++");
		System.out.println("Vi tri xua hien dau tien cua phan tu C++ la: " +firstIndex);
		int lastIndex = listAdd.lastIndexOf("C++");
		System.out.println("Lan cuoi cung phan tu C++ xuat hien tai vi tri: " +lastIndex);
		
		//Sap xep danh sach
		listAdd.add("Java");
		listAdd.add("C");
		listAdd.add("Html");
		listAdd.add("Json");
		listAdd.add("C#");
		Collections.sort(listAdd);
		System.out.println("Danh sach phan tu sau khi sap xep: "+listAdd);
		
		//Copy list
		List <String> listCopy = new ArrayList<String>();
		listCopy.add("CSS");
		listCopy.add("Java core");
		Collections.copy(list, listCopy);
		System.out.println(list);
		
		//Hoan vị
		System.out.println("Danh sach truoc khi hoan vi: " +listAdd);
		Collections.shuffle(listAdd);
		System.out.println("Danh sach da hoan vi: "+listAdd);
	}

}
