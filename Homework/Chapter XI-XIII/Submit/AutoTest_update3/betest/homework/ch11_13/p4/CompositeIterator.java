package homework.ch11_13.p4;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite iterator for traversing a component tree.
 */
public class CompositeIterator implements ComponentIterator {
    protected List<ComponentIterator> iterators;

    public CompositeIterator(ComponentIterator iterator) {
        this.iterators = new ArrayList<>();
        if (iterator != null) {
            this.iterators.add(iterator);
        }
    }

    @Override
    public boolean hasNext() {
        while (!iterators.isEmpty()) {
            ComponentIterator current = iterators.get(iterators.size() - 1);
            if (current.hasNext()) {
                return true;
            }
            iterators.remove(iterators.size() - 1);
        }
        return false;
    }

    @Override
    public Component next() {
        if (!hasNext()) {
            return null;
        }

        ComponentIterator current = iterators.get(iterators.size() - 1);
        Component c = current.next();

        if (c != null) {
            ComponentIterator childIterator = c.createIterator();
            if (childIterator != null && childIterator.hasNext()) {
                iterators.add(childIterator);
            }
        }
        return c;
    }
}
