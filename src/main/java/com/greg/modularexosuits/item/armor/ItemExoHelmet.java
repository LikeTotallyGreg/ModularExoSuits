/*
 * Copyright (c) Barteks2x and LikeTotallyGreg, 2014
 * https://github.com/LikeTotallyGreg/ModularExoSuits
 *
 * This mod is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * https://github.com/LikeTotallyGreg/ModularExoSuits/blob/master/LICENCE.txt
 */

package com.greg.modularexosuits.item.armor;

import com.greg.modularexosuits.util.ArmorType;

public class ItemExoHelmet extends ItemMESArmor {
    public ItemExoHelmet(){
        super(ExoArmorMaterial.EXO, ArmorType.HELMET);
    }

    @Override
    public String getName() {
        return "exoHelmet";
    }
    public String getTextureName(){
        return "exoarmor";
    }
}
