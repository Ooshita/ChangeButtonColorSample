# ChangeButtonColorSample
Buttonの色と形を別のメソッドから動的に変えるサンプルです。
---------------------------

サンプルではButtonのレイアウトをoval（楕円）の青色に設定しています。
通常では色を変えたい場合には同じ形の違う色のxmlを作らなければなりません。
ですが、それは非常に不細工な方法です。
したがてButtonの独自クラスを作って、xmlで形と色をしていた後に形を維持したまま色を変えるプログラムを作成しました。

<img src="http://i.imgur.com/OaQdBVo.jpg" width="450px" height="680px" />

Buttonをクリックすると青から赤にボタンの色が変わります。

<img src="http://i.imgur.com/qel2IL3.jpg" width="450px" height="680px" />



使いかた
--------

ChangeColorButton myButton = new ChangeColorButton(context);  
//Buttonのコストトラクタ,R、G、Bを指定  
myButton.buttonColorChange(button,255,0,0);  

という文法で簡単に色を変えることができます。
