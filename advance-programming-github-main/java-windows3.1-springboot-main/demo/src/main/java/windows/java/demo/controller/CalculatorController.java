package windows.java.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 電卓ページのコントローラー。
 * GETで画面表示、POSTで計算処理を行う。
 */
@Controller
public class CalculatorController {

    /**
     * 電卓画面の表示。
     * @return テンプレート名
     */
    @GetMapping("/calculator")
    public String showCalculator() {
        return "calculator";
    }

    /**
     * 計算処理。
     * @param num1 数値1
     * @param num2 数値2
     * @param op 演算子
     * @param model 結果を渡すモデル
     * @return テンプレート名
     */
    @PostMapping("/calculator")
    public String calculate(@RequestParam double num1,
                            @RequestParam double num2,
                            @RequestParam String op,
                            Model model) {
        // 四則演算を実行
        double result = switch (op) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num2 != 0 ? num1 / num2 : Double.NaN;
            default -> 0;
        };
        model.addAttribute("result", result);
        return "calculator";
    }
}
