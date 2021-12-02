
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class pomModel {

		private static final String input = null;

		@FindBy (how = How.NAME, using = "q")
		static WebElement user;
	
	@FindBy (how = How.ID, using = "reg-first-filled")
	static WebElement first_name;	
	@FindBy (how = How.ID, using = "reg-last-filled")
	static WebElement last_name;	
	@FindBy (how = How.ID, using = "reg-email-filled")
	static WebElement email_address;	
	@FindBy (how = How.ID, using = "reg-password-filled")
	static WebElement password;	
	@FindBy (how = How.ID, using ="reg-email-filled-repeat")
	static WebElement email_repeat;	
	@FindBy (how = How.XPATH, using ="//*[@id=\"registration-form\"]/div[7]/label")
	static WebElement age_checkbox;	
	@FindBy (how = How.XPATH, using ="//*[@id=\"registration-form\"]/div[8]/label")
	static WebElement terms_checkbox;	
	@FindBy (how = How.CSS, using ="#submit-registration")
	static WebElement submit_registration;	
/*
	@FindBy (how = How.XPATH, using = "/html/body/div[1]/div[3]/div[3]/div/text()")
	static WebElement serachResults1;
	@FindBy (how = How.ID, using = "serachResults")
	static WebElement serachResults;
	@FindBy (how = How.ID, using = "mesComvo")
	static WebElement unit;
	@FindBy (how = How.ID, using = "quantity")
	static WebElement amount;
	@FindBy(className = "calculator_deleteTxt")
	static List<WebElement> add_button;
	@FindBy(linkText = "äñø")
	static List<WebElement> remoov_button;
	@FindBy(className = "first")
	static List<WebElement> food_name;

	@FindBy (how = How.XPATH, using = "//*[@id=\"serachResults\"]/option[1]")
	static WebElement white_bread;
	//ìçí æéúéí
	@FindBy (how = How.XPATH, using = "//*[@id=\"serachResults\"]/option[4]")
	static WebElement olive_bread;
	
	@FindBy (how = How.XPATH, using = "//*[@id=\"foodsTable\"]/tbody/tr[2]/td[7]")
	static WebElement calor_line1;    
	@FindBy (how = How.XPATH, using = "//*[@id=\"foodsTable\"]/tbody/tr[3]/td[7]")
	static WebElement calor_line2;

	@FindBy (how = How.XPATH, using = "//*[@id=\"foodsSummery\"]/table/tbody/tr[3]/td[1]")
	static WebElement calor_sum;       //*[@id="foodsSummery"]/table/tbody/tr[3]/td[1]
	
	@FindBy (how = How.XPATH, using = "//*[@id=\"foodsTable\"]/tbody/tr[2]/td[8]")
	static WebElement carbo_line1;

	@FindBy (how = How.XPATH, using = "//*[@id=\"foodsTable\"]/tbody/tr[3]/td[8]")
	static WebElement carbo_line2;
	@FindBy (how = How.XPATH, using = "//*[@id=\"foodsSummery\"]/table/tbody/tr[3]/td[2]")
	static WebElement carbo_sum; }    
	*/ 
	