package coolmod;

import arc.*;
import arc.graphics.*;
import arc.math.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.entities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.part.DrawPart.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.entities.effect.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.ui.*;
import mindustry.world.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.production.*;
import mindustry.world.consumers.*;

public class CoolBlocks {
    public static Block
    //crafting
    cooliumCollider;
    public static void load(){
        cooliumCollider = new GenericCrafter("coolium-collider"){{
            requirements(Category.crafting, with(Items.lead, 35, Items.thorium, 10));
            health = 200;
            itemCapacity = 10;
            craftEffect = Fx.ventSteam;
            craftTime = 360f;
            outputItem = new ItemStack(CoolItems.coolium, 1);
            consumePower(4f);
            consumeItems(new ItemStack(Items.surgeAlloy, 1));
            consumeLiquid(Liquids.cryofluid, 0.3f);
        }};
    }
}