package com.example.homework2_1;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.android.volley.toolbox.NetworkImageView;
import com.example.homework2_1.network.ImageRequester;

public class MainActivity extends AppCompatActivity {
    private ImageRequester imageRequester;
    private NetworkImageView editImage;


//    private LinearLayout l_1, l_2, l_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageRequester = ImageRequester.getInstance();
        editImage = findViewById(R.id.chooseImage);
        imageRequester.setImageFromUrl(editImage,"https://cheburashka.ml/UserImages/1.jpg");
        editImage = findViewById(R.id.chooseImage1);
        imageRequester.setImageFromUrl(editImage,"https://i.pinimg.com/originals/1c/ba/1e/1cba1e5e40356f6edb0235c8a09a07d5.jpg");



//        l_1=findViewById(R.id.llh_1);
//        l_2=findViewById(R.id.llh_2);
//        l_3=findViewById(R.id.llh_3);
//        l_1.setBackground(getResources().getDrawable(R.drawable.llh1));
//        l_2.setBackground(getResources().getDrawable(R.drawable.llh2));
//        l_3.setBackground(getResources().getDrawable(R.drawable.llh3));
    }
}