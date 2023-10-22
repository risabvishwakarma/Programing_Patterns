package src.FactoryAbstractPattern;

import src.Developer.Employee;

public class Factory {

    public  static Employee getEmployee(EmployeeAbstractFactory employee){
        return employee.createEmployee();

    }

}
