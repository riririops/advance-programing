package windows.java.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * <p>ログアウト完了画面のコントローラークラスです。</p>
 * <p>/logout へのリクエストを処理し、ログアウト完了画面を表示します。</p>
 *
 * @author YAMA
 * @since 1.0
 */
@Controller
public class LogoutController {
    /**
     * ログアウトページの表示処理です。
     *
     * @return テンプレート名
     */
    @GetMapping("/logout")
    public String logoutPage() {
        return "logout";
    }
}
