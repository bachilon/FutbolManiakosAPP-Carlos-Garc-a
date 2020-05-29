﻿
Sprint 4: Diagrama de uso de Aportes al Árbitro
![enter image description here](https://imgur.com/Plvdf30.png)
Ficha técnica de uso.

Nombre: Crear mensaje aportes al árbitro

Autor: Carlos García Acevedo

Fecha: 21/05/20

Descripción: Permite crear nuevos mensajes para debatir sobre una decisión arbitral o una reclamación en el foro.

Actores: Usuarios

Precondiciones: El usuario debe tener una cuenta registrada en nuestra página, independientemente si es premium o no.
El sistema comprueba si el usuario está registrado o no en la página, sino está registrado abre un panel donde se le solicita el registro para poder enviar mensaje al foro de aportes al árbitro.


Flujo Normal:

1.- El usuario pulsa sobre el botón para crear un mensaje.

2.- El sistema crea una caja donde introducimos el título del mensaje que tiene que ser breve

y una segunda caja en la cual introducimos la reclamación o el mensaje.

3.- El usuario introduce el mensaje y pulsa un botón para enviarlo.

4.- El sistema recibe la información del nuevo mensaje.

5.- El sistema guarda la información en su base de datos.

6.- El administrador recibe el mensaje y lo acepta si es un mensaje adecuado.

7.- El sistema publica el mensaje o reclamación.

Flujo Alternativo:

6.A- El administrador rechaza el mensaje por no ser adecuado, de modo que no es publicado en el foro y le invita al usuario a modificar el mensaje para que su contenido pueda ser publicado.

Poscondiciones: El mensaje ha sido publicado después de realizar este proceso y cumplir todos los requisitos necesarios. El mensaje o reclamación pasa a disposición de estudio para ver si se realiza la petición que solicitó el usuario.
