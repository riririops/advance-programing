package windows.java.demo.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * <p>挨拶や通知などのメッセージを表すモデルクラスです。</p>
 *
 * @author YAMA
 * @since 1.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Message {
    /** メッセージ本文 */
    private String message;

    /**
     * デフォルトコンストラクタ
     */
    public Message() {}

    /**
     * メッセージを指定して生成します。
     * @param message メッセージ本文
     */
    public Message(String message) {
        this.message = message;
    }

    /**
     * メッセージ本文の取得
     * @return メッセージ本文
     */
    public String getMessage() {
        return message;
    }

    /**
     * メッセージ本文の設定
     * @param message メッセージ本文
     */
    public void setMessage(String message) {
        this.message = message;
    }
}

// Compare this snippet from src/main/java/windows/java/demo/service/HelloService.java:
// package windows.java.demo.service;
