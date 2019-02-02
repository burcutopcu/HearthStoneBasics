package com.burcutopcu.hearthstonebasics.fakes;

import com.burcutopcu.hearthstonebasics.models.GeneralInfoModel;
import com.google.gson.Gson;

public class FakeGeneralInfoModel {

    private String provideFakeInfoModel() {
        return "{\n" +
                "    \"patch\": \"13.0.9.28556\",\n" +
                "    \"classes\": [\n" +
                "        \"Death Knight\",\n" +
                "        \"Druid\",\n" +
                "        \"Hunter\",\n" +
                "        \"Mage\",\n" +
                "        \"Paladin\",\n" +
                "        \"Priest\",\n" +
                "        \"Rogue\",\n" +
                "        \"Shaman\",\n" +
                "        \"Warlock\",\n" +
                "        \"Warrior\",\n" +
                "        \"Dream\",\n" +
                "        \"Neutral\"\n" +
                "    ],\n" +
                "    \"sets\": [\n" +
                "        \"Basic\",\n" +
                "        \"Classic\",\n" +
                "        \"Promo\",\n" +
                "        \"Hall of Fame\",\n" +
                "        \"Naxxramas\",\n" +
                "        \"Goblins vs Gnomes\",\n" +
                "        \"Blackrock Mountain\",\n" +
                "        \"The Grand Tournament\",\n" +
                "        \"The League of Explorers\",\n" +
                "        \"Whispers of the Old Gods\",\n" +
                "        \"One Night in Karazhan\",\n" +
                "        \"Mean Streets of Gadgetzan\",\n" +
                "        \"Journey to Un'Goro\",\n" +
                "        \"Knights of the Frozen Throne\",\n" +
                "        \"Kobolds & Catacombs\",\n" +
                "        \"The Witchwood\",\n" +
                "        \"The Boomsday Project\",\n" +
                "        \"Rastakhan's Rumble\",\n" +
                "        \"Tavern Brawl\",\n" +
                "        \"Taverns of Time\",\n" +
                "        \"Hero Skins\",\n" +
                "        \"Missions\",\n" +
                "        \"Credits\",\n" +
                "        \"System\",\n" +
                "        \"Debug\"\n" +
                "    ],\n" +
                "    \"standard\": [\n" +
                "        \"Basic\",\n" +
                "        \"Classic\",\n" +
                "        \"Journey to Un'Goro\",\n" +
                "        \"Knights of the Frozen Throne\",\n" +
                "        \"Kobolds & Catacombs\",\n" +
                "        \"The Witchwood\",\n" +
                "        \"The Boomsday Project\",\n" +
                "        \"Rastakhan's Rumble\"\n" +
                "    ],\n" +
                "    \"wild\": [\n" +
                "        \"Basic\",\n" +
                "        \"Classic\",\n" +
                "        \"Hall of Fame\",\n" +
                "        \"Promo\",\n" +
                "        \"Naxxramas\",\n" +
                "        \"Goblins vs Gnomes\",\n" +
                "        \"Blackrock Mountain\",\n" +
                "        \"The Grand Tournament\",\n" +
                "        \"The League of Explorers\",\n" +
                "        \"Whispers of the Old Gods\",\n" +
                "        \"One Night in Karazhan\",\n" +
                "        \"Mean Streets of Gadgetzan\",\n" +
                "        \"Journey to Un'Goro\",\n" +
                "        \"Knights of the Frozen Throne\",\n" +
                "        \"Kobolds & Catacombs\",\n" +
                "        \"The Witchwood\",\n" +
                "        \"The Boomsday Project\",\n" +
                "        \"Rastakhan's Rumble\"\n" +
                "    ],\n" +
                "    \"types\": [\n" +
                "        \"Hero\",\n" +
                "        \"Minion\",\n" +
                "        \"Spell\",\n" +
                "        \"Enchantment\",\n" +
                "        \"Weapon\",\n" +
                "        \"Hero Power\"\n" +
                "    ],\n" +
                "    \"factions\": [\n" +
                "        \"Horde\",\n" +
                "        \"Alliance\",\n" +
                "        \"Neutral\"\n" +
                "    ],\n" +
                "    \"qualities\": [\n" +
                "        \"Free\",\n" +
                "        \"Common\",\n" +
                "        \"Rare\",\n" +
                "        \"Epic\",\n" +
                "        \"Legendary\"\n" +
                "    ],\n" +
                "    \"races\": [\n" +
                "        \"Demon\",\n" +
                "        \"Dragon\",\n" +
                "        \"Elemental\",\n" +
                "        \"Mech\",\n" +
                "        \"Murloc\",\n" +
                "        \"Beast\",\n" +
                "        \"Pirate\",\n" +
                "        \"Totem\"\n" +
                "    ],\n" +
                "    \"locales\": [\n" +
                "        \"deDE\",\n" +
                "        \"enGB\",\n" +
                "        \"enUS\",\n" +
                "        \"esES\",\n" +
                "        \"esMX\",\n" +
                "        \"frFR\",\n" +
                "        \"itIT\",\n" +
                "        \"koKR\",\n" +
                "        \"plPL\",\n" +
                "        \"ptBR\",\n" +
                "        \"ruRU\",\n" +
                "        \"zhCN\",\n" +
                "        \"zhTW\",\n" +
                "        \"jaJP\",\n" +
                "        \"thTH\"\n" +
                "    ]\n" +
                "}";
    }

    public GeneralInfoModel getGeneralInfoModel(Gson gson) {
        return gson.fromJson(provideFakeInfoModel(), GeneralInfoModel.class);
    }

    public GeneralInfoModel getGeneralInfoWithoutClasses(Gson gson) {
        GeneralInfoModel model = gson.fromJson(provideFakeInfoModel(), GeneralInfoModel.class);
        model.setClasses(null);
        return model;
    }

}
