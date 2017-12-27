package il.co.serenityProject.stories;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import il.co.serenityProject.steps.PriceFieldNavigationUser;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

/**
 * @author Artem Meleshko
 * @version 1.0 2017
 *
 */
@RunWith(SerenityRunner.class)
public class CheckFilteringPriceFieldStory {
	
	@Managed(uniqueSession=true)
	public WebDriver browser;
	
	@Steps
	PriceFieldNavigationUser mark;
	
	@Test
	public void check_the_price_field_from_manual_filtering() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.fillThePriceFromFieldWithPriceValue("82000");
		//Then
		mark.shouldSeeExpectedPriceListWithTheValuesHigherThenInput();
	}
	
	@Test
	public void check_the_price_field_to_manual_filtering() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.fillThePriceToFieldWithPriceValue("150000");
		//Then
		mark.shouldSeeExpectedPriceListWithTheValuesLessThenInput();
	}
	
	@Test
	public void check_the_price_field_from_auto_filtering_with_100000_value() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.autoFillThePriceFromFieldWith100000PriceValue();
		//Given
		mark.shouldSeeExpectedPriceListWithTheValuesHigherThenInput();
	}
	
	@Test
	public void check_the_price_field_from_auto_filtering_with_500000_value() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.autoFillThePriceFromFieldWith500000PriceValue();
		//Given
		mark.shouldSeeExpectedPriceListWithTheValuesHigherThenInput();
	}
	
	@Test
	public void check_the_price_field_from_auto_filtering_with_1000000_value() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.autoFillThePriceFromFieldWith1000000PriceValue();
		//Given
		mark.shouldSeeExpectedPriceListWithTheValuesHigherThenInput();
	}
	
	@Test
	public void check_the_price_field_from_auto_filtering_with_1500000_value() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.autoFillThePriceFromFieldWith1500000PriceValue();
		//Given
		mark.shouldSeeExpectedPriceListWithTheValuesHigherThenInput();
	}
	
	@Test
	public void check_the_price_field_from_auto_filtering_with_2000000_value() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.autoFillThePriceFromFieldWith2000000PriceValue();
		//Given
		mark.shouldSeeExpectedPriceListWithTheValuesHigherThenInput();
	}
	
	@Test
	public void check_the_price_field_from_auto_filtering_with_2500000_value() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.autoFillThePriceFromFieldWith2500000PriceValue();
		//Given
		mark.shouldSeeExpectedPriceListWithTheValuesHigherThenInput();
	}
	
	@Test
	public void check_the_price_field_from_auto_filtering_with_3000000_value() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.autoFillThePriceFromFieldWith3000000PriceValue();
		//Given
		mark.shouldSeeExpectedPriceListWithTheValuesHigherThenInput();
	}
	
	@Test
	public void check_the_price_field_from_auto_filtering_with_4000000_value() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.autoFillThePriceFromFieldWith4000000PriceValue();
		//Given
		mark.shouldSeeExpectedPriceListWithTheValuesHigherThenInput();
	}
	
	@Test
	public void check_the_price_field_from_auto_filtering_with_5000000_value() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.autoFillThePriceFromFieldWith5000000PriceValue();
		//Given
		mark.shouldSeeExpectedPriceListWithTheValuesHigherThenInput();
	}
	
	@Test
	public void check_the_price_field_to_auto_filtering_with_100000_value() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.autoFillThePriceToFieldWith100000PriceValue();
		//Given
		mark.shouldSeeExpectedPriceListWithTheValuesLessThenInput();
	}
	
	@Test
	public void check_the_price_field_to_auto_filtering_with_500000_value() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.autoFillThePriceToFieldWith500000PriceValue();
		//Given
		mark.shouldSeeExpectedPriceListWithTheValuesLessThenInput();
	}
	
	@Test
	public void check_the_price_field_to_auto_filtering_with_1000000_value() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.autoFillThePriceToFieldWith1000000PriceValue();
		//Given
		mark.shouldSeeExpectedPriceListWithTheValuesLessThenInput();
	}
	
	@Test
	public void check_the_price_field_to_auto_filtering_with_1500000_value() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.autoFillThePriceToFieldWith1500000PriceValue();
		//Given
		mark.shouldSeeExpectedPriceListWithTheValuesLessThenInput();
	}
	
	@Test
	public void check_the_price_field_to_auto_filtering_with_2000000_value() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.autoFillThePriceToFieldWith2000000PriceValue();
		//Given
		mark.shouldSeeExpectedPriceListWithTheValuesLessThenInput();
	}
	
	@Test
	public void check_the_price_field_to_auto_filtering_with_2500000_value() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.autoFillThePriceToFieldWith2500000PriceValue();
		//Given
		mark.shouldSeeExpectedPriceListWithTheValuesLessThenInput();
	}
	
	@Test
	public void check_the_price_field_to_auto_filtering_with_3000000_value() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.autoFillThePriceToFieldWith3000000PriceValue();
		//Given
		mark.shouldSeeExpectedPriceListWithTheValuesLessThenInput();
	}
	
	@Test
	public void check_the_price_field_to_auto_filtering_with_4000000_value() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.autoFillThePriceToFieldWith4000000PriceValue();
		//Given
		mark.shouldSeeExpectedPriceListWithTheValuesLessThenInput();
	}
	
	@Test
	public void check_the_price_field_to_auto_filtering_with_5000000_value() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.autoFillThePriceToFieldWith5000000PriceValue();
		//Given
		mark.shouldSeeExpectedPriceListWithTheValuesLessThenInput();
	}

}
