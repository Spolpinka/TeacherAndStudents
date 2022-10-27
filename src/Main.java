import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    static Set<String> examples = new HashSet<>();
    public static void main(String[] args) {
        Random random = new Random();
        int ex = 15;//необходимое количество заданий
        for (int i = 0; i < ex; i ++) {
            int first = random.nextInt(9);
            int last = random.nextInt(9);
            String s =  first + "*" + last;
            String s1 = last + "*" + first;
            if (!examples.contains(s) && !examples.contains(s1)) {
                examples.add(s);
            }
        }
        System.out.println("Ученики, вот новые задачи от учителя! Каждому по 1 задаче!");
        for (String s : examples) {
            System.out.println(s);
        }
    }
}