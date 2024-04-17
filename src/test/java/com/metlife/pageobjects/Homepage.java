package com.metlife.pageobjects;

import org.openqa.selenium.By;

public class Homepage {
    public static By appopen = By.xpath("//div[@class='slds-icon-waffle']");



    public static By view= By.xpath("//*[contains(@aria-label,\"View All Applications\")]");
    //input[@id='input-221']



    public static By search = By.xpath("//input[@class='slds-input']");


    public static By textarea = By.xpath("//p[contains(text(),'Salesforce Scheduler Setup')]");

    public static By schedulelink = By.xpath("//div[@class='slds-app-launcher__tile-body slds-truncate']");
    public static By scheduler_page = By.xpath("//a[@title='Salesforce Scheduler Setup Assistant']");
    public static By linkforschedule=By.xpath("//button[@title='Schedule a Service Appointment']");
}
