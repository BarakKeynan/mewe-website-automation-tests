package CLEAR;
import java.text.DecimalFormat;
import java.util.List;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CLEAR1 {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	  
	    /*
	    try {
	    	System.out.println("----------------   1   -----------------------------");
	    	driver.get("http://danielauto.net/practice/tabls/tables.html");
	    	Thread.sleep(1000);
	    											
	    	List  <WebElement> col = driver.findElements(By.xpath("//*[@id=\"tab\"]/thead/tr/th"));
	    	List <WebElement> row = driver.findElements(By.xpath("//*[@id=\"tab\"]/tbody/tr"));
	    	
	    	System.out.println(col.size());
	    	System.out.println(row.size());
	    } catch (Exception e) {
	    	// TODO: handle exception
	
	    try {
	    	
	    	System.out.println("----------2---------");
	    	
	    	driver.get("http://danielauto.net/practice/tabls/tables.html");
	    	Thread.sleep(1000);
	    											
	    	List  <WebElement> col = driver.findElements(By.xpath("//*[@id=\"tab\"]/thead/tr/th"));
	    	List <WebElement> row = driver.findElements(By.xpath("//*[@id=\"tab\"]/tbody/tr"));
	    	
	    	List <WebElement> companyGroups = driver.findElements(By.xpath("//td[2]"));
	    	int a=0, b=0 ,c=0;
	    	for (int i = 1; i < companyGroups.size(); i++) {
	    		
	    		String group =  companyGroups.get(i).getText();
	    		
	    		if (group.equals("A")) {a++;}
	    		
	    		if (group.equals("B")) {b++;}
	    		
	    		if (group.equals("C")) {c++;}
	    	
	    	}
	    	
	    	System.out.println("group a : " + a + "   group b : " +b +  "   group c : " + c );


	    } catch (Exception e) {
	    	// TODO: handle exception
	  
	   

	    
	    
	    
	    
	    
	    
	    try {
	    	
	    	System.out.println("----------3---------");
	    	
	    	driver.get("http://danielauto.net/practice/tabls/tables.html");
	    	Thread.sleep(3000);
			
	    	List <WebElement> price = driver.findElements(By.xpath("//td[3]"));
	    	
	    	
	    	String max;
	    	 double m=0,r=0;
	    	
	    	  for (int i =1;i< price.size();i++)
	            {    
	    		//Thread.sleep(500);
	           max= price.get(i).getText();
	               
	                
	                if (max.contains(",")) {
	                	max = max.replaceAll("," , "");

	                }
	                 m = Double.parseDouble(max);

	                if(m>r)
	                 {    
	                    r=m;
	                 }
	            }
	            System.out.println("Maximum current price is : "+ r);
	    } catch (Exception e) {
	    	// TODO: handle exception
	    
	    try {
	    	
	    	System.out.println("----------------   4   -----------------------------");
	    	driver.get("http://danielauto.net/practice/tabls/tables.html");
	    	Thread.sleep(3000);
	    											

	    	
	    	
	    	List <WebElement> companyNames = driver.findElements(By.xpath("//td[1]"));
	    	


	    	  for (int i =1;i<companyNames.size();i++)
	            {    
	    		  
	              

	                
	          
	                if (companyNames.get(i).getText().toLowerCase().startsWith("a")) {
	    				
	    			
	    				System.out.println(companyNames.get(i).getText());
	    			}
	            }
	                
	    } catch (Exception e) {
	    	// TODO: handle exception
	    }
	  	    	
	    try {
	    	
	    	System.out.println("----------------  5   -----------------------------");
	    	driver.get("http://danielauto.net/practice/tabls/tables.html");
	    	Thread.sleep(3000);
	    											

	    	
	    	List <WebElement> companyNames = driver.findElements(By.xpath("//td[1]"));
	    	List <WebElement> companyGroups = driver.findElements(By.xpath("//td[2]"));
	    	

	    	  for (int i =1;i<companyNames.size();i++)
	            {    
	    		  
	                
	               
	                
	              //max = toUpperCase();
	                if (companyNames.get(i).getText().toLowerCase().startsWith("a")) {
	                	if (companyGroups.get(i).getText().equalsIgnoreCase("c")) {
	                		System.out.println(companyNames.get(i).getText());
	    				}
	    				
	                }

	            }
	    } catch (Exception e) {
	    	// TODO: handle exception
	  }
	     
	    
	    //.סכם את אחוז השינוי הכללי של כל החברות )הצג את התוצאה עם שני מספרים בלבד אחרי הנקודה(
	    
	    try {
	    	
	    	System.out.println("----------------   6   -----------------------------");
	    	driver.get("http://danielauto.net/practice/tabls/tables.html");
	    	Thread.sleep(3000);

		
		List <WebElement> change = driver.findElements(By.xpath("//td[5]"));
		
		
		String max;
		 double m=0;
		 double sum=0;
		  for (int i =1;i<change.size();i++)
	        {    
			  
	            max= change.get(i).getText().replaceAll(" +", "");          
	             m = Double.parseDouble(max);
	            

	         sum=sum+m;
	        }
		
	        System.out.println("Total profit in percentages "+ new DecimalFormat("##.##").format(sum) );
	        
	} catch (Exception e) {
		// TODO: handle exception
		
		//.עבור לדף : "טבלה עם מספר תאים לא זהה". והדפס למסך את המספר האחרון בכל שורה
	

try {
	
	System.out.println("----------------   7   -----------------------------");
	driver.get("http://danielauto.net/practice/tabls/tableDynamic.html");
	Thread.sleep(3000);
	
	
	List<WebElement> row_num = driver.findElements(By.tagName("tr"));

	for (int i = 0; i < row_num.size(); i++) {

		List<WebElement> coll_num = row_num.get(i).findElements(By.tagName("td"));


			int coll_size = coll_num.size(); 
			
		

			System.out.println(driver.findElement(By.xpath("//tr["+(i+1)+"]/td[last()]")).getText());
	}
		
} catch (Exception e) {
	System.err.println("תרגיל 7 נפל");
}
	

 */
try {
	
	System.out.println("----------------   8   -----------------------------");
	driver.get("http://danielauto.net/practice/tabls/tableDynamic.html");
	Thread.sleep(3000);

	WebElement table = driver.findElement(By.xpath("/html/body/div[3]/table/tbody"));

List<WebElement> row_num = table.findElements(By.tagName("tr"));
int rows_count = row_num.size();


for (int i = 0; i < row_num.size(); i++) {

	List<WebElement> colums = row_num.get(i).findElements(By.tagName("td"));
	int colums_cuont = colums.size();
	
	for (int j = 0; j < colums_cuont; j++) {
		System.out.println("in the row " + (i+1) + " colum " + (j+1) + " have number " + colums.get(j).getText());
		
	}
}
} catch (Exception e) {
// TODO: handle exception
}

			
		
driver.quit();
	
	}
}