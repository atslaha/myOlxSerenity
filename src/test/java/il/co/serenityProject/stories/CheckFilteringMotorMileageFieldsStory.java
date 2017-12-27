package il.co.serenityProject.stories;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import il.co.serenityProject.steps.MotorMileageFieldNavigationUser;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

/**
 * @author Artem Meleshko
 * @version 1.0 2017
 *
 */
@RunWith(SerenityRunner.class)
public class CheckFilteringMotorMileageFieldsStory {
	
	@Managed(uniqueSession=true)
	public WebDriver browser;
	
	@Steps
	MotorMileageFieldNavigationUser mark;
	
	@Test
	public void check_the_motor_mileage_field_from_manual_filtering() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.fillTheMotorMileageFromFieldWithMileageValue("82000");
		//When
		mark.clickOnTheSearchResult();
		//Then
		mark.shouldSeeMotorMileageFromNotLessThanGivenValue();
	}
	
	@Test
	public void check_the_motor_mileage_field_to_manual_filtering() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.fillTheMotorMileageToFieldWithMileageValue("82000");
		//When
		mark.clickOnTheSearchResult();
		//Then
		mark.shouldSeeMotorMileageToNotHigherThanGivenValue();
	}
	
	@Test
	public void check_the_motor_mileage_field_from_auto_filtering_with_70000_value() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.autoFillTheMotorMileageFromFieldWith70000MileageValue();
		//When
		mark.clickOnTheSearchResult();
		//Then
		mark.shouldSeeMotorMileageFromNotLessThanGivenValue();
	}
	
	@Test
	public void check_the_motor_mileage_field_from_auto_filtering_with_100000_value() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.autoFillTheMotorMileageFromFieldWith100000MileageValue();
		//When
		mark.clickOnTheSearchResult();
		//Then
		mark.shouldSeeMotorMileageFromNotLessThanGivenValue();
	}
	
	@Test
	public void check_the_motor_mileage_field_from_auto_filtering_with_125000_value() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.autoFillTheMotorMileageFromFieldWith125000MileageValue();
		//When
		mark.clickOnTheSearchResult();
		//Then
		mark.shouldSeeMotorMileageFromNotLessThanGivenValue();
	}
	
	@Test
	public void check_the_motor_mileage_field_from_auto_filtering_with_150000_value() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.autoFillTheMotorMileageFromFieldWith150000MileageValue();
		//When
		mark.clickOnTheSearchResult();
		//Then
		mark.shouldSeeMotorMileageFromNotLessThanGivenValue();
	}
	
	@Test
	public void check_the_motor_mileage_field_from_auto_filtering_with_175000_value() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.autoFillTheMotorMileageFromFieldWith175000MileageValue();
		//When
		mark.clickOnTheSearchResult();
		//Then
		mark.shouldSeeMotorMileageFromNotLessThanGivenValue();
	}
	
	@Test
	public void check_the_motor_mileage_field_from_auto_filtering_with_200000_value() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.autoFillTheMotorMileageFromFieldWith200000MileageValue();
		//When
		mark.clickOnTheSearchResult();
		//Then
		mark.shouldSeeMotorMileageFromNotLessThanGivenValue();
	}
	
	@Test
	public void check_the_motor_mileage_field_from_auto_filtering_with_225000_value() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.autoFillTheMotorMileageFromFieldWith225000MileageValue();
		//When
		mark.clickOnTheSearchResult();
		//Then
		mark.shouldSeeMotorMileageFromNotLessThanGivenValue();
	}
	
	@Test
	public void check_the_motor_mileage_field_from_auto_filtering_with_250000_value() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.autoFillTheMotorMileageFromFieldWith250000MileageValue();
		//When
		mark.clickOnTheSearchResult();
		//Then
		mark.shouldSeeMotorMileageFromNotLessThanGivenValue();
	}
	
	@Test
	public void check_the_motor_mileage_field_from_auto_filtering_with_300000_value() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.autoFillTheMotorMileageFromFieldWith300000MileageValue();
		//When
		mark.clickOnTheSearchResult();
		//Then
		mark.shouldSeeMotorMileageFromNotLessThanGivenValue();
	}
	
	@Test
	public void check_the_motor_mileage_field_to_auto_filtering_with_70000_value() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.autoFillTheMotorMileageToFieldWith70000MileageValue();
		//When
		mark.clickOnTheSearchResult();
		//Then
		mark.shouldSeeMotorMileageToNotHigherThanGivenValue();
	}
	
	@Test
	public void check_the_motor_mileage_field_to_auto_filtering_with_100000_value() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.autoFillTheMotorMileageToFieldWith100000MileageValue();
		//When
		mark.clickOnTheSearchResult();
		//Then
		mark.shouldSeeMotorMileageToNotHigherThanGivenValue();
	}
	
	@Test
	public void check_the_motor_mileage_field_to_auto_filtering_with_125000_value() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.autoFillTheMotorMileageToFieldWith125000MileageValue();
		//When
		mark.clickOnTheSearchResult();
		//Then
		mark.shouldSeeMotorMileageToNotHigherThanGivenValue();
	}
	
	@Test
	public void check_the_motor_mileage_field_to_auto_filtering_with_150000_value() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.autoFillTheMotorMileageToFieldWith150000MileageValue();
		//When
		mark.clickOnTheSearchResult();
		//Then
		mark.shouldSeeMotorMileageToNotHigherThanGivenValue();
	}
	
	@Test
	public void check_the_motor_mileage_field_to_auto_filtering_with_175000_value() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.autoFillTheMotorMileageToFieldWith175000MileageValue();
		//When
		mark.clickOnTheSearchResult();
		//Then
		mark.shouldSeeMotorMileageToNotHigherThanGivenValue();
	}
	
	@Test
	public void check_the_motor_mileage_field_to_auto_filtering_with_200000_value() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.autoFillTheMotorMileageToFieldWith200000MileageValue();
		//When
		mark.clickOnTheSearchResult();
		//Then
		mark.shouldSeeMotorMileageToNotHigherThanGivenValue();
	}
	
	@Test
	public void check_the_motor_mileage_field_to_auto_filtering_with_225000_value() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.autoFillTheMotorMileageToFieldWith225000MileageValue();
		//When
		mark.clickOnTheSearchResult();
		//Then
		mark.shouldSeeMotorMileageToNotHigherThanGivenValue();
	}
	
	@Test
	public void check_the_motor_mileage_field_to_auto_filtering_with_250000_value() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.autoFillTheMotorMileageToFieldWith250000MileageValue();
		//When
		mark.clickOnTheSearchResult();
		//Then
		mark.shouldSeeMotorMileageToNotHigherThanGivenValue();
	}
	
	@Test
	public void check_the_motor_mileage_field_to_auto_filtering_with_300000_value() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.autoFillTheMotorMileageToFieldWith300000MileageValue();
		//When
		mark.clickOnTheSearchResult();
		//Then
		mark.shouldSeeMotorMileageToNotHigherThanGivenValue();
	}

}
