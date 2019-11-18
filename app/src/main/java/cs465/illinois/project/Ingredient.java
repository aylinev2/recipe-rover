package cs465.illinois.project;


public class Ingredient {
    private final int name;
    private final int imageResource;


    public Ingredient(int name, int imageResource) {
        this.name = name;
        this.imageResource = imageResource;
    }

    public int getName() {
        return name;
    }


    public int getImageResource() {
        return imageResource;
    }
}
