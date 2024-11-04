package HariSir;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("abc.txt");
		FileOutputStream fos=new FileOutputStream("cde.txt");
		int data;
		while((data=fis.read())!=-1) {
			fos.write(data);
		}

		fis.close();
		fos.close();
	}

}
