import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class pomModelRun {
	static WebDriver driver;
	static pomModel pom;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
			 driver = new ChromeDriver();
		
		
		driver.get("https://mewe.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.manage().window().maximize();
		 pom = new pomModel();
		pom = PageFactory.initElements(driver, pomModel.class);
	}
	
	
	
		@Test
		public void test1() throws Exception{

			pomModel.first_name.sendKeys("barak");
			pomModel.last_name.sendKeys("keynan");
			pomModel.email_address.sendKeys("barak.keynan@gmail.com");
			pomModel.email_repeat.sendKeys("barak.keynan@gmail.com");
			pomModel.password.sendKeys("Keynan12345!");
			pomModel.age_checkbox.click();
			pomModel.terms_checkbox.click();
			pomModel.submit_registration.click();
			
			Thread.sleep(2000);
		
			/* 
			if (pom.serachResults1.getText().equals("barak ")) {
			System.out.println("test 1 pass");	
			} else {
				System.err.println("test 1 fail");
			}
		
			 }
			
			 @Test
			 public void test2() throws InterruptedException{
			
				 pom.search_fill.clear();
				 pom.search_fill.sendKeys("346");
				 pom.search_button.click();
				 Thread.sleep(3000);
				 if (pom.serachResults1.getText().equals("מספר תלת ספרתי .")) {
						System.out.println("test 2 pass");	
						} else {
							System.err.println("test 2 fail");
						}
					
				 
			 }
			 
			 
			 @Test
			 public void test3() throws InterruptedException{
				 pom.search_fill.clear();
					pom.search_fill.sendKeys("PASSIFLORA");
					pom.search_button.click();
					
					Thread.sleep(2500);
					
					
					
					
				/*
					
					Select mySelection = new Select(pom.serachResults);
					mySelection.selectByVisibleText("לחם זיתים");
					
		
					
					pom.add_button.get(1).click();
					Thread.sleep(1000);
					
					if (driver.switchTo().alert().getText().equals("לחם זיתים")) {
					System.out.println("test 3 pass");	
					} else {
						System.err.println("test 3 fail");
					}
					Thread.sleep(1000);
					driver.switchTo().alert().accept();

			
				
				 
			 }
		
		
			 @Test
			 public void test4() throws InterruptedException{
				 pom.search_fill.clear();
					pom.search_fill.sendKeys("לחם");
					pom.search_button.click();
					
					Thread.sleep(2500);
					Select mySelection = new Select(pom.serachResults);
					mySelection.selectByVisibleText("לחם זיתים ");
					
		
					
				
					Thread.sleep(1000);
					
					pom.amount.sendKeys("àáâã");
				Thread.sleep(1000);
				
				if (pom.amount.getAttribute("value").equals("")) {
				System.out.println("test 4 pass");	
				} else {
					System.err.println("test 4 fail");
				}
			 }
				
		
		
					 @Test
			 public void test5() throws InterruptedException{
						
							
							pom.amount.sendKeys("900000000");
							Thread.sleep(1000);
							
							pom.add_button.get(1).click();
							Thread.sleep(1000);
							
							
							
							if (driver.switchTo().alert().getText().equals("àøòä ùâéàä \n" + "÷åã: 3001")) {
							System.out.println("test 5 pass");	
							} else {
								System.err.println("test 5 fail");
							}
							Thread.sleep(1000);
							driver.switchTo().alert().accept();
				 
			 }
					 
					 
					 @Test
					 public void test6() throws InterruptedException{
						
						 pom.amount.clear();
							pom.amount.sendKeys("5");
							Thread.sleep(1000);
							
							pom.add_button.get(1).click();
							Thread.sleep(2000);
							
							
							
							if (pom.food_name.get(1).getText().equals("ìçí æéúéí")) {
							System.out.println("test 6 pass");	
							} else {
								System.err.println("test 6 fail");
							}
							Thread.sleep(1000);
								
				 
			 }
					 
					 @Test
					 public void test7() throws InterruptedException{
						 Thread.sleep(2500);
							Select mySelection = new Select(pom.serachResults);
							mySelection.selectByVisibleText("ìçí ìáï");
							
						 pom.amount.clear();
							pom.amount.sendKeys("2");
							Thread.sleep(1000);
							
							pom.add_button.get(1).click();
							Thread.sleep(1000);
							
							
							
							if (pom.food_name.get(2).getText().equals("ìçí ìáï")) {
							System.out.println("test 7 pass");	
							} else {
								System.err.println("test 7 fail");
							}
							Thread.sleep(1000); 
			 }
					 
					 @Test
					 public void test8() throws InterruptedException{
						 pom.remoov_button.get(0).click();
							
							
						 Thread.sleep(3000);
							if (!pom.food_name.get(1).getText().equals("ìçí æéúéí")) {
							System.out.println("test 8 pass");	
							} else {
								System.err.println("test 8 fail");
							}
							Thread.sleep(1000); 
			 }
					 
					 @Test
					 public void test9() throws InterruptedException{
						 Select mySelection = new Select(pom.serachResults);
					
						 
							mySelection.selectByVisibleText("ìçí çîðéåú îåôçú îìç");
							Thread.sleep(500);
						pom.white_bread.click();
						pom.olive_bread.click();
							
						
							pom.add_button.get(1).click();
							Thread.sleep(1000);
							
						
						 Thread.sleep(3000);
							if (pom.food_name.get(2).getText().equals("ìçí çîðéåú îåôçú îìç")) {
							System.out.println("test 9 pass");	
							} else {
								System.err.println("test 9 fail");
							}
							Thread.sleep(1000); 
			 }


		
					 @Test
					 public void ztestz10() throws InterruptedException{
						 Thread.sleep(1000);
						 int cal1 = Integer.parseInt(pom.calor_line1.getText());
						 int cal2 = Integer.parseInt(pom.calor_line2.getText());
						 String ca_Sam = pom.calor_sum.getText().replaceAll("[^\\d.]", "");
						 
						 int x = cal1+cal2;
						 int cal_sum = Integer.parseInt(ca_Sam);
						
						 Thread.sleep(3000);
							if (x==cal_sum) {
							System.out.println("test 10 pass");	
							} else {
								System.err.println("test 10 fail");
							}
							Thread.sleep(1000); 
			 }


					 
					 
					 @Test
					 public void ztestz11() throws InterruptedException{
						 int carbo1 = Integer.parseInt(pom.carbo_line1.getText());
						 int carbo2 = Integer.parseInt(pom.carbo_line2.getText());
						 String carbo_Sam = pom.carbo_sum.getText().replaceAll("[^\\d.]", "");
						 int carbo_sum = Integer.parseInt(carbo_Sam);
						
						
						 Thread.sleep(1000);
							if ((carbo1+carbo2)==carbo_sum) {
							System.out.println("test 11 pass");	
							} else {
								System.err.println("test 11 fail");
							}
							Thread.sleep(1000); 
							*/
			 }
}
