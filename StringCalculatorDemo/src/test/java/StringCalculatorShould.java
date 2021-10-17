import static org.junit.jupiter.api.Assertions.assertEquals;

//import org.junit.jupiter.api.Test;
import org.junit.*;

public class StringCalculatorShould {
	
	
	StringCalculator stringCalculator=new StringCalculator();
	
	@Test
	public void when_input_is_empty_return_0()
	{
		String number="";
		stringCalculator.add(number);
		assertEquals("",number);
	}
	
	@Test
	public void when_input_are__2_5_numbers_return_7()
	{
		String number="25";
		
		assertEquals("7",stringCalculator.add(number));
	}
	

	
	

}
