package edu.info448.review;

public class Husky extends Dog implements Huggable {

    private String name;

    public Husky(String name) {
        super(BEST_BREED);
        this.name = name;
    }

    public Husky() {
        this.name="Dog";
    }

    public void pullSled() {
        System.out.println(name+" the " + BEST_BREED + " is pulling the sled!");
    }

    public void bark() {
        System.out.println("barks like a husky");
    }

    public void hug() {
        System.out.println(name+" likes hugs");
    }
}