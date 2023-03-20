package com.adactin.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.TestRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	public static WebDriver driver=TestRunner.driver;
	
	
	@Given("^user launching adactin hotel app$")
	public void user_launching_adactin_hotel_app() throws Throwable {
		driver.get("https://adactinhotelapp.com/");
	}

	@When("^user enters username$")
	public void user_enters_username() throws Throwable {
		WebElement uname = driver.findElement(By.id("username"));
		uname.sendKeys("malikabdulk");
	    
	}

	@When("^user enters password$")
	public void user_enters_password() throws Throwable {
		WebElement ps = driver.findElement(By.id("password"));
		ps.sendKeys("12345678");
	    }

	@Then("^user click login to next page search hotel$")
	public void user_click_login_to_next_page_search_hotel() throws Throwable {
		WebElement lgin = driver.findElement(By.id("login"));
		lgin.click();
	    
	}

	@When("^user select location from dropdown$")
	public void user_select_location_from_dropdown() throws Throwable {
		WebElement location = driver.findElement(By.id("location"));
		Select sl = new Select(location);
	    sl.selectByIndex(1);
	}

	@When("^user select hotel from dropdown$")
	public void user_select_hotel_from_dropdown() throws Throwable {
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select sh = new Select(hotel);
		sh.selectByIndex(1);
	   
	}

	@When("^user select roomtype from dropdown$")
	public void user_select_roomtype_from_dropdown() throws Throwable {
		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select sr = new Select(roomtype);
		sr.selectByIndex(1);
	    
	}

	@When("^user select number of rooms from dropdown$")
	public void user_select_number_of_rooms_from_dropdown() throws Throwable {
		WebElement nos = driver.findElement(By.id("room_nos"));
		Select sn = new Select(nos);
		sn.selectByIndex(1);
	   
	}

	@When("^user enters check in date$")
	public void user_enters_check_in_date() throws Throwable {
		WebElement date = driver.findElement(By.id("datepick_in"));
		date.clear();
		WebElement idate = driver.findElement(By.id("datepick_in"));
		idate.sendKeys("01/4/2022");
	   
	}

	@When("^user enters check out date$")
	public void user_enters_check_out_date() throws Throwable {
		WebElement dout = driver.findElement(By.id("datepick_out"));
		dout.clear();
		WebElement dt = driver.findElement(By.id("datepick_out"));
		dt.sendKeys("05/4/2022");
	
	   
	}

	@When("^user select adults per room$")
	public void user_select_adults_per_room() throws Throwable {
	WebElement adult = driver.findElement(By.id("adult_room"));
	Select sa = new Select(adult);
	sa.selectByIndex(1);
	}

	@When("^user select childrens per room$")
	public void user_select_childrens_per_room() throws Throwable {
		WebElement chdrom = driver.findElement(By.id("child_room"));
		Select sd = new Select(chdrom);
		sd.selectByIndex(1);
		
	    
	}

	@Then("^user click seach button to navigate select hotel$")
	public void user_click_seach_button_to_navigate_select_hotel() throws Throwable {
		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();
	    
	}

	@When("^user select radio button$")
	public void user_select_radio_button() throws Throwable {
		WebElement rd = driver.findElement(By.id("radiobutton_0"));
		rd.click();
	    
	}

	@Then("^user click to continue to navigate book a hotel$")
	public void user_click_to_continue_to_navigate_book_a_hotel() throws Throwable {
		WebElement cntnu = driver.findElement(By.id("continue"));
		cntnu.click();
		
	    
	}

	@When("^user enter firstname$")
	public void user_enter_firstname() throws Throwable {
		WebElement fn = driver.findElement(By.id("first_name"));
		fn.sendKeys("malik");

	}

	@When("^user enter lastname$")
	public void user_enter_lastname() throws Throwable {
		WebElement ln = driver.findElement(By.id("last_name"));
		ln.sendKeys("kamaalbasha");
	   
	}

	@When("^user enter billing address$")
	public void user_enter_billing_address() throws Throwable {
		WebElement add = driver.findElement(By.id("address"));
		add.sendKeys("87 viewers St Kgiri");
	}

	@When("^user enter card number$")
	public void user_enter_card_number() throws Throwable {
		WebElement cc = driver.findElement(By.id("cc_num"));
		cc.sendKeys("5439567856781234");
	    }

	@When("^user select card type from drop down$")
	public void user_select_card_type_from_drop_down() throws Throwable {
		WebElement type = driver.findElement(By.id("cc_type"));
	    Select st = new Select(type);
	    st.selectByIndex(1);
	}

	@When("^user select expiry date from drop down$")
	public void user_select_expiry_date_from_drop_down() throws Throwable {
		WebElement expm = driver.findElement(By.id("cc_exp_month"));
		Select exp = new Select(expm);
		exp.selectByVisibleText("November");
		WebElement Expiryyear = driver.findElement(By.id("cc_exp_year"));
		Select Eyear = new Select(Expiryyear);
		Eyear.selectByValue("2022");
	    
	}

	@When("^user enter cvv number$")
	public void user_enter_cvv_number() throws Throwable {
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("767");
	   
	}

	@Then("^user click book now button to navigate booking confirmation$")
	public void user_click_book_now_button_to_navigate_booking_confirmation() throws Throwable {
		WebElement bn = driver.findElement(By.id("book_now"));
		bn.click();
	    
	}

	@Then("^user click logout$")
	public void user_click_logout() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement lout = driver.findElement(By.id("logout"));
		lout.click();
	    
	}



}
