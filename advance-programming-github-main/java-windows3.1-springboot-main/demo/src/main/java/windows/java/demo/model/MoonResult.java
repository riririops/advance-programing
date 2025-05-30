package windows.java.demo.model;

/**
 * <p>月の位置・月齢などの情報を表すモデルクラスです。</p>
 *
 * @author YAMA
 * @since 1.0
 */
public class MoonResult {
    /** 黄経 */
    public double ecliptic_longitude;
    /** 黄緯 */
    public double ecliptic_latitude;
    /** 高度 */
    public double altitude;
    /** 時刻 */
    public String time;
    /** 経度 */
    public double longitude;
    /** 方位角 */
    public double azimuth;
    /** 緯度 */
    public double latitude;
    /** 月齢 */
    public double age;
}
