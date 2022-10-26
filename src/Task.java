import java.util.Objects;

public class Task {
    private int first;
    private int last;

    public Task(int first, int last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return (Objects.equals(first, task.first) && Objects.equals(last, task.last))||
                (Objects.equals(first, task.last) && Objects.equals(last, task.first));
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, last);
    }

    public int getFirst() {
        return first;
    }

    public int getLast() {
        return last;
    }
}
