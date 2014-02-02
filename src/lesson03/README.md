# Коллекции

См. http://www.scala-lang.org/docu/files/collections-api/collections.html

* `Traversable`  &#8211; кортевой типаж
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
                * `iimmutable.List`
                * `iimmutable.Stream`
                * `imutable.MutableList`
                * `imutable.Queue`
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
            * `MapSet` &#8211; Сортированный Справочник
                * `immutable.TreeMap`
            * `immutable.HashMap`
            * `mutable.HashMap`
            * `mutable.LinkedHashMap`

## Неизменяемые

* `List` &#8211; Связанный список
* `Vector` &#8211; Индексированный список
* `Stream` &#8211; Список с кэшированием и ленивым вычислением элементов. Может быть бесконечным.

## Проекции

Проекции являются обёртками над настоящими коллекциями. Данные, получаемые из проекций есть модифицированные "на лету" данные из оригинальной коллекции.

## Кортежи

Кортежи позволяют объединять несколько (до 22) значений разных типов. Представляют собой упорядоченное множество.

## Изменяемые

* `ArrayBuffer` &#8211; Аналог `ArrayList`
* `ListBuffer` &#8211; Аналог `LinkedList`
* `StringBuilders` &#8211; Аналог `StringBuilder`

## Параллельные

Любая коллекция может быть превращена в параллелизируемую с помощью метода `par`.

## Примеры

* Использование `map` [E01Map.scala](E01Map.scala)
* Использование `filter` [E02Filter.scala](E02Filter.scala)
* Использование проекций [E03View.scala](E03View.scala)
* Использование кортежей [E04Tuple.scala](E04Tuple.scala)
* Демонстрация параллелизации [E05Parallel.scala](E05Parallel.scala)
* Демонстрация иммутабельности [E06Immutable.scala](E06Immutable.scala)
* Использование `fold` [E07Fold.scala](E07Fold.scala)
* Использование `zip` и `unzip` [E08Zip.scala](E08Zip.scala)
* Методы объединения данных [E09Union.scala](E09Union.scala)
* Методы извлечения данных [E10Extraction.scala](E10Extraction.scala)
* Методы модификации коллекций [E10Modification.scala](E10Modification.scala)
* Методы получения информации о коллекции [E11Info.scala](E11Info.scala)
* Методы преобразования коллекций [E12Conversion.scala](E12Conversion.scala)
* Пакетный объект [package.scala](package.scala)