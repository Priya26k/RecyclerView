package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<ModelClass> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        arrayList.add(new ModelClass("Personal Details",R.drawable.ic_personal_information));
        arrayList.add(new ModelClass("Course Schedule",R.drawable.ic_course_schedule));
        arrayList.add(new ModelClass("Study Result",R.drawable.ic_study_result));
        arrayList.add(new ModelClass("Attendance Record",R.drawable.ic_attendant_list));
        arrayList.add(new ModelClass("Course Booking",R.drawable.ic_course_booking));
        arrayList.add(new ModelClass("Course Plan",R.drawable.ic_course_plan));

        AdapterClass adapterClass = new AdapterClass(arrayList,getApplicationContext());
        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
        recyclerView.setAdapter(adapterClass);
    }
}
