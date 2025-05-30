package windows.java.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * <p>天気予報全体のデータモデルクラスです。</p>
 * <p>気象庁APIのレスポンスに対応します。</p>
 *
 * @author YAMA
 * @since 1.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecast {
    /** 発表元の気象台名 */
    public String publishingOffice;
    /** 発表日時（ISO8601文字列） */
    public String reportDatetime;
    /** 時系列データリスト */
    public List<TimeSeries> timeSeries;
    /** 平均気温データ */
    private TempAverage tempAverage;

    /**
     * 平均気温データのgetter
     * @return TempAverage 平均気温
     */
    public TempAverage getTempAverage() {
        return tempAverage;
    }

    /**
     * 平均気温データのsetter
     * @param tempAverage 平均気温
     */
    public void setTempAverage(TempAverage tempAverage) {
        this.tempAverage = tempAverage;
    }
}

