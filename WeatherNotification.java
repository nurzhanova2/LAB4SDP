// интерфейс для уведомлений
interface WeatherNotification {
    void notifySubscriber();
}
class RainNotification implements WeatherNotification {
    @Override
    public void notifySubscriber() {
        System.out.println("Дождь. УРАААА");
    }
}
class SnowNotification implements WeatherNotification {
    @Override
    public void notifySubscriber() {
        System.out.println("Снег. ЕЕЕ НОВЫЙ ГОД!");
    }
}
class SunNotification implements WeatherNotification {
    @Override
    public void notifySubscriber() {
        System.out.println("Солнце. ЕЕЕ НА ПЛЯЖ");
    }
}

// Фабрика уведомлений
class WeatherNotificationFactory {
    public WeatherNotification createNotification(String type) {
        switch (type) {
            case "дождь":
                return new RainNotification();
            case "снег":
                return new SnowNotification();
            case "солнце":
                return new SunNotification();
            default:
                throw new IllegalArgumentException("Неподдерживаемый тип уведомления: " + type);
        }
    }
}

