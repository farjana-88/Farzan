package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileLockInterruptionException;
import java.util.Properties;

public class A {

	public Properties readFile() throws IOException {
		
		System.out.println("hi");
		
		FileInputStream v = new FileInputStream(new File("/Users/Oni-Tani/Documents/workspace/MavenFristProject/src/main/resources/datasource/config.properties"));
		
		Properties p = new Properties();
		p.load(v);
		
		return p;
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
