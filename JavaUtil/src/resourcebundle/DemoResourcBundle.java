package resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class DemoResourcBundle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResourceBundle rb = ResourceBundle.getBundle("Thong bao");
		System.out.println("Xin chao: " + rb.getString("Ban on khong"));
		Locale.setDefault(new Locale("ms", "MY"));

		rb = ResourceBundle.getBundle("MyLabels");
		System.out.println("Xin chao: " + rb.getString("Ban on khong"));

	}

}
