package windows.java.demo.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

/**
 * <p>カスタムエラー画面のコントローラークラスです。</p>
 * <p>/error へのリクエストを処理し、404やその他のエラー画面を表示します。</p>
 *
 * @author YAMA
 * @since 1.0
 */
@Controller
public class CustomErrorController implements ErrorController {

    /**
     * エラー発生時の画面遷移処理です。
     *
     * @param request HttpServletRequest
     * @return テンプレート名
     */
    @RequestMapping("/error")
    public String handleError(HttpServletRequest request) {
        int status = (int) request.getAttribute("jakarta.servlet.error.status_code");
        if (status == 404) {
            return "notfound"; // resources/templates/notfound.html
        }
        return "error"; // 他のエラー用（オプション）
    }

}
