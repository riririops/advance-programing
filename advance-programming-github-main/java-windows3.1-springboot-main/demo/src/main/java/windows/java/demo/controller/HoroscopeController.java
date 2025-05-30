package windows.java.demo.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 星座占いページのコントローラー。
 * <p>
 * /horoscope へのリクエストを処理し、星座ごとの運勢を画面に渡す。
 */
@Controller
public class HoroscopeController {

    private static final List<String> SIGNS = Arrays.asList(
        "おひつじ座", "おうし座", "ふたご座", "かに座", "しし座", "おとめ座",
        "てんびん座", "さそり座", "いて座", "やぎ座", "みずがめ座", "うお座"
    );

    private static final List<String> COMMENTS = Arrays.asList(
        "新しい出会いがありそう！",
        "思い切って行動すると吉。",
        "小さな幸せを見つけられる日。",
        "友達との会話が運気アップの鍵。",
        "チャレンジ精神が大切！",
        "リラックスする時間を大切に。",
        "笑顔を忘れずに過ごそう。",
        "身近な人に感謝を伝えてみて。",
        "計画的に動くと良い結果に。",
        "自分を信じて進もう！",
        "思いがけないラッキーがあるかも。",
        "健康に気をつけて過ごそう。"
    );

    private static final List<String> LUCKY_ITEMS = Arrays.asList(
        "赤いペン", "お気に入りのマグカップ", "音楽プレイヤー", "青いハンカチ",
        "新しいノート", "スマートフォン", "観葉植物", "お菓子", "腕時計",
        "本", "カラフルな靴下", "香水"
    );

    /**
     * 星座占いページの表示。
     * @param sign 星座名
     * @param model テンプレートに渡すモデル
     * @return テンプレート名
     */
    @GetMapping("/horoscope")
    public String showHoroscope(@RequestParam(required = false) String sign, Model model) {
        List<String> ranking = Arrays.asList(SIGNS.toArray(new String[0]));
        Collections.shuffle(ranking); // ランダムに並び替え

        model.addAttribute("ranking", ranking);
        model.addAttribute("sign", sign);

        if (sign != null && ranking.contains(sign)) {
            int rank = ranking.indexOf(sign) + 1;
            model.addAttribute("rank", rank);

            // コメントとラッキーアイテムをランダムで選ぶ
            Random rand = new Random();
            String comment = COMMENTS.get(rand.nextInt(COMMENTS.size()));
            String luckyItem = LUCKY_ITEMS.get(rand.nextInt(LUCKY_ITEMS.size()));
            model.addAttribute("comment", comment);
            model.addAttribute("luckyItem", luckyItem);
        }
        return "horoscope";
    }
}
