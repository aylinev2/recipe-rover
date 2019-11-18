package cs465.illinois.project;

import android.graphics.drawable.Drawable;

public class Recipe {
    private String recipeName;
    private Drawable recipePicture;
    private String prepTime;
    private String difficulty;
    private double percentMatch;
    private String missingIngredients;

    public Recipe(String recipeName, Drawable recipePicture, String prepTime, String difficulty,
                  double percentMatch, String missingIngredients){
        this.recipeName = recipeName;
        this.recipePicture = recipePicture;
        this.prepTime = prepTime;
        this.difficulty = difficulty;
        this.percentMatch = percentMatch;
        this.missingIngredients = missingIngredients;
    }

    public String getRecipeName(){
        return recipeName;
    }

    public Drawable getRecipePicture(){
        return recipePicture;
    }

    public String getPrepTime(){
        return prepTime;
    }

    public String getDifficulty(){
        return difficulty;
    }

    public double getPercentMatch(){
        return percentMatch;
    }

    public String getMissingIngredients(){
        return missingIngredients;
    }
}

