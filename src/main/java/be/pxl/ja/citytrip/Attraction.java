package be.pxl.ja.citytrip;

import be.pxl.ja.knapsack.KnapsackItem;

public class Attraction implements Comparable<Attraction>, KnapsackItem {
    private String name;
    private double time;
    private int rating;

    public Attraction(String name, double time, int rating) {
        this.name = name;
        this.time = time;
        this.rating = rating;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTime() {
        return time;
    }

    @Override
    public double getWeight() {
        return time;
    }


    public void setTime(double time) {
        this.time = time;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Attraction{" +
                "name='" + name + '\'' +
                ", time=" + time +
                ", rating=" + rating +
                '}';
    }

    @Override
    public int compareTo(Attraction attraction) {
        return attraction.rating - this.rating;
    }
}
