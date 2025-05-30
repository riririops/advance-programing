package windows.java.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>性格診断フォームのコントローラークラスです。</p>
 * <p>名前から性格診断コメントを返します。</p>
 *
 * @author YU 
 * @since 1.0
 */
@Controller
public class PresonalityContoller {
    // ここで返す値を決める
    private static final String[] comments = {
        "あなたはとても社交的で、誰とでもすぐに仲良くなれます。",
        "あなたは冷静で論理的、物事を慎重に考えるタイプです。",
        "あなたはクリエイティブで、独自のアイディアを持っています。",
        "あなたは情熱的で、一度決めたことは最後までやり抜きます。",
        "あなたは優しく思いやりがあり、周囲の人に愛されています。",
        "あなたは好奇心旺盛で、新しいことにどんどんチャレンジします。",
        "あなたは落ち着いていて、頼りがいのある存在です。",
        "あなたはユーモアがあり、周りを楽しい気分にさせます。",
        "あなたは責任感が強く、信頼される人です。",
        "あなたは自由を愛し、型にはまらない生き方を好みます。"
    };

    /**
     * 性格診断フォームの表示処理です。
     *
     * @return フォームテンプレート名
     */
    @GetMapping("\"/personality")
    public String showForm() {
        return "form";
    }

    /**
     * 診断結果の表示処理です。
     *
     * @param name 入力された名前
     * @param model テンプレートに渡すモデル
     * @return 結果テンプレート名
     */
    @PostMapping("/result")
    public String showResult(@RequestParam String name, Model model) {
        int sum = 0;
        for (char c : name.toCharArray()) {
            sum += c;
        }
        int index = sum % comments.length;

        model.addAttribute("name", name);
        model.addAttribute("comment", comments[index]);

        return "result";
    }
}
