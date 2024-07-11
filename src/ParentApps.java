public class ParentApps {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "MW";
        child.doit();
        System.out.println(child.name);

        Parent parent = child;
        parent.doit();
        System.out.println(parent.name);
    }
}
