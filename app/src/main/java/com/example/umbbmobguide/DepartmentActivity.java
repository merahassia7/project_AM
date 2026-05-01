package com.example.umbbmobguide;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class DepartmentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Faculty faculty = (Faculty) getIntent().getSerializableExtra("FACULTY_OBJ");
        ListView listView = findViewById(R.id.listViewFaculties);

        DepartmentAdapter adapter = new DepartmentAdapter(this, faculty.departments);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            Department dept = adapter.getItem(position);
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra("DEPT_OBJ", dept);
            startActivity(intent);
        });
    }
}