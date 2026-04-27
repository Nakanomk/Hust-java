/**
 * Task service interface.
 */
public interface TaskService {
    /**
     * Execute all tasks.
     */
    void exeuteTasks();

    /**
     * Add a task.
     *
     * @param t new task
     */
    void addTask(Task t);
}
