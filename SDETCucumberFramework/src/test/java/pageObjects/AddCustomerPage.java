package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage {

	public WebDriver ldriver;

	public AddCustomerPage(WebDriver ldriver)
	{
		this.ldriver=ldriver;
		PageFactory.initElements(ldriver,this);
	}



	

	By linkCustomer_menu = By.xpath("//a[@href='#']//p[contains(text(),'Customers')]");
	By linkCustomer_menuitem=By.xpath("//a[@href='/Admin/Customer/List']//p[text()=' Customers']");

	By btnAddnew=By.xpath("//a[@class='btn btn-primary']");

	By txtEmail=By.xpath("//div[@class='card-body']/descendant::input[@name='Email']");
	By txtPassword=By.xpath("//div[@class='card-body']/descendant::input[@name='Password']");
	By txtFirstName=By.xpath("//div[@class='card-body']/descendant::input[@name='FirstName']");
	By txtLastName=By.xpath("//div[@class='card-body']/descendant::input[@name='LastName']");

	By selectmale=By.xpath("//div[@class='card-body']/descendant::input[@id='Gender_Male']");
	By selectFemale=By.xpath("//div[@class='card-body']/descendant::input[@id='Gender_Female']");

	By enterDateOfBirth=By.xpath("//div[@class='card-body']/descendant::input[@name='DateOfBirth']");

	By txtCompanyName=By.xpath("//div[@class='card-body']/descendant::input[@name='Company']");

	By selectTaxAttempt=By.xpath("//div[@class='card-body']/descendant::input[@name='IsTaxExempt']");

	By txtNewsLetter=By.xpath("(//input[@class='k-input'])[2]");
//(//div[@class='card-body']/descendant::div[@class='k-multiselect-wrap k-floatwrap'])[1]


	By SelectCustomRole=By.xpath("//div[@class='card-body']/descendant::input[@aria-describedby='SelectedCustomerRoleIds_taglist']");


	By dropdownManageVendor=By.xpath("//div[@class='card-body']/descendant::select[@name='VendorId']");

	By checkboxActive=By.xpath("//div[@class='card-body']/descendant::input[@name='Active']");

	By textAreaBox=By.xpath("//div[@class='card-body']/descendant::textarea[@name='AdminComment']");

	By btnSave=By.xpath("//button[@name='save']");





	public void customerRoles(String value)
	{
		Select s=new Select(ldriver.findElement(SelectCustomRole));
		s.selectByVisibleText(value);
	}

	public void clickOnCustomerMenu()
	{
		ldriver.findElement(linkCustomer_menu).click();
	}

	public void clickOnCustomerMenuItem()
	{
		ldriver.findElement(linkCustomer_menuitem).click();
	}

	public void addNewBtn()
	{
		ldriver.findElement(btnAddnew).click();
	}

	public void setemail(String email)
	{
		ldriver.findElement(txtEmail).sendKeys(email);
	}

	public void setPassword(String password)
	{
		ldriver.findElement(txtPassword).sendKeys(password);
	}

	public void setFirstName(String firstName)
	{
		ldriver.findElement(txtFirstName).sendKeys(firstName);
	}

	public void setLastName(String lastName)
	{
		ldriver.findElement(txtLastName).sendKeys(lastName);
	}


	public void setdateofBirth(String dob)
	{
		ldriver.findElement(enterDateOfBirth).sendKeys(dob);
	}

	public void setCompanyName(String companyName)
	{
		ldriver.findElement(txtCompanyName).sendKeys(companyName);
	}

	public void markTaxExpert()
	{
		ldriver.findElement(selectTaxAttempt).click();
	}

	public void clickChecboxActive()
	{
		ldriver.findElement(checkboxActive).click();
	}

	public void setAdminaContent(String content)
	{
		ldriver.findElement(textAreaBox).sendKeys(content);
	}

	public void clickBtnSave()
	{
		ldriver.findElement(btnSave).click();
	}

	public void setManagerOfvendor(String value)
	{
		Select drp=new Select(ldriver.findElement(dropdownManageVendor));
		drp.selectByVisibleText(value);
	}


	public void newsletter(String newletter)
	{
		ldriver.findElement(txtNewsLetter).sendKeys(newletter);
	}
	
	public void selectGender(String gender)
	{
		if(gender.equals("Male")) {
			ldriver.findElement(selectmale).click();
		}
		else
			if(gender.equals("Female")) {
				ldriver.findElement(selectFemale).click();
			}
			else 
			{
				ldriver.findElement(selectmale).click();
			}
	}

	public String pageTitle()
	{
		return ldriver.getTitle();
	}





}