// создаем интерфейс для наблюдателей
interface WeatherObserver {
    void update(WeatherNotification notification);
}

// реализация подписчика
class Subscriber implements WeatherObserver {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(WeatherNotification notification) {
        System.out.println(name + ", уведомление:");
        notification.notifySubscriber();
    }
}
