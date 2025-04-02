package com.pizzeria.dashboard;

public class Main {

    public static void main(String[] args) {

        /* REGLAS DE NOMENCLATURA EN JAVA
            - Clases: PascalCase  →  Ej: UsuarioController
            - Métodos: camelCase  →  Ej: obtenerDatos()
            - Variables: camelCase →  Ej: nombreUsuario
            - Constantes: SCREAMING_SNAKE_CASE → Ej: MAX_INTENTOS
        */
        
        /* REGLAS DE NOMENCLATURA PARA LA BASE DE DATOS
            - Tablas: snake_case en plural
            - Columnas: snake_case en singular
            - Clave Primaria: id_nombre_tabla
            - Clave Foránea: id_nombre_tabla_referenciada
            - Índices: idx_nombre_tabla_columna
            - Tablas Intermedias (Many-to-Many): nombre_tabla1_nombre_tabla2
            - Procedimientos Almacenados: sp_nombre_funcion
            - Triggers: tr_nombre_trigger
        */

        /* CONTEXTO DE LAS CARPETAS
            
            Las carpetas estan creadas para mantener el orden, su diferencia
            principal es la última palabra de cada uno de estos y se debe 
            respetar lo que va dentro de ellas, que es lo siguiente:
        
            - controller: Clases que manejan la lógica del proyecto
            - dao: Clases que interactúan con la base de datos: CRUD 
            - database: Clase para manejar la conexión a la BD
            - model: Clases que representan las entidades del proyecto
            - utils: Funciones para validaciones
            - view: Los swing (los JFrames y variables)
        */
        
        /*
            Por último, este es una Java Maven, seguramente algo nuevo
            ya que comunmente utilizamos el Java Ant, te recomiendo 
            estudiar este tipo de proyecto. Vas a ver que es un poco más
            flexible a la hora del back-end.
        */
        /*prueba del commit
    }
}

