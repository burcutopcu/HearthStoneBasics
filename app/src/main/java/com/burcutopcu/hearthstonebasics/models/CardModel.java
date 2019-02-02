package com.burcutopcu.hearthstonebasics.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CardModel {
    @SerializedName("cardId")
    @Expose
    private String cardId;
    @SerializedName("dbfId")
    @Expose
    private String dbfId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("cardSet")
    @Expose
    private String cardSet;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("faction")
    @Expose
    private String faction;
    @SerializedName("rarity")
    @Expose
    private String rarity;
    @SerializedName("cost")
    @Expose
    private Integer cost;
    @SerializedName("attack")
    @Expose
    private Integer attack;
    @SerializedName("health")
    @Expose
    private Integer health;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("flavor")
    @Expose
    private String flavor;
    @SerializedName("artist")
    @Expose
    private String artist;
    @SerializedName("collectible")
    @Expose
    private Boolean collectible;
    @SerializedName("race")
    @Expose
    private String race;
    @SerializedName("playerClass")
    @Expose
    private String playerClass;
    @SerializedName("howToGet")
    @Expose
    private String howToGet;
    @SerializedName("howToGetGold")
    @Expose
    private String howToGetGold;
    @SerializedName("img")
    @Expose
    private String img;
    @SerializedName("imgGold")
    @Expose
    private String imgGold;
    @SerializedName("locale")
    @Expose
    private String locale;
    @SerializedName("mechanics")
    @Expose
    private List<MechanicModel> mechanics = null;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getDbfId() {
        return dbfId;
    }

    public void setDbfId(String dbfId) {
        this.dbfId = dbfId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardSet() {
        return cardSet;
    }

    public void setCardSet(String cardSet) {
        this.cardSet = cardSet;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Boolean getCollectible() {
        return collectible;
    }

    public void setCollectible(Boolean collectible) {
        this.collectible = collectible;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getPlayerClass() {
        return playerClass;
    }

    public void setPlayerClass(String playerClass) {
        this.playerClass = playerClass;
    }

    public String getHowToGet() {
        return howToGet;
    }

    public void setHowToGet(String howToGet) {
        this.howToGet = howToGet;
    }

    public String getHowToGetGold() {
        return howToGetGold;
    }

    public void setHowToGetGold(String howToGetGold) {
        this.howToGetGold = howToGetGold;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getImgGold() {
        return imgGold;
    }

    public void setImgGold(String imgGold) {
        this.imgGold = imgGold;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public List<MechanicModel> getMechanics() {
        return mechanics;
    }

    public void setMechanics(List<MechanicModel> mechanics) {
        this.mechanics = mechanics;
    }
}
