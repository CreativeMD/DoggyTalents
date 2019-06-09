package doggytalents;

import doggytalents.inventory.container.ContainerFoodBowl;
import doggytalents.inventory.container.ContainerPackPuppy;
import doggytalents.inventory.container.ContainerTreatBag;
import doggytalents.lib.GuiNames;
import doggytalents.lib.Reference;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(Reference.MOD_ID)
public class ModContainerTypes {
	
	public static final ContainerType<ContainerFoodBowl> FOOD_BOWL = null;
	public static final ContainerType<ContainerPackPuppy> PACK_PUPPY = null;
	public static final ContainerType<ContainerTreatBag> TREAT_BAG = null;
	
	@Mod.EventBusSubscriber(modid = Reference.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Registration {
	    
	    @SubscribeEvent
	    public static void registerContainers(final RegistryEvent.Register<ContainerType<?>> event) {
	    	IForgeRegistry<ContainerType<?>> containerRegistry = event.getRegistry();
	    	
	    	DoggyTalentsMod.LOGGER.info("Registering Containers");
	        containerRegistry.register(new ContainerType<ContainerFoodBowl>(ContainerFoodBowl::new).setRegistryName(GuiNames.FOOD_BOWL));
	        containerRegistry.register(new ContainerType<ContainerPackPuppy>(ContainerPackPuppy::new).setRegistryName(GuiNames.PACK_PUPPY));
	        containerRegistry.register(new ContainerType<ContainerTreatBag>(ContainerTreatBag::new).setRegistryName(GuiNames.TREAT_BAG));
	        DoggyTalentsMod.LOGGER.info("Finished Registering Containers");
	    }
    }
}