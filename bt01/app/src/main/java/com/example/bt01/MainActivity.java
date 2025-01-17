package com.example.bt01;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import de.hdodenhof.circleimageview.CircleImageView;
import android.widget.TextView;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    private CircleImageView profileImage;
    private TextView studentName, studentId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        profileImage = findViewById(R.id.profile_image);
        studentName = findViewById(R.id.student_name);
        studentId = findViewById(R.id.student_id);

        profileImage.setImageResource(R.drawable.anh);
        studentName.setText("Tô Thành Hậu");
        studentId.setText("MSSV: 22110319");


        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }


}