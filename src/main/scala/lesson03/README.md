# Коллекции

См. http://www.scala-lang.org/docu/files/collections-api/collections.html

* `Traversable`  &#8211; Корневой типаж
    * `Iterable`  &#8211; Итерируемые коллекции
        * `Seq` &#8211; Последовательность
            * `IndexedSeq` &#8211; Индексируемая последовательность
                * `immutable.Vector`
                * `mutable.ResizableArray`
                * `mutable.ArraySeq`
                * `mutable.StringBuilder`
                * `String`
                * `Array`
            * `LinearSeq` &#8211; Связанная последовательность
                * `immutable.List`
                * `immutable.Stream`
                * `mutable.MutableList`
                * `mutable.Queue`
            * `mutable.Buffer` &#8211; Изменяемый буффер
                * `mutable.ListBuffer`
                * `mutable.ArrayBuffer`
            * `Range` &#8211; Диапазон
        * `Set` &#8211; Множество
            * `SortedSet` &#8211; Сортированное множество
                * `immutable.TreeSet`
            * `immutable.HashSet`
            * `mutable.HashSet`
            * `mutable.LinkedHashSet`
            * `BitSet`
        * `Map` &#8211; Справочник
            * `SortedMap` &#8211; Сортированный справочник
                * `immutable.TreeMap`
            * `immutable.HashMap`
            * `mutable.HashMap`
            * `mutable.LinkedHashMap`

## Неизменяемые

* `List` &#8211; Связанный список.
* `Vector` &#8211; Индексированный список.
* `Stream` &#8211; Список с кэшированием и ленивым вычислением элементов. Может быть бесконечным.

## Изменяемые

* `ArrayBuffer` &#8211; Аналог `ArrayList`.
* `ListBuffer` &#8211; Аналог `LinkedList`.
* `StringBuilders` &#8211; Аналог `StringBuilder`.

## Методы `map` и `filter`

Поэлементное преобразование коллекций выполняется с помощью метода `map`: [E01Map.scala](E01Map.scala)

Фильтрация коллекций выполняется с помощью метода `filter`: [E02Filter.scala](E02Filter.scala)

## Проекции

Проекции являются обёртками над настоящими коллекциями.
Данные, получаемые из проекций, есть модифицированные &laquo;на лету&raquo; данные из оригинальной коллекции.
См. [E03View.scala](E03View.scala)

## Итераторы

*TBD*

## Потоки

*TBD*

## Кортежи

Кортежи позволяют объединять несколько (до 22) значений разных типов.
Представляют собой упорядоченное множество.
См. [E04Tuple.scala](E04Tuple.scala)

## Параллелизация обработки коллекций

Любая коллекция может быть превращена в параллелизируемую с помощью метода `par`: [E05Parallel.scala](E05Parallel.scala)

## Иммутабельность

Scala поощеряет иммутабельность. По умолчанию все коллекции неизменяемые.
При попытке изменить коллекцию создаётся её модифицированная копия: [E06Immutable.scala](E06Immutable.scala)

## Свёртка
Для операции свёртки в Scala используются методы `reduce*`, `fold*` и `aggregate`.
Отличия:

* `fold` позволяет задать начальное значение для свёртки.
* `aggregate` выполняет свёртку не непрерывно по всей коллекции, а частями по подколлекциям. Поэтому ему необходимо задать предикат для объединения свёрток подколлекций.

См. [E07Fold.scala](E07Fold.scala)

## Методы `zip` и `unzip`
Методы `zip` и `unzip` используются для поэлементного склеивания и разъединения коллекций: [E08Zip.scala](E08Zip.scala)

## Прочие методы:
* Методы объединения данных: [E09Union.scala](E09Union.scala)
* Методы извлечения данных: [E10Extraction.scala](E10Extraction.scala)
* Методы модификации коллекций: [E10Modification.scala](E10Modification.scala)
* Методы получения информации о коллекции: [E11Info.scala](E11Info.scala)
* Методы преобразования коллекций: [E12Conversion.scala](E12Conversion.scala)
* Пакетный объект: [package.scala](package.scala)

[Назад](/src/main/scala/lesson02/)