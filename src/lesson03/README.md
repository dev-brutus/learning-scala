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
