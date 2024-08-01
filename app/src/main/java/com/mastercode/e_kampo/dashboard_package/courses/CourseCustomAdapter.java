package com.mastercode.e_kampo.dashboard_package.courses;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mastercode.e_kampo.R;
import com.mastercode.e_kampo.dashboard_package.DashboardItemClickListener;

import java.util.List;

public class CourseCustomAdapter extends RecyclerView.Adapter<CourseViewHolder> {
    DashboardItemClickListener dashboardItemClickListener;
    List<CourseModel> courseModelList;
    Context context;

    public CourseCustomAdapter(List<CourseModel> courseModelList, Context context,
                               DashboardItemClickListener dashboardItemClickListener) {
        this.courseModelList = courseModelList;
        this.context = context;
        this.dashboardItemClickListener = dashboardItemClickListener;
    }

    @NonNull
    @Override
    public CourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CourseViewHolder(LayoutInflater.from(context).inflate(R.layout.courses_custom_layout,
                parent,false), dashboardItemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseViewHolder holder, int position) {
        holder.courseImg.setImageResource(courseModelList.get(position).getCourseImg());
        holder.courseName.setText(courseModelList.get(position).getCourseName());
    }

    @Override
    public int getItemCount() {
        return courseModelList.size();
    }
}
