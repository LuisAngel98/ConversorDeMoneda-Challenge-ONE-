import java.math.BigDecimal;
import java.math.RoundingMode;

public class ExchangeCalculator {
    private static double convert(double rate,int amount) {
        double result = amount * rate;
        BigDecimal roundedResult = new BigDecimal(result).setScale(4, RoundingMode.HALF_UP);
        return roundedResult.doubleValue();
    }
    public static double CurrencyConverter(String base_code, String target_code, int amount){
        //Get data from Api
        ExchangeRateResponse response = GetExchangeRateResponse.getExchangeRate(base_code);
        if ("success".equals(response.result())){
            double rate = response.conversionrates().getRate(target_code);
            return convert(rate, amount);
        }else {
            throw new RuntimeException("Error al obtener las tasas de cambio.");
        }
    }
}