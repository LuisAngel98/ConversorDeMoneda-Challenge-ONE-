import com.google.gson.annotations.SerializedName;

public record ExchangeRateResponse(
        String result,
        String base_code,
        @SerializedName("conversion_rates") ConversionRates conversionrates
){}
record ConversionRates(
        double USD,
        double PEN,
        double EUR,
        double ARS
) {
    public double getRate(String currencyCode) {
        return switch (currencyCode) {
            case "USD" -> USD;
            case "PEN" -> PEN;
            case "EUR" -> EUR;
            case "ARS" -> ARS;
            default -> throw new IllegalArgumentException("Código de moneda no soportado: " + currencyCode);
        };
    }
}