package cs465.illinois.project;

import android.view.View;

public interface RecipeAdapterListener {
    void favouriteButtonOnClick(View v, int position);
    void viewRecipeButtonOnClick();
}
