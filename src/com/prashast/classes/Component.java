
package com.prashast.classes;

public class Component {
    public void playMusic(){
        System.out.println("Playing Music");
    }

    public String getPen(int cost){
        if (cost >= 10)
            return "Pen";
        else
            return "Nothing";
    }
}
