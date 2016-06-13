package com.whispon.changebuttoncolorsample;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        button = (Button) findViewById(R.id.button);
        //青い円を指定する。
        colorChangeButton(button,"sample_blue");
        //Buttonの独自クラスのMyButtonのコンストラクタを宣言
        final ChangeColorButton myButton = new ChangeColorButton(context);

        //クリックしたら赤になるようにする
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**
                 * 引数の説明
                 * Button button,R,G,B
                 */
                myButton.buttonColorChange(button,255,0,0);
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

