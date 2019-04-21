package com.example.myapplication;

public class Tom {

    //角色名称
    String name = "汤姆";

    //血量
    int hp = 100;

    //防御力
    int def = 5;

    //攻击力
    int atk = 9;

    //技能：提升能力
    void powerUP(){
        atk = atk * 2; //攻击力 = 现在的攻击力x2
    }
}
