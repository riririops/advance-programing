package windows.java.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * <p>Spring Bootアプリケーションのエントリポイントクラスです。</p>
 * <p>このクラスの {@link #main(String[])} メソッドからアプリ全体を起動します。</p>
 *
 * @author YAMA
 * @since 1.0
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class }) // データソースの自動設定を除外
public class DemoApplication {
    /**
     * アプリケーションの起動メソッドです。
     *
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
