package com.company;

public class Medic extends Hero{
    @Override
    public void applySuperAbility(String superAbilityType) {
    super.applySuperAbility("Magical");
        System.out.println("Medic применил суперспособность CRITICAL DAMAGE");
    }
}