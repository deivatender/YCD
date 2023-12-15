package com.ycd.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	@Test
	public void login()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev.yourchildsday.com/authentication/");
		WebElement email=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/form/div/div[2]/div/input"));
		email.sendKeys("peter@yopmail.com");
		WebElement psw=driver.findElement(By.xpath("//input[@type='password']"));
		psw.sendKeys("Vss@1234");
		WebElement lgnbtn=driver.findElement(By.xpath("//button[@type='submi']"));
		lgnbtn.click();
		}

}
