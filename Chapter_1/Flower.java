package DataStructuresAndAlgorithmsInJava_Exercises.Chapter_1;

public class Flower {
    String name;
    int numberPetals;
    float price;

    public Flower(String nm, int np, float pr) {
        name = nm;
        numberPetals = np;
        price = pr;
    }
    public String getName(){ return name; }
    public int getNumberPetals() { return numberPetals; }
    public float getPrice() { return price; }
    public void setName(String newName){ this.name = newName; }
    public void setNumberPetals(int newNumber){ numberPetals = newNumber; }
    public void setPrice(float newPrice){ price = newPrice; }
}
