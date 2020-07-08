package ifElseStatement;

public class ifElseClass3NestedStatement {

		   public static void main(String[] args) 
		   {
			   int a=100;
			   int b=70;
			   int c=50;

			   if (a>b)
			   {
			   	System.out.println("a is greater than b");
			   	}else
			   	
			   		 {
			   		System.out.println("b is greater than a");
			   	}
			   		if (b>c)
			   {
			   			System.out.println("b is greater than c");
			   	}else
			   	{
			   		System.out.println("c is greater than b");
			   		
			   	}
			   		if (a>c)
			   		{
			   			System.out.println("a is greater than c");
			   		}else
			   		{
			   		System.out.println("c is greater than a");
			   		}
			   	}

			   }
