package Selenium;

import java.io.FileInputStream;
import java.util.Properties;

public final class PropertyFileReading {
	private PropertyFileReading() {
		
	}
	
	public static String readPropertyFile(String key) {
		Properties prop=null;
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("C:\\Users\\vikra\\eclipse-workspace\\caratlane.vik.com\\src\\test\\java\\Selenium\\data.properties");
			prop=new Properties();
			prop.load(fis);
		}
		catch(Exception e) {
			e.printStackTrace();
			String message = e.getMessage();
			System.out.println(message);
		}
		finally {
			try {
				fis.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		return prop.getProperty(key);
	}

}
