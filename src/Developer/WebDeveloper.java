package src.Developer;

public class WebDeveloper implements Employee {
    @Override
    public int salary() {
        System.out.println("Web Developer Salary :");
        return 4000;
    }

    @Override
    public String description() {
        System.out.print("Web Developer :");
        return "Web Developer";
    }
}
