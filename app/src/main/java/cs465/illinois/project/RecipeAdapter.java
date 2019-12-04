package cs465.illinois.project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeHolder> {
    private Context context;
    private ArrayList<Recipe> recipes;
    public static RecipeAdapterListener onClickListener;

    public RecipeAdapter(Context context, ArrayList<Recipe> recipes, RecipeAdapterListener listener){
        this.context = context;
        this.recipes = recipes;
        this.onClickListener = listener;
    }

    @NonNull
    @Override
    public RecipeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.main_page_row_item, parent, false);
        return new RecipeHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecipeHolder holder, int position) {
        Recipe recipe = recipes.get(position);
        holder.setInfo(recipe, position);
    }

    @Override
    public int getItemCount() {
        return recipes.size();
    }


}


