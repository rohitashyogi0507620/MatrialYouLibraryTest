package com.Yogify.bottomsheetlibrary;

import static com.yogify.bottomsheetdialog.ShowBottomsheet.ShowActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;
import com.google.android.material.navigationrail.NavigationRailMenuView;
import com.google.android.material.navigationrail.NavigationRailView;
import com.yogify.bottomsheetdialog.ShowBottomsheet;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NaviagitonRails();

        // ShowBottomsheet.ShowBottomSheet(MainActivity.this,R.layout.bottomsheet,R.id.relativelayout);
        // ShowActivity(MainActivity.this);
        // MatirialARangPicker();

        MatrialDatePicker();
    }

    private void NaviagitonRails() {
        NavigationRailView navigationRailView;
        BadgeDrawable badge;
        navigationRailView = findViewById(R.id.navigation_rail);

        badge = navigationRailView.getOrCreateBadge(R.id.alarms);
        badge.setVisible(true);
        badge.setNumber(33);


        badge = navigationRailView.getBadge(R.id.alarms);
        if (badge != null) {
            badge.setVisible(false);
            badge.clearNumber();
        }

        navigationRailView.removeBadge(R.id.alarms);

    }

    public void MatirialARangPicker() {
        MaterialDatePicker dateRangePicker =
                MaterialDatePicker.Builder.dateRangePicker()
                        .setTitleText("Select dates")
                        .build();
        dateRangePicker.show(getSupportFragmentManager(), "This");
        dateRangePicker.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener() {
            @Override
            public void onPositiveButtonClick(Object selection) {
                Toast.makeText(getApplicationContext(), selection.toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void MatrialDatePicker() {
        MaterialDatePicker datePicker =
                MaterialDatePicker.Builder.datePicker()
                        .setTitleText("Select date")
                        .setSelection(MaterialDatePicker.todayInUtcMilliseconds())
                        .build();

        datePicker.show(getSupportFragmentManager(), "Hell dATA");
        datePicker.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener() {
            @Override
            public void onPositiveButtonClick(Object selection) {
                Toast.makeText(getApplicationContext(), selection.toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }


}