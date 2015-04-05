package com.jaquadro.minecraft.gardenapi.api;

import com.jaquadro.minecraft.gardenapi.api.component.ILanternSourceRegistry;
import com.jaquadro.minecraft.gardenapi.api.plant.IPlantRegistry;
import com.jaquadro.minecraft.gardenapi.api.plant.ISaplingRegistry;
import com.jaquadro.minecraft.gardenapi.api.plant.IWoodRegistry;

public interface IRegistryContainer
{
    IPlantRegistry plants ();

    ISaplingRegistry saplings ();

    IWoodRegistry wood ();

    ILanternSourceRegistry lanternSources ();
}