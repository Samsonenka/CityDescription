package com.example.citydescription;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner spinnerCity;
    private TextView textViewDescriptionCity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerCity = findViewById(R.id.spinnerCity);
        textViewDescriptionCity = findViewById(R.id.textViewDescriptionCity);
    }

    public void showDescription(View view){

        int position = spinnerCity.getSelectedItemPosition();
        String description = descriptionPosition(position);
        textViewDescriptionCity.setText(description);

    }

    public String descriptionPosition(int position){
        String[] descriptions = getResources().getStringArray(R.array.cities_description);
        return descriptions[position];
    }
}
