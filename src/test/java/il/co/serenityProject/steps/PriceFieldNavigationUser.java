package il.co.serenityProject.steps;

import il.co.serenityProject.ui.OlxSearchPage;
import il.co.serenityProject.ui.PriceFieldFromToNavigation;
import net.thucydides.core.annotations.Step;

/**
 * @author Artem Meleshko
 * @version 1.0 2017
 *
 */
public class PriceFieldNavigationUser {
	OlxSearchPage olxSearchPage;
	PriceFieldFromToNavigation priceFieldNavigation;
	
	@Step
	public void isOnTheHomePage() {
		olxSearchPage.open();
	}

	@Step
	public void fillThePriceFromFieldWithPriceValue(String input) {
		priceFieldNavigation.fillThePriceFromField(input);
	}

	@Step
	public void shouldSeeExpectedPriceListWithTheValuesHigherThenInput() {
		priceFieldNavigation.checkIfthePriseListIsHigherThanInputValue();
	}

	@Step
	public void fillThePriceToFieldWithPriceValue(String input) {
		priceFieldNavigation.fillThePriceToField(input);
	}

	@Step
	public void shouldSeeExpectedPriceListWithTheValuesLessThenInput() {
		priceFieldNavigation.checkIfthePriseListIsLessThanInputValue();
	}

	@Step
	public void autoFillThePriceFromFieldWith100000PriceValue() {
		priceFieldNavigation.fillThePriceFromFieldWhith100000Value();
	}

	@Step
	public void autoFillThePriceFromFieldWith500000PriceValue() {
		priceFieldNavigation.fillThePriceFromFieldWhith500000Value();
	}

	@Step
	public void autoFillThePriceFromFieldWith1000000PriceValue() {
		priceFieldNavigation.fillThePriceFromFieldWhith1000000Value();
	}

	@Step
	public void autoFillThePriceFromFieldWith1500000PriceValue() {
		priceFieldNavigation.fillThePriceFromFieldWhith1500000Value();
	}

	@Step
	public void autoFillThePriceFromFieldWith2000000PriceValue() {
		priceFieldNavigation.fillThePriceFromFieldWhith2000000Value();
	}

	@Step
	public void autoFillThePriceFromFieldWith2500000PriceValue() {
		priceFieldNavigation.fillThePriceFromFieldWhith2500000Value();
	}

	@Step
	public void autoFillThePriceFromFieldWith3000000PriceValue() {
		priceFieldNavigation.fillThePriceFromFieldWhith3000000Value();
	}

	@Step
	public void autoFillThePriceFromFieldWith4000000PriceValue() {
		priceFieldNavigation.fillThePriceFromFieldWhith4000000Value();
	}

	@Step
	public void autoFillThePriceFromFieldWith5000000PriceValue() {
		priceFieldNavigation.fillThePriceFromFieldWhith5000000Value();
	}

	@Step
	public void autoFillThePriceToFieldWith100000PriceValue() {
		priceFieldNavigation.fillThePriceToFieldWhith100000Value();
	}

	@Step
	public void autoFillThePriceToFieldWith500000PriceValue() {
		priceFieldNavigation.fillThePriceToFieldWhith500000Value();
	}

	@Step
	public void autoFillThePriceToFieldWith1000000PriceValue() {
		priceFieldNavigation.fillThePriceToFieldWhith1000000Value();
	}

	@Step
	public void autoFillThePriceToFieldWith1500000PriceValue() {
		priceFieldNavigation.fillThePriceToFieldWhith1500000Value();
	}

	@Step
	public void autoFillThePriceToFieldWith2000000PriceValue() {
		priceFieldNavigation.fillThePriceToFieldWhith2000000Value();
	}

	@Step
	public void autoFillThePriceToFieldWith2500000PriceValue() {
		priceFieldNavigation.fillThePriceToFieldWhith2500000Value();
	}

	@Step
	public void autoFillThePriceToFieldWith3000000PriceValue() {
		priceFieldNavigation.fillThePriceToFieldWhith3000000Value();
	}

	@Step
	public void autoFillThePriceToFieldWith4000000PriceValue() {
		priceFieldNavigation.fillThePriceToFieldWhith4000000Value();
	}

	@Step
	public void autoFillThePriceToFieldWith5000000PriceValue() {
		priceFieldNavigation.fillThePriceToFieldWhith5000000Value();
	}
		
	
}
