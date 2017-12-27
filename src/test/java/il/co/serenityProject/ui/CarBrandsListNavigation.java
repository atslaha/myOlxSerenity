package il.co.serenityProject.ui;

import static org.junit.Assert.assertTrue;

import java.util.List;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

/**
 * @author Artem Meleshko
 * @version 1.0 2017
 *
 */
public class CarBrandsListNavigation extends PageObject{

	public void navigateToTheFullCarBrandsList() {
		$("//*[@id=\"topLinkShowAll\"]/span/span").click();
	}

	public void checkUniqueCarBrandValueInTheList1(String expected) {
		String carBrandValue = null;;
		List<WebElementFacade> allElements = findAll(By.xpath("//*[@id=\"topLink\"]/div/ul/li/a/span/span"));
		for (WebElementFacade element: allElements) {
			carBrandValue = element.getTextValue();
			if(carBrandValue.equals(expected)){
				break;
			}
		}
		assertTrue(carBrandValue.equals(expected));
	}
	
}
