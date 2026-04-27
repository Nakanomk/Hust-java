package homework.ch11_13.p4;

/**
 * Empty iterator used by atomic component.
 */
public class NullIterator implements ComponentIterator {
    public NullIterator() {
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Component next() {
        return null;
    }
}
