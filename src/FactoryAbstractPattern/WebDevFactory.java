package src.FactoryAbstractPattern;

import src.Developer.AndroidDeveloper;
import src.Developer.Employee;

public class WebDevFactory extends EmployeeAbstractFactory {
    @Override
    public Employee createEmployee() {
        return new AndroidDeveloper();
    }
}
