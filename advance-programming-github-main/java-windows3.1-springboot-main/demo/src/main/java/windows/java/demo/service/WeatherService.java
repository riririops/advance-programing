package windows.java.demo.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import windows.java.demo.model.Forecast;
import windows.java.demo.model.TempAverage;
import windows.java.demo.model.TimeSeries;

/**
 * <p>天気情報を外部APIから取得するサービスクラスです。</p>
 *
 * @author YAMA
 * @since 1.0
 */
@Service
public class WeatherService {

    /**
     * サンプルのstaticメソッド（未使用）
     *
     * @throws UnsupportedOperationException 未サポート
     */
    public static WeatherService getWeather() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    // 天気API呼び出し用のRestTemplate
    private final RestTemplate restTemplate;

    /**
     * RestTemplateのDIコンストラクタです。
     *
     * @param restTemplate RestTemplateインスタンス
     */
    public WeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     * <p>大阪の天気予報データを取得し、必要な情報を整形して返します。</p>
     *
     * @return Forecast 天気予報データ
     */
    public Forecast getTokyoForecast() {
        String url = "https://www.jma.go.jp/bosai/forecast/data/forecast/270000.json";
        ResponseEntity<Forecast[]> response = restTemplate.getForEntity(url, Forecast[].class);
        Forecast tokyoForecast = response.getBody()[0];

        // TempAverageの設定（例として最初のTimeSeriesから取得）
        if (!tokyoForecast.timeSeries.isEmpty()) {
            TimeSeries timeSeries = tokyoForecast.timeSeries.get(0);
            TempAverage tempAverage = new TempAverage();
            List<String> temps = null;
            if (!timeSeries.areas.isEmpty()) {
                temps = timeSeries.areas.get(0).getTemps();
            }
            if (temps != null && temps.size() >= 2) {
                tempAverage.setMinTemp(temps.get(0));
                tempAverage.setMaxTemp(temps.get(1));
            } else {
                tempAverage.setMinTemp("―");
                tempAverage.setMaxTemp("―");
            }
            tokyoForecast.setTempAverage(tempAverage);
        }

        return tokyoForecast;
    }
}
