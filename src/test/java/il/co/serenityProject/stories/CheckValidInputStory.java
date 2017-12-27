package il.co.serenityProject.stories;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import il.co.serenityProject.steps.PriceNavigationUser;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
/**
 * @author Artem Meleshko
 * @version 1.0 2017
 *
 */
@RunWith(SerenityRunner.class)
public class CheckValidInputStory {

	@Managed(uniqueSession=true)
	public WebDriver browser;
	
	@Steps
	PriceNavigationUser mark;
	
	@Test
	public void check_price_from_field_input_with_the_special_chars() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.fillInThePriceFromFieldSpecialChars("<([{\\^-=$!|]})?*+.>!@#$%&123"); 
		//Then
		mark.shouldSeePriceFromFilledWith123NumbersField();
	}
	
	@Test
	public void check_price_from_field_input_with_numbers() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.fillInThePriceFromFieldNumbers("1234567890"); 
		//Then
		mark.shouldSeePriceFromFieldWithNumbers();
	}
	
	@Test
	public void check_price_from_field_input_with_chars() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.fillInThePriceFromFieldChars("abcdef123"); 
		//Then
		mark.shouldSeePriceFromFieldWithNumbers123WithoutChars();
	}
	
	@Test
	public void check_price_to_field_input_with_the_special_chars() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.fillInThePriceFromFieldSpecialChars("<([{\\^-=$!|]})?*+.>!@#$%&123"); 
		//Then
		mark.shouldSeePriceFromFilledWith123NumbersField();
	}
	
	@Test
	public void check_price_to_field_input_with_numbers() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.fillInThePriceFromFieldNumbers("1234567890"); 
		//Then
		mark.shouldSeePriceFromFieldWithNumbers();
	}
	
	@Test
	public void check_price_to_field_input_with_chars() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.fillInThePriceFromFieldChars("abcdef123"); 
		//Then
		mark.shouldSeePriceFromFieldWithNumbers123WithoutChars();
	}
}
