https://habr.com/ru/post/260767/

Осн.понятия:
- String'а immutable объект
- хранится в виде массива типа char
- присвоение знач. в переменную с двойными кавычками (" ") одинарные для char (' ')

Заметки:
- foreach() ссылочный итератор и он не может внести изменения например в массив строк
- for обычный с итератором, НЕ ссылочный. Может изменить массив строк