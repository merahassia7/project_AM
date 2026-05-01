package com.example.umbbmobguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class FacultyAdapter extends ArrayAdapter<Faculty> {
    public FacultyAdapter(Context context, ArrayList<Faculty> faculties) {
        super(context, 0, faculties);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Faculty faculty = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_faculty, parent, false);
        }
        TextView name = convertView.findViewById(R.id.tvName);
        TextView desc = convertView.findViewById(R.id.tvDescription);
        name.setText(faculty.name);
        desc.setText(faculty.description);
        return convertView;
    }
}