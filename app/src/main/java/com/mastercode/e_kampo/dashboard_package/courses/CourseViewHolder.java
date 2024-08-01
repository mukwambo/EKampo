package com.mastercode.e_kampo.dashboard_package.courses;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mastercode.e_kampo.R;
import com.mastercode.e_kampo.dashboard_package.DashboardItemClickListener;

public class CourseViewHolder extends RecyclerView.ViewHolder {
    ImageView courseImg;
    TextView courseName;
    public CourseViewHolder(@NonNull View itemView, DashboardItemClickListener dashboardItemClickListener) {
        super(itemView);
        courseImg = itemView.findViewById(R.id.course_image);
        courseName = itemView.findViewById(R.id.course_name);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dashboardItemClickListener != null){
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION){
                        dashboardItemClickListener.onCourseItemClick(position);
                    }
                }
            }
        });

    }
}
