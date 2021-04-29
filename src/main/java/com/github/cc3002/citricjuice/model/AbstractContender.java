package com.github.cc3002.citricjuice.model;


import java.util.Random;

public abstract class AbstractContender {
  private String name;
  private final int maxHP;
  private final int atk;
  private final int def;
  private final int evd;
  private int stars;
  private int win;
  private int variable;


  public AbstractContender(final String name, int hp, final int atk, final int def, final int evd) {
    this.name = name;
    this.maxHP = hp;
    this.atk = atk;
    this.def = def;
    this.evd = evd;
    this.stars = 0;
    this.win = 0;
    this.variable = 0;
  }

  public String getName() {
    return name;
  }
  public int getMaxHP() {
    return maxHP;
  }
  public int getAtk() {
    return atk;
  }
  public int getDef() {
    return def;
  }
  public int getEvd() {
    return evd;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AbstractContender that = (AbstractContender) o;
    return maxHP == that.maxHP &&
            atk == that.atk &&
            def == that.def &&
            evd == that.evd &&
            stars == that.stars &&
            name.equals(that.name);
  }


}
