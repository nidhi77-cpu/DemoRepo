package ConfigReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configreader {
	
	
	private Properties prop;
	private FileInputStream ip;
	   
	
	
	public Properties initLangProp(String lang)  {
	
	System.out.println("lang " + lang);
	prop = new Properties();
	try {
		switch (lang.toLowerCase()) {
		case "english":
			ip = new FileInputStream("./src/main/resources/lang.english.properties");
			break;
		case "french":
			ip = new FileInputStream("./src/main/resources/lang.french.properties");
			break;
		default:
			System.out.println("lang not found " + lang);
			break;

		}

		try {
			prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		System.out.println("nothing found");
	}
	return prop;
}
}
