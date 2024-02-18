# Actividad de RabbitMQ y JPA
Se requiere enviar información de Clientes y sus direcciones en modo asíncrono a un repositorio de datos permanente, para ello se propone crear dos microservicios que permitan:

-  Crear un productor que permita enviar información al receptor en modo asíncrono usando el gestor de colar RabbitMQ.
-  El receptor guardará la información en una BDD Relacional con estructura normalizada y manteniendo la integridad referencial.

## Conexión a la base de datos postgres
## Estructura de ingreso en postman
```
{
    "nombre":"mi nombre",
    "apellido":"mi apellido",
    "email":"micorreo@gamil.com",
    "cedula":"8430493049",
    "direccionwmscList":[
        {
            "direccion":"mi direccion",
            "ciudad":"mi ciudad",
            "pais":"mi pais",
            "provincia":"mi provincia"
        }
    ]
}
```
