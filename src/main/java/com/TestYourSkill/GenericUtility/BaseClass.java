package com.TestYourSkill.GenericUtility;
import org.openqa.selenium.WebDriver;

public class BaseClass 
{
		public WebDriver driver;
		//object creation for lib
		
		public ExcelUtility exlib = new ExcelUtility();
		public FileUtility filelib = new FileUtility();
		public JavaUtility javalib = new JavaUtility();
		public WebDriverUtlity weblib = new WebDriverUtlity();
		

		
}
