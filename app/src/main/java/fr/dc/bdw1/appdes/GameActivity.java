package fr.dc.bdw1.appdes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import fr.dc.bdw1.appdes.databinding.ActivityGameBinding;
import fr.dc.bdw1.appdes.databinding.ActivityMainBinding;

public class GameActivity extends AppCompatActivity {

    private ActivityGameBinding ui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ui = ActivityGameBinding.inflate(getLayoutInflater());
        setContentView(ui.getRoot());
    }
}