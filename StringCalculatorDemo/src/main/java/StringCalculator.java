
public class StringCalculator {
	
	public String add(String numbers)
	{
		if(numbers.isEmpty())
			return "0";
		else
		{
			int sum=0;
			for(int i=0;i<numbers.length();i++)
				sum=sum+Character.getNumericValue(numbers.charAt(i));
			
			return ""+sum;
		}
		
		//return "0";
	}

}
