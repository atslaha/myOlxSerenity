package il.co.serenityProject.ui;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.pages.PageObject;

/**
 * @author Artem Meleshko
 * @version 1.0 2017
 *
 */
public class PriceFieldNavigation extends PageObject {
    
	//--Price "From" Methods--
	
	public void fillThePriceFromField(String input) {
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

	public void checkPriceFromWithTheSpecialCharsField() {
		assertThat($("//*[@id=\"param_price\"]/div/div[1]/a/span[1]").getTextValue(), containsString("123"));
	}
	
	public void checkPriceFromWithCharsField() {
		assertThat($("//*[@id=\"param_price\"]/div/div[1]/a/span[1]").getTextValue(), containsString("123"));
	}
	
	public void checkPriceFromFieldWithNumbers() {
		assertThat($("//*[@id=\"param_price\"]/div/div[1]/a/span[1]").getTextValue(), containsString("от 1234567890 грн.")); 
	}
	
	//--Price "To" Methods--
	
	public void fillThePriceToField(String input) {
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

	public void checkPriceToWithTheSpecialCharsField() {
		assertThat($("//*[@id=\"param_price\"]/div/div[2]/a/span[1]").getTextValue(), containsString("123"));
	}
	
	public void checkPriceToWithCharsField() {
		assertThat($("//*[@id=\"param_price\"]/div/div[2]/a/span[1]").getTextValue(), containsString("123"));
	}
	
	public void checkPriceToFieldWithNumbers() {
		assertThat($("//*[@id=\"param_price\"]/div/div[2]/a/span[1]").getTextValue(), containsString("от 1234567890 грн.")); 
	}

}
