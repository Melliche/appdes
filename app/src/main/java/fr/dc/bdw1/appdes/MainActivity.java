package fr.dc.bdw1.appdes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import fr.dc.bdw1.appdes.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    public static final int NUMERO_DE = 20;

    private ActivityMainBinding ui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ui = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(ui.getRoot());

        ui.button1.setOnClickListener(view -> choiceDe(view.getRootView()));

    }

    public void choiceDe (View v) {
        Button b = (Button)v;
        String buttonText = b.getText().toString();
//        int NUMERO_DE = buttonText;

        Intent i = new Intent(this, GameActivity.class);
//        i.putExtra();
        this.startActivity(i);
    }
}