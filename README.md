# **СИСТЕМА УВЕДОМЛЕНИЙ О ПОГОДЕ - NURZHANOVA ZARINA SE-2221**

## **Фабрика _(Factory)_ применяется в классе WeatherNotificationFactory:**

### **Этот класс предоставляет метод createNotification, который создает конкретные объекты уведомлений (дождь, снег, солнце) в зависимости от переданного типа.**

## **Наблюдатель _(Observer)_ применяется в интерфейсе WeatherObserver и его реализации в классе Subscriber:**

### **Здесь WeatherObserver - это интерфейс для наблюдателей, а Subscriber реализует этот интерфейс. Метод update позволяет наблюдателю получать уведомления о погоде. В данном случае, когда наблюдатель вызывает метод update, он выводит уведомление в консоль.**