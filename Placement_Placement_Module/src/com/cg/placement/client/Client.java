package com.cg.placement.client;


import com.cg.placement.entities.Placement;

import com.cg.placement.service.IPlacementService;
import com.cg.placement.service.PlacementServiceImpl;

public class Client {

	public static void main(String[] args) 
	{
		// CRUD operation calling activity
		Placement placement = new Placement();
	
		
		IPlacementService service = new PlacementServiceImpl();
				// Create
		placement.setId(66);
		placement.setName("Akshay");
		placement.setCollege("KMS University");
		placement.setDate("12-04-2121");
		placement.setQualification("BE");
		placement.setYear(2030);
		
		service.addPlacement(placement);
		
		// Retrieve
		
		placement	= service.searchPlacement(66);
		System.out.println("ID is:"+placement.getId());
		System.out.println("College is:"+placement.getCollege());
		
		
		
		  
	     // Update
		placement	= service.searchPlacement(105);
		placement.setCollege("Rive University");
		service.updatePlacement(placement);
		System.out.println("Update is successful");
	    
		
		
		placement	= service.searchPlacement(105);
		service.cancelPlacement(106);
		System.out.println("Cancel is successful");
		
		}


}

	
	
	


