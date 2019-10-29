package com.adam.fallingview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private FallingView fallingView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //初始化一个雪花样式的fallObject
        FallObject.Builder builder = new FallObject.Builder(getResources().getDrawable(R.drawable.ic_rain));
        FallObject fallObject = builder
                .setSpeed(7,true)
                .setSize(50,50,true)
                .setWind(5,true,true)
                .build();

        fallingView = (FallingView) findViewById(R.id.fallView);
        fallingView.addFallObject(fallObject,100);//添加50个下落物体对象
    }
}
