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
) {}