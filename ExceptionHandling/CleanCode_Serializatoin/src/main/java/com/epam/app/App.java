package com.epam.app;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App extends Interest
{
	Scanner scan=new Scanner(System.in);
	
	private static final Logger LOGGER = LogManager.getLogger(App.class);
	
    App()
	{
		LOGGER.info("Enter the choice of interest you want\n1.Simple Interest\n2.Compound Interest");
		int choice=scan.nextInt();
		if(choice==1)
		{
			simple_Interest();
		}
		else if(choice==2)
		{
			compound_Interest();
		}
		else
			LOGGER.info("Please select a valid option...!");
	}
	void simple_Interest()
	{
		LOGGER.info("Enter the principal amount");
		float principal_amount=scan.nextFloat();
		LOGGER.info("Enter number of years");
		int years=scan.nextInt();
		LOGGER.info("Enter rate of Interest");
		float rate_of_interest=scan.nextFloat();
		LOGGER.info("Simple Interest is "+simple_interest(principal_amount,years,rate_of_interest));
	}
	void compound_Interest()
	{
		LOGGER.info("Enter the principal amount");
		float principal_amount=scan.nextFloat();
		LOGGER.info("Enter number of times to be calculated");
		int times_calc=scan.nextInt();
		LOGGER.info("Enter number of years");
		int years=scan.nextInt();
		LOGGER.info("Enter rate of interest");
		float rate_of_interest=scan.nextFloat();
		LOGGER.info("Compound Interest is "+compound_interest(principal_amount,times_calc,years,rate_of_interest));
	}

    public static void main( String[] args )
    {
    	App object_1=new App();
    }
}