package CoreJava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);
		
		SimpleDateFormat sdf=new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(sdf.format(d));

	}

}
