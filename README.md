# Solid_Homework6
Урок 6. ООП Дизайн и Solid
S - Принцип единственной ответственности (Single Responsibility Principle):
Добавьте новый класс OrderLogger, который будет отвечать только за логирование информации о заказах. Теперь класс Order будет отвечать только за размещение заказа, а OrderLogger - за запись логов.

O - Принцип открытости/закрытости (Open/Closed Principle):
Добавьте новый метод calculateDiscount() в класс Customer, который будет рассчитывать скидку для заказов. Это позволит расширить функциональность класса без изменения его исходного кода.

L - Принцип подстановки Барбары Лисков (Liskov Substitution Principle):
Создайте класс Square, который наследуется от класса Rectangle. Убедитесь, что все методы, работающие с Rectangle, также корректно работают с Square, не изменяя их поведения.

I - Принцип разделения интерфейса (Interface Segregation Principle):
Создайте интерфейсы Driveable и Flyable. Реализуйте их в соответствующих классах Car и Airplane. Теперь классы Car и Airplane зависят только от интерфейсов, которые они используют.

D - Принцип инверсии зависимостей (Dependency Inversion Principle):
Создайте абстракцию Logger, которая будет иметь методы для логирования различных типов сообщений. Затем создайте классы FileLogger и DatabaseLogger, реализующие эту абстракцию. Теперь классы, которые требуют логирования, будут зависеть только от Logger, а не от конкретных реализаций.



