package cs465.illinois.project;

import android.graphics.drawable.Drawable;

public class Recipe {
    private String recipeName;
    private Drawable recipePicture;
    private String prepTime;
    private String difficulty;
    private double percentMatch;
    private String missingIngredients;
    boolean favorited = false;
    boolean completed = false;

    public Recipe(String recipeName, Drawable recipePicture, String prepTime, String difficulty,
                  double percentMatch, String missingIngredients){
        this.recipeName = recipeName;
        this.recipePicture = recipePicture;
        this.prepTime = prepTime;
        this.difficulty = difficulty;
        this.percentMatch = percentMatch;
        this.missingIngredients = missingIngredients;
    }

    public Recipe(String recipeName, Drawable recipePicture){
        this.recipeName = recipeName;
        this.recipePicture = recipePicture;
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

    public boolean getCompleted(){
        return completed;
    }

    public boolean getFavorited(){
        return favorited;
    }

    public void setCompleted(boolean completed){
        this.completed = completed;
    }

    public void setFavorited(boolean favorited){
        this.favorited = favorited;
    }




}

