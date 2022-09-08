package com.company;

public abstract class Hero implements HavingSuperAbility{
   private int hp;
   private int damage;
   private String typSuperSkill;

   public int getHp() {
      return hp;
   }

   public void setHp(int hp) {
      this.hp = hp;
   }

   public int getDamage() {
      return damage;
   }

   public void setDamage(int damage) {
      this.damage = damage;
   }

   public String getTypSuperSkill() {
      return typSuperSkill;
   }

   public void setTypSuperSkill(String typSuperSkill) {
      this.typSuperSkill = typSuperSkill;
   }
}
