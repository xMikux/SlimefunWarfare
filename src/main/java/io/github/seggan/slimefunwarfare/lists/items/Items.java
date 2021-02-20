package io.github.seggan.slimefunwarfare.lists.items;

import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.utils.HeadTexture;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;

public final class Items {

    private Items() {}

    public static final SlimefunItemStack SLIMESTEEL = new SlimefunItemStack(
        "SLIMESTEEL_INGOT",
        Material.IRON_INGOT,
        "&a黏液鋼錠",
        "",
        "堅硬但有彈性,這種合金",
        "非常適合各種應用"
    );

    public static final SlimefunItemStack REINFORCED_SLIMESTEEL = new SlimefunItemStack(
        "REINFORCED_SLIMESTEEL_INGOT",
        Material.IRON_INGOT,
        "&a強化黏液鋼錠",
        "",
        "堅硬但有彈性,這種合金",
        "非常適合各種應用"
    );

    public static final SlimefunItemStack SCOPE = new SlimefunItemStack(
        "SCOPE",
        Material.STICK,
        "&a瞄準鏡"
    );

    public static final SlimefunItemStack BARREL = new SlimefunItemStack(
        "BARREL",
        Material.STICK,
        "&7槍管"
    );

    public static final SlimefunItemStack ADVANCED_BARREL = new SlimefunItemStack(
        "ADVANCED_BARREL",
        Material.STICK,
        "&7進階槍管"
    );

    public static final SlimefunItemStack BULLET_PRESS = new SlimefunItemStack(
        "BULLET_PRESS",
        Material.SMOKER,
        "&7子彈製造機",
        "",
        LoreBuilder.powerPerSecond(16),
        LoreBuilder.powerBuffer(32),
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE)
    );

    public static final SlimefunItemStack AIR_LIQUEFIER = new SlimefunItemStack(
        "AIR_LIQUEFIER",
        Material.BEACON,
        "&b空氣液化器",
        "",
        LoreBuilder.powerPerSecond(64),
        LoreBuilder.powerBuffer(128),
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE)
    );

    public static final SlimefunItemStack EXPLOSIVE_SYNTHESIZER = new SlimefunItemStack(
        "EXPLOSIVE_SYNTHESIZER",
        Material.TNT,
        "&4爆炸物合成器",
        "",
        LoreBuilder.powerPerSecond(64),
        LoreBuilder.powerBuffer(128),
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE)
    );

    public static final SlimefunItemStack BOOMINATOR_9000 = new SlimefunItemStack(
        "BOOMINATOR_9000",
        Material.SMITHING_TABLE,
        "&4Boominator 9000",
        "",
        "&7用於處理核彈的鈾",
        LoreBuilder.powerPerSecond(1024),
        LoreBuilder.powerBuffer(2048),
        LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE)
    );

    public static final SlimefunItemStack IRON_BULLET = new SlimefunItemStack(
        "IRON_BULLET",
        Material.IRON_NUGGET,
        "&7鐵子彈",
        "",
        "&7x0.75傷害"
    );

    public static final SlimefunItemStack LEAD_BULLET = new SlimefunItemStack(
        "LEAD_BULLET",
        Material.IRON_NUGGET,
        "&7鉛彈",
        "",
        "&7x1傷害"
    );

    public static final SlimefunItemStack DU_BULLET = new SlimefunItemStack(
        "DU_BULLET",
        Material.IRON_NUGGET,
        "&a鈾子彈",
        "",
        "&7使命中生物時著火",
        "&7x1.5傷害"
    );

    public static final SlimefunItemStack GOLD_BULLET = new SlimefunItemStack(
        "GOLD_BULLET",
        Material.GOLD_NUGGET,
        "&6黃金子彈",
        "",
        "&7x2傷害"
    );

    public static final SlimefunItemStack TRINITROBULLETENE = new SlimefunItemStack(
        "TRINITROBULLETENE_BULLET",
        Material.GOLD_NUGGET,
        "&6三硝基丁烯",
        "",
        "&7使命中生物時著火",
        "&7x2.75傷害"
    );

    public static final SlimefunItemStack GUN_CASE = new SlimefunItemStack(
        "GUN_CASE",
        Material.CROSSBOW,
        "&7槍外殼",
        "",
        "&7所有槍的基礎"
    );

    public static final SlimefunItemStack OSMIUM_METEOR = new SlimefunItemStack(
        "OSMIUM_METEOR",
        Material.IRON_ORE,
        "&9鋨隕石",
        "",
        "&7稀有金屬的來源"
    );

    public static final SlimefunItemStack OSMIUM_DUST = new SlimefunItemStack(
        "OSMIUM_DUST",
        Material.SUGAR,
        "&9鋨粉",
        "",
        "&7劇毒. 不要吸入!"
    );

    public static final SlimefunItemStack OSMIUM_INGOT = new SlimefunItemStack(
        "OSMIUM_INGOT",
        Material.IRON_INGOT,
        "&9鋨錠",
        "",
        "&7一個僅在太空中發現的非常強的金屬"
    );

    public static final SlimefunItemStack OSMIUM_SUPERALLOY = new SlimefunItemStack(
        "OSMIUM_SUPERALLOY",
        Material.IRON_INGOT,
        "&9鋨超級合金",
        "",
        "&7最堅硬, 最堅韌, 最堅固的材料",
        "&7在 Minecraft種類"
    );

    public static final SlimefunItemStack SEGGANESSON_METEOR = new SlimefunItemStack(
        "SEGGANESSON_METEOR",
        Material.DIAMOND_ORE,
        "&7Segganesson 隕石",
        "",
        "&7稀有元素segganesson的來源"
    );

    public static final SlimefunItemStack SEGGANESSON = new SlimefunItemStack(
        "SEGGANESSON",
        Material.LIGHT_BLUE_DYE,
        "&bSegganesson",
        "",
        "&7一種非常有潛力為整個城市供電",
        "&7的稀有元素"
    );

    public static final SlimefunItemStack ENERGY_RECTIFIER = new SlimefunItemStack(
        "ENERGY_RECTIFIER",
        Material.POWERED_RAIL,
        "&b能量整流器",
        "",
        "&7將電能轉化成純能源"
    );
}