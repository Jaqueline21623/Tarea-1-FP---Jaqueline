def ejercicio1 ():
    #1.- Diseñe un algoritmo que permita determinar el nivel del perfil de ingreso de un postulante con la que obtiene una vacante a la carrera de ingeniería de Sistemas; considerando que, si su nota es mayor
    #o igual a 17 su nivel es 4, si la nota es menor de 17 y mayor o igual a 14 su nivel es 3, si su nota es menor a 14 y mayor o igual a 11 su nivel es 2; mientras que si su nota es menor de 11 ya no puede
    #obtener la vacante y por ende también está en el nivel 1.
    #Considera que la nota final es vigesimal según el siguiente ponderado:
    #Examen de conocimiento 40%
    #EntrevistaPersonal 35%
    #Test Psicológico 25%

    
    #definir variables
    excon:float()
    test:float()
    entrevista:float()
    vexcon:float()
    vtest:float()
    ventrevista:float()
    notafinal:float()
    nota:float()
    nivel:str()
    #datos de entrada
    excon=float(input("ingrese la nota del examen de conocimiento: "))
    test=float(input("ingrese la nota del examen psicologico: "))
    entrevista=float(input("ingrese la nota de la entrevista personal: "))
    #proceso
    vexcon=excon*0.40
    vtest=test*0.35
    ventrevista=entrevista*0.25
    notafinal=vexcon+vtest+ventrevista
    if notafinal>=17:
        nivel=("4")
    if notafinal<17 and notafinal>=14:
        nivel=("3")
    if notafinal<14 and notafinal>=11:
        nivel=("ya no puede obtener la vacante y por ende también está en el nivel 1:")
    #datos de salida
    print(f"la nota final es: {notafinal} ")
    print(f"su nivel es: {nivel}")
def ejercicio2 ():
    #2.-Tiendas Plaza Norte desea un programa que permita calcular el IVG de la venta de sus artefactos
    #además desea hacer un descuento del 10% cuando el monto base de venta supera los 2000 soles,
    #mientras que si el monto supera los 1000 desea hacer un descuento del 5% Y si supera los 500 soles
    #realiza un descuento del 2%, El algoritmo debe permitir calcular el IGV, el descuento y el monto total
    #a pagar.

    #definir variable
    igv:float()
    descuento:float()
    pbase:float()
    mtotal:float()
    precioFinal:float()
    #datos de entrada
    pbase=float(input("ingrese el precio base: "))
    #proceso
    if pbase>=2000:
        descuento=pbase*0.10
    elif pbase>=1000 and pbase<2000:
        descuento=pbase*0.5
    elif pbase>=500 and pbase<1000:
        descuento=pbase*0.2
    else:
        descuento=0
    precioFinal=pbase-descuento
    igv=precioFinal*0.18
    pfinal=precioFinal+igv
    #datos de salida
    print(f"el descuento es: {descuento}")
    print(f"el igv es: {igv}")
    print(f"el precio final es: {pfinal}")
def ejercicio3 ():
    #3.-Diseñar un algoritmo que permita calcular una operación aritmética entre 2 valores introducidos y
    #el signo correspondiente por teclado: si es el signo es + debe realizar una suma, si es el signo – debe
    #realizar la resta, si es el signo / debe realizar la división, si es el signo * debe realizar la multiplicación,
    #si es el signo ^ debe calcular la potencia; por otro lado, si introduce R debe permitir calcular la raíz
    #cuadrada de un número, si introduce % debe permitir calcular el módulo de 2.

    #definir variables
    dato1:float()
    dato2:float()
    signo:str()()
    total:float()
    #datos de entrada
    dato1=float(input("ingrese el numero 1: "))
    dato2=float(input("ingrese el numero 2: "))
    print("- = resta ")
    print("+ = suma ")
    print("/ = dividir ")
    print("* = multiplicar ")
    print("^ = potencia ")
    print("R = raiz")
    print("% = potencia")
    signo=str(input("ingrese el signo: "))
    #proceso
    if signo=="+": 
        total=dato1+dato2
    elif signo=="-": 
        total=dato1-dato2
    elif signo=="/":
        total=dato1/dato2
    elif signo=="*":
        total=dato1*dato2
    elif signo=="^":
        total=dato1^dato2
    elif signo=="R":
        total=dato1**(dato2**-1)
    else :
        total=dato1%dato2
    #datos de salida
    print(f"el resultado es: {total}")
def ejercicio4 ():
    #4.-Secretaría de salud requiere un algoritmo que permita determinar qué tipo de vacuna (A, B o C)
    #aplicar a una persona, considerando que, si es mayor de 70, sin importar el sexo, se le aplica el tipo C;
    #si tiene entre 16 y 69 años, y es mujer se le aplica el tipo B, y si es hombre, la A; si es menor de 16
    #años, se aplica el tipo A sin importar el sexo.

    #definir variable
    edad:float()
    genero:str()
    mensaje:str()
    #datos de entrada
    edad=float(input("ingrese la edad: "))
    genero=str(input("ingrese su genero(masculino o femenino): "))
    #proceso
    if edad>=70:
        mensaje:("C")
    elif edad>=16 and edad<=69 and genero=="masculino" :
        mensaje:("A")
    elif edad>=16 and edad<=69 and genero=="femenino" :
        mensaje:("B")
    else:
        mensaje:("A")
    #datos de salida
    print(f"el tipo de vacuna es: {mensaje}")

#examenJHC
    #5.-Realice un algoritmo que permita probar uno de los 3 algoritmos que ha diseñado anteriormente
    #aplicando una estructura condicional multiple o algo similar, y las estructuras de control que se
    #requieran para tal fin.

#Definir variables
numero = float
#Datos de entrada
numero = float ( input ( "Ingrese el numero del ejercicio(1-4): " ))
#proceso
if numero==1:
    ejercicio1()
elif numero==2:
    ejercicio2()
elif numero==3:
    ejercicio3()
else :
    ejercicio4()
    


