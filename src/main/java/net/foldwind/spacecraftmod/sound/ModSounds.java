package net.foldwind.spacecraftmod.sound;

import net.foldwind.spacecraftmod.SpaceCraftMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.JukeboxSong;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, SpaceCraftMod.MOD_ID);
    public static final RegistryObject<SoundEvent> INTERSTELLAR = registerSoundEvent("interstellar");
    public static final ResourceKey<JukeboxSong> INTERSTELLAR_KEY = ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(SpaceCraftMod.MOD_ID, "interstellar"));
    public static final RegistryObject<SoundEvent> INTERSTELLAR_PIANO = registerSoundEvent("interstellar_piano");
    public static final ResourceKey<JukeboxSong> INTERSTELLAR_PIANO_KEY = ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(SpaceCraftMod.MOD_ID, "interstellar_piano"));
    public static final RegistryObject<SoundEvent> LANDS_UNKNOWN = registerSoundEvent("lands_unknown");
    public static final ResourceKey<JukeboxSong> LANDS_UNKNOWN_KEY = ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(SpaceCraftMod.MOD_ID, "lands_unknown"));
    public static final RegistryObject<SoundEvent> SHOOTING_STARS_INSTRUMENTAL = registerSoundEvent("shooting_stars_instrumental");
    public static final ResourceKey<JukeboxSong> SHOOTING_STARS_INSTRUMENTAL_KEY = ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(SpaceCraftMod.MOD_ID, "shooting_stars_instrumental"));
    private static RegistryObject<SoundEvent> registerSoundEvent(String name){
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(SpaceCraftMod.MOD_ID, name)));
    }
    public static void register(IEventBus eventBus){
        SOUND_EVENTS.register(eventBus);
    }
}
