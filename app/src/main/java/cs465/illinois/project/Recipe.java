package cs465.illinois.project;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

public class Recipe implements Serializable {
    private String recipeName;
    private Drawable recipePicture;
    private String prepTime;
    private int prepTimeInMinutes;
    private String difficulty;
    private double percentMatch;
    private String missingIngredients;
    boolean favorited = false;
    boolean completed = false;

    public Recipe(String recipeName, Drawable recipePicture, String prepTime, int prepTimeInMinutes, String difficulty,
                  double percentMatch, String missingIngredients){
        this.recipeName = recipeName;
        this.recipePicture = recipePicture;
        this.prepTime = prepTime;
        this.prepTimeInMinutes = prepTimeInMinutes;
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

    public int getPrepTimeInMinutes() {
        return prepTimeInMinutes;
    }

    public void setPrepTimeInMinutes(int prepTimeInMinutes) {
        this.prepTimeInMinutes = prepTimeInMinutes;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "recipeName='" + recipeName + '\'' +
                ", recipePicture=" + recipePicture +
                ", prepTime='" + prepTime + '\'' +
                ", prepTimeInMinutes=" + prepTimeInMinutes +
                ", difficulty='" + difficulty + '\'' +
                ", percentMatch=" + percentMatch +
                ", missingIngredients='" + missingIngredients + '\'' +
                ", favorited=" + favorited +
                ", completed=" + completed +
                '}';
    }
}

