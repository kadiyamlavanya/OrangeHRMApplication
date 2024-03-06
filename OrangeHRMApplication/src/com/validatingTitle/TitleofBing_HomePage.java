package com.validatingTitle;
import org.openqa.selenium.edge.EdgeDriver;




public class TitleofBing_HomePage {

	public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","C:\\Users\\user\\Desktop\\OrangeHRMApplication\\OrangeHRMApplication\\Libraries\\drivers\\msedgedriver.exe");
		// TODO Auto-generated method stub
	EdgeDriver edgebrowser=new EdgeDriver();
	edgebrowser.get("http://bing.com");
	String Expectedbinghomepagetitle="bing";
	System.out.println("The Expected Title of bing home page is :-" +Expectedbinghomepagetitle );
	String Actualbinghomepagetitle=edgebrowser.getTitle();
	System.out.println("The Actual Title of bing home page is :-" +Actualbinghomepagetitle );
	if(Actualbinghomepagetitle.equalsIgnoreCase( Expectedbinghomepagetitle)) 
	{
		System.out.println("The Title of bing home page matches -PASS" );
		
		}
	else
	{
	
		System.out.println("The Title of bing home page matches -FAIL" );
		edgebrowser.close();
	}
	}	
}	



	
	

	


 