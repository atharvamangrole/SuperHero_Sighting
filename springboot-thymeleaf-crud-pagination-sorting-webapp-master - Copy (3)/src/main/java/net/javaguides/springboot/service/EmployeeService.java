package net.javaguides.springboot.service;

import java.util.List;

import org.springframework.data.domain.Page;

import net.javaguides.springboot.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long Id);
	void deleteEmployeeById(long Id);
	Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
