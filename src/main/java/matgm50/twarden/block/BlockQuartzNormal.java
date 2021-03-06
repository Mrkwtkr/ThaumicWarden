package matgm50.twarden.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import matgm50.twarden.TWarden;
import matgm50.twarden.lib.BlockLib;
import matgm50.twarden.lib.ModLib;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

/**
 * Created by MasterAbdoTGM50 on 5/22/2014.
 */

public class BlockQuartzNormal extends Block {

    public IIcon topIcon;
    public IIcon botIcon;
    public IIcon sideIcon;

    protected BlockQuartzNormal() {

        super(Material.rock);
        setBlockName(BlockLib.QUARTZ_NORMAL_NAME);
        setCreativeTab(TWarden.tabTWarden);
        setStepSound(Block.soundTypeStone);
        setHardness(0.8F);

    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister register) {

        topIcon = register.registerIcon(ModLib.ID.toLowerCase() + ":" + "infusedquartztop" );
        botIcon = register.registerIcon(ModLib.ID.toLowerCase() + ":" + "infusedquartzbot" );
        sideIcon = register.registerIcon(ModLib.ID.toLowerCase() + ":" + "infusedquartzside" );

    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {

        if(side == 0) {

            return botIcon;

        } else if(side == 1) {

            return topIcon;

        } else {

            return sideIcon;

        }

    }

}
