package cs465.illinois.project;

import androidx.annotation.Nullable;

public class Ingredient {
    private final int name;
    private final int imageResource;
    private String qty;
    private String qtyUnit;
    private String datePurchased;
    private String dateExpired;
    public Ingredient(int name, int imageResource) {
        this.name = name;
        this.imageResource = imageResource;
        this.qty = "1";
        this.qtyUnit = "units";
        this.datePurchased = "01/01/2019";
        this.dateExpired = "02/02/2019";
    }
    public Ingredient(int name, int imageResource, String qty, String qtyUnit, String datePurchased, String dateExpired) {
        this.name = name;
        this.imageResource = imageResource;
        this.qty = qty;
        this.qtyUnit = qtyUnit;
        this.datePurchased = datePurchased;
        this.dateExpired = dateExpired;
    }
    public int getName() {
        return name;
    }
    public int getImageResource() {
        return imageResource;
    }
    public String getQty() { return qty;}
    public String getQtyUnit() {return qtyUnit;}
    public String getDatePurchased() {return datePurchased;}
    public String getDateExpired() {return dateExpired;}
    @Override
    public boolean equals(@Nullable Object obj) {
        Ingredient objIngredient = (Ingredient) obj;
        return objIngredient.getName() == name;
    }
}
