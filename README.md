# Validación de Número de Teléfono en Java

## Descripción

Este proyecto consiste en desarrollar una aplicación en **Java** con una interfaz gráfica que permite introducir un **número de teléfono** mediante un formulario. Al pulsar un botón de validación, la aplicación comprueba si el formato es correcto, verificando que el número contenga exactamente **10 dígitos**.

El objetivo del ejercicio es practicar la validación de datos introducidos por el usuario y el manejo de eventos utilizando **Swing**.

## Objetivos

- Crear un formulario con campos de entrada.
- Permitir al usuario introducir un número de teléfono.
- Validar el formato del número ingresado.
- Mostrar mensajes de error o confirmación según el resultado.
- Practicar expresiones regulares y validación de datos.

## Funcionamiento

1. Se inicia la aplicación.
2. Se muestra un formulario con un campo para introducir el teléfono.
3. El usuario escribe un número.
4. Al pulsar el botón de validación:
   - Se verifica que el campo no esté vacío.
   - Se comprueba que el número tenga exactamente 10 dígitos.
   - Si el formato es incorrecto, se muestra un mensaje de error.
   - Si es válido, se muestra una confirmación.

## Ejemplo de uso

Formulario:

```text
Número de teléfono:

[______________]

     [ Validar ]
```

Entrada válida:

```text
1234567890
```

Resultado:

```text
Número válido.
```

Entrada incorrecta:

```text
12345abc
```

Resultado:

```text
Error: El número debe contener exactamente 10 dígitos.
```
