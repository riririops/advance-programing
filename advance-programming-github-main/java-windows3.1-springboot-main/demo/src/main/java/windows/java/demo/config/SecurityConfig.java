package windows.java.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

/**
 * <p>Spring Securityの設定クラスです。</p>
 * <p>認証・認可やログインページの設定を行います。</p>
 *
 * @author YAMA
 * @since 1.0
 */
@Configuration
public class SecurityConfig {
    /**
     * セキュリティフィルタチェーンの設定です。
     *
     * @param http HttpSecurity
     * @return SecurityFilterChain
     * @throws Exception セキュリティ設定例外
     */
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(authz -> authz
                .requestMatchers("/login", "/login/", "/css/**", "/js/**", "/images/**", "/static/**").permitAll()
                .anyRequest().authenticated()
            )
            .formLogin(form -> form
                .loginPage("/login") // ログインページ
                .defaultSuccessUrl("/index", true) // ログイン成功後の遷移先
                .permitAll()
            )
            .oauth2Login(oauth2 -> oauth2
                .loginPage("/login/") // OAuth2ログインページ
                .defaultSuccessUrl("/index", true) // OAuth2ログイン成功後の遷移先
                .failureUrl("/login?error")
            )
            .logout(logout -> logout
                .logoutSuccessUrl("/login/")
            );
        return http.build();
    }
}
