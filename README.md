# TP persistencia TUP
# Descripción del Proyecto
El proyecto, denominado "Tppersistencia", es una aplicación Java basada en Spring Boot que tiene como objetivo gestionar una serie de entidades relacionadas en una base de datos. Estas entidades incluyen usuarios, clientes, domicilios, productos, rubros, pedidos, facturas y detalles de pedidos. 

# Principales Características
Gestión de Usuarios: Permite crear usuarios con roles específicos, como "Cliente" o "Cocinero", y asociar pedidos a usuarios.

Gestión de Clientes: Permite registrar información de clientes, como nombre, apellido, teléfono y correo electrónico, y asociar pedidos a clientes.

Gestión de Domicilios: Permite crear registros de domicilios con detalles de dirección y asociar pedidos a domicilios.

Gestión de Productos: Permite agregar productos con detalles como tipo, precio, stock, unidad de medida y receta.

Gestión de Rubros: Facilita la categorización de productos en rubros específicos.

Gestión de Pedidos: Permite crear pedidos con información sobre la fecha, estado, hora estimada de entrega y tipo de envío. Los pedidos pueden estar asociados a facturas y clientes.

Gestión de Facturas: Registra detalles de facturas, incluida la fecha, número, descuento, forma de pago y total.

Gestión de Detalles de Pedidos: Registra información detallada sobre los productos incluidos en un pedido, como cantidad y subtotal.

# Tecnologías Utilizadas
Spring Boot: Framework de desarrollo de aplicaciones Java.

Hibernate: Framework de mapeo objeto-relacional para la gestión de bases de datos.

H2 Database: Sistema de gestión de bases de datos en memoria para pruebas locales.

# Uso del Proyecto
El proyecto se inicia como una aplicación de Spring Boot y utiliza el patrón de repositorios para acceder y gestionar los datos de las entidades en la base de datos. Se incluye un script de inicio que crea instancias de las entidades y realiza operaciones básicas de guardado en la base de datos al ejecutar la aplicación.
