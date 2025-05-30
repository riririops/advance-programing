package windows.java.demo;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * <p>サーブレット環境用のSpring Boot初期化クラスです。</p>
 * <p>WARデプロイ時にSpring Bootアプリケーションを初期化します。</p>
 *
 * @author YAMA
 * @since 1.0
 */
public class ServletInitializer extends SpringBootServletInitializer {

    /**
     * Springアプリケーションの設定を行います。
     *
     * @param application SpringApplicationBuilder
     * @return 設定済みのSpringApplicationBuilder
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DemoApplication.class);
    }

}
