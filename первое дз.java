
import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		Integer number = myObj.nextInt();
		Integer weq = number;
		if (number < 0)
		{
			number = number *(-1);
		}
		 
		Integer div = 0;
		ArrayList<Integer> chisla = new ArrayList<Integer>();
		while (number >=2)
		{
		    
		    chisla.add(number%2);
			number = number / 2;
			
		}
		chisla.add(number);
		String answer = "";
		Collections.reverse(chisla);
		for (Integer x1:chisla)
		{
           String x2 = x1.toString();
		   answer = answer + x2;

		}
		if (weq >=0)
		{
		System.out.println("Значение: " + answer);
		}
		else
		{
           Integer axa = answer.length();
		   Integer assa = 2;
		   Integer cnt = 1;
		   while (axa > assa)
		   {
             assa = assa *2;
			 cnt++;
		   }
		   
		   Integer minus = assa - axa;
		   Integer amount = 0;
		   while (amount < minus)
		   {
			answer = "0" + answer;
			amount++;
		   }
		   answer = answer.replace("1","2");
		   answer = answer.replace("0","1");
		   answer = answer.replace("2","0");
		   System.out.println("Значение: " + answer);
		
		   
		}
		
		
		
		
	}
}