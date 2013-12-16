package mu.world;

import mu.world.lib.Reference;
import mu.world.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

/**
 * 
 * @author Mu
 * 
 * @License Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class MuWorld
{

	@Instance
	public static MuWorld instance;
	
	@SidedProxy(clientSide = "mu.world.proxy.ClientProxy", serverSide = "mu.world.proxy.CommonProxy")
	public CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent evt)
	{
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent evt)
	{
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent evt)
	{
		
	}
	
}
