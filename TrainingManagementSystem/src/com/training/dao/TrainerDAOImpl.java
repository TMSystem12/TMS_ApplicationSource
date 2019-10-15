package com.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.training.entities.Trainer;
import com.training.integrate.ConnectionManager;
//import com.virtusa.entities.Departments;
//import com.virtusa.entities.Employees;

public class TrainerDAOImpl implements TrainerDAO{
	
	@Override
	public boolean postTrainingDetails(Trainer trainer) throws ClassNotFoundException, SQLException{
	// TODO Auto-generated method stub
	Connection connection=ConnectionManager.openConnection();
	PreparedStatement statement=
			connection.prepareStatement("update courses set employee_id=? where course_name=?");
	statement.setInt(1,trainer.getEmployeeId());
	statement.setString(2, trainer.getCourseName());
	int rows=statement.executeUpdate();
	ConnectionManager.closeConnection();
	if(rows>0)
		return true;
	else
	return false;
}

	/*@Override
	public boolean viewTrainingFeedback(Trainer trainer) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement statement=connection.prepareStatement("select e.employee_id,d.department_name\r\n" + 
				"from employees e\r\n" + 
				"join departments d\r\n" + 
				"on(e.department_id=d.department_id)\r\n" + 
				"where employee_id=?");
		statement.setInt(1, employeeId);
		
		ResultSet resultSet=statement.executeQuery();
		Trainer employees=new Trainer();
		while(resultSet.next()) {
			
			employees.setEmployeeId(resultSet.getInt("employee_id"));
			
			Departments departments=new Departments();
			departments.setDepartmentName(resultSet.getString("department_name"));
			
			employees.setDepartments(departments);
			
		}
		ConnectionManager.closeConnection();
		return employees;
	}
	}*/
	}
