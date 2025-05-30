package windows.java.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * <p>お絵かき（ペイント）ページのコントローラークラスです。</p>
 * <p>/paint へのリクエストを処理し、ペイント画面を表示します。</p>
 *
 * @author YAMA
 * @since 1.0
 */
@Controller
public class PaintController {
    /**
     * ペイントページの表示処理です。
     *
     * @return テンプレート名
     */
    @GetMapping("/paint")
    public String showPaintPage() {
        return "paint"; // paint.html を返す
    }
}
