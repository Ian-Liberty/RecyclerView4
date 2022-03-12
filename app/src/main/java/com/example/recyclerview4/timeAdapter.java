package com.example.recyclerview4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class timeAdapter extends RecyclerView.Adapter<timeAdapter.Viewhorder>{

    ArrayList<time> items = new ArrayList<time>();

    @NonNull
    @Override
    public Viewhorder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater =LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.time_item, parent, false);

        return new Viewhorder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewhorder holder, int position) {

        time item =items.get(position);
        holder.setItem(item);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }


    static class Viewhorder extends RecyclerView.ViewHolder{
        TextView 웜업;
        TextView 운동;
        TextView 휴식;
        TextView 반복;

        public Viewhorder(View itemView){
            super(itemView);

            웜업 = itemView.findViewById(R.id.준비시간);
            운동 = itemView.findViewById(R.id.운동시간);
            휴식 = itemView.findViewById(R.id.휴식시간);
            반복 = itemView.findViewById(R.id.라운드);

        }

        public void setItem(time item){
            웜업.setText(String.valueOf(item.get준비()));
            운동.setText(String.valueOf(item.get운동()));
            휴식.setText(String.valueOf(item.get휴식()));
            반복.setText(String.valueOf(item.get라운드()));
        }

    }

    public void addItem(time item){
        items.add(item);
    }
    public void setItems(ArrayList<time> items){
        this.items =items;
    }
    public time getItem(int position){
        return items.get(position);
    }
    public void setItem(int position, time item){
        items.set(position, item);
    }

}
