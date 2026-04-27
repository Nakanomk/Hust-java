import java.time.LocalDateTime;

/**
 * Task 3: print current timestamp.
 */
public class TimestampTask implements Task {
    @Override
    public void execute() {
        System.out.println("Task3: now = " + LocalDateTime.now());
    }
}
