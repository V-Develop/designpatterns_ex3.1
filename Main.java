public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println("================ Employee ================");
        employee.perform();
        System.out.println("==========================================\n");

        Manager manager = new Manager();
        System.out.println("================ Manager ================");
        manager.perform();
        System.out.println("=========================================\n");

        CEO ceo = new CEO();
        System.out.println("================ CEO ================");
        ceo.perform();
        System.out.println("=====================================");
    }
}
