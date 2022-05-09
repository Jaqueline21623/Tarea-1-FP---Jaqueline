# -*- coding: utf-8 -*-
"""Ejercicio 8

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1_7ZFZ28q6RMbI2hI0L_9nPYuO_iiBnM1
"""

#Declarar Variables
anhoAnti : int
sueldo : float
bonoAnti : float = 0
bonoSueldo : float
bonoMayor : float
#Datos de Entrada
anhoAnti = int ( input ( "Ingrese anho de antiguedad:" ))
sueldo = float ( input ( "Ingrese el sueldo reciente:" ))
#Proceso y Datos de Salida
if  anhoAnti > 2  and  anhoAnti < 5 :
  bonoAnti = sueldo * 0.20
elif  anhoAnti >= 5 :
  bonoAnti = sueldo * 0.30

if  sueldo > 3500 :
  bonoSueldo = sueldo * 0.10
elif  sueldo >= 1000 and sueldo <= 3500 :
  bonoSueldo = sueldo * 0.15
if sueldo>= sueldo:
  bonoSueldo = sueldo * 0.25

if  bonoAnti > bonoSueldo :
  bonoMayor = bonoAnti
if bonoMayor > bonoSueldo:
  bonoMayor = bonoSueldo
#Datos de Salida  
print ( f"El Bono que corresponde es: { bonoMayor } " )

"""Cierta empresa proporciona un Bono mensual a sus trabajadores, el cuál puede ser por su antigüedad o bien por el monto de su sueldo (el que sea mayor), de la siguiente forma:
Cuando la antigüedad es mayor a 2 años, pero menor a 5, se otorga 20% de su sueldo; cuándo es de 5 años o más, 30%.  Ahora bien, el bono por concepto de sueldo, sí este es menor a S/ 1000, pero menor o igual a S/ 3500, se otorga 15% de su sueldo, para más de S/ 3500, 10%.  Realice el algoritmo correspondiente para calcular los dos tipos de bono y asignar el mayor. 

"""