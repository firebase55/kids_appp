package com.example.fypapp.applocker.ui;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;


import com.example.fypapp.R;
import com.example.fypapp.applocker.ui.adapter.InstalledAppsAdapter;
import com.example.fypapp.applocker.ui.model.AppList;
import com.example.fypapp.applocker.ui.util.GlobalMethods;
import com.example.fypapp.databinding.FragmentBlockAppsBinding;

import java.util.List;

public class BlockAppsFragment extends Fragment {
    private FragmentBlockAppsBinding binding;

    public BlockAppsFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding =  DataBindingUtil.inflate(inflater , R.layout.fragment_block_apps, container, false);

        /***
         * methods
         */

        setupRecyclerView();
        return binding.getRoot();

    }

    @Override
    public void onResume() {
        super.onResume();

        new BgTask().execute();
    }

    private void setupRecyclerView(){
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        binding.recyclerView.setHasFixedSize(true);
    }

    private class BgTask extends AsyncTask<Void , Void , List<AppList>>{
        @Override
        protected List<AppList> doInBackground(Void... voids) {
            return GlobalMethods.getInstalledApps(requireContext());
        }

        @Override
        protected void onPostExecute(List<AppList> appLists) {
            super.onPostExecute(appLists);
            InstalledAppsAdapter adapter = new InstalledAppsAdapter(getContext() , appLists);
            binding.recyclerView.setAdapter(adapter);
            adapter.notifyDataSetChanged();
            binding.progressBar.setVisibility(View.INVISIBLE);

        }
    }



}