package com.burcutopcu.hearthstonebasics.network.repo;

import com.burcutopcu.hearthstonebasics.api.ApiManager;
import com.burcutopcu.hearthstonebasics.api.IServiceResponseCallback;
import com.burcutopcu.hearthstonebasics.models.CardModel;
import com.burcutopcu.hearthstonebasics.models.GeneralInfoModel;
import com.burcutopcu.hearthstonebasics.network.IHearthStoneRepo;
import com.burcutopcu.hearthstonebasics.network.services.HearthStoneService;
import com.google.gson.JsonObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.List;

public class HearthStoneRepo implements IHearthStoneRepo {

    private final String UNKNOWN_ERROR = "An error occured, Please try again later..";
    private HearthStoneService mHearthStoneService;

    public HearthStoneRepo(ApiManager apiManager) {
        this.mHearthStoneService = apiManager.createRetrofitService(HearthStoneService.class);
    }

    @Override
    public void getGeneralInfo(final IServiceResponseCallback<GeneralInfoModel> callback) {
        Call<GeneralInfoModel> infoModelCall = mHearthStoneService.getGeneralInfo();
        infoModelCall.enqueue(new Callback<GeneralInfoModel>() {
            @Override
            public void onResponse(Call<GeneralInfoModel> call, Response<GeneralInfoModel> response) {
                if (response.isSuccessful() && response.body() != null) {
                    callback.onServerCompleted(response.body());
                } else
                    callback.onServerError(UNKNOWN_ERROR);
            }

            @Override
            public void onFailure(Call<GeneralInfoModel> call, Throwable t) {
                callback.onServerError(UNKNOWN_ERROR);
            }
        });
    }

    @Override
    public void getFilteredClassInfo(String name, final IServiceResponseCallback<List<CardModel>> callback) {
        Call<List<CardModel>> cardModelCall = mHearthStoneService.getFilteredClassInfo(name);

        cardModelCall.enqueue(new Callback<List<CardModel>>() {
            @Override
            public void onResponse(Call<List<CardModel>> call, Response<List<CardModel>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    callback.onServerCompleted(response.body());
                } else
                    callback.onServerError(UNKNOWN_ERROR);

            }

            @Override
            public void onFailure(Call<List<CardModel>> call, Throwable t) {
                callback.onServerError(UNKNOWN_ERROR);
            }
        });

    }

    @Override
    public void getSearchInfo(String name, final IServiceResponseCallback<List<CardModel>> callback) {
        Call<List<CardModel>> cardModelCall = mHearthStoneService.getSearchInfo(name);

        cardModelCall.enqueue(new Callback<List<CardModel>>() {
            @Override
            public void onResponse(Call<List<CardModel>> call, Response<List<CardModel>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    callback.onServerCompleted(response.body());
                } else
                    callback.onServerError(UNKNOWN_ERROR);

            }

            @Override
            public void onFailure(Call<List<CardModel>> call, Throwable t) {
                callback.onServerError(UNKNOWN_ERROR);
            }
        });
    }

    @Override
    public void getCardInfoDetail(String name, final IServiceResponseCallback<List<CardModel>> callback) {
        Call<List<CardModel>> cardModelCall = mHearthStoneService.getCardInfoDetail(name);

        cardModelCall.enqueue(new Callback<List<CardModel>>() {
            @Override
            public void onResponse(Call<List<CardModel>> call, Response<List<CardModel>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    callback.onServerCompleted(response.body());
                } else
                    callback.onServerError(UNKNOWN_ERROR);

            }

            @Override
            public void onFailure(Call<List<CardModel>> call, Throwable t) {
                callback.onServerError(UNKNOWN_ERROR);
            }
        });


    }
}
