package com.example.a201811453_hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Toast;

public class PhoneActivity extends AppCompatActivity {
    ImageView imageView;
    RadioGroup radioGroup;
    LinearLayout container;
    String imageData;
    EditText editText_name;
    EditText editText_phone_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);

        imageView = findViewById(R.id.imageView);
        radioGroup = findViewById(R.id.radioGroup_gender);
        container = findViewById(R.id.contact_linearLayout);
        editText_name = findViewById(R.id.editText_name);
        editText_phone_number = findViewById(R.id.editText_phone_number);

        // radio 버튼에 따른 이미지 변경
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radio_male) {
                    imageView.setImageResource(R.drawable.male);
                    imageData = "male";

                } else if (checkedId == R.id.radio_female) {
                    imageView.setImageResource(R.drawable.female);
                    imageData = "female";
                } else {
                    imageView.setImageResource(R.drawable.unspecified);
                    imageData = "unspecified";
                }
            }
        });
    }

    // onBackPressed()의 super.onBackPressed();를 주석 처리 함으로 뒤로 가기 버튼 비활성화
    @Override
    public void onBackPressed() {
//        super.onBackPressed();
    }

    // save 버튼 리스너
    public void save(View view) {

        // 이름이 입력되지 않으면 Toast 를 띄우고 넘어가지 않음
        if (editText_name.length() == 0) {
            Toast.makeText(getApplicationContext(), "이름을 입력하세요.", Toast.LENGTH_SHORT).show();
        }
        // 전화번호가 입력되지 않으면 Toast 를 띄우고 넘어가지 않음
        else if (editText_phone_number.length() == 0) {
            Toast.makeText(getApplicationContext(), "전화번호를 입력하세요.", Toast.LENGTH_SHORT).show();
        }
        // 모든 정보가 입력되면 intent 로 데이터 전달 및 액티비티 전환
        else {
            Intent intent = new Intent();
            intent.putExtra("name", editText_name.getText().toString()); // 이름 정보 전달
            intent.putExtra("number", editText_phone_number.getText().toString()); // 전화번호 정보 전달

            // 성별에 따른 이미지 정보 전달
            if (imageData == "male") {
                intent.putExtra("image", "male");
            } else if (imageData == "female") {
                intent.putExtra("image", "female");
            } else {
                intent.putExtra("image", "unspecified");
            }
            setResult(RESULT_OK, intent);
            finish();
        }
    }

    // cancel 버튼 리스너
    public void cancel(View view) {
        finish();
    }
}