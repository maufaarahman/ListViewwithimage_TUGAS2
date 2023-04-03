package id.ac.uinsuska.listviewwithimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lvprogram;
    String[] programName = {"Bitcoin","facebook","instagram","spotify","telegram","twitter","whatsapp","figma","android","apple","signal"};
    String[] programDeskripsi={"Crypto", "Sosial Media", "Sosial Media", "Sosial Media", "Sosial Media", "Sosial Media", "Sosial Media","Aplikasi Desain", "Sistem Operasi","Sistem Operasi", "Jaringan"};
    int[] programImage = {R.drawable.bitcoin,R.drawable.facebook,R.drawable.instagram,R.drawable.spotify
            ,R.drawable.telegram,R.drawable.twitter,R.drawable.whatsapp,
            R.drawable.figma,R.drawable.android,R.drawable.apple,R.drawable.signal};
    String[] urls = {"https://g.co/kgs/2s6EJP",
    "https://g.co/kgs/nnCtfL",
    "https://g.co/kgs/4P6yTx",
    "https://g.co/kgs/P35Ugs",
    "https://g.co/kgs/ojgtuH",
    "https://g.co/kgs/DnFZXY",
    "https://g.co/kgs/H18GBh",
    "https://g.co/kgs/FrSCso",
    "https://g.co/kgs/zrpojN",
    "https://g.co/kgs/rXBytY",
    "https://g.co/kgs/wk7gYz"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvprogram = findViewById(R.id.lv_program);
        programAdapter programAdapter = new programAdapter(this, programName,programImage,programDeskripsi,urls);
        lvprogram.setAdapter(programAdapter);
    }
}