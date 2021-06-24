package com.company;

public class Main {

    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        warrior.applySuperAbility("Physical");
        Medic medic = new Medic();
        medic.applySuperAbility("Medical");
        Magic magic = new Magic();
        magic.applySuperAbility("Magically");
    }
}