package windows.java.demo.model;

/**
 * <p>月齢・照度・月相などの月情報レスポンスモデルクラスです。</p>
 *
 * @author YAMA
 * @since 1.0
 */
public class MoonResponse {
    /** 月齢 */
    public double moonage;
    /** 月の照度 */
    public double illumination;
    /** 月相 */
    public String phase;
    /** 時刻 */
    public String time;
    // 必要に応じて他のフィールドも追加
}
