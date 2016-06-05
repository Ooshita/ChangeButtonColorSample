package com.whispon.changebuttoncolorsample;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        colorChangeButton("sample_blue");
        //colorChangebutton("sample_red"); Case of red color.
    }



    private void colorChangeButton(final String color) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    button.setBackground(ResourcesCompat.getDrawable(getResources(), getResources().getIdentifier(color,"drawable",getPackageName()), null));
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

