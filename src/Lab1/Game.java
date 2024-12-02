package Lab1;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.PrintStream;

public class Game {
    String name;
    String genre;
    int year;
    float price;

    public Game(String name, String genre, int year) {
        this.name = name;
        this.genre = genre;
        this.year = year;
    }

    public Game(String name, String genre, int year, float price) {
        this.name = name;
        this.genre = genre;
        this.year = year;
        this.price = price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    void print() {
        System.out.println(this.name + " " + this.genre + " " + this.year + " " + this.price + " USD");
    }

    void printToFile(PrintStream stream) {
        stream.println(this.name + " " + this.genre + " " + this.year + " " + this.price + " USD");
    }
}
