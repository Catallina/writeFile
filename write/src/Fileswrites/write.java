package Fileswrites;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;


public class write {
	

	public void writeFile() throws IOException
	{
		BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in)); 
		String text = reader.readLine(); 
	
    	try {
			Files.write(Paths.get("src//Fileswrites//file.txt"), text.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
