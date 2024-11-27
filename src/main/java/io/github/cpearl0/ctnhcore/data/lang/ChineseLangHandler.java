package io.github.cpearl0.ctnhcore.data.lang;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.machine.MultiblockMachineDefinition;
import com.gregtechceu.gtceu.common.data.GTMachines;
import io.github.cpearl0.ctnhcore.registry.*;
import net.minecraftforge.common.data.LanguageProvider;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Field;
import java.util.Map;

public class ChineseLangHandler {
    public static void init(RegistrateCNLangProvider provider) {
        replace(provider, CTNHTagPrefixes.oreHolystone.getUnlocalizedName(), "圣石%s矿石");
        replace(provider, CTNHTagPrefixes.oreMossyHolystone.getUnlocalizedName(), "覆苔圣石%s矿石");

        replace(provider, CTNHMaterials.Holystone.getUnlocalizedName(), "圣石");
        replace(provider, CTNHMaterials.Zanite.getUnlocalizedName(), "紫晶石");
        replace(provider, CTNHMaterials.Ambrosium.getUnlocalizedName(), "神能晶");
        replace(provider, CTNHMaterials.Skyjade.getUnlocalizedName(), "穹玉");
        replace(provider, CTNHMaterials.Stratus.getUnlocalizedName(), "云母钢");

        provider.add("gtceu.underfloor_heating_system", "地暖");
        provider.add("gtceu.astronomical_observatory", "天文台");
        provider.add("gtceu.photovoltaic_power", "光伏发电");
        provider.add("gtceu.slaughter_house", "屠宰场");
        provider.add("gtceu.big_dam", "三峡大坝");
        provider.add("gtceu.coke_oven", "焦化塔");
        provider.add("gtceu.demon_will_generator", "恶魔意志发电");
        provider.add("gtceu.meadow","牧场养殖");
        provider.add("gtceu.machine.parallel_hatch_mk9.tooltip", "允许同时处理至多1024个配方。") ;
        provider.add("gtceu.machine.parallel_hatch_mk10.tooltip", "允许同时处理至多4096个配方。");
        provider.add("gtceu.machine.parallel_hatch_mk11.tooltip", "允许同时处理至多16384个配方。");
        provider.add("gtceu.machine.parallel_hatch_mk12.tooltip", "允许同时处理至多65536个配方。");
        provider.add("gtceu.machine.parallel_hatch_mk13.tooltip", "允许同时处理至多262144个配方。");
        provider.add("gtceu.machine.parallel_hatch_mk14.tooltip", "允许同时处理至多1048576个配方。");
        provider.add("block.ctnhcore.luv_compressed_fusion_reactor", "压缩核聚变反应堆控制电脑 MK-I");
        provider.add("block.ctnhcore.zpm_compressed_fusion_reactor", "压缩核聚变反应堆控制电脑 MK-II");
        provider.add("block.ctnhcore.uv_compressed_fusion_reactor", "压缩核聚变反应堆控制电脑 MK-III");

        provider.add("gtceu.naq_mk1", "超能燃料");
        provider.add("gtceu.bedrock_drilling_rigs", "基岩钻机");
        provider.add("gtceu.plasma_condenser", "等离子冷凝");
        provider.add("gtceu.multiblock.laser.tooltip", "允许使用激光仓");
        provider.add("ctnh.multiblock.parallelize.tooltip", "线圈等级和电压等级的提升会提高并行数");
        provider.add("ctnh.multiblock.underfloor_heating_system.efficiency", "效率：%d");
        provider.add("ctnh.multiblock.underfloor_heating_system.rate", "速率：%s");
        provider.add("ctnh.multiblock.underfloor_heating_system.rate.tooltip", "减少蒸汽的消耗来降低地暖的发热功率");
        provider.add("ctnh.multiblock.underfloor_heating_system.rate_modify", "调节速率：");
        provider.add("ctnh.multiblock.underfloor_heating_system.steam_consumption", "蒸汽消耗速率：%d");
        provider.add("ctnh.multiblock.photovoltaic_power_station_invalid", "有方块阻挡");
        provider.add("ctnh.multiblock.photovoltaic_power_station_night", "光照过于微弱");
        provider.add("ctnh.multiblock.photovoltaic_power_station1", "发电效率：%s%%");
        provider.add("ctnh.multiblock.photovoltaic_power_station2", "产能功率：%s/%s EU/t");
        provider.add("info.ctnhcore.network_machine", "发电网络机器数：%d");
        provider.add("info.ctnhcore.network_machine_efficiency", "发电效率：%d");
        provider.add("ctnh.multiblock.slaughter_house.mobcount", "怪物种类：%d (%s)");
        provider.add("ctnh.stress_output", "产出应力：%ssu");
        provider.add("ctnh.stress_input", "输入应力：%ssu");
        provider.add("ctnh.fermenting_tank.growing_temperature", "生长温度：§2%d°C§r");
        provider.add("ctnh.fermenting_tank.growth_efficiency", "生长效率：%d%%");
        provider.add("ctnh.machine.eut_multiplier.tooltip", "耗能倍数：%s");
        provider.add("ctnh.machine.duration_multiplier.tooltip", "耗时倍数：%s");
        provider.add("ctnh.manaturbine.efficiency", "发电效率：%d%%");
        provider.add("ctnh.manaturbine.consumption_rate", "消耗倍率：%d");
        provider.add("ctnh.machine.chemical_plant.tooltip.0","线圈等级每高出白铜一级能耗与速度x5%");
        provider.add("ctnh.multiblock.naq_reactor_machine.boost_disallowed", "§b升级你的动力仓以激活等离子体加速");
        provider.add("ctnh.multiblock.naq_reactor_machine.oxygen_plasma_boosted","§b氧等离子体加速中");
        provider.add("ctnh.multiblock.naq_reactor_machine.supply_oxygen_plasma_to_boost","提供氧等离子体以加速");
        provider.add("ctnh.multiblock.naq_reactor_machine.iron_plasma_boosted","§b铁等离子体加速中");
        provider.add("ctnh.multiblock.naq_reactor_machine.supply_iron_plasma_to_boost","提供铁等离子体以加速");
        provider.add("ctnh.multiblock.naq_reactor_machine.nickel_plasma_boosted","§b镍等离子体加速中");
        provider.add("ctnh.multiblock.naq_reactor_machine.supply_nickel_plasma_to_boost","提供镍等离子体以加速");
        provider.add("ctnh.machine.naq_reactor_machine.tooltip.boost_mk1","提供§f20 mB/s§7的氧等离子体，并消耗§f四倍§7燃料以产生高达§f%s§7EU/t的功率。");
        provider.add("ctnh.machine.naq_reactor_machine.tooltip.boost_mk2","提供§f20 mB/s§7的铁等离子体，并消耗§f四倍§7燃料以产生高达§f%s§7EU/t的功率。");
        provider.add("ctnh.test_terminal.lack_error","在%s处缺少");
        provider.add("ctnh.test_terminal.wrong_error","在%s处应为");
        provider.add("ctnh.test_terminal.position","(%s,%s,%s)");
        provider.add("ctnh.test_terminal.error_info","(%s)");
        provider.add("ctnh.test_terminal.success","一切正常！");
        provider.add("ctnh.testing_terminal.tooltip.1","用于检测多方块搭建时产生的错误");
        provider.add("ctnh.testing_terminal.tooltip.2","右键多方块的主方块以显示错误信息");
        provider.add("ctnh.simple_nutritious_meal.tooltip.1","能维持机体基本的生理功能");
        provider.add("ctnh.plasma_condenser.tooltips.1", "氤氲之气，凝为霜露");
        provider.add("ctnh.sweat_shop.tooltips.1","生产资料与剩余价值");
        provider.add("ctnh.sweat_shop.tooltips.2","工厂内的村民数量决定了工作效率，配方耗时x(1/村民数量)");
        provider.add("ctnh.sweat_shop.tooltips.3","工厂内的有效员工数量受限于工厂大小，初始上限为4，工厂长度每增加4格上限+1");
        provider.add("ctnh.sweat_shop.tooltips.4","放入的生产资料(机器)决定了可以工作的配方：\n动力辊压机----卷板机配方\n动力搅拌机----搅拌机配方\n车床----车床配方\n离心机----离心机配方\n烈焰人燃烧室----提取机配方\n工作盆----流体成型配方\n粉碎轮----研磨机配方\n动力锯----线材轧机配方\n激光加工器----激光蚀刻配方\n==============================");
        provider.add("ctnh.sweat_shop.tooltips.5","放入的生产资料(机器)数量决定了对应工作配方的并行数：并行数 = sqrt(机器数)");
        provider.add("ctnh.sweat_shop.tooltips.6","放入机械手可以提高整体配方运行速度，配方耗时x (1/1 + sqrt(机械手数))");
        provider.add("ctnh.sweat_shop.tooltips.7","放入机器的多样性会提高配方运行速度");
        provider.add("ctnh.sweat_shop.tooltips.8","每5秒机器会消耗(员工数量)份简易员工餐");
        provider.add("ctnh.demon_will_generator.tooltips.1","借用恶魔之力");
        provider.add("ctnh.demon_will_generator.tooltips.2","利用机器两侧的区块内的恶魔意志浓度差发电，浓度差与发电量呈指数关系");
        provider.add("ctnh.demon_will_generator.tooltips.3","以机器两侧的恶魔合金方块处的意志浓度为基准进行计算");
        provider.add("ctnh.demon_will_generator.tooltips.4","两侧区块中的各种恶魔意志的多样性会影响发电效率");
        provider.add("ctnh.demon_will_generator.tooltips.5","机器内可以放入意志核心，将机器转化为对于某种意志专精的模式");
        provider.add("ctnh.demon_will_generator.tooltips.6","机器内的符文方块可替换，从而起到不同的增益效果:\n§4献祭符文和牺牲符文----提高生命源质强化模式的发电倍率§r\n§3速度符文----提升一次配方运行的时长（节省恶魔意志消耗）§r\n§e增容符文----每一个符文增加1点恶魔意志浓度差§r\n§c超容符文----每一个符文增加百分之5的恶魔意志浓度差（叠乘）§r\n==============================");
        provider.add("ctnh.demon_will_generator.tooltips.7","输入§4生命源质§r开启强化模式，发电量翻倍，每秒消耗§a100mb§r的生命源质");
        provider.add("ctnh.multiblock.sweat_shop.villager_count","员工数量：%s");
        provider.add("ctnh.multiblock.sweat_shop.basic_rate","基础效率：x%s");
        provider.add("ctnh.multiblock.demon_generator.info.default","专精强化：无");
        provider.add("ctnh.multiblock.demon_generator.info.vengeful","专精强化：复仇");
        provider.add("ctnh.multiblock.demon_generator.info.corrosive","专精强化：腐蚀");
        provider.add("ctnh.multiblock.demon_generator.info.steadfast","专精强化：坚韧");
        provider.add("ctnh.multiblock.demon_generator.info.destructive","专精强化：破坏");
        provider.add("ctnh.multiblock.demon_generator.info.1","浓度差异：%s");
        provider.add("ctnh.multiblock.demon_generator.info.boosted","§b生命源质强化中");
        provider.add("meadow", "自动化放牧");
        provider.add("ctnh.meadow.basic", "只能养鸡牛羊猪，牛会产生皮革，羊会产生羊毛，鸡会产生鸡蛋，猪会产生猪肉");
        provider.add("ctnh.meadow.mechanism", "牧场里每多一只动物，产生的排泄物数量就会提升，养的动物越多，产物越多");
        provider.add("ctnh.fermenting_tank.bio_growth_mechanism", "发酵罐的生物生长机制：");
        provider.add("ctnh.fermenting_tank.bio_growth_temperature", "当发酵罐温度处于§236§r至§238§r度之间时为最适生长温度，配方获得1.2倍效率，越偏离最适生长温度，配方效率越低，最低为三分之一");
        provider.add("ctnh.fermenting_tank.bio_growth", "微生物的生长符合逻辑斯蒂方程，当输入仓内液体体积为容量的一半时，§2生长效率达到两倍§r，而满仓和空仓时生长效率最低，保底为20%");
        provider.add("subtick_overclock", "当配方运行时间小于1t时,会自动计算并行");
        provider.add("fermenting_introduction", "一个专为微生物提供的生长罐，注意时刻关注他！");
        provider.add("large_fermenting_tank", "高效工业化发酵生产");
        provider.add("ctnh.large_fermenting_tank.bio_growth", "可接入附属结构，在对应位置连接上一个大发酵瓶后，可以根据发酵瓶中的液体种类提升保底效率：水(50%)，简易培养基(150%)，无菌培养基(200%)");
        provider.add("large_bottle", "真是一个大罐子");
        provider.add("ctnh.large_bottle.basic", "可以存储10000桶液体");
        provider.add("ctnh.large_bottle.consume", "与大型发酵罐一起使用时，其中的液体会以§e100mb/s§r的速度消耗");
        provider.add("digestion_tank_introduction", "其实产生的是很有价值的原料......");
        provider.add("ctnh.digestion_tank.bio_growth_mechanism", "化粪池堆肥机制：");
        provider.add("ctnh.digestion_tank.bio_growth_temperature", "当化粪池温度处于§236§r至§238§r度之间时为最适生长温度，配方获得1.2倍效率，越偏离最适生长温度，配方效率越低，最低为三分之一");
        provider.add("ctnh.blaze_blast_furnace.pyrotheum", "烈焰之炽焱：%d mB");
        provider.add("ctnh.blaze_blast_furnace.consume", "每秒基础消耗§a10mB§r烈焰之炽焱，电压每超过§6HV§r一级，消耗量变为原来的两倍");
        provider.add("ctnh.blaze_blast_furnace.energy", "运行耗能x0.75");
        provider.add("ctnh.blaze_blast_furnace.parallel", "允许一次性处理8个配方");
        provider.add("blaze_blast_furnace", "比电力高炉快");
        provider.add("mana_machine", "魔法，神奇吧");
        provider.add("ctnh.basic_mana_machine.mana_consume", "每秒基础消耗4mB液态魔力，电压每超过§7LV§r一级，消耗量变为原来的两倍");
        provider.add("ctnh.advanced_mana_machine.mana_consume", "每秒基础消耗10mB液态魔力，电压每超过§7LV§r一级，消耗量变为原来的两倍");
        provider.add("ctnh.mana_macerator", "机器类型：§e研磨机§r");
        provider.add("ctnh.mana_bender", "机器类型：§e卷板机§r");
        provider.add("ctnh.mana_lathe", "机器类型：§e车床§r");
        provider.add("ctnh.mana_assembler", "机器类型：§e组装机§r");
        provider.add("ctnh.mana_wiremill", "机器类型：§e线材轧机§r");
        provider.add("ctnh.perfect_overclock", "§a无损超频！§r");


        for (var tier : GTMachines.ALL_TIERS) {
            provider.add(CTNHMachines.CIRCUIT_BUS[tier].getBlock(), GTValues.VNF[tier] + " 芯片总线");
        }
        for (var tier : GTMachines.ELECTRIC_TIERS) {
            provider.add(CTNHMachines.PERSONAL_COMPUTER[tier].getBlock(), GTValues.VNF[tier] + " 个人计算机");
        }
        for (int tier = GTValues.UHV; tier <= GTValues.MAX; tier++){
            provider.add(CTNHMachines.PARALLEL_HATCH[tier].getBlock(),GTValues.VNF[tier] + " 并行控制仓");
        }

        provider.add(CTNHCreativeModeTabs.MACHINE.get(), "CTNH机器");
        provider.add(CTNHCreativeModeTabs.ITEM.get(), "CTNH物品");
        provider.add(CTNHCreativeModeTabs.BLOCK.get(), "CTNH方块");

        provider.addItem(CTNHItems.GREAT_ASTRONOMY_CIRCUIT_1, "完善的一阶航天数据芯片");
        provider.addItem(CTNHItems.ASTRONOMY_CIRCUIT_1, "一阶航天数据芯片");
        provider.addItem(CTNHItems.TESTING_TERMINAL, "检测终端");
        provider.addItem(CTNHItems.SIMPLE_NUTRITIOUS_MEAL, "简易营养餐");
        provider.addItem(CTNHItems.ANIMAL_EXCRETA, "动物排泄物");
        provider.addItem(CTNHItems.TUMOR, "肿瘤");
        provider.addBlock(CTNHBlocks.CASING_REFLECT_LIGHT, "反光机械方块");
        provider.addBlock(CTNHBlocks.CASING_TUNGSTENCU_DIAMOND_PLATING, "W-Cu覆膜金刚石机械方块");
        provider.addBlock(CTNHBlocks.ENERGETIC_PHOTOVOLTAIC_BLOCK, "充能光伏方块");
        provider.addBlock(CTNHBlocks.PULSATING_PHOTOVOLTAIC_BLOCK, "脉冲光伏方块");
        provider.addBlock(CTNHBlocks.VIBRANT_PHOTOVOLTAIC_BLOCK, "振动光伏方块");
        provider.addBlock(CTNHBlocks.PLASMA_COOLED_CORE,"等离子冷凝线圈方块");
        provider.addBlock(CTNHBlocks.CASING_NAQUADAH_BLOCK,"铿铀强化硅岩铕机械方块");
        provider.addBlock(CTNHBlocks.CASING_NAQUADAH_ALLOY_BLOCK,"三钛强化中子素硅岩合金机械方块");
        provider.addBlock(CTNHBlocks.CASING_ANTIFREEZE_HEATPROOF_MACHINE,"等离子冷凝机械方块");
        provider.addBlock(CTNHBlocks.ANNIHILATE_CORE_MKI,"反应堆核心 MKI");
        provider.addBlock(CTNHBlocks.ANNIHILATE_CORE_MKII,"反应堆核心 MKII");
        provider.addBlock(CTNHBlocks.ANNIHILATE_CORE_MKIII,"反应堆核心 MKIII");
        provider.addBlock(CTNHBlocks.ANNIHILATE_CORE_MKIV,"反应堆核心 MKIV");
        provider.addBlock(CTNHBlocks.ANNIHILATE_CORE_MKV,"反应堆核心 MKV");
        provider.addBlock(CTNHBlocks.CASING_ADVANCED_HYPER,"暗物质强化超能硅岩机械方块");
        provider.addBlock(CTNHBlocks.CASING_HYPER,"黑钚强化硅岩合金机械方块");
        provider.addBlock(CTNHBlocks.COIL_ABYSALALLOY, "渊狱合金线圈");
        provider.addBlock(CTNHBlocks.COIL_TITANSTEEL, "泰坦钢线圈");
        provider.addBlock(CTNHBlocks.COIL_PIKYONIUM, "皮卡优线圈");
        provider.addBlock(CTNHBlocks.COIL_BLACKTITANIUM, "黑钛合金线圈");
        provider.addBlock(CTNHBlocks.COIL_STARMETAL, "星辉线圈");
        provider.addBlock(CTNHBlocks.COIL_INFINITY, "无尽线圈");
        provider.addBlock(CTNHBlocks.CASING_SPACE_ELEVATOR_MECHANICAL, "太空电梯机械方块");
        provider.addBlock(CTNHBlocks.HIGH_GRADE_COKE_OVEN_BRICKS, "高级焦炉砖");
        provider.addBlock(CTNHBlocks.SPACE_ELEVATOR_POWER_CORE, "太空电梯维持反应堆核心");
        provider.addBlock(CTNHBlocks.BLAZE_BLAST_FURNACE_CASING, "炽焱高炉机械外壳");
        provider.addBlock(CTNHBlocks.MANA_STEEL_CASING,"魔力钢机械外壳");
        provider.addBlock(CTNHBlocks.TERRA_STEEL_CASING,"泰拉钢机械外壳");
        provider.addBlock(CTNHBlocks.ELEMENTIUM_CASING,"源质钢机械外壳");
        provider.addBlock(CTNHBlocks.ALF_STEEL_CASING,"精灵钢机械外壳");
        provider.add(CTNHMultiblockMachines.UNDERFLOOR_HEATING_SYSTEM.getBlock(), "地暖");
        provider.add(CTNHMultiblockMachines.ASTRONOMICAL_OBSERVATORY.getBlock(), "天文台");
        provider.add(CTNHMultiblockMachines.PHOTOVOLTAIC_POWER_STATION_ENERGETIC.getBlock(), "充能光伏发电站");
        provider.add(CTNHMultiblockMachines.PHOTOVOLTAIC_POWER_STATION_PULSATING.getBlock(), "脉冲光伏发电站");
        provider.add(CTNHMultiblockMachines.PHOTOVOLTAIC_POWER_STATION_VIBRANT.getBlock(), "振动光伏发电站");
        provider.add(CTNHMultiblockMachines.WIND_POWER_ARRAY.getBlock(), "风力发电阵列");
        provider.add(CTNHMultiblockMachines.ADVANCED_WIND_POWER_ARRAY.getBlock(), "进阶风力发电阵列");
        provider.add(CTNHMultiblockMachines.SUPER_WIND_POWER_ARRAY.getBlock(), "超级风力发电阵列");
        provider.add(CTNHMultiblockMachines.SLAUGHTER_HOUSE.getBlock(), "屠宰场");
        provider.add(CTNHMultiblockMachines.BIG_DAM.getBlock(), "三峡大坝");
        provider.add(CTNHMultiblockMachines.COKE_OVEN.getBlock(), "焦化塔");
        provider.add(CTNHMultiblockMachines.PLASMA_CONDENSER.getBlock(),"等离子冷凝器");
        provider.add(CTNHMultiblockMachines.BEDROCK_DRILLING_RIGS.getBlock(), "基岩钻机");
        provider.add(CTNHMultiblockMachines.NAQ_REACTOR_MK1.getBlock(),"超能反应堆 MKI");
        provider.add(CTNHMultiblockMachines.NAQ_REACTOR_MK2.getBlock(),"超能反应堆 MKII");
        provider.add(CTNHMultiblockMachines.SWEATSHOP.getBlock(),"§4血汗工厂");
        provider.add(CTNHMultiblockMachines.DEMON_WILL_GENERATOR.getBlock(),"§b恶魔意志发电机");
        provider.add(CTNHMultiblockMachines.MEADOW.getBlock(),"§6牧场");
        provider.add(CTNHMultiblockMachines.FERMENTING_TANK.getBlock(), "发酵罐");
        provider.add(CTNHMultiblockMachines.LARGE_FERMENTING_TANK.getBlock(), "大型发酵罐");
        provider.add(CTNHMultiblockMachines.DIGESTION_TANK.getBlock(),"化粪池");
        provider.add(CTNHMultiblockMachines.BLAZE_BLAST_FURNACE.getBlock(), "§c炽焱高炉");
        provider.add(CTNHMultiblockMachines.MANA_MACERATOR.getBlock(),"§b魔力粉碎机");
        provider.add(CTNHMultiblockMachines.MANA_BENDER.getBlock(),"§b魔力卷板机");
        provider.add(CTNHMultiblockMachines.MANA_WIREMILL.getBlock(),"§b魔力线材轧机");
        provider.add(CTNHMultiblockMachines.MANA_LATHE.getBlock(),"§b魔力车床");
        provider.add(CTNHMultiblockMachines.MANA_ASSEMBLER.getBlock(),"§b魔力组装机");
    }

    public static void replace(@NotNull RegistrateCNLangProvider provider, @NotNull String key,
                               @NotNull String value) {
        try {
            // the regular lang mappings
            Field field = LanguageProvider.class.getDeclaredField("data");
            field.setAccessible(true);
            // noinspection unchecked
            Map<String, String> map = (Map<String, String>) field.get(provider);
            map.put(key, value);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException("Error replacing entry in datagen.", e);
        }
    }
}
