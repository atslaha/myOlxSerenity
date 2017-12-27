package il.co.serenityProject.steps;

import il.co.serenityProject.ui.CarBrandsListNavigation;
import il.co.serenityProject.ui.OlxSearchPage;
import net.thucydides.core.annotations.Step;

/**
 * @author Artem Meleshko
 * @version 1.0 2017
 *
 */
public class NavigationListCarBrandsUser {
	
	OlxSearchPage olxSearchPage;
	CarBrandsListNavigation CarBrandsListNavigation;
	
	@Step
	public void isOnTheHomePage() {
		olxSearchPage.open();
	}

	@Step
	public void navigatesToFullCarBrandsList() {
		CarBrandsListNavigation.navigateToTheFullCarBrandsList();
	}

	@Step
	public void shouldSeeUniqueCarBrandValue(String expected) {
	CarBrandsListNavigation.checkUniqueCarBrandValueInTheList1(expected);
	
	}
}
