package windows.java.demo.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import windows.java.demo.model.AnniversaryResponse;

/**
 * <p>記念日情報ページのコントローラークラスです。</p>
 * <p>/anniversary へのリクエストを処理し、今日の記念日情報を画面に渡します。</p>
 *
 * @author YAMA
 * @since 1.0
 */
@Controller
public class AnniversaryController {
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 記念日ページの表示処理です。
     *
     * @param model テンプレートに渡すモデル
     * @return テンプレート名
     */
    @GetMapping("/anniversary")
    public String showAnniversary(Model model) {
        LocalDate today = LocalDate.now();
        String mmdd = String.format("%02d%02d", today.getMonthValue(), today.getDayOfMonth());
        String url = String.format("https://api.whatistoday.cyou/v3/anniv/%s", mmdd);

        List<String> anniversaries = new ArrayList<>();
        try {
            AnniversaryResponse response = restTemplate.getForObject(url, AnniversaryResponse.class);
            if (response != null) {
                if (response.anniv1 != null && !response.anniv1.isEmpty()) anniversaries.add(response.anniv1);
                if (response.anniv2 != null && !response.anniv2.isEmpty()) anniversaries.add(response.anniv2);
                if (response.anniv3 != null && !response.anniv3.isEmpty()) anniversaries.add(response.anniv3);
                if (response.anniv4 != null && !response.anniv4.isEmpty()) anniversaries.add(response.anniv4);
                if (response.anniv5 != null && !response.anniv5.isEmpty()) anniversaries.add(response.anniv5);
            }
        } catch (HttpClientErrorException e) {
            // 404などの場合
        }
        if (anniversaries.isEmpty()) {
            anniversaries.add("特別な記念日はありません");
        }
        model.addAttribute("anniversaries", anniversaries);
        model.addAttribute("today", mmdd);
        return "anniversary";
    }
}
