public class Toy {
    private int id;
    private String name;
    private double weight;

    public Toy(int id, double weight, String name) {
        this.id = id;
        this.weight = weight;
        this.name = name;
    }

    public int getId() {
        return id;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public String getName() {
        return name;
    }
}  
    

