package com.example.myapplication;

public class Jerry {
    //角色名称
    String name = "杰瑞";

    //血量
    int hp = 20;

    //防御力
    int def = 1;

    //攻击力
    int atk = 15;

    //技能：使用道具
    void useItem(){
        def = def * 100; //防御力 = 现在的防御力 *100
    }
}
