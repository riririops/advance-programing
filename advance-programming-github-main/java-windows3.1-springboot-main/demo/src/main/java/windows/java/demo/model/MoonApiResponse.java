package windows.java.demo.model;

import java.util.List;

/**
 * <p>月APIのレスポンス全体モデルクラスです。</p>
 *
 * @author YAMA
 * @since 1.0
 */
public class MoonApiResponse {
    /** ステータスコード */
    public int status;
    /** 月情報リスト */
    public List<MoonResult> result;
}
