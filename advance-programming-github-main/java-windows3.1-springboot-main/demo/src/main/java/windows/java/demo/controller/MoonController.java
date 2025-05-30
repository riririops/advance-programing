package windows.java.demo.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import windows.java.demo.model.MoonApiResponse;
import windows.java.demo.model.MoonResult;

/**
 * <p>月情報ページのコントローラークラスです。</p>
 * <p>/moon へのリクエストを処理し、月の位置や月齢などの情報を画面に渡します。</p>
 *
 * @author YAMA
 * @since 1.0
 */
@Controller
public class MoonController {
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 月情報ページの表示処理です。
     *
     * @param model テンプレートに渡すモデル
     * @return テンプレート名
     */
    @GetMapping("/moon")
    public String showMoonInfo(Model model) {
        LocalDate today = LocalDate.now();
        String dateStr = today.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        String url = String.format(
            "https://mgpn.org/api/moon/v2position.cgi?time=%sT12:00&lat=35.00&lon=135.00",
            dateStr
        );

        MoonApiResponse response = restTemplate.getForObject(url, MoonApiResponse.class);
        MoonResult moon = (response != null && response.result != null && !response.result.isEmpty())
                ? response.result.get(0)
                : null;
        model.addAttribute("moon", moon);
        return "moon";
    }
}
