package com.megathirio.shinsei;

import com.megathirio.shinsei.core.CommonProxy;
import com.megathirio.shinsei.ref.Ref;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Ref.MOD_ID, name = Ref.MOD_NAME, version = Ref.VERSION)
public class Main {

    @Instance
    public static Main instance = new Main();

    @SidedProxy(clientSide = Ref.CLIENT_PROXY, serverSide = Ref.SERVER_PROXY)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent e){
        this.proxy.preInit(e);
    }

    @EventHandler
    public void init(FMLInitializationEvent e){
        this.proxy.init(e);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e){
        this.proxy.postInit(e);
    }
}