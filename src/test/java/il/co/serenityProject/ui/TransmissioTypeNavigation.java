package il.co.serenityProject.ui;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.pages.PageObject;

/**
 * @author Artem Meleshko
 * @version 1.0 2017
 *
 */
public class TransmissioTypeNavigation extends PageObject {

	boolean isChecked=false;
	boolean isCheckedDefault;
	
	public void clickOnTheTransmissionTypeField() {
		Actions action = new Actions(getDriver());
		action.moveToElement($("//*[@id=\"geo-suggestions-close\"]")).click().build().perform();
		action.moveToElement($("//*[@id=\"param_transmission_type\"]/div/a")).click().build().perform();
	}

	public void checkTheDefaultCheckbox() {
		isChecked = $("//*[@id=\"f-all-filter_enum_transmission_type_10\"]").isSelected();
		assertTrue(isChecked);
	}

	public void clickOnTheManualTransmissionTypeCheckbox() {
		$("//*[@id=\"f-545_transmission_type\"]").click();
	}

	public void checkTheManualTranasmissionTypeCheckbox() {
		isChecked = $("//*[@id=\"f-545_transmission_type\"]").isSelected();
		if(isChecked == true) {
			isCheckedDefault = $("//*[@id=\"f-all-filter_enum_transmission_type_10\"]").isSelected();
		}
		assertTrue(isCheckedDefault==false);
	}

	public void clickOnTheAutomaticTransmissionTypeCheckbox() {
		$("//*[@id=\"f-546_transmission_type\"]").click();
	}

	public void checkTheAutomaticTranasmissionTypeCheckbox() {
		isChecked = $("//*[@id=\"f-546_transmission_type\"]").isSelected();
		if(isChecked == true) {
			isCheckedDefault = $("//*[@id=\"f-all-filter_enum_transmission_type_10\"]").isSelected();
		}
		assertTrue(isCheckedDefault==false);
	}

	public void clickOnTheVariatorTransmissionTypeCheckbox() {
		$("//*[@id=\"f-547_transmission_type\"]").click();
	}
	
	public void checkTheVariatorTranasmissionTypeCheckbox() {
		isChecked = $("//*[@id=\"f-547_transmission_type\"]").isSelected();
		if(isChecked == true) {
			isCheckedDefault = $("//*[@id=\"f-all-filter_enum_transmission_type_10\"]").isSelected();
		}
		assertTrue(isCheckedDefault==false);
	}

	public void clickOnTheAdaptiveTransmissionTypeCheckbox() {
		$("//*[@id=\"f-adaptive_transmission_type\"]").click();
	}
	
	public void checkTheAdaptiveTranasmissionTypeCheckbox() {
		isChecked = $("//*[@id=\"f-adaptive_transmission_type\"]").isSelected();
		if(isChecked == true) {
			isCheckedDefault = $("//*[@id=\"f-all-filter_enum_transmission_type_10\"]").isSelected();
		}
		assertTrue(isCheckedDefault==false);
	}

	public void clickOnTheTiptronicTransmissionTypeCheckbox() {
		$("//*[@id=\"f-tip-tronic_transmission_type\"]").click();
	}
	
	public void checkTheTiptronicTranasmissionTypeCheckbox() {
		isChecked = $("//*[@id=\"f-tip-tronic_transmission_type\"]").isSelected();
		if(isChecked == true) {
			isCheckedDefault = $("//*[@id=\"f-all-filter_enum_transmission_type_10\"]").isSelected();
		}
		assertTrue(isCheckedDefault==false);
	}

}
