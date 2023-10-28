public class Main {
    public static void main(String[] args) {
        WeatherNotificationFactory factory = new WeatherNotificationFactory();

        // создаем наблюдателей
        WeatherObserver observer1 = new Subscriber("Нурай");
        WeatherObserver observer2 = new Subscriber("Зарина");
        WeatherObserver observer3 = new Subscriber("Анеля");

        // подписываем на уведомления о погоде
        WeatherNotification rainNotification = factory.createNotification("дождь");
        WeatherNotification snowNotification = factory.createNotification("снег");
        WeatherNotification sunNotification = factory.createNotification("солнце");

        observer1.update(rainNotification);
        observer2.update(snowNotification);
        observer3.update(sunNotification);
    }
}
