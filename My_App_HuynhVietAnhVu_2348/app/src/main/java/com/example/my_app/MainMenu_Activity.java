package com.example.my_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainMenu_Activity extends Activity {

    Button btnSanPham, btnGioHang, btnYeuThich, btnTaiKhoan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        // Liên kết nút với id trong XML
        btnSanPham = findViewById(R.id.btnSanPham);
        btnGioHang = findViewById(R.id.btnGioHang);
        btnYeuThich = findViewById(R.id.btnYeuThich);
        btnTaiKhoan = findViewById(R.id.btnTaiKhoan);

        // Sự kiện bấm nút
        btnSanPham.setOnClickListener(v -> {
            startActivity(new Intent(MainMenu_Activity.this, SanPham_Activity.class));
        });

        btnGioHang.setOnClickListener(v -> {
            startActivity(new Intent(MainMenu_Activity.this, GioHang_Activity.class));
        });

        btnYeuThich.setOnClickListener(v -> {
            startActivity(new Intent(MainMenu_Activity.this, YeuThich_Activity.class));
        });

        btnTaiKhoan.setOnClickListener(v -> {
            startActivity(new Intent(MainMenu_Activity.this, TaiKhoan_Activity.class));
        });
    }
}

