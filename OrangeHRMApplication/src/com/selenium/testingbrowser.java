package com.selenium;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class testingbrowser
{

public static void main(String[] args) {


 
  // Automating Edge Browser
  System.setProperty("webdriver.edge.driver", "C:\\Users\\user\\Desktop\\OrangeHRMApplication\\OrangeHRMApplication\\Libraries\\drivers\\msedgedriver.exe");
  EdgeDriver edgeBrowser = new EdgeDriver();
  edgeBrowser.close();
  System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\OrangeHRMApplication\\OrangeHRMApplication\\Libraries\\drivers\\chromedriver.exe");
  ChromeDriver chromebrowser=new ChromeDriver();
   chromebrowser.close();
  
 
  
   // will close the browser along with all the Tab's Opened
 


 
}


}
