package com.Yogify.bottomsheetlibrary;

import static com.yogify.bottomsheetdialog.ShowBottomsheet.ShowActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.yogify.bottomsheetdialog.ShowBottomsheet;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ShowBottomsheet.ShowBottomSheet(MainActivity.this,R.layout.bottomsheet,R.id.relativelayout);
        ShowActivity(MainActivity.this);
    }
}