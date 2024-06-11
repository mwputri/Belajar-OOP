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

        // type check & Casts
        sayHello(new Employee("Putri"));
        sayHello(new Manager("Meilinia"));
        sayHello(new VicePresident("Mawaddah"));
    }
    static void sayHello(Employee employee){
        if(employee instanceof VicePresident){
            System.out.println("Hello VP "+employee.name);
        }
        else if(employee instanceof Manager){
            System.out.println("Hello Manager "+employee.name);
        }
        else{
            System.out.println("Hello Employee "+employee.name);
        }
    }
}
