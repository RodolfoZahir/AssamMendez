## _Colección en Java_
en Java, La interfaz más importante es Collection, Es todo aquello que se puede iterar y saber de su tamaño, Se podría decir que es la raíz de todas las interfaces y clases que tengan alguna relación con colecciones de elementos.
Una de las caracteristicas de algunas colecciones es que pueden existir duplicados de elementos dentro de ellas, Otras pueden tener elementos ordenados .
El lenguaje de Java no define ninguna implementación de esta interfacr y son subinterfaces las que implementarían sus métodos.
Las operaciones básicas de una collection son:
Operaciones básicas que contiene:
* _size():_ Cantidad de elementos que almacena la colección
* _iterator():_ Recorre la colección visitando cada uno de sus elementos una vez.
* _add(T):_ Agrega un elemento.
* _contains(t):_ Pregunta si el elemento t ya está dentro de la colección.
## _Java Collection Framework_
¿Qué es Java Collection Framework?
Se podría decir que es una arquitectura para manipular y almacenar un grupo de objetos. 
Incluye lo siguiente: Clases, Interfaces y Algoritmos


**Jerarquía de Java Collection Framework**
![ImagenDeProgramacion](https://d1jnx9ba8s6j9r.cloudfront.net/blog/wp-content/uploads/2017/05/Collection-framework-hierarchy.png) 

**Java Collections: Interface**
Es la interfaz que itera, Recorre la lista y modifica los elementos.
Tiene 3 métodos:
* public void remove(): Elimina los últimos elementos que devolvió el iterador.
* public object next(): Devuelve el elemento y mueve el puntero del cursor al siguiente elemento.
* public boolean hasNext(): Devuelve verdadero si el iterador tiene mas elementos.

**Java Collections: List**
Es una interfaz de colección ordenada de elementos que pueden contener duplicados.
Las listas se clasifican en:
* Vectors
* ArrayList
* LinkedList