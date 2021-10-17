import static org.junit.jupiter.api.Assertions.assertEquals;

//import org.junit.jupiter.api.Test;
import org.junit.*;

public class StringCalculatorShould {
	
	
	StringCalculator stringCalculator=new StringCalculator();
	
	
	@Test
	public void when_input_is_empty_return_0()
	{
		String number="";
		assertEquals("0",stringCalculator.add(number));
	}
	
	@Test
	public void when_input_is_1_number_return_1()
	{
		String number="5";
		assertEquals("5",stringCalculator.add(number));
	}
	
	@Test
	public void when_input_are__2_5_numbers_return_7()
	{
		String number="2,5";
		assertEquals("7",stringCalculator.add(number));
	}
	
	@Test
	public void when_input_are__unknown_numbers_return_7()
	{
		String number="2,5,1,4";
		assertEquals("12",stringCalculator.add(number));
	}

	@Test
	public void when_input_are__1_newline_character_2_5_return_6()
	{
		//1+/n2+3=6
		String number="1,\n2,3";
		assertEquals("6",stringCalculator.add(number));
	}
	
	@Test
	public void when_delimiter_is_changed_result_should_be_addition_of_given_numbers()
	//delimiter is changed to ';' previous delimiter was ','
	{
		/*  //;\n1;2=3   */
		String number="//;\n1;2";
		assertEquals("3", stringCalculator.add(number));
	}
	
	/*
	@Test
	//if negative numbers are passed
	public void when_negative_numbers_passed_to_add_function_throw_exception()
	{
		String number="1,2,-1,4,-2";
		assertEquals("Numbers should be positive only, -1,-2", stringCalculator.add(number));
	}*/
	
}
