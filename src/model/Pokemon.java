package model;

public abstract class Pokemon {
    protected int numberPokeDex;
    protected String name;
    protected double weight;
    protected String gender;
    protected int season;
    //methods
    protected abstract void attackTackle();
    protected abstract void attackScratch();
    protected abstract void attackBite();
}
