# Currency Converter

Este es un programa de consola en Java que permite realizar conversiones
de moneda utilizando la API de[ExchangeRate API](https://www.exchangerate-api.com/).
El usuario puede seleccionar diferentes pares de monedas y realizar conversiones según la tasa de cambio actual.

## Funcionalidades

- Conversión entre monedas como USD, PEN, EUR, y ARS.
- Opciones para convertir:
    - Dólar (USD) a Nuevo Sol Peruano (PEN)
    - Nuevo Sol Peruano (PEN) a Dólar (USD)
    - Euro (EUR) a Nuevo Sol Peruano (PEN)
    - Nuevo Sol Peruano (PEN) a Euro (EUR)
    - Euro (EUR) a Peso Argentino (ARS)
    - Peso Argentino (ARS) a Euro (EUR)

## Requisitos

- Java 17 o superior.
- Dependencia de [Gson](https://github.com/google/gson) para deserializar la respuesta de JSON de la API.