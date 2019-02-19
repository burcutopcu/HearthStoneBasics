package com.burcutopcu.hearthstonebasics.network;

import com.burcutopcu.hearthstonebasics.api.IServiceResponseCallback;
import com.burcutopcu.hearthstonebasics.models.CardModel;
import com.burcutopcu.hearthstonebasics.models.GeneralInfoModel;
import com.google.gson.JsonObject;

import java.util.List;

/**
 * Responsible to manage hearth stone repo process with implemented classes
 *
 * @author burcutopcu
 * @since 1.0
 */
public interface IHearthStoneRepo {

    void getGeneralInfo(IServiceResponseCallback<GeneralInfoModel> callback);

    void getFilteredClassInfo(String name, IServiceResponseCallback<List<CardModel>> callback);

    void getSearchInfo(String name, IServiceResponseCallback<List<CardModel>> callback);

    void getCardInfoDetail(String name, IServiceResponseCallback<List<CardModel>> callback);

}
