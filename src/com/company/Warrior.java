package com.company;

public class Warrior extends Hero{
    @Override
    public void applySuperAbility(String superAbilityType) {
        super.applySuperAbility("Physical");
        System.out.println("Warrior применил суперспособность CRITICAL DAMAGE");

    }
}