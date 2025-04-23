# Examen2T_VargasRomero_-ngela
Examen Pruebas CajaNegra, CajaBlanca e Integración.

ÍNDICE:
- Pruebas de Valores Límite: Explica qué valores probaste y qué resultados esperabas. 
- Pruebas de Equivalencia: Describe las clases de equivalencia que cubriste y los resultados de las pruebas.
- Pruebas de Cobertura de Decisiones: Explica qué decisiones cubriste y cómo verificaste cada una.
- Pruebas de Cobertura de Caminos Independientes: Documenta los caminos que cubriste en las pruebas y qué resultados esperabas.
- Pruebas de Integración: Describe cómo realizaste la integración entre los métodos y los resultados de las pruebas.

## Analizamos el método de la clase Departamento: procesarPedido().
En este método utilicé las pruebas de Caja Negra -> Pruebas de Valores Límites, Caja Blanca -> Prueba de Decisiones.

1. Este tiene un if que si el monto es mayor que el presupuesto devuelve false:
- En las pruebas de Caja Negra comparamos con assertEquals si el monto supera o no el presupuesto. False si lo supera, true no lo supera.
- En las pruebas de Caja Blanca realizamos la siguiente rama o acción que hace el método: la suma. Teniendo en cuenta lo explicado en la caja negra, se realizará la suma si el monto en menor que el presupuesto, así que de parámetro tendremos que utilizar una cantidad inferior para que se realice la suma y devuelva true.

## Analizamos el método de la clase Instituto: agregarDepartamento().
1. 
