package com.example.radiobuttontest;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends Activity implements CompoundButton.OnCheckedChangeListener {
    private RadioGroup mGroup2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGroup2 = (RadioGroup)findViewById(R.id.radioGroup2);

        RadioButton button1 = (RadioButton)findViewById(R.id.option_1);
        button1.setOnCheckedChangeListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        RadioButton checked = (RadioButton)findViewById(mGroup2.getCheckedRadioButtonId());
        checked.setTypeface(Typeface.DEFAULT_BOLD);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        buttonView.setTypeface(isChecked ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
    }
}