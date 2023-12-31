1. ##### Тесты `test_invalid_input_raises_error`:
   **Сценарии**:
    - Проверяет, что при передаче недопустимого ввода (содержащего нечисловые значения) в метод `calculate_average`,
      возникает ожидаемое исключение типа `TypeError`.


- **Почему выбран этот сценарий**: Этот тест важен для проверки корректности обработки некорректных данных. Он поможет
  убедиться, что код правильно выбрасывает исключение при нарушении условий.

<hr>

2. ##### Тесты `test_calculate_average`:
   **Сценарии**:
    - Проверка вычисления среднего значения для положительных чисел.
    - Проверка вычисления среднего значения для отрицательных чисел.
    - Проверка вычисления среднего значения для пустого списка.
    - Проверка вычисления среднего значения для списка из нулей.

- **Почему выбраны эти сценарии**: Эти тесты охватывают различные варианты ввода, чтобы убедиться, что
  метод `calculate_average` корректно обрабатывает разные сценарии и возвращает ожидаемые результаты.

<hr>

3. ##### Тесты `test_compare_averages_lists_equal, test_compare_averages_second_greater, test_compare_averages_with_first_greater`:
   **Сценарии**:
    - Проверка сравнения средних значений двух списков, когда средние значения равны.
    - Проверка сравнения средних значений двух списков, при отрицательных значеньях.
    - Проверка сравнения средних значений двух списков, когда среднее значение второго списка больше.
    - Проверка сравнения средних значений двух списков, когда среднее значение первого списка больше.


- **Почему выбраны эти сценарии**: Эти тесты охватывают различные случаи сравнения средних значений, чтобы
  удостовериться, что метод `compare_averages` возвращает правильный результат для разных сценариев.

<hr>

Общий подход к выбору сценариев заключается в том, что все тесты параметризованы, что делает их более удобными и
уменьшает дублирование кода.
Все тесты являются функциональными и не зависят от внешних факторов, что обеспечивает их стабильность.