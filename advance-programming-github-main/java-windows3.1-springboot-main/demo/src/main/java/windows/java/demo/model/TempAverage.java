package windows.java.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * <p>平均気温データを表すモデルクラスです。</p>
 *
 * @author jyori
 * @since 1.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TempAverage {
    /** 最低気温 */
    private String minTemp;
    /** 最高気温 */
    private String maxTemp;

    // --- getter / setter ---
    /**
     * 最低気温の取得
     * @return 最低気温
     */
    public String getMinTemp() {
        return minTemp;
    }
    /**
     * 最低気温の設定
     * @param minTemp 最低気温
     */
    public void setMinTemp(String minTemp) {
        this.minTemp = minTemp;
    }

    /**
     * 最高気温の取得
     * @return 最高気温
     */
    public String getMaxTemp() {
        return maxTemp;
    }
    /**
     * 最高気温の設定
     * @param maxTemp 最高気温
     */
    public void setMaxTemp(String maxTemp) {
        this.maxTemp = maxTemp;
    }
}