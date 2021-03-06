/*
 * Copyright (c) Barteks2x and LikeTotallyGreg, 2014
 * https://github.com/LikeTotallyGreg/ModularExoSuits
 *
 * This mod is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * https://github.com/LikeTotallyGreg/ModularExoSuits/blob/master/LICENCE.txt
 */

package com.greg.modularexosuits.item;

import com.greg.modularexosuits.item.armor.*;

public class MESItems {
    public static final ItemMESBase titaniumIngot = new ItemTitaniumIngot();
    public static final ItemMESBase titaniumNugget = new ItemTitaniumNugget();
    public static final ItemMESBase titaniumPlate = new ItemTitaniumPlate();

    public static final ItemMESBase deuterium = new ItemDeuterium();
    public static final ItemMESBase tritium = new ItemTritium();

    public static final ItemMESBase nickelDust = new ItemNickelDust();
    public static final ItemMESBase lithiumDust = new ItemLithiumDust();

    public static final ItemMESBase nitinolIngot = new ItemNitinolIngot();

    public static final ItemMESBase vacuumChamber = new ItemVacuumChamber();
    public static final ItemMESBase vacuumInductionSmelterCore = new VacuumInductionSmelterCore();

    public static final ItemMESBase valve = new ItemValve();
    public static final ItemMESBase pressureRegulator = new ItemPressureRegulator();
    public static final ItemMESBase vacuumPump = new ItemVacuumPump();

    public static final ItemMESBase controlCircuit = new ItemControlCircuit();
    public static final ItemMESBase iccs = new ItemICCS();
    public static final ItemMESBase fusionReactorInert = new ModuleFusionReactorInert();
    public static final ItemMESBase fusionReactorActive = new ModuleFusionReactorActive();
    public static final ItemMESBase titaniumPlating = new ModuleTitaniumPlating();
    public static final ItemMESBase ionThruster = new ModuleIonThruster();
    public static final ItemMESBase servo = new ModuleServo();
    public static final ItemMESBase pulseHeatGenerator = new ModulePulseHeatGenerator();
    public static final ItemMESBase forceFeildGenerator = new ModuleForceFeildGenerator();
    public static final ItemMESBase shockAbsorber = new ModuleShockAbsorber();
    public static final ItemMESBase autoFeeder = new ModuleAutoFeeder();

    public static final ItemMESArmor exoHelmet = new ItemExoHelmet();
    public static final ItemMESArmor exoChestplate = new ItemExoChestplate();
    public static final ItemMESArmor exoLeggings = new ItemExoLeggings();
    public static final ItemMESArmor exoBoots = new ItemExoBoots();

    public static final PrivateMESItem poke = new ItemPoke();

    public static void init(){
        titaniumIngot.register();
        titaniumNugget.register();
        titaniumPlate.register();

        deuterium.register();
        tritium.register();

        nickelDust.register();
        lithiumDust.register();

        nitinolIngot.register();

        exoHelmet.register();
        exoChestplate.register();
        exoLeggings.register();
        exoBoots.register();

        vacuumChamber.register();
        vacuumInductionSmelterCore.register();

        valve.register();
        pressureRegulator.register();
        vacuumPump.register();

        controlCircuit.register();
        iccs.register();
        fusionReactorInert.register();
        fusionReactorActive.register();
        titaniumPlating.register();
        ionThruster.register();
        servo.register();
        pulseHeatGenerator.register();
        forceFeildGenerator.register();
        shockAbsorber.register();
        autoFeeder.register();


        poke.register();
    }
}
