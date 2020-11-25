package demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DemoApp {

	
	public static void main(String[] args) {
		try {
			
			new DemoApp().terminalChecking();
			
			
		}
		catch (CovidePositiveException e) {
			System.out.println(e);
		}
		catch (NullPointerException e) {
			System.out.println(" No Record Found");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Inform to Health-Care Dept/Police");
		}
		System.out.println(" ---- Checking Complete ----");
		
	}
	
	public void terminalChecking()throws CovidePositiveException
	{
		Commuters c1 = new Commuters();
		Commuters c2 = new Commuters();
		Commuters c3 = new Commuters();
		Commuters c4 = null;
		
		List<Commuters> list = new ArrayList<Commuters>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		
		
		
			InterStateCommutation obj = new InterStateCommutation();
			
			obj.doTravel(list);
			
	}
}




