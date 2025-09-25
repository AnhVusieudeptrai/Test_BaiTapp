package com.example.my_app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class GioHang_Activity extends Activity {

    Button btnBackGioHang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gio_hang);

        btnBackGioHang = findViewById(R.id.btnBackGioHang);

        btnBackGioHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // quay lại màn hình trước
            }
        });
    }
}
