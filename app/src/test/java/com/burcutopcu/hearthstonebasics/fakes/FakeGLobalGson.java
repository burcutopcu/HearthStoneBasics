package com.burcutopcu.hearthstonebasics.fakes;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class FakeGLobalGson {
    public Gson getFakeGlobalJson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        return gsonBuilder.create();
    }
}
