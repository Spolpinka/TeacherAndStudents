import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    static Set<Task> examples = new HashSet<>();
    public static void main(String[] args) {
        Random random = new Random();
        int ex = 100;//необходимое количество заданий
        while (examples.size() < ex) {
            int first = random.nextInt(100);
            int last = random.nextInt(100);
            examples.add(new Task(first, last));
        }
        System.out.println("Ученики, вот новые задачи от учителя! Каждому по 1 задаче!");
        for (Task t: examples) {
            System.out.println(t.getFirst() + "*" + t.getLast());
        }
    }
}