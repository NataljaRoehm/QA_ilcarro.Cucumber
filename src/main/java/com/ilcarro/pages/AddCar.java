package com.ilcarro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddCar extends BasePage {

  public AddCar(WebDriver driver) {
    super(driver);
  }

  @FindBy(id = "pickUpPlace")
  WebElement addLocation;


  public AddCar pickUpPlace(String location) {
    type(addLocation, location);
    return this;
  }

  @FindBy(id = "make")
  WebElement enterMake;

  public AddCar enterMake(String make) {
    type(enterMake, make);
    return this;
  }

  @FindBy(id = "model")
  WebElement enterModel;

  public AddCar enterModel(String model) {
    type(enterModel, model);
    return this;
  }

  @FindBy(id = "year")
  WebElement enterYear;

  public AddCar enterYear(String year) {
    type(enterYear, year);
    return this;
  }


  @FindBy(id = "fuel")
  WebElement enterFuel;

  public AddCar selectsFuel(String gas) {
    Select select = new Select(enterFuel);
    select.selectByVisibleText(gas);
    return this;
  }

  @FindBy(id = "seats")
  WebElement enterSeat;

  public AddCar enterNumberSeat(String seat) {
    type(enterSeat, seat);
    return this;
  }

  @FindBy(id = "class")
  WebElement enterClass;

  public AddCar enterCarClass(String carClass) {
    type(enterClass, carClass);
    return this;
  }

  @FindBy(id = "serialNumber")
  WebElement enterRegistrNumber;

  public AddCar enterRegistrationNumber(String number) {
    type(enterRegistrNumber, number);
    return this;
  }

  @FindBy(xpath = "//input[@id='price']")
  WebElement entPrice;

  public AddCar enterPrice(String price) {
    type(entPrice, price);
    return this;
  }


  @FindBy(xpath = "//label[contains(text(),'Add photos of your car')]")
  WebElement loadPhoto;

  public AddCar uploadPhoto(String photo) {
    loadPhoto.sendKeys(photo);
    return this;
  }

  @FindBy(xpath = "//button[contains(text(),'Submit')]")
  WebElement clickButton;

  public AddCar clickSubmitButton() {
    click(clickButton);
    return this;
  }
}