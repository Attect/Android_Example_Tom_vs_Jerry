package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView screenText = findViewById(R.id.text);

        Tom tom = new Tom();
        Jerry jerry = new Jerry();

        //暂存输出信息的字符串
        String output = "";

        //整理在场角信息
        output = "在场角色:" + tom.name + " 和 " + jerry.name + "\n";

        //Tom使用技能
        output = output + tom.name + "使用了技能\n";
        tom.powerUP();

        //Jerry使用技能
        output = output + jerry.name + "使用了技能\n";
        jerry.useItem();

        //Tom攻击Jerry
        output = output + tom.name+" 攻击了 " + jerry.name + "\n";
        jerry.hp = jerry.hp - (tom.atk - jerry.def);

        //输出Jerry的血量
        output = output + (jerry.name + "的血量:" + jerry.hp) + "\n";

        //Jerry开始反击Tom
        output = output + jerry.name + " 攻击了 " +tom.name + "\n";
        tom.hp = tom.hp - (jerry.atk - tom.def);

        //输出Tom的血量
        output = output + (tom.name + "的血量:" + tom.hp);

        //输出信息
        screenText.setText(output);
    }
}
