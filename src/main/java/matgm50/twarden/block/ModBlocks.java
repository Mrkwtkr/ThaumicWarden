package matgm50.twarden.block;

import cpw.mods.fml.common.registry.GameRegistry;
import matgm50.twarden.lib.BlockLib;
import net.minecraft.block.Block;

/**
 * Created by MasterAbdoTGM50 on 5/22/2014.
 */

public class ModBlocks {

    public static Block blockExubitura;
    public static Block blockInfusedQuartzNormal;
    public static Block blockInfusedQuartzSlab;
    public static Block blockInfusedQuartzStair;
    public static Block blockInfusedQuartzChiseled;
    public static Block blockInfusedQuartzPillar;

    public static void init() {

        blockExubitura = new BlockExubitura();
        blockInfusedQuartzNormal = new BlockQuartzNormal();
        blockInfusedQuartzChiseled = new BlockQuartzChiseled();
        blockInfusedQuartzPillar = new BlockQuartzPillar();
        blockInfusedQuartzSlab = new BlockQuartzSlab();
        blockInfusedQuartzStair = new BlockQuartzStair();

        GameRegistry.registerBlock(blockExubitura, BlockLib.EXUBITURA_NAME);
        GameRegistry.registerBlock(blockInfusedQuartzNormal, BlockLib.QUARTZ_NORMAL_NAME);
        GameRegistry.registerBlock(blockInfusedQuartzChiseled, BlockLib.QUARTZ_CHISELED_NAME);
        GameRegistry.registerBlock(blockInfusedQuartzPillar, BlockLib.QUARTZ_PILLAR_NAME);
        GameRegistry.registerBlock(blockInfusedQuartzSlab, BlockLib.QUARTZ_SLAB_NAME);
        GameRegistry.registerBlock(blockInfusedQuartzStair, BlockLib.QUARTZ_STAIR_NAME);

    }

}
