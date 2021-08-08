package com.example.fypapp.applocker.ui.adapter;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.fypapp.R;
import com.example.fypapp.applocker.ui.model.AppList;
import com.example.fypapp.applocker.ui.util.GlobalMethods;


import java.util.ArrayList;
import java.util.List;

public class InstalledAppsAdapter extends RecyclerView.Adapter<InstalledAppsAdapter.InstalledViewHolder>{
    private Context context;
    private List<AppList> appLists;

    public InstalledAppsAdapter(Context context, List<AppList> appLists) {
        this.context = context;
        this.appLists = appLists;
    }

    @NonNull
    @Override
    public InstalledViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new InstalledViewHolder(LayoutInflater.from(context).inflate(R.layout.item_row_apps , parent , false));
    }

    @Override
    public void onBindViewHolder(@NonNull InstalledViewHolder holder, int position) {
        holder.bindIcon(appLists.get(position).getIcon());
        holder.bindName(appLists.get(position).getName());
        holder.bindPackageName(appLists.get(position).getPackages());
        holder.bindBlock();
    }

    @Override
    public int getItemCount() {
        return appLists.size();
    }

    public class InstalledViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public InstalledViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
        }

        void bindName(String name){
            TextView mDisplayName = itemView.findViewById(R.id.item_row_displayName);
            mDisplayName.setText(name);
        }
        void bindIcon(Drawable icon){
            ImageView mIcon = itemView.findViewById(R.id.item_row_icon);
            Glide.with(context).load(icon).into(mIcon);
        }
        void bindPackageName(String packageName){
            TextView mPackageName = itemView.findViewById(R.id.item_row_displayPackage);
            mPackageName.setText(packageName);
        }
        void bindBlock(){
            TextView mBlockView = itemView.findViewById(R.id.item_row_displayBlock);
            TextView mUnBlockView = itemView.findViewById(R.id.item_row_displayUnBlock);

            final ArrayList<String> blockList = GlobalMethods.getBlockList(context);
            if (!blockList.isEmpty()){

                for (int i = 0; i < appLists.size(); i++){
                    for (int j = 0; j < blockList.size(); j++){
                        if (appLists.get(getAdapterPosition()).getPackages().equals(blockList.get(j))){
                            mBlockView.setVisibility(View.GONE);
                            mUnBlockView.setVisibility(View.VISIBLE);
                            break;
                        }else {
                            mBlockView.setVisibility(View.VISIBLE);
                            mUnBlockView.setVisibility(View.GONE);
                        }
                    }
                }
            }

            mBlockView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    displayConfirmDialog(appLists.get(getAdapterPosition()).getName());
                }
            });

            mUnBlockView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    stateDialog();
                }
            });


        }

        @Override
        public void onClick(View v) {

        }
        private void stateDialog(){
            ArrayList<String> blockList = GlobalMethods.getBlockList(context);
            if (!blockList.isEmpty()){
                for (int j = 0; j < blockList.size(); j++){
                    if (appLists.get(getAdapterPosition()).getPackages().contains(blockList.get(j))){
                            displayUnblockConfirmDialog(appLists.get(getAdapterPosition()).getName() , j);
                            break;
                    }
                }

            }else {
                displayConfirmDialog(appLists.get(getAdapterPosition()).getName());
            }
        }

        private void displayConfirmDialog(final String app){
            AlertDialog.Builder dialog = new AlertDialog.Builder (context);
            dialog.setTitle("Block App");
            dialog.setMessage("Are you sure you want to block app?");
            dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            }).setPositiveButton("Confirm", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    GlobalMethods.addAppToBlock(context , appLists.get(getAdapterPosition()).getPackages());
                    dialog.dismiss();
                    Toast.makeText(context,"" + app + " Blocked" , Toast.LENGTH_SHORT).show();
                    notifyDataSetChanged();
                }
            });

            dialog.show();

        }


        private void displayUnblockConfirmDialog(final String app , final int position){
            AlertDialog.Builder dialog = new AlertDialog.Builder (context);
            dialog.setTitle("Unblock App");
            dialog.setMessage("Are you sure you want to unblock app?");
            dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            }).setPositiveButton("Confirm", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    GlobalMethods.removeAppFromBlock(context , position);
                    dialog.dismiss();
                    Toast.makeText(context,"" + app + " Unblocked" , Toast.LENGTH_SHORT).show();
                    notifyDataSetChanged();
                }
            });

            dialog.show();

        }

    }


}
