package pam.pamhc2crops.datagen.common.tags;

import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import pam.pamhc2crops.Pamhc2crops;

import java.util.ArrayList;
import java.util.List;

import static net.minecraftforge.versions.forge.ForgeVersion.MOD_ID;

public abstract class ModTags {
    private List<Pair<TagKey<Item>, Item>> pairList;
    private String folder;
    private TagKey<Item> folderKey;

    public ModTags(String folder) {
        this.folder = folder;
        this.pairList = new ArrayList<>();
        this.folderKey = TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(MOD_ID, folder));
    }

    public void createTagWithItem(Item item){
        pairList.add(new Pair<>(ItemTags.create(new ResourceLocation(MOD_ID, this.folder + "/" + getTagName(item.getRegistryName().getPath()))), item));
    }

    public void createTagWithItem(String tag, Item item){
        pairList.add(new Pair<>(ItemTags.create(new ResourceLocation(MOD_ID, this.folder + "/" + tag)), item));
    }

    public void createTagSeedWithItem(Item item){
        pairList.add(new Pair<>(ItemTags.create(new ResourceLocation(MOD_ID, this.folder + "/" + getSeedTagName(item.getRegistryName().getPath()))), item));
    }

    public List<Pair<TagKey<Item>, Item>> getPairList() {
        return pairList;
    }

    public String getFolder() {
        return folder;
    }

    public TagKey<Item> getFolderKey() {
        return folderKey;
    }

    private String getTagName(String name){
        if(name.contains("item")){
            return name.substring(0, name.length() - 4);
        }
        return name;
    }

    private String getSeedTagName(String name){
        if(name.contains("item")){
            name = name.replaceAll("seed", "");
            return name.substring(0, name.length() - 4);
        }
        return name;
    }
}
