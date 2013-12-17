package mu.world.world;

import mu.world.MuWorld;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenMuOcean extends BiomeGenBase {

	public BiomeGenMuOcean(int id) {
		super(id);
		
		this.topBlock = (byte)MuWorld.blockMuDirt.blockID;
		this.fillerBlock = (byte)MuWorld.blockMuDirt.blockID;
	}

}
