package com.handong.csee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.handong.csee.EmployeeManager;

// http://localhost:8080/test/employee-module/getAllEmployees
@Controller
@RequestMapping("/employee-module")

public class EmployeeController {
	
	@Autowired
    EmployeeManager manager;
 
    @RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
    public String getAllEmployees(Model model)
    {
    	//employees��� �̸����� ���� �����͸� �Ѹ���?
        model.addAttribute("employees", manager.getAllEmployees());
        
        //home.jsp file �ִ� ���� jsp file ����� return�� ��
        return "employeesListDisplay";
    }
    
}
