package vector;

import java.util.*;

public class DemoVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector(3 , 2);
		System.out.println("Kich thuoc ban dau: "+v.size());
		System.out.println("Capacity ban dau: "+v.capacity());
		v.addElement(3 );
		v.addElement(2);
		v.addElement(4);
		v.addElement(1);
		System.out.println("Capacity sau 4 lan cong lai la: " +v.capacity());
		v.addElement(5.45);
		System.out.println("Capacity hien tai la: "+v.capacity());
		v.addElement(8.5);
		v.addElement(7);
		System.out.println("Capacity hien tai la: "+v.capacity());
		v.addElement(8);
		System.out.println("Phan tu dau tien la: "+v.firstElement());
		System.out.println("Phan tu cuoi cung la:  "+v.lastElement());
		if(v.contains(3)) {
			System.out.println("Vector chua 3");
		}
		else {
			System.out.println("Vector khong chua 3");
		}
		
		//tinh toan so phan tu trong vector
		System.out.println("");
		Enumeration vEnum = v.elements();
		System.out.println("Cac phan tu trong vector: ");
		while(vEnum.hasMoreElements()) {
			System.out.println("Cac phan tu trong vector la: "+vEnum.nextElement() + " ");
			
		}
		System.out.println();
		
	}

}
