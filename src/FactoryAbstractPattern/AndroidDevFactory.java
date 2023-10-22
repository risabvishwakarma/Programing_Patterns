package src.FactoryAbstractPattern;


import src.Developer.Employee;
import src.Developer.WebDeveloper;

public class AndroidDevFactory extends EmployeeAbstractFactory {
    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }
}
