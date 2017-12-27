package il.co.serenityProject.steps;

import il.co.serenityProject.ui.OlxSearchPage;
import il.co.serenityProject.ui.PriceFieldNavigation;
import net.thucydides.core.annotations.Step;

/**
 * @author Artem Meleshko
 * @version 1.0 2017
 *
 */
public class PriceNavigationUser {
	OlxSearchPage olxSearchPage;
	PriceFieldNavigation priceFieldNavigation;
	
	@Step
	public void isOnTheHomePage() {
		olxSearchPage.open();
	}

	@Step
	public void fillInThePriceFromFieldSpecialChars(String input) {
		priceFieldNavigation.fillThePriceFromField(input);
	}
	
	@Step
	public void fillInThePriceFromFieldNumbers(String input) {
		priceFieldNavigation.fillThePriceFromField(input);
	}

	@Step
	public void fillInThePriceFromFieldChars(String input) {
		priceFieldNavigation.fillThePriceFromField(input);
		
	}
	
	@Step
	public void shouldSeePriceFromFilledWith123NumbersField() {
		priceFieldNavigation.checkPriceFromWithTheSpecialCharsField();
		
	}
	
	@Step
	public void shouldSeePriceFromFieldWithNumbers() {
		priceFieldNavigation.checkPriceFromFieldWithNumbers();
		
	}

	@Step
	public void shouldSeePriceFromFieldWithNumbers123WithoutChars() {
		priceFieldNavigation.checkPriceFromWithCharsField();
		
	}
	
	@Step
	public void fillInThePriceToFieldSpecialChars(String input) {
		priceFieldNavigation.fillThePriceFromField(input);
	}
	
	@Step
	public void fillInThePriceToFieldNumbers(String input) {
		priceFieldNavigation.fillThePriceFromField(input);
	}

	@Step
	public void fillInThePriceToFieldChars(String input) {
		priceFieldNavigation.fillThePriceFromField(input);
		
	}
	
	@Step
	public void shouldSeePriceToFilledWith123NumbersField() {
		priceFieldNavigation.checkPriceFromWithTheSpecialCharsField();
		
	}
	
	@Step
	public void shouldSeePriceToFieldWithNumbers() {
		priceFieldNavigation.checkPriceFromFieldWithNumbers();
		
	}

	@Step
	public void shouldSeePriceToFieldWithNumbers123WithoutChars() {
		priceFieldNavigation.checkPriceFromWithCharsField();
		
	}

	
	

}
