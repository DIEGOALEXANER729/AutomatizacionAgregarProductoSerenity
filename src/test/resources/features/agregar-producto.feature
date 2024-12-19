# language: es

Característica: Crear un producto nuevo y asegurarse de que se muestra en la lista

  Como usuario autenticado,
  Quiero crear un nuevo producto en la aplicación,
  Para asegurarme de que el producto se muestra en la lista de productos.

  Antecedentes:
    Dado que el usuario abra el navegador en la url e inicie sesion exitosamente

  @agregarProducto
  Escenario: Crear un producto  y validar producto creado
    Cuando el usuario accede al módulo "Northwind"
    Y selecciona "Productos"
    Y hace clic en "Nuevo Producto"
    Y ingresa la informacion del producto
    Y hace clic en "Guardar"
    Y ingresa "producto" en el campo de búsqueda
    Entonces  debera visualizar el producto creado en la lista






