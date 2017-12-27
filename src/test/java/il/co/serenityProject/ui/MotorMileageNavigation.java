package il.co.serenityProject.ui;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.pages.PageObject;

/**
 * @author Artem Meleshko
 * @version 1.0 2017
 *
 */
public class MotorMileageNavigation extends PageObject {
	
	private String savedInput;
	private String motorMileageFromSearchPage;
	
	public void manualFillingTheMotorMileageFromFieldWhithTheValue(String input) {
		savedInput = input;
		Actions action = new Actions(getDriver());
		action.moveToElement($("//*[@id=\"geo-suggestions-close\"]")).click().build().perform();
		action.moveToElement($("//*[@id=\"param_motor_mileage\"]/div/div[1]/a")).click().build().perform();
		$("//*[@id=\"param_motor_mileage\"]/div/div[1]/label/input").type(input);
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
			 try {
		            Thread.sleep(1000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		            System.out.println(e);
		        }
	}
	
	public void manualFillingTheMotorMileageToFieldWhithTheValue(String input) {
		savedInput = input;
		Actions action = new Actions(getDriver());
		action.moveToElement($("//*[@id=\"geo-suggestions-close\"]")).click().build().perform();
		action.moveToElement($("//*[@id=\"param_motor_mileage\"]/div/div[2]/a")).click().build().perform();
		$("//*[@id=\"param_motor_mileage\"]/div/div[2]/label/input").type(input).click();
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
			 try {
		            Thread.sleep(1000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		            System.out.println(e);
		        }
	}

	public void clickOnTheSearchResult() {
		Actions action = new Actions(getDriver());
		action.moveToElement($("//*[@id=\"cookiesBar\"]/a")).click().build().perform();
		action.moveToElement($("//*[@id=\"body-container\"]/div[3]/div/div[1]/table[1]/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/div/h3/a")).click().build().perform();
		motorMileageFromSearchPage = $("//*[@id=\"offerdescription\"]//table/tbody/tr/td/strong[contains(text(), 'км')]").getTextValue().replaceAll("[^0-9]", "");
	}

	public void checkTheMotorMileageFromValueOnTheSearchResultPage() {
		assertTrue(Integer.parseInt(savedInput) <= Integer.parseInt(motorMileageFromSearchPage));
	}

	public void checkTheMotorMileageToValueOnTheSearchResultPage() {
		assertTrue(Integer.parseInt(savedInput) >= Integer.parseInt(motorMileageFromSearchPage));
	}

	public void clickOnThe70000valueInTheMileageFromValuesList() {
		Actions action = new Actions(getDriver());
		action.moveToElement($("//*[@id=\"geo-suggestions-close\"]")).click().build().perform();
		action.moveToElement($("//*[@id=\"param_motor_mileage\"]/div/div[1]/a")).click().build().perform();
		savedInput = $("//*[@id=\"param_motor_mileage\"]/div/div[1]/ul/li[1]/a").getTextValue().replaceAll("[^0-9]", "");
		$("//*[@id=\"param_motor_mileage\"]/div/div[1]/ul/li[1]/a").click();
	}

	public void clickOnThe100000valueInTheMileageFromValuesList() {
		Actions action = new Actions(getDriver());
		action.moveToElement($("//*[@id=\"geo-suggestions-close\"]")).click().build().perform();
		action.moveToElement($("//*[@id=\"param_motor_mileage\"]/div/div[1]/a")).click().build().perform();
		savedInput = $("//*[@id=\"param_motor_mileage\"]/div/div[1]/ul/li[2]/a").getTextValue().replaceAll("[^0-9]", "");
		$("//*[@id=\"param_motor_mileage\"]/div/div[1]/ul/li[2]/a").click();
	}

	public void clickOnThe125000valueInTheMileageFromValuesList() {
		Actions action = new Actions(getDriver());
		action.moveToElement($("//*[@id=\"geo-suggestions-close\"]")).click().build().perform();
		action.moveToElement($("//*[@id=\"param_motor_mileage\"]/div/div[1]/a")).click().build().perform();
		savedInput = $("//*[@id=\"param_motor_mileage\"]/div/div[1]/ul/li[3]/a").getTextValue().replaceAll("[^0-9]", "");
		$("//*[@id=\"param_motor_mileage\"]/div/div[1]/ul/li[3]/a").click();
	}

	public void clickOnThe150000valueInTheMileageFromValuesList() {
		Actions action = new Actions(getDriver());
		action.moveToElement($("//*[@id=\"geo-suggestions-close\"]")).click().build().perform();
		action.moveToElement($("//*[@id=\"param_motor_mileage\"]/div/div[1]/a")).click().build().perform();
		savedInput = $("//*[@id=\"param_motor_mileage\"]/div/div[1]/ul/li[4]/a").getTextValue().replaceAll("[^0-9]", "");
		$("//*[@id=\"param_motor_mileage\"]/div/div[1]/ul/li[4]/a").click();
	}

	public void clickOnThe175000valueInTheMileageFromValuesList() {
		Actions action = new Actions(getDriver());
		action.moveToElement($("//*[@id=\"geo-suggestions-close\"]")).click().build().perform();
		action.moveToElement($("//*[@id=\"param_motor_mileage\"]/div/div[1]/a")).click().build().perform();
		savedInput = $("//*[@id=\"param_motor_mileage\"]/div/div[1]/ul/li[5]/a").getTextValue().replaceAll("[^0-9]", "");
		$("//*[@id=\"param_motor_mileage\"]/div/div[1]/ul/li[5]/a").click();
	}

	public void clickOnThe200000valueInTheMileageFromValuesList() {
		Actions action = new Actions(getDriver());
		action.moveToElement($("//*[@id=\"geo-suggestions-close\"]")).click().build().perform();
		action.moveToElement($("//*[@id=\"param_motor_mileage\"]/div/div[1]/a")).click().build().perform();
		savedInput = $("//*[@id=\"param_motor_mileage\"]/div/div[1]/ul/li[6]/a").getTextValue().replaceAll("[^0-9]", "");
		$("//*[@id=\"param_motor_mileage\"]/div/div[1]/ul/li[6]/a").click();
	}

	public void clickOnThe225000valueInTheMileageFromValuesList() {
		Actions action = new Actions(getDriver());
		action.moveToElement($("//*[@id=\"geo-suggestions-close\"]")).click().build().perform();
		action.moveToElement($("//*[@id=\"param_motor_mileage\"]/div/div[1]/a")).click().build().perform();
		savedInput = $("//*[@id=\"param_motor_mileage\"]/div/div[1]/ul/li[7]/a").getTextValue().replaceAll("[^0-9]", "");
		$("//*[@id=\"param_motor_mileage\"]/div/div[1]/ul/li[7]/a").click();
	}

	public void clickOnThe250000valueInTheMileageFromValuesList() {
		Actions action = new Actions(getDriver());
		action.moveToElement($("//*[@id=\"geo-suggestions-close\"]")).click().build().perform();
		action.moveToElement($("//*[@id=\"param_motor_mileage\"]/div/div[1]/a")).click().build().perform();
		savedInput = $("//*[@id=\"param_motor_mileage\"]/div/div[1]/ul/li[8]/a").getTextValue().replaceAll("[^0-9]", "");
		$("//*[@id=\"param_motor_mileage\"]/div/div[1]/ul/li[8]/a").click();
	}

	public void clickOnThe300000valueInTheMileageFromValuesList() {
		Actions action = new Actions(getDriver());
		action.moveToElement($("//*[@id=\"geo-suggestions-close\"]")).click().build().perform();
		action.moveToElement($("//*[@id=\"param_motor_mileage\"]/div/div[1]/a")).click().build().perform();
		savedInput = $("//*[@id=\"param_motor_mileage\"]/div/div[1]/ul/li[9]/a").getTextValue().replaceAll("[^0-9]", "");
		$("//*[@id=\"param_motor_mileage\"]/div/div[1]/ul/li[9]/a").click();
	}

	public void clickOnThe70000valueInTheMileageToValuesList() {
		Actions action = new Actions(getDriver());
		action.moveToElement($("//*[@id=\"geo-suggestions-close\"]")).click().build().perform();
		action.moveToElement($("//*[@id=\"param_motor_mileage\"]/div/div[2]/a")).click().build().perform();
		savedInput = $("//*[@id=\"param_motor_mileage\"]/div/div[2]/ul/li[1]/a").getTextValue().replaceAll("[^0-9]", "");
		$("//*[@id=\"param_motor_mileage\"]/div/div[2]/ul/li[1]/a").click(); 
	}

	public void clickOnThe100000valueInTheMileageToValuesList() {
		Actions action = new Actions(getDriver());
		action.moveToElement($("//*[@id=\"geo-suggestions-close\"]")).click().build().perform();
		action.moveToElement($("//*[@id=\"param_motor_mileage\"]/div/div[2]/a")).click().build().perform();
		savedInput = $("//*[@id=\"param_motor_mileage\"]/div/div[2]/ul/li[2]/a").getTextValue().replaceAll("[^0-9]", "");
		$("//*[@id=\"param_motor_mileage\"]/div/div[2]/ul/li[2]/a").click(); 
	}

	public void clickOnThe125000valueInTheMileageToValuesList() {
		Actions action = new Actions(getDriver());
		action.moveToElement($("//*[@id=\"geo-suggestions-close\"]")).click().build().perform();
		action.moveToElement($("//*[@id=\"param_motor_mileage\"]/div/div[2]/a")).click().build().perform();
		savedInput = $("//*[@id=\"param_motor_mileage\"]/div/div[2]/ul/li[3]/a").getTextValue().replaceAll("[^0-9]", "");
		$("//*[@id=\"param_motor_mileage\"]/div/div[2]/ul/li[3]/a").click(); 
	}

	public void clickOnThe150000valueInTheMileageToValuesList() {
		Actions action = new Actions(getDriver());
		action.moveToElement($("//*[@id=\"geo-suggestions-close\"]")).click().build().perform();
		action.moveToElement($("//*[@id=\"param_motor_mileage\"]/div/div[2]/a")).click().build().perform();
		savedInput = $("//*[@id=\"param_motor_mileage\"]/div/div[2]/ul/li[4]/a").getTextValue().replaceAll("[^0-9]", "");
	}

	public void clickOnThe175000valueInTheMileageToValuesList() {
		Actions action = new Actions(getDriver());
		action.moveToElement($("//*[@id=\"geo-suggestions-close\"]")).click().build().perform();
		action.moveToElement($("//*[@id=\"param_motor_mileage\"]/div/div[2]/a")).click().build().perform();
		savedInput = $("//*[@id=\"param_motor_mileage\"]/div/div[2]/ul/li[5]/a").getTextValue().replaceAll("[^0-9]", "");
		$("//*[@id=\"param_motor_mileage\"]/div/div[2]/ul/li[5]/a").click(); 
	}

	public void clickOnThe200000valueInTheMileageToValuesList() {
		Actions action = new Actions(getDriver());
		action.moveToElement($("//*[@id=\"geo-suggestions-close\"]")).click().build().perform();
		action.moveToElement($("//*[@id=\"param_motor_mileage\"]/div/div[2]/a")).click().build().perform();
		savedInput = $("//*[@id=\"param_motor_mileage\"]/div/div[2]/ul/li[6]/a").getTextValue().replaceAll("[^0-9]", "");
		$("//*[@id=\"param_motor_mileage\"]/div/div[2]/ul/li[6]/a").click(); 
	}

	public void clickOnThe2250000valueInTheMileageToValuesList() {
		Actions action = new Actions(getDriver());
		action.moveToElement($("//*[@id=\"geo-suggestions-close\"]")).click().build().perform();
		action.moveToElement($("//*[@id=\"param_motor_mileage\"]/div/div[2]/a")).click().build().perform();
		savedInput = $("//*[@id=\"param_motor_mileage\"]/div/div[2]/ul/li[7]/a").getTextValue().replaceAll("[^0-9]", "");
		$("//*[@id=\"param_motor_mileage\"]/div/div[2]/ul/li[7]/a").click(); 
	}

	public void clickOnThe2500000valueInTheMileageToValuesList() {
		Actions action = new Actions(getDriver());
		action.moveToElement($("//*[@id=\"geo-suggestions-close\"]")).click().build().perform();
		action.moveToElement($("//*[@id=\"param_motor_mileage\"]/div/div[2]/a")).click().build().perform();
		savedInput = $("//*[@id=\"param_motor_mileage\"]/div/div[2]/ul/li[8]/a").getTextValue().replaceAll("[^0-9]", "");
		$("//*[@id=\"param_motor_mileage\"]/div/div[2]/ul/li[8]/a").click(); 
	}

	public void clickOnThe3000000valueInTheMileageToValuesList() {
		Actions action = new Actions(getDriver());
		action.moveToElement($("//*[@id=\"geo-suggestions-close\"]")).click().build().perform();
		action.moveToElement($("//*[@id=\"param_motor_mileage\"]/div/div[2]/a")).click().build().perform();
		savedInput = $("//*[@id=\"param_motor_mileage\"]/div/div[2]/ul/li[9]/a").getTextValue().replaceAll("[^0-9]", "");
		$("//*[@id=\"param_motor_mileage\"]/div/div[2]/ul/li[9]/a").click(); 
	}
}
