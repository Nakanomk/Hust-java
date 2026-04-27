package homework.ch11_13.p4;

import java.util.ArrayList;

/**
 * Children container and local iterator.
 */
public class ComponentList extends ArrayList<Component> implements ComponentIterator {
    private int position;

    public ComponentList() {
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < size();
    }

    @Override
    public Component next() {
        if (!hasNext()) {
            return null;
        }
        return get(position++);
    }

    public ComponentIterator createIterator() {
        position = 0;
        return this;
    }
}
