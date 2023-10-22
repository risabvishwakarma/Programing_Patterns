package src.Developer;

public class AndroidDeveloper implements Employee {
    @Override
    public int salary() {
        System.out.println("Android Developer Salary :");
        return 5000;
    }

    @Override
    public String description() {
        System.out.println("Web Developer :");
        return "Web Developer";
    }
}
