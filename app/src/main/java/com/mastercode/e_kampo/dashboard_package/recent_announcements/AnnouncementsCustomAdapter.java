package com.mastercode.e_kampo.dashboard_package.recent_announcements;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mastercode.e_kampo.R;
import com.mastercode.e_kampo.dashboard_package.DashboardItemClickListener;

import java.util.List;

public class AnnouncementsCustomAdapter extends RecyclerView.Adapter<AnnouncementsViewHolder> {
    DashboardItemClickListener dashboardItemClickListener;
    List<AnnouncementsModel> chatsModels;
    private final Context context;

    public AnnouncementsCustomAdapter(List<AnnouncementsModel> chatsModels, Context context,
                                      DashboardItemClickListener dashboardItemClickListener) {
        this.chatsModels = chatsModels;
        this.context = context;
        this.dashboardItemClickListener = dashboardItemClickListener;
    }
    @NonNull
    @Override
    public AnnouncementsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new AnnouncementsViewHolder(LayoutInflater.from(context).inflate(R.layout.announcement_custom_layout,
                parent, false),dashboardItemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull AnnouncementsViewHolder holder, int position) {
        holder.profilePic.setImageResource(chatsModels.get(position).getProfilePic());
        holder.userName.setText(chatsModels.get(position).getUserName());
        holder.userEmail.setText(chatsModels.get(position).getEmail());
    }

    @Override
    public int getItemCount() {
        return chatsModels.size();
    }

}
