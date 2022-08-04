package com.example.portfolioapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.portfolioapp.R;
import com.example.portfolioapp.modal.PortfolioItem;

import java.util.List;

public class PortfolioAdapter extends RecyclerView.Adapter<PortfolioAdapter.PortfolioViewHolder> {

    List<PortfolioItem> mData;

    public PortfolioAdapter(List<PortfolioItem> mData) {
        this.mData = mData;
    }

    @NonNull
    @Override
    public PortfolioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.portfolio_item,parent,false);

        return new PortfolioViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PortfolioViewHolder holder, int position) {
        holder.tvPos.setText(String.valueOf(position));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class PortfolioViewHolder extends RecyclerView.ViewHolder{

        TextView tvPos;

        public PortfolioViewHolder(@NonNull View itemView) {
            super(itemView);

            tvPos = itemView.findViewById(R.id.item_port_text);
        }
    }

}
