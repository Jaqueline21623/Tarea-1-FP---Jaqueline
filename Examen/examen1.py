def ejercicio1 ():
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
    


