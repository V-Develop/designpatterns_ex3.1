public class Employee implements IPerform, IEmployee {
    @Override
    public void perform() {
        salary();
    }

    @Override
    public void salary() {
        System.out.println("Getting the salary...");
    }
}
