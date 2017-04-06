package com.example.bojidar_pavel.testapp2.model;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bojidar_pavel.testapp2.R;

import java.util.List;

/**
 * Created by Bojidar on 3/28/2017.
 */

public class MyRecylcerViewAdapter extends RecyclerView.Adapter<MyRecylcerViewAdapter.MyViewHolder> {

   private Context context;
    private List<Goat> goats;

    public MyRecylcerViewAdapter(Context context,List<Goat> goats){
        this.context=context;
        this.goats=goats;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        View row;
        TextView nameTV;
        ImageView imgVW;
        TextView ageTV;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.row=itemView;
            this.nameTV= (TextView) row.findViewById(R.id.name_tv);
            this.imgVW= (ImageView) row.findViewById(R.id.img_iv);
            this.ageTV= (TextView) row.findViewById(R.id.age_tv);
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater li =LayoutInflater.from(context);
        View row=li.inflate(R.layout.activity_row,parent,false);
        MyViewHolder vh=new MyViewHolder(row);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Goat goat=goats.get(position);
        holder.nameTV.setText(goat.getName());
        holder.imgVW.setImageResource(goat.getImgId());
        holder.ageTV.setText(goat.getAge()+"");

    }

    @Override
    public int getItemCount() {
        return goats.size();
    }

}
