package extendedrenderer;

import extendedrenderer.render.FoliageRenderer;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.FMLClientHandler;
import extendedrenderer.render.RotatingParticleManager;

@OnlyIn(Dist.CLIENT)
public class ClientProxy extends CommonProxy
{
    public static Minecraft mc;

    public ClientProxy()
    {
        mc = FMLClientHandler.instance().getClient();
    }
    
    @Override
    public void preInit()
    {
    	super.preInit();
    }
    
    @Override
    public void postInit()
    {
    	super.postInit();
    	ExtendedRenderer.rotEffRenderer = new RotatingParticleManager(mc.world, mc.textureManager);
        ExtendedRenderer.foliageRenderer = new FoliageRenderer(mc.textureManager);
    }

    @Override
    public void init()
    {
        super.init();
        
        //rr.registerEntityRenderingHandler(StormCluster.class, new RenderNull());
        //rr.registerEntityRenderingHandler(EntityFallingRainFX.class, new RenderNull());
        //rr.registerEntityRenderingHandler(EntityWaterfallFX.class, new RenderNull());
        //rr.registerEntityRenderingHandler(EntitySnowFX.class, new RenderNull());
    }
    
}
