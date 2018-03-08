package set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DemoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []count = {10,72,36,45,25,66,87,18,83};
		Set<Integer> set = new HashSet<Integer>();
		try {
			for(int i = 0; i< 6 ; i++) {
				set.add(count[i]);
			}
			//sap xep danh sach cac phan tu
			System.out.println(set);
			TreeSet sortedSet = new TreeSet<Integer>(set);
			System.out.print("Danh sach sach da sap xep la: ");
			System.out.println(sortedSet);
			System.out.println("Phan tu dau tien cua tap hop la: "+sortedSet.first());
			System.out.println("Phan tu cuoi cung la: "+sortedSet.last());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//kiem tra set con 
		System.out.println("kiem tra set con ");
		Integer []count1 = {36,45,25};
		List<Integer> list1 = Arrays.asList(count1);
		Set<Integer> set1 = new HashSet<Integer>();
		set1.addAll(list1);
		//set1.add(count[]);
		if(set.containsAll(set1)) {
			System.out.println("Set 1 là con của set");
		}
		else
			System.out.println("Set 1 khong là con cua set");
		
		//Remove phan tu
		System.out.println();
		set.remove(1);
		if(set.contains(72)){
			System.out.println("Xoa thanh cong");
			set.remove(72);
			System.out.println("Danh sach cac phan tu con lai: "+set);
			System.out.println("So phan tu con lai sau khi xoa: "+set.size());
		}
		else
			System.out.println("Xoa that bai");
		
		//xoa cac phan tu trong set
		System.out.println();
		set.clear();
		if(set.isEmpty())
			System.out.println("khong co phan tu nao");
		
		
		//set addAll
		Integer []Array = {44,65,32,43,76,98};
		Set<Integer> set2 = new HashSet<Integer>();
		List<Integer> list2 = Arrays.asList(Array);
		set2.addAll(list2);
		set1.addAll(set2);
		System.out.println("Danh sach set 1 la: " +set1);
		TreeSet<Integer> sortedset1 = new TreeSet<Integer>(set1);
		System.out.println("Danh sach sau khi sap xep la: "+sortedset1);
	
	}

}
