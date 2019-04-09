package sec04_3;

import java.io.*;
import java.net.*;
import java.util.*;

public class PropertiesExample {
	public static void main(String[] args) throws Exception {
		Properties properties = new Properties();
		String path = PropertiesExample.class.getResource("datavase.properties").getPath();
		path = URLDecoder.decode(path, "utf-8");
		properties.load(new FileReader(path));
		
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("username : " + username);
		System.out.println("password : " + password);
	}
}
