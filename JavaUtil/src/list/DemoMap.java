package list;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Map<Integer, String> map = new HashMap<Integer, String>();
	map.put(1, "Minh");
	map.put(3, "Ngoc");
	map.put(5, "Nhan");
	map.put(2, "Nam");
	map.put(4, "Lan");
	map.put(6, "Diep");
	Set<Integer> set = map.keySet();
	for (Integer key : set)
		System.out.println(key + " "+map.get(key));
	
	//Sử dụng entrykey de truy cap cac phan tu của map
	System.out.println(" ");
	for (Map.Entry<Integer, String> entry : map.entrySet()) {
		System.out.println(entry.getKey() +" "+ entry.getValue());
	}
	HashMap<String, String> hashMap = new HashMap<>();
	hashMap.put("CSDL", "Cơ sở dữ liệu");
	hashMap.put("HDT", "Lập trình hướng đối tượng");
	hashMap.put("KTLT", "Kỹ thuật lập trình");
	Set< Map.Entry<String, String>> setHashMap = hashMap.entrySet();
	System.out.println("Các entry có trong setHashMap là: "+setHashMap); 
	HashMap<Integer, Integer> hashMap1 = new HashMap<>();
	hashMap1.put(0, 1);
	hashMap1.put(1, 2);
	hashMap1.put(2, 3);
	hashMap1.put(3, 4);
	hashMap1.put(4, 5);
	System.out.println("Danh sach cac phan tu: ");
	hashMap1.forEach((keyInt, valueInt) -> System.out.println("Key= "+keyInt +" value= "
	+valueInt));
	}
	
	

}
