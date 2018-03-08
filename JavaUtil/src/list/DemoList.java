package list;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class DemoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> list = new ArrayList<String>();
//		String []arr = {"KTLT","TRR","DHMT","MMT"};
//		list = Arrays.asList(arr);
		list.add("HDT");
		list.add("AI");
		list.add("CSDL");
		list.add(2, "CTDL");
		System.out.println("Phan tu vi tri thu 4 la: "+list.get(3));
		for (String s : list)
			System.out.println(s);
		System.out.println("Danh sach mon hoc: "+list);
		
		//Add list sử dụng Arrays.asList
		System.out.println();
		String[] arr = {"TRR","KTLT","AI","CSDL","MMT"};
		List <String> list1 = Arrays.asList(arr);
		for(String s : list1)
			System.out.println("Mon hoc: " +s);
	}

}
