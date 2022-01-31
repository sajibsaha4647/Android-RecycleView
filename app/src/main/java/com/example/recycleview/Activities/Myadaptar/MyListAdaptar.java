package com.example.recycleview.Activities.Myadaptar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleview.R;

public class MyListAdaptar extends RecyclerView.Adapter<MyListAdaptar.Myviewholder> {

    Context context ;
    String [] title,desc;
    int [] Images;
    private static Clicklistener clicklistener;

    public MyListAdaptar(Context context, String[] title, String[] desc, int[] images) {
        this.context = context;
        this.title = title;
        this.desc = desc;
        Images = images;
    }

    @NonNull
    @Override
    public Myviewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        LayoutInflater layoutInflater  = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.sample_layout,viewGroup,false);

        return new Myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Myviewholder holder, int position) {

        holder.titleTextView.setText(title[position]);
        holder.descTextview.setText(desc[position]);
        holder.imageflag.setImageResource(Images[position]);

    }

    @Override
    public int getItemCount() {

        return title.length;
    }

    public class Myviewholder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {

        TextView titleTextView,descTextview;
        ImageView imageflag;
        public Myviewholder(@NonNull View itemView) {
            super(itemView);

            titleTextView = itemView.findViewById(R.id.titleID);
            descTextview = itemView.findViewById(R.id.descId);
            imageflag = itemView.findViewById(R.id.imageId);

            imageflag.setOnClickListener(this);
            imageflag.setOnLongClickListener(this);

        }

        @Override
        public void onClick(View view) {
            clicklistener.onItemClick(getAdapterPosition(),view);
        }

        @Override
        public boolean onLongClick(View view) {
            clicklistener.onItemLongClick(getAdapterPosition(),view);
            return false;
        }


    }

    public interface Clicklistener{
        void onItemClick(int Position ,View view);
        void onItemLongClick(int Position ,View view);
    }

    public void setOnItemClickListener(Clicklistener click){

        MyListAdaptar.clicklistener = click ;
    }
}
