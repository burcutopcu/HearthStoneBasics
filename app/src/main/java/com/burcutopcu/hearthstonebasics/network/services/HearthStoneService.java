package com.burcutopcu.hearthstonebasics.network.services;

import com.burcutopcu.hearthstonebasics.models.CardModel;
import com.burcutopcu.hearthstonebasics.models.GeneralInfoModel;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface HearthStoneService {

    /**
     * The get request to provide hearth stone general info from api
     *
     * @return general info model
     * @author burcutopcu
     * @since 1.0
     * @see GeneralInfoModel
     */

    @GET("info")
    Call<GeneralInfoModel> getGeneralInfo();

    /**
     * The get request to provide hearth stone search info from api
     *
     * @return general info model
     * @author burcutopcu
     * @since 1.0
     * @see CardModel
     */

    @GET("cards/search/{name}")
    Call<List<CardModel>> getSearchInfo(@Path("name") String name);

    /**
     * The get request to provide hearth stone filtered class info from api
     *
     * @return general info model
     * @author burcutopcu
     * @since 1.0
     * @see CardModel
     */

    @GET("cards/classes/{class}")
    Call<List<CardModel>> getFilteredClassInfo(@Path("class") String name);

    /**
     * The get request to provide hearth stone detiled card class info from api
     *
     * @return general info model
     * @author burcutopcu
     * @since 1.0
     * @see CardModel
     */

    @GET("cards/{name}")
    Call<List<CardModel>> getCardInfoDetail(@Path("name") String name);

}
