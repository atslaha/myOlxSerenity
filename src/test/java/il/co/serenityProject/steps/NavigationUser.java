package il.co.serenityProject.steps;

import il.co.serenityProject.ui.FilterNavigation;
import il.co.serenityProject.ui.OlxSearchPage;
import net.thucydides.core.annotations.Step;

/**
 * @author Artem Meleshko
 * @version 1.0 2017
 *
 */
public class NavigationUser {
	
	OlxSearchPage olxSearchPage;
	FilterNavigation filterNavigation;
	
	@Step
	public void isOnTheHomePage() {
		olxSearchPage.open();
	}
	
	@Step
	public void shouldSeeSearchBoxFiltersDefaultValue(String expected) {
		filterNavigation.checkSearchFilterAttribute(expected);
		}
	
	@Step
	public void shouldSeeCityFieldFilterDefaultValue(String expected) {
		filterNavigation.checkCityFieldFilterAttribute(expected);
	}
	
	@Step
	public void shouldSeeDistanceSelectDefaultValue(String expected) {
		filterNavigation.checkDistanceSelectFilterAttribute(expected);
	}

	@Step
	public void shouldSeeCarLabelDefaultValue(String expected) {
		filterNavigation.checkCarLabelDefaultFilterAttribute(expected);
		
	}

	@Step
	public void shouldSeeItemPriceFromDefaultValue(String expected) {
		filterNavigation.checkItemPriceFromDefaultFilterAttribute(expected);
		
	}

	@Step
	public void shouldSeeItemPriceToDefaultValue(String expected) {
		filterNavigation.checkItemPriceToDefaultFilterAttribute(expected);
		
	}

	@Step
	public void shouldSeeParamMotorYearFromDefaultValue(String expected) {
		filterNavigation.checkParamMotorYearFromDefaultFilterAttribute(expected);
		
	}

	@Step
	public void shouldSeeParamMotorYearToDefaultValue(String expected) {
		filterNavigation.checkParamMotorYearToDefaultFilterAttribute(expected);
		
	}

	@Step
	public void shouldSeeParamMotorMileageFromDefaultValue(String expected) {
		filterNavigation.checkParamMotorMileageFromDefaultFilterAttribute(expected);
		
	}

	@Step
	public void shouldSeeParamMotorMileageToDefaultValue(String expected) {
		filterNavigation.checkParamMotorMileageToDefaultFilterAttribute(expected);
		
	}

	@Step
	public void shouldSeeParamMotorEngineSizeFromDefaultValue(String expected) {
		filterNavigation.checkParamMotorEngineSizeFromDefaultFilterAttribute(expected);
		
	}

	@Step
	public void shouldSeeParamMotorEngineSizeToDefaultValue(String expected) {
		filterNavigation.checkParamMotorEngineSizeToDefaultFilterAttribute(expected);
		
	}

	@Step
	public void shouldSeeParamCarBodyDefaultValue(String expected) {
		filterNavigation.checkParamCarBodyDefaultFilterAttribute(expected);
		
	}

	@Step
	public void shouldSeeParamFuelTypeDefaultValue(String expected) {
		filterNavigation.checkParamFuelTypeDefaultFilterAttribute(expected);
		
	}

	@Step
	public void shouldSeeParamColorDefaultValue(String expected) {
		filterNavigation.checkParamColorDefaultFilterAttribute(expected);
		
	}

	@Step
	public void shouldSeeParamTransmissiomTypeDefaultValue(String expected) {
		filterNavigation.checkParamTransmissionTypeDefaultFilterAttribute(expected);
		
	}

	@Step
	public void shouldSeeParamConditionDefaultValue(String expected) {
		filterNavigation.checkParamConditionDefaultFilterAttribute(expected);
		
	}

	@Step
	public void shouldSeeParamCarOptionDefaultValue(String expected) {
		filterNavigation.checkParamCarOptionDefaultFilterAttribute(expected);
		
	}

	@Step
	public void shouldSeeParamClearedCustomsDefaultValue(String expected) {
		filterNavigation.checkParamClearedCustomsDefaultFilterAttribute(expected);
		
	}
		
	

	
}
