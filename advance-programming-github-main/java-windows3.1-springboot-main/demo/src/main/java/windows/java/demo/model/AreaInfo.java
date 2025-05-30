package windows.java.demo.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * <p>地域情報（エリア名・コード）を表すモデルクラスです。</p>
 *
 * @author YAMA
 * @since 1.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AreaInfo {
    /** 地域名 */
    private String name;
    /** 地域コード */
    private String code;

    // --- getter / setter ---
    /**
     * 地域名の取得
     * @return 地域名
     */
    public String getName() {
        return name;
    }
    /**
     * 地域名の設定
     * @param name 地域名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 地域コードの取得
     * @return 地域コード
     */
    public String getCode() {
        return code;
    }
    /**
     * 地域コードの設定
     * @param code 地域コード
     */
    public void setCode(String code) {
        this.code = code;
    }
}

