import java.util.ArrayList;
import java.util.List;

/**
 * TaskService implementation.
 */
public class TaskServiceImpl implements TaskService {
    private final List<Task> tasks = new ArrayList<>();

    @Override
    public void exeuteTasks() {
        for (Task t : tasks) {
            t.execute();
        }
    }

    @Override
    public void addTask(Task t) {
        if (t != null) {
            tasks.add(t);
        }
    }
}
