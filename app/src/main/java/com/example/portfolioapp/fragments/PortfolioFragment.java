package com.example.portfolioapp.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.example.portfolioapp.R;
import com.example.portfolioapp.adapter.PortfolioAdapter;
import com.example.portfolioapp.modal.PortfolioItem;

import java.util.List;
import java.util.Objects;

public class PortfolioFragment extends Fragment {

    List<PortfolioItem> mData;
    RecyclerView rv_portfolio;
    PortfolioAdapter adapter;

    Button acaDroidBtn, giftShopBtn, acaDroidQuizBtn, bloodDonationBtn;
    FragmentManager fragmentManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_portfolio, container, false);

        acaDroidBtn = view.findViewById(R.id.acaDroidBtn);
        acaDroidBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToAcaDroid();
            }
        });

        giftShopBtn = view.findViewById(R.id.giftShopBtn);
        giftShopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://github.com/satyam-442/eGiftHouse";
                Uri uri = Uri.parse(url);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

        acaDroidQuizBtn = view.findViewById(R.id.acaDroidQuizBtn);
        acaDroidQuizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://github.com/satyam-442/AcaDroid_Quiz";
                Uri uri = Uri.parse(url);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

        bloodDonationBtn = view.findViewById(R.id.bloodDonationBtn);
        bloodDonationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://github.com/satyam-442/Donation_Blood";
                Uri uri = Uri.parse(url);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

        return view;
    }

    private void goToAcaDroid() {
        String url = "https://github.com/satyam-442/University_All_In_One";
        Uri uri = Uri.parse(url);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }

    /*@Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rv_portfolio = view.findViewById(R.id.rv_portfolio);

        mData = new ArrayList<>();
        mData.add(new PortfolioItem());
        mData.add(new PortfolioItem());
        mData.add(new PortfolioItem());
        mData.add(new PortfolioItem());
        mData.add(new PortfolioItem());
        mData.add(new PortfolioItem());
        mData.add(new PortfolioItem());
        mData.add(new PortfolioItem());
        mData.add(new PortfolioItem());
        mData.add(new PortfolioItem());
        mData.add(new PortfolioItem());
        mData.add(new PortfolioItem());
        mData.add(new PortfolioItem());
        mData.add(new PortfolioItem());

        adapter = new PortfolioAdapter(mData);

        rv_portfolio.setLayoutManager(new GridLayoutManager(getContext(),2));
        rv_portfolio.setAdapter(adapter);

    }*/

}