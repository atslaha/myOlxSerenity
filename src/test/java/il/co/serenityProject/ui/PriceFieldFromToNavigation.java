package il.co.serenityProject.ui;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

/**
 * @author Artem Meleshko
 * @version 1.0 2017
 *
 */
public class PriceFieldFromToNavigation extends PageObject {
	
	private String savedInput;
	
	public void fillThePriceFromField(String input) {
		savedInput = input;
		Actions action = new Actions(getDriver());
		action.moveToElement($("//*[@id=\"geo-suggestions-close\"]")).click().build().perform();
		action.moveToElement($("//*[@id=\"param_price\"]/div/div[1]/a")).click().build().perform();
		$("//*[@id=\"param_price\"]/div/div[1]/label/input").type(input);
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
			 try {
		            Thread.sleep(1000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		            System.out.println(e);
		        }
	}
	
	public void fillThePriceToField(String input) {
		savedInput = input;
		Actions action = new Actions(getDriver());
		action.moveToElement($("//*[@id=\"geo-suggestions-close\"]")).click().build().perform();
		action.moveToElement($("//*[@id=\"param_price\"]/div/div[2]/a")).click().build().perform();
		$("//*[@id=\"param_price\"]/div/div[2]/label/input").type(input);
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
			 try {
		            Thread.sleep(1000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		            System.out.println(e);
		        }
	}

	public void checkIfthePriseListIsHigherThanInputValue() {
		String priceValue = null;
		boolean bool=false;
		
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//strong[contains(text(), 'грн.')]"))));
		
		List<WebElementFacade> allPrimeElements = findAll(By.xpath("//strong[contains(text(), 'грн.')]"));
		for(WebElementFacade element: allPrimeElements) {
			priceValue = element.getText().replaceAll("[^0-9]", "");
			if(Integer.parseInt(savedInput) <= Integer.parseInt(priceValue)) {
				bool=true;
			}else {bool=false; break;}
		}
		assertTrue(bool);
	}

	public void checkIfthePriseListIsLessThanInputValue() {
		String priceValue = null;
		boolean bool=false;
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//strong[contains(text(), 'грн.')]"))));
		
		List<WebElementFacade> allElements = findAll(By.xpath("//strong[contains(text(), 'грн.')]"));
		for(WebElementFacade element: allElements) {
			priceValue = element.getText().replaceAll("[^0-9]", "");
			if(Integer.parseInt(savedInput) >= Integer.parseInt(priceValue)) {
				bool=true;
			}else {bool=false; break;}
		}
		assertTrue(bool);
	}

	public void fillThePriceFromFieldWhith100000Value() {
		Actions action = new Actions(getDriver());
		action.moveToElement($("//*[@id=\"geo-suggestions-close\"]")).click().build().perform();
		action.moveToElement($("//*[@id=\"param_price\"]/div/div[1]/a")).click().build().perform();
		savedInput = $("//*[@id=\"param_price\"]/div/div[1]/ul/li[1]/a").getTextValue().replaceAll("[^0-9]", "");
		$("//*[@id=\"param_price\"]/div/div[1]/ul/li[1]/a").click();
	}

	public void fillThePriceFromFieldWhith500000Value() {
		Actions action = new Actions(getDriver());
		action.moveToElement($("//*[@id=\"geo-suggestions-close\"]")).click().build().perform();
		action.moveToElement($("//*[@id=\"param_price\"]/div/div[1]/a")).click().build().perform();
		savedInput = $("//*[@id=\"param_price\"]/div/div[1]/ul/li[2]/a").getTextValue().replaceAll("[^0-9]", "");
		$("//*[@id=\"param_price\"]/div/div[1]/ul/li[2]/a").click();
	}

	public void fillThePriceFromFieldWhith1000000Value() {
		Actions action = new Actions(getDriver());
		action.moveToElement($("//*[@id=\"geo-suggestions-close\"]")).click().build().perform();
		action.moveToElement($("//*[@id=\"param_price\"]/div/div[1]/a")).click().build().perform();
		savedInput = $("//*[@id=\"param_price\"]/div/div[1]/ul/li[3]/a").getTextValue().replaceAll("[^0-9]", "");
		$("//*[@id=\"param_price\"]/div/div[1]/ul/li[3]/a").click();
	}

	public void fillThePriceFromFieldWhith1500000Value() {
		Actions action = new Actions(getDriver());
		action.moveToElement($("//*[@id=\"geo-suggestions-close\"]")).click().build().perform();
		action.moveToElement($("//*[@id=\"param_price\"]/div/div[1]/a")).click().build().perform();
		savedInput = $("//*[@id=\"param_price\"]/div/div[1]/ul/li[4]/a").getTextValue().replaceAll("[^0-9]", "");
		$("//*[@id=\"param_price\"]/div/div[1]/ul/li[4]/a").click();
	}

	public void fillThePriceFromFieldWhith2000000Value() {
		Actions action = new Actions(getDriver());
		action.moveToElement($("//*[@id=\"geo-suggestions-close\"]")).click().build().perform();
		action.moveToElement($("//*[@id=\"param_price\"]/div/div[1]/a")).click().build().perform();
		savedInput = $("//*[@id=\"param_price\"]/div/div[1]/ul/li[5]/a").getTextValue().replaceAll("[^0-9]", "");
		$("//*[@id=\"param_price\"]/div/div[1]/ul/li[5]/a").click();
	}

	public void fillThePriceFromFieldWhith2500000Value() {
		Actions action = new Actions(getDriver());
		action.moveToElement($("//*[@id=\"geo-suggestions-close\"]")).click().build().perform();
		action.moveToElement($("//*[@id=\"param_price\"]/div/div[1]/a")).click().build().perform();
		savedInput = $("//*[@id=\"param_price\"]/div/div[1]/ul/li[6]/a").getTextValue().replaceAll("[^0-9]", "");
		$("//*[@id=\"param_price\"]/div/div[1]/ul/li[6]/a").click();
	}

	public void fillThePriceFromFieldWhith3000000Value() {
		Actions action = new Actions(getDriver());
		action.moveToElement($("//*[@id=\"geo-suggestions-close\"]")).click().build().perform();
		action.moveToElement($("//*[@id=\"param_price\"]/div/div[1]/a")).click().build().perform();
		savedInput = $("//*[@id=\"param_price\"]/div/div[1]/ul/li[7]/a").getTextValue().replaceAll("[^0-9]", "");
		$("//*[@id=\"param_price\"]/div/div[1]/ul/li[7]/a").click();
	}

	public void fillThePriceFromFieldWhith4000000Value() {
		Actions action = new Actions(getDriver());
		action.moveToElement($("//*[@id=\"geo-suggestions-close\"]")).click().build().perform();
		action.moveToElement($("//*[@id=\"param_price\"]/div/div[1]/a")).click().build().perform();
		savedInput = $("//*[@id=\"param_price\"]/div/div[1]/ul/li[8]/a").getTextValue().replaceAll("[^0-9]", "");
		$("//*[@id=\"param_price\"]/div/div[1]/ul/li[8]/a").click();
	}

	public void fillThePriceFromFieldWhith5000000Value() {
		Actions action = new Actions(getDriver());
		action.moveToElement($("//*[@id=\"geo-suggestions-close\"]")).click().build().perform();
		action.moveToElement($("//*[@id=\"param_price\"]/div/div[1]/a")).click().build().perform();
		savedInput = $("//*[@id=\"param_price\"]/div/div[1]/ul/li[9]/a").getTextValue().replaceAll("[^0-9]", "");
		$("//*[@id=\"param_price\"]/div/div[1]/ul/li[9]/a").click();
	}

	public void fillThePriceToFieldWhith100000Value() {
		Actions action = new Actions(getDriver());
		action.moveToElement($("//*[@id=\"geo-suggestions-close\"]")).click().build().perform();
		action.moveToElement($("//*[@id=\"param_price\"]/div/div[2]/a")).click().build().perform();
		savedInput = $("//*[@id=\"param_price\"]/div/div[2]/ul/li[1]/a").getTextValue().replaceAll("[^0-9]", "");
		$("//*[@id=\"param_price\"]/div/div[2]/ul/li[1]/a").click();
	}

	public void fillThePriceToFieldWhith500000Value() {
		Actions action = new Actions(getDriver());
		action.moveToElement($("//*[@id=\"geo-suggestions-close\"]")).click().build().perform();
		action.moveToElement($("//*[@id=\"param_price\"]/div/div[2]/a")).click().build().perform();
		savedInput = $("//*[@id=\"param_price\"]/div/div[2]/ul/li[2]/a").getTextValue().replaceAll("[^0-9]", "");
		$("//*[@id=\"param_price\"]/div/div[2]/ul/li[2]/a").click();
	}

	public void fillThePriceToFieldWhith1000000Value() {
		Actions action = new Actions(getDriver());
		action.moveToElement($("//*[@id=\"geo-suggestions-close\"]")).click().build().perform();
		action.moveToElement($("//*[@id=\"param_price\"]/div/div[2]/a")).click().build().perform();
		savedInput = $("//*[@id=\"param_price\"]/div/div[2]/ul/li[3]/a").getTextValue().replaceAll("[^0-9]", "");
		$("//*[@id=\"param_price\"]/div/div[2]/ul/li[3]/a").click();
	}

	public void fillThePriceToFieldWhith1500000Value() {
		Actions action = new Actions(getDriver());
		action.moveToElement($("//*[@id=\"geo-suggestions-close\"]")).click().build().perform();
		action.moveToElement($("//*[@id=\"param_price\"]/div/div[2]/a")).click().build().perform();
		savedInput = $("//*[@id=\"param_price\"]/div/div[2]/ul/li[4]/a").getTextValue().replaceAll("[^0-9]", "");
		$("//*[@id=\"param_price\"]/div/div[2]/ul/li[4]/a").click();
	}

	public void fillThePriceToFieldWhith2000000Value() {
		Actions action = new Actions(getDriver());
		action.moveToElement($("//*[@id=\"geo-suggestions-close\"]")).click().build().perform();
		action.moveToElement($("//*[@id=\"param_price\"]/div/div[2]/a")).click().build().perform();
		savedInput = $("//*[@id=\"param_price\"]/div/div[2]/ul/li[5]/a").getTextValue().replaceAll("[^0-9]", "");
		$("//*[@id=\"param_price\"]/div/div[2]/ul/li[5]/a").click();
	}

	public void fillThePriceToFieldWhith2500000Value() {
		Actions action = new Actions(getDriver());
		action.moveToElement($("//*[@id=\"geo-suggestions-close\"]")).click().build().perform();
		action.moveToElement($("//*[@id=\"param_price\"]/div/div[2]/a")).click().build().perform();
		savedInput = $("//*[@id=\"param_price\"]/div/div[2]/ul/li[6]/a").getTextValue().replaceAll("[^0-9]", "");
		$("//*[@id=\"param_price\"]/div/div[2]/ul/li[6]/a").click();
	}

	public void fillThePriceToFieldWhith3000000Value() {
		Actions action = new Actions(getDriver());
		action.moveToElement($("//*[@id=\"geo-suggestions-close\"]")).click().build().perform();
		action.moveToElement($("//*[@id=\"param_price\"]/div/div[2]/a")).click().build().perform();
		savedInput = $("//*[@id=\"param_price\"]/div/div[2]/ul/li[7]/a").getTextValue().replaceAll("[^0-9]", "");
		$("//*[@id=\"param_price\"]/div/div[2]/ul/li[7]/a").click();
	}

	public void fillThePriceToFieldWhith4000000Value() {
		Actions action = new Actions(getDriver());
		action.moveToElement($("//*[@id=\"geo-suggestions-close\"]")).click().build().perform();
		action.moveToElement($("//*[@id=\"param_price\"]/div/div[2]/a")).click().build().perform();
		savedInput = $("//*[@id=\"param_price\"]/div/div[2]/ul/li[8]/a").getTextValue().replaceAll("[^0-9]", "");
		$("//*[@id=\"param_price\"]/div/div[2]/ul/li[8]/a").click();
	}

	public void fillThePriceToFieldWhith5000000Value() {
		Actions action = new Actions(getDriver());
		action.moveToElement($("//*[@id=\"geo-suggestions-close\"]")).click().build().perform();
		action.moveToElement($("//*[@id=\"param_price\"]/div/div[2]/a")).click().build().perform();
		savedInput = $("//*[@id=\"param_price\"]/div/div[2]/ul/li[9]/a").getTextValue().replaceAll("[^0-9]", "");
		$("//*[@id=\"param_price\"]/div/div[2]/ul/li[9]/a").click();
	}

}
