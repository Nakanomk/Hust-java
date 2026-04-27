package homework.ch11_13.p4;

/**
 * Manual test entry for Programming Problem 3.
 */
public class Test {
    public static void main(String[] args) {
        Component computer = ComponentFactory.create();

        System.out.println("Computer detail:");
        System.out.println(computer);

        System.out.println("Traverse by iterator:");
        System.out.println("id: " + computer.getId() + ", name: " + computer.getName() + ", price:" + computer.getPrice());

        ComponentIterator it = computer.iterator();
        while (it.hasNext()) {
            Component c = it.next();
            System.out.println("id: " + c.getId() + ", name: " + c.getName() + ", price:" + c.getPrice());
        }
    }
}
