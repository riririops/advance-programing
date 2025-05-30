package windows.java.demo.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import windows.java.demo.model.Forecast;
import windows.java.demo.service.WeatherService;

/**
 * <p>天気情報ページのコントローラークラスです。</p>
 * <p>/weather へのリクエストを処理し、天気データを画面に渡します。</p>
 *
 * @author YAMA
 * @since 1.0
 */
@Controller
@RequestMapping("/weather")
public class WeatherController {

    // 天気情報取得サービス
    private final WeatherService weatherService;

    /**
     * DIによるWeatherServiceの注入
     * @param weatherService 天気サービス
     */
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    /**
     * 天気ページの表示処理です。
     *
     * @param model テンプレートに渡すモデル
     * @param locale ロケール情報
     * @return テンプレート名
     */
    @GetMapping
    public String showWeather(Model model, Locale locale) {
        LocalDateTime dateObject = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm", locale);

        // 天気データを取得してモデルに追加
        Forecast weather = weatherService.getTokyoForecast();
        model.addAttribute("weather", weather);

        model.addAttribute("dateObject", dateObject);
        model.addAttribute("formatter", formatter);
        return "weather";
    }
}

