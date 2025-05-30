package windows.java.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * <p>アプリケーション全体の設定クラスです。</p>
 * <p>Bean定義や共通設定を行います。</p>
 *
 * @author YAMA
 * @since 1.0
 */
@Configuration
public class AppConfig {
    /**
     * RestTemplateのBean定義です。
     *
     * @return RestTemplateインスタンス
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
