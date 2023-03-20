package common;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadDataFromProperties {

	public static String propFilePath = "/home/excellarate/Desktop/Selenium-Java/MagentoTesting/src/test/java/config/data.properties";

	public static Properties readPropertiesFile() throws IOException {
		Properties prop = new Properties();
		InputStream input = new FileInputStream(propFilePath);
		prop.load(input);

		return prop;
	}

	public static String getBaseURI() throws IOException {
		String baseURI = readPropertiesFile().getProperty("BaseURI");

		return baseURI;
	}
}
