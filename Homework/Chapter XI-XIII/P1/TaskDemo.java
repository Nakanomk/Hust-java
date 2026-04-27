/**
 * Demo for Programming Problem 1.
 */
public class TaskDemo {
    public static void main(String[] args) {
        TaskService service = new TaskServiceImpl();
        service.addTask(new PrintHelloTask());
        service.addTask(new SumTask(10));
        service.addTask(new TimestampTask());
        service.exeuteTasks();
    }
}
