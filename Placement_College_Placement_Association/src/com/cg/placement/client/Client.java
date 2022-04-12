package com.cg.placement.client;


	import com.cg.placement.entities.College;
import com.cg.placement.entities.Placement;
import com.cg.placement.service.CollegeServiceImpl;
	import com.cg.placement.service.ICollegeService;

	public class Client {

		public static void main(String[] args) {
			
			
			// Creating an object of all entity files
			Placement placement = new Placement();
			placement.setP_Id(66);
			placement.setName("Akshay");
		    placement.setDate("12-04-2121");
			placement.setQualification("BE");
			placement.setYear(2030);
			
		     //College Instance(Record)
			College college = new College();
		    college.setCollegeadmin("Admin");
			college.setCollegename("SVIT College");
			college.setLocation("HUbli, Karnataka");
			
			//Many To One Bidirectional Mapping
			placement.setCollege(college);
			college.setPlacement(placement);
			System.out.println("College details added in database");

		
		}

	
}
