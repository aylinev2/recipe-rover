package cs465.illinois.project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FavAdapter extends RecyclerView.Adapter<FavHolder> {
    private Context context;
    private ArrayList<Recipe> recipes;

    public FavAdapter(Context context, ArrayList<Recipe> recipes){
        this.context = context;
        this.recipes = recipes;
    }

    @NonNull
    @Override
    public FavHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.fav_row_item, parent, false);
        return new FavHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FavHolder holder, int position) {
        Recipe recipe = recipes.get(position);
        holder.setInfo(recipe);
    }

    @Override
    public int getItemCount() {
        return recipes.size();
    }


}
