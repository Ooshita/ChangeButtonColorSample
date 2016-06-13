package com.whispon.changebuttoncolorsample;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuffColorFilter;
import android.widget.Button;


/**
 * Created by noriakioshita on 2016/06/13.
 * Buttonのレイアウトをxmlで指定した場合、色を変えることができない
 * だがそれは不便なので、色を変えるためのButtonの独自クラスを作成したs
 */
public class ChangeColorButton extends Button {
    public ChangeColorButton(Context context) {
        super(context);
        //背景色の設定
        //デフォルトではグレイにしとく
        setBackgroundColor(Color.GRAY);
    }

    /**
     *
     * @param button ボタンのコンストラクタを指定
     * @param colorR RGB要素のRを指定
     * @param colorG RGB要素のGを指定
     * @param colorB RGB要素のBを指     */
    public void buttonColorChange(Button button,int colorR,int colorG,int colorB){
        button.getBackground().setColorFilter(new PorterDuffColorFilter(Color.rgb(colorR,colorG,colorB),android.graphics.PorterDuff.Mode.SRC_ATOP));
    }

}
