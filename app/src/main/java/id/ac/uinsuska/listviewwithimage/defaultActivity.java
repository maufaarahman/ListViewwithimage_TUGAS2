package id.ac.uinsuska.listviewwithimage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class defaultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default);

        ImageView ivDefault = findViewById(R.id.iv_default);
        TextView tvDefault = findViewById(R.id.tv_default);

        Intent intent = getIntent();

        int logoaplikasi = intent.getIntExtra("Gambar Default",0);
        String namaaplikasi = intent.getStringExtra("TEKS Default");

        ivDefault.setImageResource(logoaplikasi);
        tvDefault.setText(namaaplikasi);

    }
}