package Interview_Programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropoerFileDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		FileInputStream file = new FileInputStream("C:\\Mypractice\\JavaPractice\\src\\Interview_Programs\\config.proporties");
		
		Properties pp= new Properties();
		try {
			pp.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("username is "+pp.getProperty("username"));
		System.out.println("password is "+pp.getProperty("password"));

	}

}
