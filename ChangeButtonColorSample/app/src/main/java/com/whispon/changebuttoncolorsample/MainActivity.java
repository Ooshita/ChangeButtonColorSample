package com.whispon.changebuttoncolorsample;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        colorChangeButton(button,"sample_blue");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorChangeButton(button,"sample_red");
            }
        });
        //colorChangebutton(button,"sample_red"); Case of red color.
    }



    private void colorChangeButton(final Button buttonId,final String color) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    buttonId.setBackground(ResourcesCompat.getDrawable(getResources(), getResources().getIdentifier(color,"drawable",getPackageName()), null));
                }catch (NumberFormatException e) {
                    e.printStackTrace();
                }catch (Resources.NotFoundException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.run();
    }
}

