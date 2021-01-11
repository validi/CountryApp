package com.aurora.countryapp.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import java.util.List;


import com.aurora.countryapp.BR;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Country extends BaseObservable {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("topLevelDomain")
    @Expose
    private List<String> topLevelDomain = null;
    @SerializedName("alpha2Code")
    @Expose
    private String alpha2Code;
    @SerializedName("alpha3Code")
    @Expose
    private String alpha3Code;
    @SerializedName("callingCodes")
    @Expose
    private List<String> callingCodes = null;
    @SerializedName("capital")
    @Expose
    private String capital;
    @SerializedName("altSpellings")
    @Expose
    private List<String> altSpellings = null;
    @SerializedName("region")
    @Expose
    private String region;
    @SerializedName("subregion")
    @Expose
    private String subregion;
    @SerializedName("population")
    @Expose
    private Integer population;
    @SerializedName("latlng")
    @Expose
    private List<Double> latlng = null;
    @SerializedName("demonym")
    @Expose
    private String demonym;
    @SerializedName("area")
    @Expose
    private Double area;
    @SerializedName("gini")
    @Expose
    private Double gini;
    @SerializedName("timezones")
    @Expose
    private List<String> timezones = null;
    @SerializedName("borders")
    @Expose
    private List<String> borders = null;
    @SerializedName("nativeName")
    @Expose
    private String nativeName;
    @SerializedName("numericCode")
    @Expose
    private String numericCode;
    @SerializedName("currencies")
    @Expose
    private List<Currency> currencies = null;
    @SerializedName("languages")
    @Expose
    private List<Language> languages = null;
    @SerializedName("translations")
    @Expose
    private Translations translations;
    @SerializedName("flag")
    @Expose
    private String flag;
    @SerializedName("regionalBlocs")
    @Expose
    private List<RegionalBloc> regionalBlocs = null;
    @SerializedName("cioc")
    @Expose
    private String cioc;

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR._all);
    }

    public List<String> getTopLevelDomain() {
        return topLevelDomain;
    }

    public void setTopLevelDomain(List<String> topLevelDomain) {
        this.topLevelDomain = topLevelDomain;
    }

    @Bindable
    public String getAlpha2Code() {
        return alpha2Code;
    }

    public void setAlpha2Code(String alpha2Code) {
        this.alpha2Code = alpha2Code;
        notifyPropertyChanged(BR._all);
    }

    public String getAlpha3Code() {
        return alpha3Code;
    }

    public void setAlpha3Code(String alpha3Code) {
        this.alpha3Code = alpha3Code;
    }

    public List<String> getCallingCodes() {
        return callingCodes;
    }

    public void setCallingCodes(List<String> callingCodes) {
        this.callingCodes = callingCodes;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public List<String> getAltSpellings() {
        return altSpellings;
    }

    public void setAltSpellings(List<String> altSpellings) {
        this.altSpellings = altSpellings;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public List<Double> getLatlng() {
        return latlng;
    }

    public void setLatlng(List<Double> latlng) {
        this.latlng = latlng;
    }

    public String getDemonym() {
        return demonym;
    }

    public void setDemonym(String demonym) {
        this.demonym = demonym;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getGini() {
        return gini;
    }

    public void setGini(Double gini) {
        this.gini = gini;
    }

    public List<String> getTimezones() {
        return timezones;
    }

    public void setTimezones(List<String> timezones) {
        this.timezones = timezones;
    }

    public List<String> getBorders() {
        return borders;
    }

    public void setBorders(List<String> borders) {
        this.borders = borders;
    }


    public String getNativeName() {
        return nativeName;
    }

    public void setNativeName(String nativeName) {
        this.nativeName = nativeName;
    }

    public String getNumericCode() {
        return numericCode;
    }

    public void setNumericCode(String numericCode) {
        this.numericCode = numericCode;
    }

    public List<Currency> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<Currency> currencies) {
        this.currencies = currencies;
    }

    public List<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    public Translations getTranslations() {
        return translations;
    }

    public void setTranslations(Translations translations) {
        this.translations = translations;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public List<RegionalBloc> getRegionalBlocs() {
        return regionalBlocs;
    }

    public void setRegionalBlocs(List<RegionalBloc> regionalBlocs) {
        this.regionalBlocs = regionalBlocs;
    }

    public String getCioc() {
        return cioc;
    }

    public void setCioc(String cioc) {
        this.cioc = cioc;
    }

}

class Currency {

    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("symbol")
    @Expose
    private String symbol;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

}

class Language  extends BaseObservable{

    @SerializedName("iso639_1")
    @Expose
    private String iso6391;
    @SerializedName("iso639_2")
    @Expose
    private String iso6392;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("nativeName")
    @Expose
    private String nativeName;

    public String getIso6391() {
        return iso6391;
    }

    public void setIso6391(String iso6391) {
        this.iso6391 = iso6391;
    }

    public String getIso6392() {
        return iso6392;
    }

    public void setIso6392(String iso6392) {
        this.iso6392 = iso6392;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Bindable
    public String getNativeName() {
        return nativeName;
    }

    public void setNativeName(String nativeName) {
        this.nativeName = nativeName;
        notifyPropertyChanged(BR._all);
    }

}

 class RegionalBloc {

    @SerializedName("acronym")
    @Expose
    private String acronym;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("otherAcronyms")
    @Expose
    private List<Object> otherAcronyms = null;
    @SerializedName("otherNames")
    @Expose
    private List<Object> otherNames = null;

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Object> getOtherAcronyms() {
        return otherAcronyms;
    }

    public void setOtherAcronyms(List<Object> otherAcronyms) {
        this.otherAcronyms = otherAcronyms;
    }

    public List<Object> getOtherNames() {
        return otherNames;
    }

    public void setOtherNames(List<Object> otherNames) {
        this.otherNames = otherNames;
    }

}

 class Translations {

    @SerializedName("de")
    @Expose
    private String de;
    @SerializedName("es")
    @Expose
    private String es;
    @SerializedName("fr")
    @Expose
    private String fr;
    @SerializedName("ja")
    @Expose
    private String ja;
    @SerializedName("it")
    @Expose
    private String it;
    @SerializedName("br")
    @Expose
    private String br;
    @SerializedName("pt")
    @Expose
    private String pt;
    @SerializedName("nl")
    @Expose
    private String nl;
    @SerializedName("hr")
    @Expose
    private String hr;
    @SerializedName("fa")
    @Expose
    private String fa;

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getEs() {
        return es;
    }

    public void setEs(String es) {
        this.es = es;
    }

    public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr;
    }

    public String getJa() {
        return ja;
    }

    public void setJa(String ja) {
        this.ja = ja;
    }

    public String getIt() {
        return it;
    }

    public void setIt(String it) {
        this.it = it;
    }

    public String getBr() {
        return br;
    }

    public void setBr(String br) {
        this.br = br;
    }

    public String getPt() {
        return pt;
    }

    public void setPt(String pt) {
        this.pt = pt;
    }

    public String getNl() {
        return nl;
    }

    public void setNl(String nl) {
        this.nl = nl;
    }

    public String getHr() {
        return hr;
    }

    public void setHr(String hr) {
        this.hr = hr;
    }

    public String getFa() {
        return fa;
    }

    public void setFa(String fa) {
        this.fa = fa;
    }

}
