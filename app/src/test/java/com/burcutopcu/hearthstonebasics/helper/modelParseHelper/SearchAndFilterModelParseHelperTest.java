package com.burcutopcu.hearthstonebasics.helper.modelParseHelper;

import com.burcutopcu.hearthstonebasics.fakes.FakeCardInfoModel;
import com.burcutopcu.hearthstonebasics.fakes.FakeGLobalGson;
import com.burcutopcu.hearthstonebasics.models.CardModel;
import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SearchAndFilterModelParseHelperTest {

    private FakeCardInfoModel mFakeCardInfoModel;
    private FakeGLobalGson mFakeGlobalGson;
    private SearchAndFilterModelParseHelper mParseHelper;

    @Before
    public void setUp() {
        mFakeCardInfoModel= new FakeCardInfoModel();
        mFakeGlobalGson=new FakeGLobalGson();
        mParseHelper=new SearchAndFilterModelParseHelper();
    }

    @Test
    public void getFirstTenCard_ShouldReturnTenCards(){

        //Given
        List<CardModel> fakeCardModelList= mFakeCardInfoModel.getCardListModel(mFakeGlobalGson.getFakeGlobalJson());

        //When
        List<CardModel> actual= mParseHelper.getFirstTenCard(fakeCardModelList);

        //Then
        Assertions.assertThat(actual)
                .isNotNull()
                .isNotEmpty()
                .hasSize(10);

        Assertions.assertThat(actual.get(0).getName())
                .isNotNull()
                .isEqualTo("Next Hero: Druid Ench");

    }

    @Test
    public void getFirstTenCard_ShouldReturnNull() {

        //Given
        List<CardModel> fakeCardModelList= mFakeCardInfoModel.getNullCardListModel();

        //When
        List<CardModel> actual=mParseHelper.getFirstTenCard(fakeCardModelList);

        //Then
        Assertions.assertThat(actual)
                .isNull();
    }

    @Test
    public void getFirstTenCard_ShouldReturnWithSizeUntilTen() {

        //Given
        List<CardModel> fakeCardModelList = mFakeCardInfoModel.getCardListModelWithSizeUntilTen(mFakeGlobalGson.getFakeGlobalJson());

        //When
        List<CardModel> actual= mParseHelper.getFirstTenCard(fakeCardModelList);

        //Then
        Assertions.assertThat(actual)
                .isNotEmpty()
                .isNotNull()
                .hasSize(5);
    }

    @After
    public void tearDown() {
        mFakeCardInfoModel=null;
        mFakeGlobalGson=null;
        mParseHelper=null;
    }
}