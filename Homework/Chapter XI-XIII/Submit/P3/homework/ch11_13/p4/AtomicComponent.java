package homework.ch11_13.p4;

/**
 * Atomic component with no children.
 */
public class AtomicComponent extends Component {
    public AtomicComponent() {
    }

    public AtomicComponent(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException("Atomic component cannot add child.");
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException("Atomic component cannot remove child.");
    }

    @Override
    public double calcPrice() {
        return getPrice();
    }

    @Override
    public ComponentIterator createIterator() {
        return new NullIterator();
    }
}
