package com.metlife.pageobjects;

import org.openqa.selenium.By;

public class Appointmentpage {


    public static By Parent = By.xpath("//input[@class='slds-combobox__input slds-input']");


  public static By Accounttype = By.xpath("//span[@title='Ajay']");

  public static By Next=By.xpath("(//*[contains(text(),'Next')])[2]");

  public static By Selectworktype = By.xpath("//*[contains(text(),'General Consult')]");

  public static By Next1 =By.xpath("(//*[contains(text(),'Next')])[2]");

 public static By Appointmenttype = By.xpath("//*[contains(text(),'In a Video Call')]");


  public static By Next2 =By.xpath("(//*[contains(text(),'Next')])[2]");

  public static By Next3 =By.xpath("(//*[contains(text(),'Next')])[2]");

  public static By errormsg= By.xpath("//ul[@class='errorsList']");

}
