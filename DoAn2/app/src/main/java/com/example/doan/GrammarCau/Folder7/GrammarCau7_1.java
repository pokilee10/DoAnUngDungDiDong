package com.example.doan.GrammarCau.Folder7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.doan.GrammarCau.GrammarCau6;
import com.example.doan.GrammarCau.GrammarCau7;
import com.example.doan.R;

public class GrammarCau7_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grammar_cau71);
        ImageButton imgbtn_back = (ImageButton) findViewById(R.id.imgbtn_back);
        imgbtn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Back();
            }
        });
    }
    public void Back(){
        Intent intent = new Intent(this, GrammarCau7.class);
        startActivity(intent);
    }
}