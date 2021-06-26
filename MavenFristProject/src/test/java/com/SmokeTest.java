package com;

import java.io.IOException;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import util.A;

public class SmokeTest {
	ChromeDriver dr;
	 Properties prop;
	 
	@Test
	public void test1() throws IOException {
		A x = new A();
		
		prop=x.readFile();
		
		//prop =x.readFile();
		
		//String bro =prop.getProperty("browser");
		String bro=prop.getProperty("browser");
		if(bro.equals("Chrome"))
//		if(bro.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", "/Users/Oni-Tani/Downloads/chromedriver");
			dr = new ChromeDriver();
//			//System.out.println("open chrome browser");
//		}
//		else if (bro.equals("Firefox")) {
//			System.out.println("open Firefox");
//		}
		dr.get(prop.getProperty("url"));
		//System.out.println("newphone");
	}
	
	
	
	
	
	
	
	
	
}
