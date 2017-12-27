package il.co.serenityProject.steps;

import il.co.serenityProject.ui.MotorMileageNavigation;
import il.co.serenityProject.ui.OlxSearchPage;
import net.thucydides.core.annotations.Step;

/**
 * @author Artem Meleshko
 * @version 1.0 2017
 *
 */
public class MotorMileageFieldNavigationUser {
	OlxSearchPage olxSearchPage;
	MotorMileageNavigation motorMileageNavigation;
	
	@Step
	public void isOnTheHomePage() {
		olxSearchPage.open();
	}

	@Step
	public void fillTheMotorMileageFromFieldWithMileageValue(String input) {
		motorMileageNavigation.manualFillingTheMotorMileageFromFieldWhithTheValue(input);
	}
	
	@Step
	public void fillTheMotorMileageToFieldWithMileageValue(String input) {
		motorMileageNavigation.manualFillingTheMotorMileageToFieldWhithTheValue(input);
	}

	@Step
	public void clickOnTheSearchResult() {
		motorMileageNavigation.clickOnTheSearchResult();
	}

	@Step
	public void shouldSeeMotorMileageFromNotLessThanGivenValue() {
		motorMileageNavigation.checkTheMotorMileageFromValueOnTheSearchResultPage();
	}

	@Step
	public void shouldSeeMotorMileageToNotHigherThanGivenValue() {
		motorMileageNavigation.checkTheMotorMileageToValueOnTheSearchResultPage();
	}

	@Step
	public void autoFillTheMotorMileageFromFieldWith70000MileageValue() {
		motorMileageNavigation.clickOnThe70000valueInTheMileageFromValuesList();
	}

	@Step
	public void autoFillTheMotorMileageFromFieldWith100000MileageValue() {
		motorMileageNavigation.clickOnThe100000valueInTheMileageFromValuesList();
	}

	@Step
	public void autoFillTheMotorMileageFromFieldWith125000MileageValue() {
		motorMileageNavigation.clickOnThe125000valueInTheMileageFromValuesList();
	}

	@Step
	public void autoFillTheMotorMileageFromFieldWith150000MileageValue() {
		motorMileageNavigation.clickOnThe150000valueInTheMileageFromValuesList();
	}

	@Step
	public void autoFillTheMotorMileageFromFieldWith175000MileageValue() {
		motorMileageNavigation.clickOnThe175000valueInTheMileageFromValuesList();
	}

	@Step
	public void autoFillTheMotorMileageFromFieldWith200000MileageValue() {
		motorMileageNavigation.clickOnThe200000valueInTheMileageFromValuesList();
	}

	@Step
	public void autoFillTheMotorMileageFromFieldWith225000MileageValue() {
		motorMileageNavigation.clickOnThe225000valueInTheMileageFromValuesList();
	}

	@Step
	public void autoFillTheMotorMileageFromFieldWith250000MileageValue() {
		motorMileageNavigation.clickOnThe250000valueInTheMileageFromValuesList();
	}

	@Step
	public void autoFillTheMotorMileageFromFieldWith300000MileageValue() {
		motorMileageNavigation.clickOnThe300000valueInTheMileageFromValuesList();
	}

	@Step
	public void autoFillTheMotorMileageToFieldWith70000MileageValue() {
		motorMileageNavigation.clickOnThe70000valueInTheMileageToValuesList();
	}

	@Step
	public void autoFillTheMotorMileageToFieldWith100000MileageValue() {
		motorMileageNavigation.clickOnThe100000valueInTheMileageToValuesList();
	}

	@Step
	public void autoFillTheMotorMileageToFieldWith125000MileageValue() {
		motorMileageNavigation.clickOnThe125000valueInTheMileageToValuesList();
	}

	@Step
	public void autoFillTheMotorMileageToFieldWith150000MileageValue() {
		motorMileageNavigation.clickOnThe150000valueInTheMileageToValuesList();
	}

	@Step
	public void autoFillTheMotorMileageToFieldWith175000MileageValue() {
		motorMileageNavigation.clickOnThe175000valueInTheMileageToValuesList();
	}

	@Step
	public void autoFillTheMotorMileageToFieldWith200000MileageValue() {
		motorMileageNavigation.clickOnThe200000valueInTheMileageToValuesList();
	}

	@Step
	public void autoFillTheMotorMileageToFieldWith225000MileageValue() {
		motorMileageNavigation.clickOnThe2250000valueInTheMileageToValuesList();
	}

	@Step
	public void autoFillTheMotorMileageToFieldWith250000MileageValue() {
		motorMileageNavigation.clickOnThe2500000valueInTheMileageToValuesList();
	}

	@Step
	public void autoFillTheMotorMileageToFieldWith300000MileageValue() {
		motorMileageNavigation.clickOnThe3000000valueInTheMileageToValuesList();
		
	}
}
