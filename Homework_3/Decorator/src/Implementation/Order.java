package Implementation;

import Contracts.Food;

import java.util.ArrayList;

public class Order {
    private ArrayList<Food> items;
    private double sum = 0;

    public Order() {
        this.items = new ArrayList<Food>();
    }
    public Order(ArrayList<Food> items) {
        this.items = items;
    }

    public ArrayList<Food> getItems() {
        return items;
    }

    public void setItems(ArrayList<Food> items) {
        this.items = items;
    }

    public void addItems(Food food) {
        this.items.add(food);
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getCost() {
        double cost = 0;
        for (Food item : items){
            cost += item.cost();
        }
        setSum(cost);
        return cost;
    }

    @Override
    public String toString() {
        String orders = "";
        for (Food item : items) {
            orders += item.eat() + "\t" + "cost: " + item.cost() + "\n";
        }
        return "Order{" + "\n" +
                "Items: " + "\n"
                + orders +
                '}';
    }
}
