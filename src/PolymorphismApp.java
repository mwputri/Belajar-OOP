public class PolymorphismApp {
    public static void main(String[] args) {
        // polymorphism
        // mengubah bentuk dari bentuk awal menjadi bentu yg lain, berkaitan dengan pewarisan
        Employee employee = new Employee("nana");
        employee.sayHello("uti");

        employee = new Manager("Satria");
        employee.sayHello("uti");

        employee = new VicePresident("Mei");
        employee.sayHello("Uti");

        sayHello(new Employee("Putri"));
        sayHello(new Manager("Putri"));
        sayHello(new VicePresident("Putri"));
    }
    static void sayHello(Employee employee){
        System.out.println("Hello "+employee.name);
    }
}
