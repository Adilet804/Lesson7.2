package com.company;

public class Magic extends Hero{
    @Override
    public void applySuperAbility(String superAbilityType) {
        super.applySuperAbility("Magically");
        System.out.println("Magic применил суперспособность CRITICAL DAMAGE");
    }
}