package com.Runner;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.BaseClass.Base_Class;
import sdp.Page_Object_Manager;
public class Test_Runner extends Base_Class {
public static	WebDriver driver=browser("chrome");
 public static Page_Object_Manager pom = new Page_Object_Manager(driver);
 public static Logger log =Logger.getLogger(Test_Runner.class);
	public static void main(String[] args) throws InterruptedException, IOException {
		PropertyConfigurator.configure("log4j.properties");
		log.info("successfully browser launched");
		url("http://automationpractice.com/index.php");
		log.info("url launched");
		implictywait(6000, TimeUnit.SECONDS);
clickOnElement(pom.getInstancepg().getSign_in());
String mailid =particular_data("C:\\Users\\surya\\eclipse-workspace\\Maven_Projects\\Excel\\Test cases excel.xlsx",2 ,5);
input(pom.getInstanceLn().getEmail(),mailid);
String pass = particular_data("C:\\Users\\surya\\eclipse-workspace\\Maven_Projects\\Excel\\Test cases excel.xlsx",3 ,5 );
input(pom.getInstanceLn().getPass(),pass);
clickOnElement(pom.getInstanceLn().getLogin());
log.info("loggin successfully");
moveAction(pom.getInstancet().getT_Shirt());
performclick(pom.getInstancet().getT_Shirt());
scroll(pom.getInstancet().getEnd());
sleep();
scrollup();
performclick(pom.getInstancet().getYellow());
sleep();
log.info("add the red dress");
frame(pom.getInstancet().getFrame());
sleep();
moveAction(pom.getInstancet().getSubmit());
performclick(pom.getInstancet().getSubmit());
explicitwait(120, "visibilityofElementLocated", By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
moveAction(pom.getInstancet().getAdd());
performclick(pom.getInstancet().getAdd());
scroll(pom.getInstances().getScrolldown());
moveAction(pom.getInstances().getStep1());
performclick(pom.getInstances().getStep1());
log.info("add to cart");
scroll(pom.getInstancex().getScroll());
moveAction(pom.getInstancex().getStep2());
performclick(pom.getInstancex().getStep2());
log.info("proceed to checkout");
scroll(pom.getInstancey().getScroll1());
moveAction(pom.getInstancey().getBox());
performclick(pom.getInstancey().getBox());
moveAction(pom.getInstancey().getStep3());
performclick(pom.getInstancey().getStep3());
scroll(pom.getInstancez().getScroll2());
moveAction(pom.getInstancez().getStep4());
performclick(pom.getInstancez().getStep4());
scroll(pom.getInstanceg().getScroll3());
moveAction(pom.getInstanceg().getStep5());
performclick(pom.getInstanceg().getStep5());
scroll(pom.GetInstanceth().getEnd());
scrolluplittle();;
sleep();
screenshot();
log.info("sucessfully take the screenshot");
log.info("order placed");
}
}