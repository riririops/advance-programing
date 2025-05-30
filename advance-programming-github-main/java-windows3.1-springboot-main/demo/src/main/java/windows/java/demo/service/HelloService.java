package windows.java.demo.service;

import org.springframework.stereotype.Service;

import windows.java.demo.model.Message;

/**
 * <p>挨拶メッセージを返すサービスクラスです。</p>
 *
 * @author YAMA
 * @since 1.0
 */
@Service
public class HelloService {
    /**
     * 挨拶メッセージを生成して返します。
     *
     * @return Message メッセージオブジェクト
     */
    public Message getMessage() {
        return new Message("");
    }
}


