package com.burcutopcu.hearthstonebasics.helper.modelParseHelper;

import com.burcutopcu.hearthstonebasics.fakes.FakeGLobalGson;
import com.burcutopcu.hearthstonebasics.fakes.FakeGeneralInfoModel;
import com.burcutopcu.hearthstonebasics.models.GeneralInfoModel;
import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GeneralInfoModelParseHelperTest {

    private GeneralInfoModelParseHelper mParseHelper;
    private FakeGeneralInfoModel mFakeInfoModel;
    private FakeGLobalGson mGson;

    @Before
    public void setUp() {
        mParseHelper = new GeneralInfoModelParseHelper();
        mFakeInfoModel = new FakeGeneralInfoModel();
        mGson = new FakeGLobalGson();
    }

    @Test
    public void getHeroClassList_ShouldReturnCorrectly() {

        //Given
        GeneralInfoModel fakeModel = this.mFakeInfoModel.getGeneralInfoModel(mGson.getFakeGlobalJson());


        //When
        List<String> actual = this.mParseHelper.getHeroClassList(fakeModel);


        //Then
        Assertions.assertThat(actual)
                .isNotNull()
                .isNotEmpty()
                .hasSize(12);

        Assertions.assertThat(actual.get(1))
                .isEqualTo("Druid");
    }

    @Test
    public void getHeroClassList_ShouldReturnNull() {
        //Given
        GeneralInfoModel fakeModel = this.mFakeInfoModel.getGeneralInfoWithoutClasses(mGson.getFakeGlobalJson());

        //When
        List<String> actual = this.mParseHelper.getHeroClassList(fakeModel);

        //Then
        Assertions.assertThat(actual)
                .isNull();

    }

    @After
    public void tearDown() {
        mParseHelper = null;
        mFakeInfoModel = null;
        mGson = null;
    }
}