package coolmod;

import arc.graphics.*;
import mindustry.type.*;

public class CoolItems{
    public static Item
        coolium;
    
    public static void load(){
        coolium = new Item("coolium", Color.valueOf("72CABD")){
            cost = 1.6f;
        }
    };
}