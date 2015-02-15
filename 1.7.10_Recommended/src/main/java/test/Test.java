package test;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import test.lib.Constants;

/**
 * Created by Matthias on 2015/02/15.
 */
@Mod(modid = Constants.MOD_ID, name = Constants.MOD_NAME, version = Constants.VERSION)
public class Test {
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

    }

    @Mod.EventHandler
    public void init(FMLPreInitializationEvent event){

    }

    // For addons to other mods
    @Mod.EventHandler
    public void postInit(FMLPreInitializationEvent event){

    }
}
