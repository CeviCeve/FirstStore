package com.app.firststore.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.app.firststore.R;
import java.util.List;
import com.app.firststore.Model.Category;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {


    Context context;
    List<Category> categories;

    public CategoryAdapter(Context context, List<Category> categories) {
        this.context = context;
        this.categories = categories;
    }


    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View categoryItems = LayoutInflater.from(context).inflate(R.layout.category_item, parent, false);
        return new CategoryViewHolder(categoryItems);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.categoryTitle.setText(categories.get(position).getTitle()); // текст для поля

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //MainActivity.showCoursesByCategory(categories.get(position).getId());
            }
        });
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    public static final class CategoryViewHolder extends RecyclerView.ViewHolder {

        TextView categoryTitle;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);

            categoryTitle = itemView.findViewById(R.id.categoryTitle);
        }
    }
}
