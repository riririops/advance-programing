package windows.java.demo.model;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * <p>時系列ごとの天気データを表すモデルクラスです。</p>
 * <p>気象庁APIのtimeSeries要素に対応します。</p>
 *
 * @author YAMA
 * @since 1.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TimeSeries {
    /** 日時リスト（ISO8601文字列） */
    public List<String> timeDefines;
    /** 地域ごとの天気データリスト */
    public List<Area> areas;
    /** 追加データ（未使用） */
    public Map<String, Object> data;
}

