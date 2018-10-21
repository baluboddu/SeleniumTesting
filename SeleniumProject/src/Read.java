import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Read {
	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("C:\\Users\\Balanarasimha\\workspace\\SeleniumProject\\file.properties");
			FileWriter writer=new FileWriter("");
			Properties properties=new Properties();
			try {
				properties.load(reader);
			
				System.out.println(properties.getProperty("age"));
				properties.setProperty("value", "100");
				properties.store(writer, "hi");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
}
