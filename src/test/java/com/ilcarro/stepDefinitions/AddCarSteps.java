package com.ilcarro.stepDefinitions;

import static com.ilcarro.pages.BasePage.driver;

import com.ilcarro.pages.AddCar;
import com.ilcarro.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;

public class AddCarSteps {

  //@And("User enter a pickUpPlace")
  //  public void userEnterAPickUpPlace() {
  //  }
  @When("User click on the Let the car work")
  public void click_on_Let_car_work() {
    new LoginPage(driver).clickOnTheCarWork();
  }

  @And("User enter a pickUpPlace")
  public void enter_location() {
    new AddCar(driver).pickUpPlace("Tel Aviv, Israel");
  }

  @And("User enter a make")
  public void enter_make(){
    new AddCar(driver).enterMake("Nissan");
  }

  @And("User enter a model")
      public void enter_model()  {
    new AddCar(driver).enterModel("XTRAIL");
  }

  @And("User enter year")
  public void enter_year(){
    new AddCar(driver).enterYear("2020");
  }

  @And("User selects fuel")
  public void select_fuel(){
    new AddCar(driver).selectsFuel("Gas");
  }

  @And("User enter number if seats")
  public void enter_number_seat(){
    new AddCar(driver).enterNumberSeat("3");
  }

  @And("User enter car class")
  public void enter_car_class(){
    new AddCar(driver).enterCarClass("A");
  }

  @And("User enter registration number")
  public void enter_registration_number(){
    new AddCar(driver).enterRegistrationNumber("234-342-345");
  }

  @And("User enter price")
  public void enter_price(){
    new AddCar(driver).enterPrice("150");
  }

  @An("User upload car photo")
  public void load_photo(){
    String photo = "C:/Users/AIT TR Student/Desktop/2.jpeg";
    new AddCar(driver).uploadPhoto(photo);
  }

  @An("User click on the submit button")
  public void click_on_submit(){
    new AddCar(driver).clickSubmitButton();
  }


}
