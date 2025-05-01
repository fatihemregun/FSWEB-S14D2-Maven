package org.example.model;

public class Room{
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Lamp lamp;
    private Carpet carpet;

    public Room(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Lamp lamp, Carpet carpet){
        name = this.name;
        wall1 = this.wall1;
        wall2 = this.wall2;
        wall3 = this.wall3;
        wall4 = this.wall4;
        ceiling = this.ceiling;
        lamp = this.lamp;
        carpet = this.carpet;
    }

    public String getName(){
        return name;
    }

    public Wall getWall1(){
        return wall1;
    }

    public Wall getWall2(){
        return wall2;
    }

    public Wall getWall3(){
        return wall3;
    }

    public Wall getWall4(){
        return wall4;
    }

    public Ceiling getCeiling(){
        return ceiling;
    }

    public Lamp getLamp(){
        return lamp;
    }


    public Carpet getCarpet(){
        return carpet;
    }



}

