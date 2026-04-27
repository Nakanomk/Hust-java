package homework.ch11_13.p4;

/**
 * Composite component containing children.
 */
public class CompositeComponent extends Component {
    protected ComponentList children;

    public CompositeComponent() {
        this.children = new ComponentList();
    }

    public CompositeComponent(int id, String name, double price) {
        super(id, name, 0.0);
        this.children = new ComponentList();
    }

    @Override
    public void add(Component component) {
        if (component == null) {
            return;
        }
        if (!children.contains(component)) {
            children.add(component);
        }
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public double calcPrice() {
        double sum = 0.0;
        for (Component c : children) {
            sum += c.calcPrice();
        }
        setPrice(sum);
        return sum;
    }

    @Override
    public double getPrice() {
        return calcPrice();
    }

    @Override
    public ComponentIterator createIterator() {
        return new CompositeIterator(children.createIterator());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append('\n');
        for (Component c : children) {
            String childText = c.toString();
            sb.append(childText);
            if (!childText.endsWith("\n")) {
                sb.append('\n');
            }
        }
        return sb.toString();
    }
}
