package com.liuy.texturecamare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private MyTextureView myTextureView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTextureView=findViewById(R.id.mytextureview);
        findViewById(R.id.paizhai).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTextureView.take();
            }
        });
        findViewById(R.id.yulan).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTextureView.startPreview();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        myTextureView.startPreview();
    }

    @Override
    protected void onStop() {
        super.onStop();
        myTextureView.stopPreview();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        myTextureView.releasePreview();
    }
}
