package il.co.serenityProject.steps;

import il.co.serenityProject.ui.OlxSearchPage;
import il.co.serenityProject.ui.TransmissioTypeNavigation;
import net.thucydides.core.annotations.Step;

/**
 * @author Artem Meleshko
 * @version 1.0 2017
 *
 */
public class TransmissionTypeNavigayionUser {
	
	OlxSearchPage olxSearchPage;
	TransmissioTypeNavigation transmissioTypeNavigation;
	
	@Step
	public void isOnTheHomePage() {
		olxSearchPage.open();
	}

	@Step
	public void clickOnTheTransmissionTypeField() {
		transmissioTypeNavigation.clickOnTheTransmissionTypeField();
	}

	@Step
	public void shouldSeeAllTranasmissionTypeCheckboxIsChecked() {
		transmissioTypeNavigation.checkTheDefaultCheckbox();
	}

	@Step
	public void clickOnTheManulTransmissionCheckBox() {
		transmissioTypeNavigation.clickOnTheManualTransmissionTypeCheckbox();
	}

	@Step
	public void shouldSeeManualTranasmissionTypeCheckboxIsChecked() {
		transmissioTypeNavigation.checkTheManualTranasmissionTypeCheckbox();
	}

	@Step
	public void clickOnTheAutomaticTransmissionCheckBox() {
		transmissioTypeNavigation.clickOnTheAutomaticTransmissionTypeCheckbox();
	}

	@Step
	public void shouldSeeAutomaticTranasmissionTypeCheckboxIsChecked() {
		transmissioTypeNavigation.checkTheAutomaticTranasmissionTypeCheckbox();
	}

	@Step
	public void clickOnTheVariatorTransmissionCheckBox() {
		transmissioTypeNavigation.clickOnTheVariatorTransmissionTypeCheckbox();
	}

	@Step
	public void shouldSeeVariatorTranasmissionTypeCheckboxIsChecked() {
		transmissioTypeNavigation.checkTheVariatorTranasmissionTypeCheckbox();
	}

	@Step
	public void clickOnTheAdaptiveTransmissionCheckBox() {
		transmissioTypeNavigation.clickOnTheAdaptiveTransmissionTypeCheckbox();
		
	}

	@Step
	public void shouldSeeAdaptiveTranasmissionTypeCheckboxIsChecked() {
		transmissioTypeNavigation.checkTheAdaptiveTranasmissionTypeCheckbox();
	}

	@Step
	public void clickOnTheTiptronicTransmissionCheckBox() {
		transmissioTypeNavigation.clickOnTheTiptronicTransmissionTypeCheckbox();
	}

	@Step
	public void shouldSeeTiptronicTranasmissionTypeCheckboxIsChecked() {
		transmissioTypeNavigation.checkTheTiptronicTranasmissionTypeCheckbox();
	}

}
