package windows.java.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * <p>地域ごとの天気データモデルクラスです。</p>
 * <p>気象庁APIのareas要素に対応します。</p>
 *
 * @author YAMA
 * @since 1.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Area {
    /** 地域情報 */
    private AreaInfo area;
    /** 降水確率リスト */
    private List<String> pops;
    /** 天気リスト */
    private List<String> weathers;
    /** 天気コードリスト */
    private List<String> weatherCodes;
    /** 風情報リスト */
    private List<String> winds;
    /** 波情報リスト */
    private List<String> waves;
    /** 気温リスト */
    private List<String> temps;

    // --- getter / setter ---
    /**
     * 地域情報の取得
     * @return 地域情報
     */
    public AreaInfo getArea() {
        return area;
    }
    /**
     * 地域情報の設定
     * @param area 地域情報
     */
    public void setArea(AreaInfo area) {
        this.area = area;
    }

    /**
     * 降水確率リストの取得
     * @return 降水確率リスト
     */
    public List<String> getPops() {
        return pops;
    }
    /**
     * 降水確率リストの設定
     * @param pops 降水確率リスト
     */
    public void setPops(List<String> pops) {
        this.pops = pops;
    }

    /**
     * 天気リストの取得
     * @return 天気リスト
     */
    public List<String> getWeathers() {
        return weathers;
    }
    /**
     * 天気リストの設定
     * @param weathers 天気リスト
     */
    public void setWeathers(List<String> weathers) {
        this.weathers = weathers;
    }

    /**
     * 天気コードリストの取得
     * @return 天気コードリスト
     */
    public List<String> getWeatherCodes() {
        return weatherCodes;
    }
    /**
     * 天気コードリストの設定
     * @param weatherCodes 天気コードリスト
     */
    public void setWeatherCodes(List<String> weatherCodes) {
        this.weatherCodes = weatherCodes;
    }

    /**
     * 風情報リストの取得
     * @return 風情報リスト
     */
    public List<String> getWinds() {
        return winds;
    }
    /**
     * 風情報リストの設定
     * @param winds 風情報リスト
     */
    public void setWinds(List<String> winds) {
        this.winds = winds;
    }

    /**
     * 波情報リストの取得
     * @return 波情報リスト
     */
    public List<String> getWaves() {
        return waves;
    }
    /**
     * 波情報リストの設定
     * @param waves 波情報リスト
     */
    public void setWaves(List<String> waves) {
        this.waves = waves;
    }

    /**
     * 気温リストの設定
     * @param temps 気温リスト
     */
    public void setTemps(List<String> temps) {
        this.temps = temps;
    }
    /**
     * 気温リストの取得
     * @return 気温リスト
     */
    public List<String> getTemps() {
        return temps;
    }
}



