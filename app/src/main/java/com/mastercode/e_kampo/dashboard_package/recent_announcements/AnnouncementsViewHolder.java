package com.mastercode.e_kampo.dashboard_package.recent_announcements;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mastercode.e_kampo.R;
import com.mastercode.e_kampo.dashboard_package.DashboardItemClickListener;

public class AnnouncementsViewHolder extends RecyclerView.ViewHolder {
    ImageView profilePic;
    TextView userName, userEmail;

    public AnnouncementsViewHolder(@NonNull View itemView, DashboardItemClickListener dashboardItemClickListener) {
        super(itemView);
        profilePic = itemView.findViewById(R.id.profile_pic);
        userName = itemView.findViewById(R.id.user_name);
        userEmail = itemView.findViewById(R.id.user_email);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dashboardItemClickListener != null){
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION){
                        dashboardItemClickListener.onAnnouncementItemClick(position);
                    }
                }
            }
        });

    }
}
