package il.co.serenityProject.stories;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import il.co.serenityProject.steps.NavigationListCarBrandsUser;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
/**
 * @author Artem Meleshko
 * @version 1.0 2017
 *
 */
@RunWith(SerenityRunner.class)
public class CheckTheListOfCarBrandsValuesStory {
	
	//Insert Unique Car Brand Value From the List On The OlxSearchPage;
	String CAR_BRAND_VALUE = "Volvo";
	
	@Managed(uniqueSession = true)
	public WebDriver browser;
	
	@Steps
	NavigationListCarBrandsUser mark;
	
	// Test For The Unique Car Brands
	@Test
	public void check_the_UNIQUE_brand_in_the_car_brands_list() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.navigatesToFullCarBrandsList();
		//Then
		mark.shouldSeeUniqueCarBrandValue(CAR_BRAND_VALUE);
	}
}

