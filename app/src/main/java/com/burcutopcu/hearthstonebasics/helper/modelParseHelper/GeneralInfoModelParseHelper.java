package com.burcutopcu.hearthstonebasics.helper.modelParseHelper;

import com.burcutopcu.hearthstonebasics.models.GeneralInfoModel;

import java.util.List;

public class GeneralInfoModelParseHelper {

    /**
     * This method provides parsed hero class list for spinner
     *
     * @param infoModel
     * @return hero class list as List<String>
     * @author burcutopcu
     * @since 1.0
     */

    public List<String> getHeroClassList(GeneralInfoModel infoModel) {
        List<String> fieldList = infoModel.getClasses();
        if (fieldList != null && !fieldList.isEmpty())
            return fieldList;

        return null;
    }

}
