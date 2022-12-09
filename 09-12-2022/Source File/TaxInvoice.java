/*
Date of Develop	:	09-12-2022
Program Name	:	TaxInvoice
Developed by	:	Navaneethakannan
Quiz			:	Create a Tax Invoice bill
*/
import java.util.Scanner;
class TaxInvoice
{
    public static void main(String[] args)
	{
	  	System.out.println("Sales Man: Greeting Sir!, What do you want? ");
		System.out.println("1. Soap");
		System.out.println("2. Computers");
		System.out.println("3. Paper Bundle");
		Scanner a=new Scanner(System.in);
		int myproduct=a.nextInt();
		
		float tax=0, price=0, MRP=0;
			
						
		switch(myproduct)
		{
			case 1:
				 System.out.println("Soap price	: ");
				 Scanner SoapPrice=new Scanner(System.in);
				 price=SoapPrice.nextInt();
				 System.out.println();
				 System.out.println("           RAJAN STORES ");					// Display Shop Name
				 System.out.println("            Invoice No: 001 ");				
				 tax=price*2/100;													// I give 2 % tax for Soap
				 MRP=tax+price;
				 System.out.println("Soap Price		:Rs."+ price);
				 System.out.println("GST 			:Rs."+ tax);
				 System.out.println("Total			:Rs."+ MRP);
				 break;
		    case 2:
				 System.out.println("Computer Price	: ");
				 Scanner PcPrice=new Scanner(System.in);
				 price=PcPrice.nextInt();
				 System.out.println();
				 System.out.println("           RAJAN STORES ");
				 System.out.println("            Invoice No: 001 ");
				 tax=price*20/100;													// I give 20 % tax for Computer
				 MRP=tax+price;
				 System.out.println("Computer Price		:Rs."+ price);
				 System.out.println("GST			:Rs."+ tax);
				 System.out.println("Total			:Rs."+ MRP);
				 break;
		    case 3:
				 System.out.println("Paper Bundle Price	: ");
				 Scanner PaperPrice=new Scanner(System.in);
				 price=PaperPrice.nextInt();
				 System.out.println();
				 System.out.println("           RAJAN STORES ");
				 System.out.println("            Invoice No: 001 ");
				 tax=price*8/100;													// I give 8 % tax for Paper bundle
				 MRP=tax+price;
				 System.out.println("Paper bundle  		:Rs."+ price);
				 System.out.println("GST			:Rs."+ tax);
				 System.out.println("Total			:Rs."+ MRP);
				 break;
		    default:
			     System.out.println("Choose Correct Option");
			}}
		
	}
