package com.imooc.object;

public class Pet {
    public String type;
    public String name;
    public int age;
    public float weight;

    public void eat(float foodWeight){
        System.out.println(this.type + "今天进食了" + foodWeight);
    };

    public static void main(String[] args){
        Pet duoduo = new Pet();
        duoduo.type = "猫";
        duoduo.age = 1;
        duoduo.weight = 2.1f;
        duoduo.eat(1.0f);

        System.out.println("多多今年" + duoduo.age + "岁了");

        Pet lucky = new Pet();
        lucky.type = "狗";
        lucky.age = 2;
        lucky.weight = 5.4f;
    }
}
