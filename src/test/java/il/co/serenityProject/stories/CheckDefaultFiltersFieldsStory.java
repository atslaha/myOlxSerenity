package il.co.serenityProject.stories;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import il.co.serenityProject.steps.NavigationUser;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

/**
 * @author Artem Meleshko
 * @version 1.0 2017
 *
 */
@RunWith(SerenityRunner.class)
public class CheckDefaultFiltersFieldsStory {
	
	@Managed(uniqueSession = true)
	public WebDriver browser; 
	
	@Steps
	NavigationUser mark;
	
	@Test
	public void check_the_default_search_field__text() {
		
		// Given
		mark.isOnTheHomePage();
		
		// Then
		mark.shouldSeeSearchBoxFiltersDefaultValue("Поиск...");
	}
	
	@Test
	public void check_the_default_text_of_the_city_field_filter() {
		
		//Given
		mark.isOnTheHomePage();
		
		//Then
		mark.shouldSeeCityFieldFilterDefaultValue("Вся Украина");
	}
	
	@Test
	public void check_the_default_text_of_the_distance_select_field() {
		//Given
		mark.isOnTheHomePage();
		
		//Then
		mark.shouldSeeDistanceSelectDefaultValue("+ 0 km");
	}
	
	@Test
	public void check_the_default_text_of_the_car_label_field() {
		//Given
		mark.isOnTheHomePage();
		
		//Then
		mark.shouldSeeCarLabelDefaultValue("Марка");
	}
	
	@Test
	public void check_the_default_text_of_the_item_price_from_field() {
		//Given
		mark.isOnTheHomePage();
		
		//Then
		mark.shouldSeeItemPriceFromDefaultValue("Цена от (грн.)");
	}
	
	@Test
	public void check_the_default_text_of_the_item_price_to_field() {
		//Given
		mark.isOnTheHomePage();
		
		//Then
		mark.shouldSeeItemPriceToDefaultValue("Цена до (грн.)");
	}
	
	@Test
	public void check_the_default_text_of_the_param_motor_year_from_field() {
		//Given
		mark.isOnTheHomePage();
		
		//Then
		mark.shouldSeeParamMotorYearFromDefaultValue("Год выпуска от");
	}
	
	@Test
	public void check_the_default_text_of_the_param_motor_year_to_field() {
		//Given
		mark.isOnTheHomePage();
		
		//Then
		mark.shouldSeeParamMotorYearToDefaultValue("Год выпуска до");
	}
	
	@Test
	public void check_the_default_text_of_the_param_motor_mileage_from_field() {
		//Given
		mark.isOnTheHomePage();
		
		//Then
		mark.shouldSeeParamMotorMileageFromDefaultValue("Пробег от");
	}
	
	@Test
	public void check_the_default_text_of_the_param_motor_mileage_to_field() {
		//Given
		mark.isOnTheHomePage();
		
		//Then
		mark.shouldSeeParamMotorMileageToDefaultValue("Пробег до");
	}
	
	@Test
	public void check_the_default_text_of_the_param_motor_engine_size_from_field() {
		//Given
		mark.isOnTheHomePage();
		
		//Then
		mark.shouldSeeParamMotorEngineSizeFromDefaultValue("Объем двигателя от");
	}
	
	@Test
	public void check_the_default_text_of_the_param_motor_engine_size_to_field() {
		//Given
		mark.isOnTheHomePage();
		
		//Then
		mark.shouldSeeParamMotorEngineSizeToDefaultValue("Объем двигателя до");
	}
	
	@Test
	public void check_the_default_text_of_the_param_car_body_field() {
		//Given
		mark.isOnTheHomePage();
		
		//Then
		mark.shouldSeeParamCarBodyDefaultValue("Тип кузова");
	}
	
	@Test
	public void check_the_default_text_of_the_param_fuel_type_field() {
		//Given
		mark.isOnTheHomePage();
		
		//Then
		mark.shouldSeeParamFuelTypeDefaultValue("Вид топлива");
	}
	
	@Test
	public void check_the_default_text_of_the_param_color_field() {
		//Given
		mark.isOnTheHomePage();
		
		//Then
		mark.shouldSeeParamColorDefaultValue("Цвет");
	}
	
	@Test
	public void check_the_default_text_of_the_param_transmission_type_field() {
		//Given
		mark.isOnTheHomePage();
		
		//Then
		mark.shouldSeeParamTransmissiomTypeDefaultValue("Коробка передач");
	}
	
	@Test
	public void check_the_default_text_of_the_param_condition_field() {
		//Given
		mark.isOnTheHomePage();
		
		//Then
		mark.shouldSeeParamConditionDefaultValue("Состояние машины");
	}
	
	@Test
	public void check_the_default_text_of_the_param_car_option_field() {
		//Given
		mark.isOnTheHomePage();
		
		//Then
		mark.shouldSeeParamCarOptionDefaultValue("Доп. опции");
	}
	
	@Test
	public void check_the_default_text_of_the_param_cleared_customs_field() {
		//Given
		mark.isOnTheHomePage();
		
		//Then
		mark.shouldSeeParamClearedCustomsDefaultValue("Растаможена");
	}

}
