package homework.ch11_13.p4;

/**
 * Factory for building a computer component tree.
 */
public class ComponentFactory {
    public ComponentFactory() {
    }

    public static Component create() {
        int id = 0;

        Component computer = new CompositeComponent(id++, "Think Pad", 0.0);
        Component keyboard = new AtomicComponent(id++, "Keyboard", 20.0);
        Component mouse = new AtomicComponent(id++, "Mouse", 20.0);
        Component monitor = new AtomicComponent(id++, "Monitor", 1000.0);

        computer.add(keyboard);
        computer.add(mouse);
        computer.add(monitor);

        Component mainFrame = new CompositeComponent(id++, "Main frame", 0.0);
        Component hardDisk = new AtomicComponent(id++, "Hard disk", 1000.0);
        Component powerSupplier = new AtomicComponent(id++, "Power supplier", 500.0);

        mainFrame.add(hardDisk);
        mainFrame.add(powerSupplier);

        Component mainBoard = new CompositeComponent(id++, "Main board", 0.0);
        Component cpu = new AtomicComponent(id++, "CPU", 1500.0);
        Component videoCard = new AtomicComponent(id++, "Video card", 900.0);
        Component networkCard = new AtomicComponent(id++, "Network card", 100.0);

        mainBoard.add(cpu);
        mainBoard.add(videoCard);
        mainBoard.add(networkCard);

        mainFrame.add(mainBoard);
        computer.add(mainFrame);

        computer.calcPrice();
        return computer;
    }
}
