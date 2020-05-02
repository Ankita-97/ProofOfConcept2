package com.example.proofofconcept;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class NewsAdapter extends RecyclerView.Adapter<NewsViewholder> {

    ArrayList<Newsb> newsbb;

    public NewsAdapter(){
        newsbb = new ArrayList<>();
    }
    public void setData(ArrayList<Newsb> newsbb){
        this.newsbb = newsbb;
    }

    @NonNull
    @Override
    public NewsViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View newsview = inflater.inflate(R.layout.custom_news, parent, false);
        return new NewsViewholder(newsview);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewholder holder, int position) {

        Newsb newsb = newsbb.get(position);
        Picasso.get()
                .load(newsb.imageHref)
                .into(holder.image);
        holder.title.setText(newsb.title);
        holder.description.setText(newsb.description);
    }

    @Override
    public int getItemCount() {
        return newsbb.size();
    }
}
