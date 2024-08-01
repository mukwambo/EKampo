package com.mastercode.e_kampo.dashboard_package;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.mastercode.e_kampo.R;
import com.mastercode.e_kampo.dashboard_package.courses.CourseCustomAdapter;
import com.mastercode.e_kampo.dashboard_package.courses.CourseModel;
import com.mastercode.e_kampo.dashboard_package.recent_announcements.AnnouncementsModel;
import com.mastercode.e_kampo.dashboard_package.recent_announcements.AnnouncementsCustomAdapter;

import java.util.ArrayList;
import java.util.List;

public class DashboardActivity extends AppCompatActivity implements DashboardItemClickListener{
    CourseCustomAdapter courseCustomAdapter;
    AnnouncementsCustomAdapter customAdapter;
    RecyclerView courseRecyclerView, announcementsView;
    List<CourseModel> courseModelList;
    List<AnnouncementsModel> announcementsModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        //1. AdapterView
        courseRecyclerView = findViewById(R.id.courses_recycler_view);

        //2. Data source fro the courseRecyclerView
        courseModelList = new ArrayList<>();
        courseModelList.add(new CourseModel(R.drawable.accounting, "BACT"));
        courseModelList.add(new CourseModel(R.drawable.finance, "BFIN"));
        courseModelList.add(new CourseModel(R.drawable.procurement,"PROC"));
        courseModelList.add(new CourseModel(R.drawable.insurance, "BINS"));
        courseModelList.add(new CourseModel(R.drawable.entrepreneurship, "BENT"));

        //3. Connect the adapterView to the data source
        courseRecyclerView.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL,false));
        courseCustomAdapter = new CourseCustomAdapter(courseModelList, getApplicationContext(),this);
        courseRecyclerView.setAdapter(courseCustomAdapter);

        // 1. Create an instance of the  adapterView
        announcementsView = findViewById(R.id.announcement_view);

        // 2. The data source for the adapterView
        announcementsModelList = new ArrayList<>();
        announcementsModelList.add(new AnnouncementsModel(R.drawable.daniel,"Daniel",
                "daniel@gmail.com"));
        announcementsModelList.add(new AnnouncementsModel(R.drawable.kira, "Kira",
                "kira@gmail.com"));
        announcementsModelList.add(new AnnouncementsModel(R.drawable.jeanette,"Jeanette",
                "jeanette@gmail.com"));
        announcementsModelList.add(new AnnouncementsModel(R.drawable.jonathan,"Johnathan",
                "johnathan@gmail.com"));
        announcementsModelList.add(new AnnouncementsModel(R.drawable.patrick,"Patrick",
                "patrick@gmail.com"));
        announcementsModelList.add(new AnnouncementsModel(R.drawable.daniel,"Dennis",
                "daniel@gmail.com"));
        announcementsModelList.add(new AnnouncementsModel(R.drawable.kira, "Sasha",
                "kira@gmail.com"));
        announcementsModelList.add(new AnnouncementsModel(R.drawable.jeanette,"Sandra",
                "jeanette@gmail.com"));
        announcementsModelList.add(new AnnouncementsModel(R.drawable.jonathan,"Nick",
                "johnathan@gmail.com"));
        announcementsModelList.add(new AnnouncementsModel(R.drawable.patrick,"Luther",
                "patrick@gmail.com"));

        // 3. The Adapter connecting the adapterView to the data source
        announcementsView.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false));
        customAdapter = new AnnouncementsCustomAdapter(announcementsModelList,getApplicationContext(),
                this);
        announcementsView.setAdapter(customAdapter);
    }

    @Override
    public void onCourseItemClick(int position) {
        Toast.makeText(this, ""+ courseModelList.get(position).getCourseName(),
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAnnouncementItemClick(int position) {
        Toast.makeText(this, ""+ announcementsModelList.get(position).getUserName(),
                Toast.LENGTH_SHORT).show();
    }
}