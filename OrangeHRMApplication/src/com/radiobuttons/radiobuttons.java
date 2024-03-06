package com.radiobuttons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.utility.Log;

public class radiobuttons extends Basetest {
	@Test(priority=1,description="Radiobuttonclickoperation")
	public void radiobuttonsclick()
	{
		//<input type="radio" name="group1" value="Milk">
		//<input type="radio" name="group1" value="Butter" checked="">
		//<input type="radio" name="group1" value="Cheese">
		
		
		//<input type="radio" name="group2" value="Water">
		//<input type="radio" name="group2" value="Beer">
		//<input type="radio" name="group2" value="Wine" checked="">
		
		
		By radiobuttonsproperty=By.tagName("radio");
		List<WebElement> radiobuttons=driver.findElements(radiobuttonsproperty);
		int radiobuttonsize=radiobuttons.size();
		Log.info("The size of radiobuttons"+radiobuttonsize);
		
		for(int radiobuttonindex=0;radiobuttonindex<radiobuttonsize;radiobuttonindex++)
		{
			radiobuttons.get(radiobuttonindex).click();
		}
		
		
		
		
		

		
		
		
		
		
		
	}


		// TODO Auto-generated method stub
		
	}


