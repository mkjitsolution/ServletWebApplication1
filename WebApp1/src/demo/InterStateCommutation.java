package demo;

import java.util.*;

class Commuters{
	
	public boolean getCovidReportStatus() {return false;}
}

class CovidePositiveException extends Exception{

	public CovidePositiveException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}

public class InterStateCommutation {

	public void doTravel(List<Commuters>  list)throws CovidePositiveException
	{
		for (Commuters commuter : list) {
			if(!commuter.getCovidReportStatus())
			{
				System.out.println(commuter);
				System.out.println(" Covid test clear ");
				// all fine ..entry allow
			}
			else
			{
				throw new CovidePositiveException(commuter+" is covid +");
				// go back to native state
				
			}
		}
			
			
	}
	
}
