
public class StringCalculator {
	
	public String checkNegative(String input1)
	{
		char[] input=input1.toCharArray();
		int flag=0;
		String str="";
		for(int j=0;j<input.length;j++)
		{
			if(Integer.parseInt(String.valueOf(input[j]))<0)
			{
				flag=1;
				str=str+input[j]+",";
			}
		}
		if(flag==1)
			return "Numbers should be positive only, "+str;	
		return "0";
	}
	public String add(String numbers)
	{
		char[] numbers1=numbers.toCharArray();
		String str="";
				
		//if empty string
		if(numbers.isEmpty())
			return "0";
		
		//if string contains single integer
		if(numbers.length()==1)
			return ""+numbers;
		 
		//to check negative numbers in string
		//else if(str.equals(checkNegative(numbers)))
			//return str;
		
		else if(numbers1[0]=='/' && numbers1[1]=='/')
		{//;\n1;2=3 
			
			int sum1=0;
			for(int i=0;i<numbers.length();i++)
			{	
				if(numbers.charAt(i)=='/' && numbers.charAt(i++)=='/')
					i=i+2;
				if(numbers.charAt(i)==';')
					i++;
				//if string contains \n
				if(numbers.charAt(i)=='\n')
					i++;
				sum1=sum1+Character.getNumericValue(numbers.charAt(i));
			}
			return ""+sum1;	
		}
		
		else//add the given numbers
		{
			int sum=0;
			for(int i=0;i<numbers.length();i++)
			{	
				if(numbers.charAt(i)==',')
					i++;
				//if string contains \n
				if(numbers.charAt(i)=='\n')
					i++;
				sum=sum+Character.getNumericValue(numbers.charAt(i));
			}
			return ""+sum;
		}
		
	}

}
