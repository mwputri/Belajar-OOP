public class Manager extends Employee{

    Manager(String name){
        super(name);
    }
    void sayHello(String name){
        System.out.println("Hai "+name+", My Name is Manager "+this.name);
    }

}
