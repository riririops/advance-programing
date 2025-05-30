package windows.java.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * <p>福笑いゲームページのコントローラークラスです。</p>
 * <p>/fukuwarai へのリクエストを処理し、福笑い画面を表示します。</p>
 *
 * @author MASTU
 * @since 1.0
 */
@Controller
public class FukuwaraiController {
    /**
     * 福笑いページの表示処理です。
     *
     * @return テンプレート名
     */
    @GetMapping("/fukuwarai")
    public String puzzle() {
        return "fukuwarai";
    }
}