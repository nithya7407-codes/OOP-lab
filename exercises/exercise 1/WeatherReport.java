class WeatherReport {
    public static void main(String[] args) {

        byte day = 5;                 
        short year = 2026;
        int cityCode = 517501;
        long stationId = 987654321L;
        float temperature = 31.6f;
        double humidity = 68.45;
        char condition = 'S';         
        boolean isRaining = false;

        System.out.println("---- Daily Weather Report ----");
        System.out.println("Day: " + day);
        System.out.println("Year: " + year);
        System.out.println("City Code: " + cityCode);
        System.out.println("Station ID: " + stationId);
        System.out.println("Temperature: " + temperature + " °C");
        System.out.println("Humidity: " + humidity + "%");
        System.out.println("Condition Code: " + condition);
        System.out.println("Is it raining? " + isRaining);
    }
}
