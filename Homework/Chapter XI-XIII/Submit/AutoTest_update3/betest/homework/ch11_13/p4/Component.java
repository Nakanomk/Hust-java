package homework.ch11_13.p4;

/**
 * Abstract component class.
 */
public abstract class Component {
    protected int id;
    protected String name;
    protected double price;

    public Component() {
    }

    public Component(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Component other = (Component) obj;
        return id == other.id;
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name + ", price:" + price;
    }

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract double calcPrice();

    public abstract ComponentIterator createIterator();

    public ComponentIterator iterator() {
        return createIterator();
    }
}
