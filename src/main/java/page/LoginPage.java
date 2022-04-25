package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {

	WebDriver driver;

	public void openBrwoser(){
		
		System.setProperty("webdriver.gecko.driver", "D:\\SeleniumJars\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
public void closeBrwoser(){
		
		driver.quit();
	}
public void openWebPage() {
	driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=p3chVoHAeHs&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoicDNjaFZvSEFlSHMiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY0NTk3NzYzOSwiaWF0IjoxNjQ1OTc2NDM5LCJqdGkiOiIwODRhNjM1OS1hNTYyLTQ2YTItODgzMS03MmMwZTY1NTIyMjYiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.k2mXF1vhzFzUYZ7vN4I7Mf6wuSO66BmImXCZi1CT9ZR1XOqvNNxXLz1brmu9wKdeBeXYuqtyeFraUgTvapdYOZXqtUoKDx01dPqIIciqh9NxLKKdG8_VHc7Z8USKoDbJ1FMn4Ui_eI14vQdOvqva0ybjBKSQ73M_WFpVxPHKuYWLa9tXR5Nl-fps8sxnIdlgxjtzMFNOmoLvLTppnkGR4J-kXPd2bkPRh7HQDm1SURnKC1o62kjfx8sjQW84ecuBc6xLe6sa-kbbmdULzqNKxzOqyyw94VVOs4CSSK6KhfWK9RVsP4hMCjbplj6d-qDe1rZ-27rnky95w14A9pzQlw&preferred_environment=");
}
public String getTitle() {
	String act = driver.getTitle();
	return act;
}
public void emailandpass (String a, String b) {
	driver.findElement(By.name("usernameInput")).sendKeys(a);
	driver.findElement(By.name("password")).sendKeys(b);
}

public void loginButton() throws InterruptedException {
	driver.findElement(By.className("ButtonCore__block")).click();
	Thread.sleep(5000);
}
public String readErr() {
	String actual =  driver.findElement(By.xpath("//*[text()='Please enter a username or card number without special characters.']")).getText();
	return actual;
}
}
