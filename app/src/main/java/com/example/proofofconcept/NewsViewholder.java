package com.example.proofofconcept;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NewsViewholder extends RecyclerView.ViewHolder {

    ImageView image;
    TextView title;
    TextView description;

    public NewsViewholder(@NonNull View itemView) {
        super(itemView);

        image = itemView.findViewById(R.id.image);
        title = itemView.findViewById(R.id.title);
        description = itemView.findViewById(R.id.description);
    }
}
