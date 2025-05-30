package windows.java.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>計算機（電卓）機能のコントローラークラスです。</p>
 * <p>/calculate POSTリクエストを処理し、計算結果を画面に渡します。</p>
 *
 * @author YAMA
 * @since 1.0
 */
@Controller
public class CalculateController {
    /**
     * 計算処理です。
     *
     * @param a 数値a
     * @param b 数値b
     * @param op 演算子
     * @param model テンプレートに渡すモデル
     * @return テンプレート名
     */
    @PostMapping("/calculate")
    public String calculate(@RequestParam double a, @RequestParam double b, @RequestParam(required = false, defaultValue = "+") String op, Model model) {
        double result;
        String error = null;
        switch (op) {
            case "+" -> result = a + b;
            case "-" -> result = a - b;
            case "*" -> result = a * b;
            case "/" -> {
                if (b == 0) {
                    error = "0で割ることはできません";
                    result = Double.NaN;
                } else {
                    result = a / b;
                }
            }
            default -> {
                error = "不正な演算子です";
                result = Double.NaN;
            }
        }
        model.addAttribute("result", result);
        if (error != null) model.addAttribute("error", error);
        return "calculator";
    }
}
