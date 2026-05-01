package com.example.umbbmobguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class DepartmentAdapter extends ArrayAdapter<Department> {
    public DepartmentAdapter(Context context, ArrayList<Department> departments) {
        super(context, 0, departments);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Department dept = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_faculty, parent, false);
        }
        TextView name = convertView.findViewById(R.id.tvName);
        TextView desc = convertView.findViewById(R.id.tvDescription);
        name.setText(dept.name);
        desc.setText(dept.description);
        return convertView;
    }
}