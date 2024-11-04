package RaahulShetty;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonFileReading {

	public static void main(String[] args) throws IOException, ParseException {
		JSONObject jobject=new JSONObject();
		jobject.put("name", "vikram");
		jobject.put("id", 123);
		jobject.put("gender", "M");
		
		JSONArray jarray=new JSONArray();
		jarray.add("77 tnhb");
		jarray.add("9th floor");
		jobject.put("address", jarray);
		
		System.out.println(jobject);
		
		FileWriter fw=new FileWriter(".//jsondata.json");
		fw.write(jobject.toJSONString());
		fw.flush();
		fw.close();
		
		
		FileReader fr=new FileReader("jsondata.json");
		JSONParser parser=new JSONParser();
		Object obj = parser.parse(fr);
		System.out.println(obj);
		JSONObject jobj=(JSONObject)obj;
		//System.out.println(jo);
		String name = (String)jobj.get("name");
		System.out.println(name);
		JSONArray jar=(JSONArray)jobj.get("address");
		System.out.println(jar);
		
		

	}

}
