package src;

import src.Developer.Employee;
import src.Developer.WebDeveloper;
import src.FactoryAbstractPattern.AndroidDevFactory;
import src.FactoryAbstractPattern.Factory;
import src.FactoryAbstractPattern.WebDevFactory;

public class MainClass {

    public static void main(String []arg){
        Employee e= Factory.getEmployee(new AndroidDevFactory());
        System.out.println(e.salary());
        System.out.println(e.description());

        e= Factory.getEmployee(new WebDevFactory());
        System.out.println(e.salary());
        System.out.println(e.description());

    }
}
