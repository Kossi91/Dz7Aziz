package com.company;

public class Main {
    public static void main(String[] args) {
        Magic mag = new Magic();
        mag.setHp(200);
        mag.setDamage(20);
        mag.setTypSuperSkill(mag.appleSuperAbility("Magiuy"));

        Medic medic = new Medic();
        medic.setHp(250);
        medic.setDamage(0);
        medic.setTypSuperSkill( medic.appleSuperAbility("Lechenie"));


        Warrior voin = new Warrior();
        voin.setHp(300);
        voin.setDamage(15);
        voin.setTypSuperSkill(voin.appleSuperAbility("Kriticheskiy udar"));


        Hero[] hero = {mag, medic, voin,};
        for (int i = 0; i < hero.length; i++) {
            System.out.println(hero[i].getTypSuperSkill());


        }

    }
}
