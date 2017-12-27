package il.co.serenityProject.stories;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import il.co.serenityProject.steps.TransmissionTypeNavigayionUser;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

/**
 * @author Artem Meleshko
 * @version 1.0 2017
 *
 */
@RunWith(SerenityRunner.class)
public class CheckCheckboxesOfTheTransmissionTypeFieldStory {
	
	@Managed(uniqueSession=true)
	WebDriver browser;
	
	@Steps
	TransmissionTypeNavigayionUser mark;
	
	@Test
	public void check_transmission_type_field_default_checkbox() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.clickOnTheTransmissionTypeField();
		//Then
		mark.shouldSeeAllTranasmissionTypeCheckboxIsChecked();
	}
	
	@Test
	public void check_changing_checked_checkbox_from_default_to_manual_transmission_type() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.clickOnTheTransmissionTypeField();
		//When
		mark.clickOnTheManulTransmissionCheckBox();
		//Then
		mark.shouldSeeManualTranasmissionTypeCheckboxIsChecked();
	}
	
	@Test
	public void check_changing_checked_checkbox_from_default_to_automatic_transmission_type() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.clickOnTheTransmissionTypeField();
		//When
		mark.clickOnTheAutomaticTransmissionCheckBox();
		//Then
		mark.shouldSeeAutomaticTranasmissionTypeCheckboxIsChecked();
	}
	
	@Test
	public void check_changing_checked_checkbox_from_default_to_variator_transmission_type() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.clickOnTheTransmissionTypeField();
		//When
		mark.clickOnTheVariatorTransmissionCheckBox();
		//Then
		mark.shouldSeeVariatorTranasmissionTypeCheckboxIsChecked();
	}
	
	@Test
	public void check_changing_checked_checkbox_from_default_to_adaptive_transmission_type() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.clickOnTheTransmissionTypeField();
		//When
		mark.clickOnTheAdaptiveTransmissionCheckBox();
		//Then
		mark.shouldSeeAdaptiveTranasmissionTypeCheckboxIsChecked();
	}
	
	@Test
	public void check_changing_checked_checkbox_from_default_to_tiptronic_transmission_type() {
		//Given
		mark.isOnTheHomePage();
		//When
		mark.clickOnTheTransmissionTypeField();
		//When
		mark.clickOnTheTiptronicTransmissionCheckBox();
		//Then
		mark.shouldSeeTiptronicTranasmissionTypeCheckboxIsChecked();
	}

}
