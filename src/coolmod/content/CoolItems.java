package coolmod.content;

import arc.graphics.*;
import mindustry.type.*;

public class CoolItems{
    public static Item
        coolium;
    
    public static void load(){
        coolium = new Item("coolium", Color.valueOf("5FADA2")){{
            cost = 1.6f;
            hardness = 5;
        }};
    };
}