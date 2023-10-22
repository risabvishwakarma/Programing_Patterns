package src.FactoryMethodPattern;

import src.Developer.AndroidDeveloper;
import src.Developer.Employee;
import src.Developer.WebDeveloper;

public class Factory {

   static Employee getDeveloper(String employee) throws Exception {
        if (employee.equals("Android")){
            return new AndroidDeveloper();
        } else if (employee.equals("Web")) {
            return new WebDeveloper();
        }else {
            throw new Exception("Please provide valid employee");
        }
    }


}
