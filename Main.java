import java.util.PriorityQueue;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        
        Toy[] toys = new Toy[3];
        toys[0] = new Toy(1,2,"конструктор");
        toys[1] = new Toy(2,2,"робот");
        toys[2] = new Toy(3,3,"кукла");

        PriorityQueue<Toy> pq = new PriorityQueue<Toy>((t1,t2) -> Double.compare(t2.getWeight(), t1.getWeight()));
        for (Toy toy : toys) {
            pq.add(toy);
        }

        PriorityQueue<Toy> tpq = new PriorityQueue<Toy>((t1,t2) -> Double.compare(t2.getWeight(), t1.getWeight()));
        tpq.addAll(pq);
        tpq.addAll(pq);
        tpq.addAll(pq);
        tpq.addAll(pq);

        //System.out.println(pq);
        try (PrintWriter wr = new PrintWriter(new FileWriter("toys.txt"))) {
            for (int i = 0; i < 10; i++) {
                Toy toy = tpq.poll();
                wr.printf("%d. %s (%.2f)\n", (i + 1), toy.getName(), toy.getWeight());
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
        
    }
}