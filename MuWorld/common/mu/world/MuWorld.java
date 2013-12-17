package mu.world;

import mu.world.lib.Reference;
import mu.world.proxy.CommonProxy;
import mu.world.world.BiomeGenMuOcean;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

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
	public static CommonProxy proxy;
	
	public static Block blockMuDirt;
	
	public static BiomeGenBase biomeMuOcean;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent evt)
	{
		//Blocks and Items
		blockMuDirt = new Block(199, Material.ground).setTextureName("mw:dirt").setUnlocalizedName("blockMuDirt").setCreativeTab(CreativeTabs.tabBlock).setHardness(0.5F).setStepSound(Block.soundGravelFootstep);
		
		//Other Stuff
		biomeMuOcean = new BiomeGenMuOcean(255).setBiomeName("Mu Ocean").setDisableRain().setMinMaxHeight(-1F, 0F);
		
		GameRegistry.registerBlock(blockMuDirt, "blockMuDirt");
		
		LanguageRegistry.addName(blockMuDirt, "Mu Dirt");
		
		GameRegistry.addBiome(biomeMuOcean);
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
