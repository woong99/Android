package org.techtown.doitmission;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText editText1;
    EditText editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        Calendar c = Calendar.getInstance();
        int mYear = c.get(Calendar.YEAR);
        int mMonth = c.get(Calendar.MONTH);
        int mDay = c.get(Calendar.DAY_OF_MONTH);
        button.setText(mYear + "/" + (mMonth + 1) + "/" + mDay);

        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                button.setText(year + "/" + (month + 1) + "/" + dayOfMonth);
            }
        }, mYear, mMonth, mDay);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (button.isClickable()) {
                    datePickerDialog.show();
                }
            }
        });
        editText1 = findViewById(R.id.editTextTextPersonName3);
        editText2 = findViewById(R.id.editTextTextPersonName4);
        Button button1 = findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "이름 : " + editText1.getText().toString() + " 나이 : " + editText2.getText().toString() + " 날짜 : " + button.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}