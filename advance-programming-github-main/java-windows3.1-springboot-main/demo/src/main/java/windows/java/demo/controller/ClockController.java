package windows.java.demo.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * <p>時計表示ページのコントローラークラスです。</p>
 * <p>/clock へのリクエストを処理し、現在時刻を画面に渡します。</p>
 *
 * @author YAMA
 * @since 1.0
 */
@Controller
public class ClockController {

    /**
     * 時計ページの表示処理です。
     *
     * @param model テンプレートに渡すモデル
     * @return テンプレート名
     */
    @GetMapping("/clock")
    public String showClock(Model model) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        String currentTime = LocalDateTime.now().format(formatter);
        model.addAttribute("currentTime", currentTime);
        return "clock";
    }
}
