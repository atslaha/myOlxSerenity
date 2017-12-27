package il.co.serenityProject.ui;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import net.serenitybdd.core.pages.PageObject;

public class FilterNavigation extends PageObject{
	
	public void checkSearchFilterAttribute(String expected) {
		assertThat($("#search-text").getAttribute("defaultval"), containsString(expected));
	}
	
	public void checkCityFieldFilterAttribute(String expected) {
		assertThat($("#cityField").getAttribute("defaultval"), containsString(expected));
	}

	public void checkDistanceSelectFilterAttribute(String expected) {
		assertThat($("//*[@id=\"distanceSelect\"]/dt/a/span[1]").getTextValue(), containsString(expected));
		
	}

	public void checkCarLabelDefaultFilterAttribute(String expected) {
		assertThat($("//*[@id=\"param_subcat\"]/div/a/span[1]").getTextValue(), containsString(expected));
		
	}

	public void checkItemPriceFromDefaultFilterAttribute(String expected) {
		assertThat($("//*[@id=\"param_price\"]/div/div[1]/a/span[1]").getTextValue(), containsString(expected));
		
	}

	public void checkItemPriceToDefaultFilterAttribute(String expected) {
		assertThat($("//*[@id=\"param_price\"]/div/div[2]/a/span[1]").getTextValue(), containsString(expected));
		
	}

	public void checkParamMotorYearFromDefaultFilterAttribute(String expected) {
		assertThat($("//*[@id=\"param_motor_year\"]/div/div[1]/a/span[1]").getTextValue(), containsString(expected));
		
	}

	public void checkParamMotorYearToDefaultFilterAttribute(String expected) {
		assertThat($("//*[@id=\"param_motor_year\"]/div/div[2]/a/span[1]").getTextValue(), containsString(expected));
		
	}

	public void checkParamMotorMileageFromDefaultFilterAttribute(String expected) {
		assertThat($("//*[@id=\"param_motor_mileage\"]/div/div[1]/a/span[1]").getTextValue(), containsString(expected));
		
	}

	public void checkParamMotorMileageToDefaultFilterAttribute(String expected) {
		assertThat($("//*[@id=\"param_motor_mileage\"]/div/div[2]/a/span[1]").getTextValue(), containsString(expected));
		
	}

	public void checkParamMotorEngineSizeFromDefaultFilterAttribute(String expected) {
		assertThat($("//*[@id=\"param_motor_engine_size\"]/div/div[1]/a/span[1]").getTextValue(), containsString(expected));
		
	}

	public void checkParamMotorEngineSizeToDefaultFilterAttribute(String expected) {
		assertThat($("//*[@id=\"param_motor_engine_size\"]/div/div[2]/a/span[1]").getTextValue(), containsString(expected));
		
	}

	public void checkParamCarBodyDefaultFilterAttribute(String expected) {
		assertThat($("//*[@id=\"param_car_body\"]/div/a/span[1]").getTextValue(), containsString(expected));
		
		
	}

	public void checkParamFuelTypeDefaultFilterAttribute(String expected) {
		assertThat($("//*[@id=\"param_fuel_type\"]/div/a/span[1]").getTextValue(), containsString(expected));
		
	}

	public void checkParamColorDefaultFilterAttribute(String expected) {
		assertThat($("//*[@id=\"param_color\"]/div/a/span[1]").getTextValue(), containsString(expected));
		
	}

	public void checkParamTransmissionTypeDefaultFilterAttribute(String expected) {
		assertThat($("//*[@id=\"param_transmission_type\"]/div/a/span[1]").getTextValue(), containsString(expected));
		
	}

	public void checkParamConditionDefaultFilterAttribute(String expected) {
		assertThat($("//*[@id=\"param_condition\"]/div/a/span[1]").getTextValue(), containsString(expected));
		
	}

	public void checkParamCarOptionDefaultFilterAttribute(String expected) {
		assertThat($("//*[@id=\"param_car_option\"]/div/a/span[1]").getTextValue(), containsString(expected));
		
	}

	public void checkParamClearedCustomsDefaultFilterAttribute(String expected) {
		assertThat($("//*[@id=\"param_cleared_customs\"]/div/a/span[1]").getTextValue(), containsString(expected));
		
	}
}
