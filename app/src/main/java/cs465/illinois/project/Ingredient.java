package cs465.illinois.project;


import androidx.annotation.Nullable;

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

    @Override
    public boolean equals(@Nullable Object obj) {
        Ingredient objIngredient = (Ingredient) obj;
        return objIngredient.getName() == name;
    }
}
