package com.burcutopcu.hearthstonebasics.helper.modelParseHelper;

import com.burcutopcu.hearthstonebasics.models.CardModel;

import java.util.List;

public class SearchAndFilterModelParseHelper {

    /**
     * This method provides card list for search and filter fragments
     *
     * If card list has more then 10 elements, method returns 10 elements of card list,
     * If card list has less then 10 elements, method returns all the elements of card list,
     * If card list is null, method returns null.
     *
     * @param cardModelList
     * @return Card Model List as List<CardModel>
     */

    public List<CardModel> getFirstTenCard(List<CardModel> cardModelList) {

        if (cardModelList != null && !cardModelList.isEmpty()){

            if (cardModelList.size() >10) {
                return cardModelList.subList(0,10);
            }

            return cardModelList;
        }
        return null;
    }
}
