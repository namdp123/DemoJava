package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DemoCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("PHP");
		arrayList.add("Java");
		arrayList.add("Html");
		arrayList.add("C#");
		System.out.println("Danh sach cac phan tu là: ");
		System.out.println("Các phần tử trong list là: " + arrayList);
		List<String> linked = new LinkedList<String>();
		linked.add("PHP");
		linked.add("Java");
		linked.add("Html");
		linked.add("C#");
		System.out.println("Danh sach cac phan tu là: ");
		System.out.println("Danh sach cac phan tu là: "+linked);
		
		//new treeset sap xep cac phan tu
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("PHP");
		hashSet.add("Java");
		hashSet.add("Html");
		hashSet.add("C#");
		System.out.println("Danh sach cac phan tu la: " + hashSet);
		
		//new treeMap sap xep phan tu dau vao key của chung
		Map<String, String> hashMap = new HashMap<String , String>();
		hashMap.put("Windows", "2000");
		hashMap.put("Windows", "XP");
		hashMap.put("Linux", "Kali");
		hashMap.put("Unix", "Android");
		hashMap.put("IOS", "IOS9");
		System.out.println("Danh sách cac phan tu hashMap: "+hashMap);
		
		//Duyet danh sach phan tu
		//Show danh sach itorator
		System.out.println();
		Iterator<String> itr =  arrayList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+ ",");
		}
		//Show ds for - each
		System.out.println();
		for(String obj : arrayList) {
			System.out.println(obj + ", ");
		}
		//Show ds index
		System.out.println();
		int size = arrayList.size();
		for(int i = 0; i < size ; i++)
			System.out.println(arrayList.get(i) + " ");
		
	}

}
