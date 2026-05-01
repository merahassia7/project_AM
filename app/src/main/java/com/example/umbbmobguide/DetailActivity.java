package com.example.umbbmobguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Department dept = (Department) getIntent().getSerializableExtra("DEPT_OBJ");

        TextView tvName = findViewById(R.id.tvName);
        TextView tvSpecialties = findViewById(R.id.tvSpecialties);
        TextView tvDescription = findViewById(R.id.tvDescription);

        if (dept != null) {
            tvName.setText(dept.name);
            tvSpecialties.setText("location: " + dept.location);
            tvDescription.setText(dept.description);

            // call btn
            Button btnCall = findViewById(R.id.btnCall);
            btnCall.setOnClickListener(v -> {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + dept.phone));
                startActivity(intent);
            });

            // sms btn
            Button btnSMS = findViewById(R.id.btnSMS);
            btnSMS.setOnClickListener(v -> {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("smsto:" + dept.phone));
                startActivity(intent);
            });

            // email btn
            Button btnEmail = findViewById(R.id.btnEmail);
            btnEmail.setOnClickListener(v -> {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:" + dept.email));
                startActivity(intent);
            });

            // map btn
            Button btnMap = findViewById(R.id.btnMap);
            btnMap.setOnClickListener(v -> {
                // recherche sur map
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + Uri.encode(dept.location));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");

                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                } else {
                    Toast.makeText(this, "تطبيق الخرائط غير مثبت", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}