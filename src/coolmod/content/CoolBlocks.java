package coolmod;

import arc.graphics.*;
import arc.math.*;
import arc.struct.*;
import mindustry.*;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.DrawPart.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.unit.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.campaign.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.heat.*;
import mindustry.world.blocks.legacy.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.sandbox.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.units.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;

import static mindustry.Vars.*;
import static mindustry.type.ItemStack.*;

public class CoolBlocks {
    public static Block
    //crafting
    cooliumCollider,
    //defense
    cooliumWall, cooliumWallLarge;
    public static void load(){
        
        cooliumCollider = new GenericCrafter("coolium-collider"){{
            requirements(Category.crafting, with(Items.thorium, 60, Items.lead, 40, Items.silicon, 30, Items.phaseFabric, 15));
            itemCapacity = 10;
            craftEffect = Fx.formSmoke;
            updateEffect = Fx.ventSteam;
            craftTime = 360f;
            outputItem = new ItemStack(CoolItems.coolium, 1);
            consumePower(4f);
            consumeItems(new ItemStack(Items.surgeAlloy, 1));
            consumeLiquid(Liquids.cryofluid, 0.3f);
            envDisabled |= Env.scorching;
        }};

        cooliumWall = new Wall("coolium-wall"){{
            requirements(Category.defense, new ItemStack(CoolItems.coolium, 6));
            health = 250 * wallHealthMultiplier;
            armor = 20f;
            envDisabled |= Env.scorching;
        }};

        cooliumWallLarge = new Wall("coolium-wall-large"){{
            requirements(Category.defense, new ItemStack(CoolItems.coolium, 24));
            health = 250 * 4 * wallHealthMultiplier;
            armor = 20f;
            size = 2;
            envDisabled |= Env.scorching;
        }};
    }
}
