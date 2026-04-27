/**
 * Task 2: calculate a sum.
 */
public class SumTask implements Task {
    private final int n;

    public SumTask(int n) {
        this.n = n;
    }

    @Override
    public void execute() {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Task2: sum(1.." + n + ") = " + sum);
    }
}
