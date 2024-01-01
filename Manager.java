public class Manager implements IPerform, IEmployee, IManager, ICEOAndManagerBenefit {
    @Override
    public void perform() {
        addBonus();
        salary();
        hire();
        train();
    }

    @Override
    public void salary() {
        System.out.println("Getting the salary...");
    }

    @Override
    public void hire() {
        System.out.println("I can hire employee...");
    }

    @Override
    public void train() {
        System.out.println("I can train employee...");
    }

    @Override
    public void addBonus() {
        System.out.println("Getting the bonus at the end of the year...");
    }
}
