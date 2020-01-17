package com.handong.csee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.handong.csee.EmployeeVO;
import com.handong.csee.EmployeeDAO;

@Service
public class EmployeeManagerImpl implements EmployeeManager{
	
	@Autowired
    EmployeeDAO dao;
     
    public List<EmployeeVO> getAllEmployees() 
    {
        return dao.getAllEmployees();
    }
}
