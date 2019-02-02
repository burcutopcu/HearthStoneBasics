package com.burcutopcu.hearthstonebasics.fakes;

import com.burcutopcu.hearthstonebasics.models.CardModel;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

public class FakeCardInfoModel {

    private String provideFakeCardInfoModel() {

        return "[\n" +
                "    {\n" +
                "        \"cardId\": \"FB_TagTeam_Druid_Ench\",\n" +
                "        \"dbfId\": \"41003\",\n" +
                "        \"name\": \"Next Hero: Druid Ench\",\n" +
                "        \"cardSet\": \"Tavern Brawl\",\n" +
                "        \"type\": \"Enchantment\",\n" +
                "        \"faction\": \"Neutral\",\n" +
                "        \"text\": \"Add Druid cards to your deck.\",\n" +
                "        \"playerClass\": \"Druid\",\n" +
                "        \"locale\": \"enUS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"cardId\": \"FB_LK_Druid_Ench_copy\",\n" +
                "        \"dbfId\": \"46513\",\n" +
                "        \"name\": \"Next Hero: Druid Ench Copy\",\n" +
                "        \"cardSet\": \"Tavern Brawl\",\n" +
                "        \"type\": \"Enchantment\",\n" +
                "        \"faction\": \"Neutral\",\n" +
                "        \"text\": \"Add Druid cards to your deck.\",\n" +
                "        \"playerClass\": \"Druid\",\n" +
                "        \"locale\": \"enUS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"cardId\": \"FB_Juggernaut_Druid_Ench\",\n" +
                "        \"dbfId\": \"41439\",\n" +
                "        \"name\": \"Opponent's Class: Druid Ench\",\n" +
                "        \"cardSet\": \"Tavern Brawl\",\n" +
                "        \"type\": \"Enchantment\",\n" +
                "        \"faction\": \"Neutral\",\n" +
                "        \"text\": \"Your opponent: Druid\",\n" +
                "        \"playerClass\": \"Druid\",\n" +
                "        \"locale\": \"enUS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"cardId\": \"FB_LK_Druid_copy\",\n" +
                "        \"dbfId\": \"46522\",\n" +
                "        \"name\": \"Druid\",\n" +
                "        \"cardSet\": \"Tavern Brawl\",\n" +
                "        \"type\": \"Spell\",\n" +
                "        \"faction\": \"Neutral\",\n" +
                "        \"cost\": 0,\n" +
                "        \"text\": \"Select Druid as your next class.\",\n" +
                "        \"playerClass\": \"Druid\",\n" +
                "        \"img\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/original/FB_LK_Druid_copy.png\",\n" +
                "        \"imgGold\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/animated/FB_LK_Druid_copy_premium.gif\",\n" +
                "        \"locale\": \"enUS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"cardId\": \"FB_Juggernaut_Druid\",\n" +
                "        \"dbfId\": \"41450\",\n" +
                "        \"name\": \"Druid\",\n" +
                "        \"cardSet\": \"Tavern Brawl\",\n" +
                "        \"type\": \"Spell\",\n" +
                "        \"faction\": \"Neutral\",\n" +
                "        \"cost\": 0,\n" +
                "        \"text\": \"Your opponent is a Druid.\",\n" +
                "        \"playerClass\": \"Druid\",\n" +
                "        \"img\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/original/FB_Juggernaut_Druid.png\",\n" +
                "        \"imgGold\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/animated/FB_Juggernaut_Druid_premium.gif\",\n" +
                "        \"locale\": \"enUS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"cardId\": \"TB_ClassRandom_Druid\",\n" +
                "        \"dbfId\": \"40044\",\n" +
                "        \"name\": \"Second Class: Druid\",\n" +
                "        \"cardSet\": \"Tavern Brawl\",\n" +
                "        \"type\": \"Spell\",\n" +
                "        \"cost\": 0,\n" +
                "        \"text\": \"Add Druid cards to your deck.\",\n" +
                "        \"playerClass\": \"Druid\",\n" +
                "        \"img\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/original/TB_ClassRandom_Druid.png\",\n" +
                "        \"imgGold\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/animated/TB_ClassRandom_Druid_premium.gif\",\n" +
                "        \"locale\": \"enUS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"cardId\": \"TRLA_205h\",\n" +
                "        \"dbfId\": \"53227\",\n" +
                "        \"name\": \"Wardruid Loti\",\n" +
                "        \"cardSet\": \"Rastakhan's Rumble\",\n" +
                "        \"type\": \"Hero\",\n" +
                "        \"faction\": \"Neutral\",\n" +
                "        \"cost\": 0,\n" +
                "        \"attack\": 0,\n" +
                "        \"health\": 10,\n" +
                "        \"durability\": 0,\n" +
                "        \"text\": \"<i>She and her raptors aim to prove the wild side is_the_winning_side.</i>\",\n" +
                "        \"artist\": \"Zoltan Boros\",\n" +
                "        \"playerClass\": \"Druid\",\n" +
                "        \"img\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/original/TRLA_205h.png\",\n" +
                "        \"imgGold\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/animated/TRLA_205h_premium.gif\",\n" +
                "        \"locale\": \"enUS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"cardId\": \"AT_042t2\",\n" +
                "        \"dbfId\": \"2860\",\n" +
                "        \"name\": \"Druid of the Saber\",\n" +
                "        \"cardSet\": \"The Grand Tournament\",\n" +
                "        \"type\": \"Minion\",\n" +
                "        \"rarity\": \"Common\",\n" +
                "        \"cost\": 2,\n" +
                "        \"attack\": 3,\n" +
                "        \"health\": 2,\n" +
                "        \"text\": \"<b>Stealth</b>\",\n" +
                "        \"race\": \"Beast\",\n" +
                "        \"playerClass\": \"Druid\",\n" +
                "        \"img\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/original/AT_042t2.png\",\n" +
                "        \"imgGold\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/animated/AT_042t2_premium.gif\",\n" +
                "        \"locale\": \"enUS\",\n" +
                "        \"mechanics\": [\n" +
                "            {\n" +
                "                \"name\": \"Stealth\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"cardId\": \"OG_044c\",\n" +
                "        \"dbfId\": \"38321\",\n" +
                "        \"name\": \"Druid of the Saber\",\n" +
                "        \"cardSet\": \"The Grand Tournament\",\n" +
                "        \"type\": \"Minion\",\n" +
                "        \"rarity\": \"Common\",\n" +
                "        \"cost\": 2,\n" +
                "        \"attack\": 3,\n" +
                "        \"health\": 2,\n" +
                "        \"text\": \"<b>Charge</b>\\\\n<b>Stealth</b>\",\n" +
                "        \"race\": \"Beast\",\n" +
                "        \"playerClass\": \"Druid\",\n" +
                "        \"img\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/original/OG_044c.png\",\n" +
                "        \"imgGold\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/animated/OG_044c_premium.gif\",\n" +
                "        \"locale\": \"enUS\",\n" +
                "        \"mechanics\": [\n" +
                "            {\n" +
                "                \"name\": \"Charge\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"name\": \"Stealth\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"cardId\": \"AT_042\",\n" +
                "        \"dbfId\": \"2783\",\n" +
                "        \"name\": \"Druid of the Saber\",\n" +
                "        \"cardSet\": \"The Grand Tournament\",\n" +
                "        \"type\": \"Minion\",\n" +
                "        \"rarity\": \"Common\",\n" +
                "        \"cost\": 2,\n" +
                "        \"attack\": 2,\n" +
                "        \"health\": 1,\n" +
                "        \"text\": \"[x]<b>Choose One -</b> Transform\\\\ninto a 2/1 with <b>Charge</b>;\\\\nor a 3/2 with <b>Stealth</b>.\",\n" +
                "        \"flavor\": \"That's saberTEETH, not like curved pirate blades.  That's a different kind of druid.  Druid of the Curved Pirate Blades.\",\n" +
                "        \"artist\": \"Arthur Gimaldinov\",\n" +
                "        \"collectible\": true,\n" +
                "        \"playerClass\": \"Druid\",\n" +
                "        \"img\": \"http://media.services.zam.com/v1/media/byName/hs/cards/enus/AT_042.png\",\n" +
                "        \"imgGold\": \"http://media.services.zam.com/v1/media/byName/hs/cards/enus/animated/AT_042_premium.gif\",\n" +
                "        \"locale\": \"enUS\",\n" +
                "        \"mechanics\": [\n" +
                "            {\n" +
                "                \"name\": \"Charge\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"name\": \"Stealth\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"cardId\": \"AT_042t\",\n" +
                "        \"dbfId\": \"2784\",\n" +
                "        \"name\": \"Druid of the Saber\",\n" +
                "        \"cardSet\": \"The Grand Tournament\",\n" +
                "        \"type\": \"Minion\",\n" +
                "        \"rarity\": \"Common\",\n" +
                "        \"cost\": 2,\n" +
                "        \"attack\": 2,\n" +
                "        \"health\": 1,\n" +
                "        \"text\": \"<b>Charge</b>\",\n" +
                "        \"race\": \"Beast\",\n" +
                "        \"playerClass\": \"Druid\",\n" +
                "        \"img\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/original/AT_042t.png\",\n" +
                "        \"imgGold\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/animated/AT_042t_premium.gif\",\n" +
                "        \"locale\": \"enUS\",\n" +
                "        \"mechanics\": [\n" +
                "            {\n" +
                "                \"name\": \"Charge\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"cardId\": \"ICC_051t2\",\n" +
                "        \"dbfId\": \"46008\",\n" +
                "        \"name\": \"Druid of the Swarm\",\n" +
                "        \"cardSet\": \"Knights of the Frozen Throne\",\n" +
                "        \"type\": \"Minion\",\n" +
                "        \"rarity\": \"Rare\",\n" +
                "        \"cost\": 2,\n" +
                "        \"attack\": 1,\n" +
                "        \"health\": 5,\n" +
                "        \"text\": \"<b>Taunt</b>\",\n" +
                "        \"race\": \"Beast\",\n" +
                "        \"playerClass\": \"Druid\",\n" +
                "        \"img\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/original/ICC_051t2.png\",\n" +
                "        \"imgGold\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/animated/ICC_051t2_premium.gif\",\n" +
                "        \"locale\": \"enUS\",\n" +
                "        \"mechanics\": [\n" +
                "            {\n" +
                "                \"name\": \"Taunt\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"cardId\": \"ICC_051t3\",\n" +
                "        \"dbfId\": \"46009\",\n" +
                "        \"name\": \"Druid of the Swarm\",\n" +
                "        \"cardSet\": \"Knights of the Frozen Throne\",\n" +
                "        \"type\": \"Minion\",\n" +
                "        \"rarity\": \"Rare\",\n" +
                "        \"cost\": 2,\n" +
                "        \"attack\": 1,\n" +
                "        \"health\": 5,\n" +
                "        \"text\": \"<b>Taunt</b>\\\\n<b>Poisonous</b>\",\n" +
                "        \"artist\": \"Zoltan Boros\",\n" +
                "        \"race\": \"Beast\",\n" +
                "        \"playerClass\": \"Druid\",\n" +
                "        \"img\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/original/ICC_051t3.png\",\n" +
                "        \"imgGold\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/animated/ICC_051t3_premium.gif\",\n" +
                "        \"locale\": \"enUS\",\n" +
                "        \"mechanics\": [\n" +
                "            {\n" +
                "                \"name\": \"Poisonous\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"name\": \"Taunt\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"cardId\": \"ICC_051t\",\n" +
                "        \"dbfId\": \"42650\",\n" +
                "        \"name\": \"Druid of the Swarm\",\n" +
                "        \"cardSet\": \"Knights of the Frozen Throne\",\n" +
                "        \"type\": \"Minion\",\n" +
                "        \"rarity\": \"Rare\",\n" +
                "        \"cost\": 2,\n" +
                "        \"attack\": 1,\n" +
                "        \"health\": 2,\n" +
                "        \"text\": \"<b>Poisonous</b>\",\n" +
                "        \"race\": \"Beast\",\n" +
                "        \"playerClass\": \"Druid\",\n" +
                "        \"img\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/original/ICC_051t.png\",\n" +
                "        \"imgGold\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/animated/ICC_051t_premium.gif\",\n" +
                "        \"locale\": \"enUS\",\n" +
                "        \"mechanics\": [\n" +
                "            {\n" +
                "                \"name\": \"Poisonous\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"cardId\": \"ICC_051\",\n" +
                "        \"dbfId\": \"42651\",\n" +
                "        \"name\": \"Druid of the Swarm\",\n" +
                "        \"cardSet\": \"Knights of the Frozen Throne\",\n" +
                "        \"type\": \"Minion\",\n" +
                "        \"rarity\": \"Rare\",\n" +
                "        \"cost\": 2,\n" +
                "        \"attack\": 1,\n" +
                "        \"health\": 2,\n" +
                "        \"text\": \"<b>Choose One -</b> Transform into a 1/2 with <b>Poisonous</b>; or a 1/5 with <b>Taunt</b>.\",\n" +
                "        \"flavor\": \"The druid awoke from troubling dreams to find herself transformed into a giant spider.\",\n" +
                "        \"artist\": \"Zoltan Boros\",\n" +
                "        \"collectible\": true,\n" +
                "        \"playerClass\": \"Druid\",\n" +
                "        \"img\": \"http://media.services.zam.com/v1/media/byName/hs/cards/enus/ICC_051.png\",\n" +
                "        \"imgGold\": \"http://media.services.zam.com/v1/media/byName/hs/cards/enus/animated/ICC_051_premium.gif\",\n" +
                "        \"locale\": \"enUS\",\n" +
                "        \"mechanics\": [\n" +
                "            {\n" +
                "                \"name\": \"Taunt\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"name\": \"Poisonous\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"cardId\": \"OG_044b\",\n" +
                "        \"dbfId\": \"38320\",\n" +
                "        \"name\": \"Druid of the Flame\",\n" +
                "        \"cardSet\": \"Blackrock Mountain\",\n" +
                "        \"type\": \"Minion\",\n" +
                "        \"rarity\": \"Common\",\n" +
                "        \"cost\": 3,\n" +
                "        \"attack\": 5,\n" +
                "        \"health\": 5,\n" +
                "        \"race\": \"Beast\",\n" +
                "        \"playerClass\": \"Druid\",\n" +
                "        \"img\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/original/OG_044b.png\",\n" +
                "        \"imgGold\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/animated/OG_044b_premium.gif\",\n" +
                "        \"locale\": \"enUS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"cardId\": \"BRM_010\",\n" +
                "        \"dbfId\": \"2292\",\n" +
                "        \"name\": \"Druid of the Flame\",\n" +
                "        \"cardSet\": \"Blackrock Mountain\",\n" +
                "        \"type\": \"Minion\",\n" +
                "        \"rarity\": \"Common\",\n" +
                "        \"cost\": 3,\n" +
                "        \"attack\": 2,\n" +
                "        \"health\": 2,\n" +
                "        \"text\": \"<b>Choose One -</b> Transform into a 5/2 minion; or a 2/5 minion.\",\n" +
                "        \"flavor\": \"Druids who fought too long in Northrend were easily seduced by Ragnaros; a mug of hot chocolate was generally all it took.\",\n" +
                "        \"artist\": \"Stanley Lau\",\n" +
                "        \"collectible\": true,\n" +
                "        \"playerClass\": \"Druid\",\n" +
                "        \"howToGet\": \"Unlocked in Molten Core, in the Blackrock Mountain adventure.\",\n" +
                "        \"howToGetGold\": \"Crafting unlocked in Molten Core, in the Blackrock Mountain adventure.\",\n" +
                "        \"img\": \"http://media.services.zam.com/v1/media/byName/hs/cards/enus/BRM_010.png\",\n" +
                "        \"imgGold\": \"http://media.services.zam.com/v1/media/byName/hs/cards/enus/animated/BRM_010_premium.gif\",\n" +
                "        \"locale\": \"enUS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"cardId\": \"BRM_010t\",\n" +
                "        \"dbfId\": \"2310\",\n" +
                "        \"name\": \"Druid of the Flame\",\n" +
                "        \"cardSet\": \"Blackrock Mountain\",\n" +
                "        \"type\": \"Minion\",\n" +
                "        \"rarity\": \"Common\",\n" +
                "        \"cost\": 3,\n" +
                "        \"attack\": 5,\n" +
                "        \"health\": 2,\n" +
                "        \"artist\": \"Benjamin Zhang\",\n" +
                "        \"race\": \"Beast\",\n" +
                "        \"playerClass\": \"Druid\",\n" +
                "        \"img\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/original/BRM_010t.png\",\n" +
                "        \"imgGold\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/animated/BRM_010t_premium.gif\",\n" +
                "        \"locale\": \"enUS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"cardId\": \"BRM_010t2\",\n" +
                "        \"dbfId\": \"2311\",\n" +
                "        \"name\": \"Druid of the Flame\",\n" +
                "        \"cardSet\": \"Blackrock Mountain\",\n" +
                "        \"type\": \"Minion\",\n" +
                "        \"rarity\": \"Common\",\n" +
                "        \"cost\": 3,\n" +
                "        \"attack\": 2,\n" +
                "        \"health\": 5,\n" +
                "        \"artist\": \"Hideaki Takamura\",\n" +
                "        \"race\": \"Beast\",\n" +
                "        \"playerClass\": \"Druid\",\n" +
                "        \"img\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/original/BRM_010t2.png\",\n" +
                "        \"imgGold\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/animated/BRM_010t2_premium.gif\",\n" +
                "        \"locale\": \"enUS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"cardId\": \"GIL_188t\",\n" +
                "        \"dbfId\": \"48305\",\n" +
                "        \"name\": \"Druid of the Scythe\",\n" +
                "        \"cardSet\": \"The Witchwood\",\n" +
                "        \"type\": \"Minion\",\n" +
                "        \"rarity\": \"Common\",\n" +
                "        \"cost\": 3,\n" +
                "        \"attack\": 4,\n" +
                "        \"health\": 2,\n" +
                "        \"text\": \"<b>Rush</b>\",\n" +
                "        \"artist\": \"L. Lullabi & K. Turovec\",\n" +
                "        \"race\": \"Beast\",\n" +
                "        \"playerClass\": \"Druid\",\n" +
                "        \"img\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/original/GIL_188t.png\",\n" +
                "        \"imgGold\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/animated/GIL_188t_premium.gif\",\n" +
                "        \"locale\": \"enUS\",\n" +
                "        \"mechanics\": [\n" +
                "            {\n" +
                "                \"name\": \"Rush\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"cardId\": \"GIL_188t2\",\n" +
                "        \"dbfId\": \"48306\",\n" +
                "        \"name\": \"Druid of the Scythe\",\n" +
                "        \"cardSet\": \"The Witchwood\",\n" +
                "        \"type\": \"Minion\",\n" +
                "        \"rarity\": \"Common\",\n" +
                "        \"cost\": 3,\n" +
                "        \"attack\": 2,\n" +
                "        \"health\": 4,\n" +
                "        \"text\": \"<b>Taunt</b>\",\n" +
                "        \"artist\": \"L. Lullabi & K. Turovec\",\n" +
                "        \"race\": \"Beast\",\n" +
                "        \"playerClass\": \"Druid\",\n" +
                "        \"img\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/original/GIL_188t2.png\",\n" +
                "        \"imgGold\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/animated/GIL_188t2_premium.gif\",\n" +
                "        \"locale\": \"enUS\",\n" +
                "        \"mechanics\": [\n" +
                "            {\n" +
                "                \"name\": \"Taunt\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"cardId\": \"GIL_188t3\",\n" +
                "        \"dbfId\": \"48307\",\n" +
                "        \"name\": \"Druid of the Scythe\",\n" +
                "        \"cardSet\": \"The Witchwood\",\n" +
                "        \"type\": \"Minion\",\n" +
                "        \"rarity\": \"Common\",\n" +
                "        \"cost\": 3,\n" +
                "        \"attack\": 4,\n" +
                "        \"health\": 4,\n" +
                "        \"text\": \"<b>Rush</b>\\\\n<b>Taunt</b>\",\n" +
                "        \"artist\": \"L. Lullabi & K. Turovec\",\n" +
                "        \"race\": \"Beast\",\n" +
                "        \"playerClass\": \"Druid\",\n" +
                "        \"img\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/original/GIL_188t3.png\",\n" +
                "        \"imgGold\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/animated/GIL_188t3_premium.gif\",\n" +
                "        \"locale\": \"enUS\",\n" +
                "        \"mechanics\": [\n" +
                "            {\n" +
                "                \"name\": \"Rush\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"name\": \"Taunt\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"cardId\": \"GIL_188\",\n" +
                "        \"dbfId\": \"46859\",\n" +
                "        \"name\": \"Druid of the Scythe\",\n" +
                "        \"cardSet\": \"The Witchwood\",\n" +
                "        \"type\": \"Minion\",\n" +
                "        \"rarity\": \"Common\",\n" +
                "        \"cost\": 3,\n" +
                "        \"attack\": 2,\n" +
                "        \"health\": 2,\n" +
                "        \"text\": \"[x]<b>Choose One -</b> Transform\\\\ninto a 4/2 with <b>Rush</b>;\\\\nor a 2/4 with <b>Taunt</b>.\",\n" +
                "        \"flavor\": \"She's a scythe for sore eyes.\",\n" +
                "        \"artist\": \"Luke Mancini\",\n" +
                "        \"collectible\": true,\n" +
                "        \"playerClass\": \"Druid\",\n" +
                "        \"img\": \"http://media.services.zam.com/v1/media/byName/hs/cards/enus/GIL_188.png\",\n" +
                "        \"imgGold\": \"http://media.services.zam.com/v1/media/byName/hs/cards/enus/animated/GIL_188_premium.gif\",\n" +
                "        \"locale\": \"enUS\",\n" +
                "        \"mechanics\": [\n" +
                "            {\n" +
                "                \"name\": \"Rush\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"name\": \"Taunt\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"cardId\": \"TRL_343\",\n" +
                "        \"dbfId\": \"43310\",\n" +
                "        \"name\": \"Wardruid Loti\",\n" +
                "        \"cardSet\": \"Rastakhan's Rumble\",\n" +
                "        \"type\": \"Minion\",\n" +
                "        \"rarity\": \"Legendary\",\n" +
                "        \"cost\": 3,\n" +
                "        \"attack\": 1,\n" +
                "        \"health\": 2,\n" +
                "        \"text\": \"<b>Choose One - </b>Transform into one of Loti's four dinosaur forms.\",\n" +
                "        \"flavor\": \"“Ravasaur!”\\\\n“Pretty scary”\\\\n“…Blammodax!”\\\\n“Is that a thing?”\\\\n“SMAXODON!”\\\\n“….now you’re just making those up.”\",\n" +
                "        \"artist\": \"Zoltan Boros\",\n" +
                "        \"collectible\": true,\n" +
                "        \"elite\": true,\n" +
                "        \"playerClass\": \"Druid\",\n" +
                "        \"img\": \"http://media.services.zam.com/v1/media/byName/hs/cards/enus/TRL_343.png\",\n" +
                "        \"imgGold\": \"http://media.services.zam.com/v1/media/byName/hs/cards/enus/animated/TRL_343_premium.gif\",\n" +
                "        \"locale\": \"enUS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"cardId\": \"TRL_343et1\",\n" +
                "        \"dbfId\": \"43315\",\n" +
                "        \"name\": \"Wardruid Loti\",\n" +
                "        \"cardSet\": \"Rastakhan's Rumble\",\n" +
                "        \"type\": \"Minion\",\n" +
                "        \"rarity\": \"Legendary\",\n" +
                "        \"cost\": 3,\n" +
                "        \"attack\": 4,\n" +
                "        \"health\": 6,\n" +
                "        \"text\": \"<b>Taunt</b>, <b>Rush</b>, <b>Poisonous</b>, <b>Stealth</b>, <b>Spell Damage +1</b>\",\n" +
                "        \"artist\": \"Zoltan Boros\",\n" +
                "        \"elite\": true,\n" +
                "        \"race\": \"Beast\",\n" +
                "        \"playerClass\": \"Druid\",\n" +
                "        \"img\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/original/TRL_343et1.png\",\n" +
                "        \"imgGold\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/animated/TRL_343et1_premium.gif\",\n" +
                "        \"locale\": \"enUS\",\n" +
                "        \"mechanics\": [\n" +
                "            {\n" +
                "                \"name\": \"Taunt\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"name\": \"Poisonous\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"name\": \"Stealth\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"name\": \"Spell Damage\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"name\": \"Rush\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"cardId\": \"TRL_343at2\",\n" +
                "        \"dbfId\": \"54599\",\n" +
                "        \"name\": \"Wardruid Loti\",\n" +
                "        \"cardSet\": \"Rastakhan's Rumble\",\n" +
                "        \"type\": \"Minion\",\n" +
                "        \"rarity\": \"Legendary\",\n" +
                "        \"cost\": 3,\n" +
                "        \"attack\": 1,\n" +
                "        \"health\": 6,\n" +
                "        \"text\": \"<b>Taunt</b>\",\n" +
                "        \"elite\": true,\n" +
                "        \"race\": \"Beast\",\n" +
                "        \"playerClass\": \"Druid\",\n" +
                "        \"img\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/original/TRL_343at2.png\",\n" +
                "        \"imgGold\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/animated/TRL_343at2_premium.gif\",\n" +
                "        \"locale\": \"enUS\",\n" +
                "        \"mechanics\": [\n" +
                "            {\n" +
                "                \"name\": \"Taunt\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"cardId\": \"TRL_343bt2\",\n" +
                "        \"dbfId\": \"54600\",\n" +
                "        \"name\": \"Wardruid Loti\",\n" +
                "        \"cardSet\": \"Rastakhan's Rumble\",\n" +
                "        \"type\": \"Minion\",\n" +
                "        \"rarity\": \"Legendary\",\n" +
                "        \"cost\": 3,\n" +
                "        \"attack\": 4,\n" +
                "        \"health\": 2,\n" +
                "        \"text\": \"<b>Rush</b>\",\n" +
                "        \"elite\": true,\n" +
                "        \"race\": \"Beast\",\n" +
                "        \"playerClass\": \"Druid\",\n" +
                "        \"img\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/original/TRL_343bt2.png\",\n" +
                "        \"imgGold\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/animated/TRL_343bt2_premium.gif\",\n" +
                "        \"locale\": \"enUS\",\n" +
                "        \"mechanics\": [\n" +
                "            {\n" +
                "                \"name\": \"Rush\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"cardId\": \"TRL_343ct2\",\n" +
                "        \"dbfId\": \"54601\",\n" +
                "        \"name\": \"Wardruid Loti\",\n" +
                "        \"cardSet\": \"Rastakhan's Rumble\",\n" +
                "        \"type\": \"Minion\",\n" +
                "        \"rarity\": \"Legendary\",\n" +
                "        \"cost\": 3,\n" +
                "        \"attack\": 1,\n" +
                "        \"health\": 4,\n" +
                "        \"text\": \"<b>Spell Damage +1</b>\",\n" +
                "        \"elite\": true,\n" +
                "        \"race\": \"Beast\",\n" +
                "        \"playerClass\": \"Druid\",\n" +
                "        \"img\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/original/TRL_343ct2.png\",\n" +
                "        \"imgGold\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/animated/TRL_343ct2_premium.gif\",\n" +
                "        \"locale\": \"enUS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"cardId\": \"TRL_343dt2\",\n" +
                "        \"dbfId\": \"54602\",\n" +
                "        \"name\": \"Wardruid Loti\",\n" +
                "        \"cardSet\": \"Rastakhan's Rumble\",\n" +
                "        \"type\": \"Minion\",\n" +
                "        \"rarity\": \"Legendary\",\n" +
                "        \"cost\": 3,\n" +
                "        \"attack\": 1,\n" +
                "        \"health\": 2,\n" +
                "        \"text\": \"<b>Poisonous</b>, <b>Stealth</b>\",\n" +
                "        \"elite\": true,\n" +
                "        \"race\": \"Beast\",\n" +
                "        \"playerClass\": \"Druid\",\n" +
                "        \"img\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/original/TRL_343dt2.png\",\n" +
                "        \"imgGold\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/animated/TRL_343dt2_premium.gif\",\n" +
                "        \"locale\": \"enUS\",\n" +
                "        \"mechanics\": [\n" +
                "            {\n" +
                "                \"name\": \"Poisonous\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"name\": \"Stealth\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"cardId\": \"FB_Champs_EX1_165t1\",\n" +
                "        \"dbfId\": \"49344\",\n" +
                "        \"name\": \"Druid of the Claw\",\n" +
                "        \"cardSet\": \"Tavern Brawl\",\n" +
                "        \"type\": \"Minion\",\n" +
                "        \"rarity\": \"Common\",\n" +
                "        \"cost\": 5,\n" +
                "        \"attack\": 4,\n" +
                "        \"health\": 4,\n" +
                "        \"text\": \"<b>Charge</b>\",\n" +
                "        \"playerClass\": \"Druid\",\n" +
                "        \"img\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/original/FB_Champs_EX1_165t1.png\",\n" +
                "        \"imgGold\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/animated/FB_Champs_EX1_165t1_premium.gif\",\n" +
                "        \"locale\": \"enUS\",\n" +
                "        \"mechanics\": [\n" +
                "            {\n" +
                "                \"name\": \"Charge\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"cardId\": \"FB_Champs_EX1_165t2\",\n" +
                "        \"dbfId\": \"49345\",\n" +
                "        \"name\": \"Druid of the Claw\",\n" +
                "        \"cardSet\": \"Tavern Brawl\",\n" +
                "        \"type\": \"Minion\",\n" +
                "        \"rarity\": \"Common\",\n" +
                "        \"cost\": 5,\n" +
                "        \"attack\": 4,\n" +
                "        \"health\": 6,\n" +
                "        \"text\": \"<b>Taunt</b>\",\n" +
                "        \"playerClass\": \"Druid\",\n" +
                "        \"img\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/original/FB_Champs_EX1_165t2.png\",\n" +
                "        \"imgGold\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/animated/FB_Champs_EX1_165t2_premium.gif\",\n" +
                "        \"locale\": \"enUS\",\n" +
                "        \"mechanics\": [\n" +
                "            {\n" +
                "                \"name\": \"Taunt\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"cardId\": \"OG_044a\",\n" +
                "        \"dbfId\": \"38319\",\n" +
                "        \"name\": \"Druid of the Claw\",\n" +
                "        \"cardSet\": \"Classic\",\n" +
                "        \"type\": \"Minion\",\n" +
                "        \"rarity\": \"Common\",\n" +
                "        \"cost\": 5,\n" +
                "        \"attack\": 4,\n" +
                "        \"health\": 6,\n" +
                "        \"text\": \"<b>Charge</b>\\\\n<b>Taunt</b>\",\n" +
                "        \"race\": \"Beast\",\n" +
                "        \"playerClass\": \"Druid\",\n" +
                "        \"img\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/original/OG_044a.png\",\n" +
                "        \"imgGold\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/animated/OG_044a_premium.gif\",\n" +
                "        \"locale\": \"enUS\",\n" +
                "        \"mechanics\": [\n" +
                "            {\n" +
                "                \"name\": \"Charge\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"name\": \"Taunt\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"cardId\": \"EX1_165\",\n" +
                "        \"dbfId\": \"692\",\n" +
                "        \"name\": \"Druid of the Claw\",\n" +
                "        \"cardSet\": \"Classic\",\n" +
                "        \"type\": \"Minion\",\n" +
                "        \"faction\": \"Neutral\",\n" +
                "        \"rarity\": \"Common\",\n" +
                "        \"cost\": 5,\n" +
                "        \"attack\": 4,\n" +
                "        \"health\": 4,\n" +
                "        \"text\": \"[x]<b>Choose One -</b> Transform\\\\ninto a 4/4 with <b>Charge</b>;\\\\nor a 4/6 with <b>Taunt</b>.\",\n" +
                "        \"flavor\": \"Cat or Bear?  Cat or Bear?!  I just cannot CHOOSE!\",\n" +
                "        \"artist\": \"Luca Zontini\",\n" +
                "        \"collectible\": true,\n" +
                "        \"playerClass\": \"Druid\",\n" +
                "        \"img\": \"http://media.services.zam.com/v1/media/byName/hs/cards/enus/EX1_165.png\",\n" +
                "        \"imgGold\": \"http://media.services.zam.com/v1/media/byName/hs/cards/enus/animated/EX1_165_premium.gif\",\n" +
                "        \"locale\": \"enUS\",\n" +
                "        \"mechanics\": [\n" +
                "            {\n" +
                "                \"name\": \"Taunt\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"name\": \"Charge\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"cardId\": \"EX1_165t1\",\n" +
                "        \"dbfId\": \"1681\",\n" +
                "        \"name\": \"Druid of the Claw\",\n" +
                "        \"cardSet\": \"Classic\",\n" +
                "        \"type\": \"Minion\",\n" +
                "        \"rarity\": \"Common\",\n" +
                "        \"cost\": 5,\n" +
                "        \"attack\": 4,\n" +
                "        \"health\": 4,\n" +
                "        \"text\": \"<b>Charge</b>\",\n" +
                "        \"race\": \"Beast\",\n" +
                "        \"playerClass\": \"Druid\",\n" +
                "        \"img\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/original/EX1_165t1.png\",\n" +
                "        \"imgGold\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/animated/EX1_165t1_premium.gif\",\n" +
                "        \"locale\": \"enUS\",\n" +
                "        \"mechanics\": [\n" +
                "            {\n" +
                "                \"name\": \"Charge\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"cardId\": \"EX1_165t2\",\n" +
                "        \"dbfId\": \"1682\",\n" +
                "        \"name\": \"Druid of the Claw\",\n" +
                "        \"cardSet\": \"Classic\",\n" +
                "        \"type\": \"Minion\",\n" +
                "        \"rarity\": \"Common\",\n" +
                "        \"cost\": 5,\n" +
                "        \"attack\": 4,\n" +
                "        \"health\": 6,\n" +
                "        \"text\": \"<b>Taunt</b>\",\n" +
                "        \"race\": \"Beast\",\n" +
                "        \"playerClass\": \"Druid\",\n" +
                "        \"img\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/original/EX1_165t2.png\",\n" +
                "        \"imgGold\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/animated/EX1_165t2_premium.gif\",\n" +
                "        \"locale\": \"enUS\",\n" +
                "        \"mechanics\": [\n" +
                "            {\n" +
                "                \"name\": \"Taunt\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"cardId\": \"FB_Champs_OG_044a\",\n" +
                "        \"dbfId\": \"49272\",\n" +
                "        \"name\": \"Druid of the Claw\",\n" +
                "        \"cardSet\": \"Tavern Brawl\",\n" +
                "        \"type\": \"Minion\",\n" +
                "        \"rarity\": \"Common\",\n" +
                "        \"cost\": 5,\n" +
                "        \"attack\": 4,\n" +
                "        \"health\": 6,\n" +
                "        \"text\": \"<b>Charge</b>\\\\n<b>Taunt</b>\",\n" +
                "        \"playerClass\": \"Druid\",\n" +
                "        \"img\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/original/FB_Champs_OG_044a.png\",\n" +
                "        \"imgGold\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/animated/FB_Champs_OG_044a_premium.gif\",\n" +
                "        \"locale\": \"enUS\",\n" +
                "        \"mechanics\": [\n" +
                "            {\n" +
                "                \"name\": \"Charge\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"name\": \"Taunt\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"cardId\": \"FB_Champs_EX1_165\",\n" +
                "        \"dbfId\": \"49273\",\n" +
                "        \"name\": \"Druid of the Claw\",\n" +
                "        \"cardSet\": \"Tavern Brawl\",\n" +
                "        \"type\": \"Minion\",\n" +
                "        \"faction\": \"Neutral\",\n" +
                "        \"rarity\": \"Common\",\n" +
                "        \"cost\": 5,\n" +
                "        \"attack\": 4,\n" +
                "        \"health\": 4,\n" +
                "        \"text\": \"[x]<b>Choose One -</b> Transform\\\\ninto a 4/4 with <b>Charge</b>;\\\\nor a 4/6 with <b>Taunt</b>.\",\n" +
                "        \"playerClass\": \"Druid\",\n" +
                "        \"img\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/original/FB_Champs_EX1_165.png\",\n" +
                "        \"imgGold\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/animated/FB_Champs_EX1_165_premium.gif\",\n" +
                "        \"locale\": \"enUS\",\n" +
                "        \"mechanics\": [\n" +
                "            {\n" +
                "                \"name\": \"Taunt\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"name\": \"Charge\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"cardId\": \"GVG_080t\",\n" +
                "        \"dbfId\": \"2230\",\n" +
                "        \"name\": \"Druid of the Fang\",\n" +
                "        \"cardSet\": \"Goblins vs Gnomes\",\n" +
                "        \"type\": \"Minion\",\n" +
                "        \"cost\": 5,\n" +
                "        \"attack\": 7,\n" +
                "        \"health\": 7,\n" +
                "        \"artist\": \"Massive Black\",\n" +
                "        \"race\": \"Beast\",\n" +
                "        \"playerClass\": \"Druid\",\n" +
                "        \"img\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/original/GVG_080t.png\",\n" +
                "        \"imgGold\": \"http://wow.zamimg.com/images/hearthstone/cards/enus/animated/GVG_080t_premium.gif\",\n" +
                "        \"locale\": \"enUS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"cardId\": \"GVG_080\",\n" +
                "        \"dbfId\": \"2048\",\n" +
                "        \"name\": \"Druid of the Fang\",\n" +
                "        \"cardSet\": \"Goblins vs Gnomes\",\n" +
                "        \"type\": \"Minion\",\n" +
                "        \"rarity\": \"Common\",\n" +
                "        \"cost\": 5,\n" +
                "        \"attack\": 4,\n" +
                "        \"health\": 4,\n" +
                "        \"text\": \"<b>Battlecry:</b> If you have a Beast, transform this minion into a 7/7.\",\n" +
                "        \"flavor\": \"The Druids of the Fang live in the Wailing Caverns. They wear cool snake shirts and tell snake jokes and say \\\"bro\\\" a lot.\",\n" +
                "        \"artist\": \"Brandon Kitkouski\",\n" +
                "        \"collectible\": true,\n" +
                "        \"playerClass\": \"Druid\",\n" +
                "        \"img\": \"http://media.services.zam.com/v1/media/byName/hs/cards/enus/GVG_080.png\",\n" +
                "        \"imgGold\": \"http://media.services.zam.com/v1/media/byName/hs/cards/enus/animated/GVG_080_premium.gif\",\n" +
                "        \"locale\": \"enUS\",\n" +
                "        \"mechanics\": [\n" +
                "            {\n" +
                "                \"name\": \"Battlecry\"\n" +
                "            }\n" +
                "        ]\n" +
                "    }\n" +
                "]";
    }

    public List<CardModel> getCardListModel(Gson gson) {
        return gson.fromJson(provideFakeCardInfoModel(),new TypeToken<List<CardModel>>(){}.getType());
    }

    public List<CardModel> getNullCardListModel() {
        return null;
    }

    public List<CardModel> getCardListModelWithSizeUntilTen(Gson gson) {
        List<CardModel> cardModelList= gson.fromJson(provideFakeCardInfoModel(),new TypeToken<List<CardModel>>(){}.getType());
        return cardModelList.subList(0,5);
    }
}
