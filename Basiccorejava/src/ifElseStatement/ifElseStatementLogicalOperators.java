package ifElseStatement;

public class ifElseStatementLogicalOperators {

	public static void main(String[] args) {
		//And operator
		int age=25;
		boolean voterID=true;
		//if (age>=18 && VoterID==true) //1st
		if (age>=18 && voterID) 
		{
			System.out.println("You are eliggible");
			
		}
		else {
			System.out.println("You are not eliggible");
		}

	}

}

//OR Operator
boolean pancard=true;
boolean adharcard=true;

if (pancard || adharcard)
{
	System.out.println("you are eligible");
	}else {
		System.out.println("you are not eligible");
	}




