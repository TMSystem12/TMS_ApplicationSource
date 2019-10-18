package com.training.controller;

import java.net.Authenticator.RequestorType;
import java.util.List;
import com.training.helper.FactoryAdminDAO;
import com.training.model.AttendeesAdminModel;
import com.training.model.ScheduleAdminModel;
import com.training.model.VenueAdminModel;
import com.training.service.AdminService;
import com.training.service.AdminServiceImpl;
import com.training.view.AdminView;
import com.training.view.UpdateAdminModel;


public class AdminController {

	private AdminService adminService;
	AdminView employeeView=new AdminView();
	
	public AdminController() {
		this.adminService=
				FactoryAdminDAO.createAdminService();
	}

		
  public void numberOfAttendees(AttendeesAdminModel adminModel)
  {
	  
	  AdminService adminService = new AdminServiceImpl();
	  adminService.attendeesService(adminModel);
		
  }
	
	public void venueController(VenueAdminModel venueAdminModel)
	{
		AdminService adminService = new AdminServiceImpl();
		adminService.venueService(venueAdminModel);
		
	}
	
	public void updateDateController(ScheduleAdminModel scheduleAdminModel)
	{
		AdminService adminService = new AdminServiceImpl(); {
		 adminService.updateDateService(scheduleAdminModel);	
		}
	}

}
