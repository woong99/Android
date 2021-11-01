package com.example.a201811453_hw1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    final int MAX_SIZE = 100; // 연락처 최대 저장 수
    String[][] list = new String[MAX_SIZE][3]; // 연락처 정보 리스트
    int i = 0; // 현재 저장된 연락처 수
    String number; // 전달받은 전화번호 정보
    String name; // 전달받은 이름 정보
    String image; // 전달받은 이미지 정보
    LinearLayout container; // view 가 들어갈 layout
    LayoutInflater layoutInflater; // inflater
    TextView textViewName;
    TextView textViewNumber;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // view 를 추가할 layout
        container = findViewById(R.id.contact_linearLayout);

        // exit 버튼 리스너
        Button button_exit = findViewById(R.id.button_exit);
        button_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMessage();
            }
        });
    }

    // onBackPressed()의 super.onBackPressed();를 주석 처리 함으로 뒤로 가기 버튼 비활성화
    @Override
    public void onBackPressed() {
//        super.onBackPressed();
    }

    // button_exit 버튼 클릭 시 알림 대화상자 호출
    private void showMessage() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Would like to exit the App?");

        // YES, EXIT 버튼 클릭 시 finish()를 사용해 액티비티 종료
        builder.setPositiveButton("YES, EXIT", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        // NO, CANCEL 버튼 클릭 시 null 값으로 인해 아무 일도 일어나지 않고 화면 복귀
        builder.setNegativeButton("NO, CANCEL", null);

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    // 연락처 추가 화면으로 이동하기
    public void addContact(View view) {
        Intent intent = new Intent(getApplicationContext(), PhoneActivity.class);
        startActivityForResult(intent, 101);
    }

    // 연락처 추가 화면에서 intent 시 실행되는 메소드
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        final ViewGroup view;
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 101) {
            if (resultCode == RESULT_OK) {

                // 이름, 번호, 이미지의 정보를 각 배열에 저장한다.
                name = data.getStringExtra("name");
                list[i][0] = name;
                number = data.getStringExtra("number");
                list[i][1] = number;
                image = data.getStringExtra("image");
                list[i][2] = image;

                // inflater 선언
                layoutInflater = LayoutInflater.from(this);
                // view
                view = (ViewGroup) layoutInflater.inflate(R.layout.phone_info, null, false);
                view.setTag(i);
                // 해당 view 의 변수 연결
                textViewName = view.findViewById(R.id.textView_name);
                textViewNumber = view.findViewById(R.id.textView_phone_number);
                imageView = view.findViewById(R.id.imageView);

                // view 에 정보 연결
                textViewName.setText(list[i][0]); // 이름 정보
                textViewNumber.setText(list[i][1]); // 전화번호 정보
                switch (image) { // 성별에 따른 이미지 정보
                    case "male":
                        imageView.setImageResource(R.drawable.male);
                        break;
                    case "female":
                        imageView.setImageResource(R.drawable.female);
                        break;
                    default:
                        imageView.setImageResource(R.drawable.unspecified);
                }

                // call 버튼 리스너
                Button button_call = view.findViewById(R.id.button_call);
                button_call.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Integer gIndex = (Integer) view.getTag();
                        int k = gIndex;
                        String data = "tel:" + list[k][1];
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(data));
                        startActivity(intent);
                    }
                });
                // container 에 view 추가
                container.addView(view);
                i++;
            }
        }
    }
}