package com.softtek;

import java.util.Random;

class Areas {
	static double areaCirculo(double radio) {
		return Math.PI * radio * radio;
	}

	static double areaRectangulo(double base, double altura) {
		return base * altura;
	}
}

class Campos {
	private int x;

	Campos(int x) {
		this.x = x;
	}

	int getX() {
		return this.x;
	}

	void incrementa() {
		this.x++;
	}
}

class TablaMultiplicar {
	private int numero;

	TablaMultiplicar(int numero) {
		this.numero = numero;
	}

	String generarTabla() {
		StringBuilder tabla = new StringBuilder();
		for (int i = 1; i <= 10; i++) {
			tabla.append(this.numero).append(" x ").append(i).append(" = ").append(this.numero * i).append("\n");
		}
		return tabla.toString();
	}
	static class Alumno {
		private String nombre;
		private int[] calificaciones;

		public Alumno(String nombre, int cantidadParciales) {
			this.nombre = nombre;
			this.calificaciones = new int[cantidadParciales];
		}

		public void asignarCalificaciones(int[] calificaciones) {
			this.calificaciones = calificaciones;
		}

		public void mostrarInformacion() {
			System.out.println("Nombre del alumno: " + nombre);
			System.out.println("Calificaciones:");
			for (int i = 0; i < calificaciones.length; i++) {
				System.out.println("Parcial " + (i + 1) + ": " + calificaciones[i]);
			}
		}
	}

	static class Dado {
		public void lanzar() {
			Random random = new Random();
			int resultado = random.nextInt(6) + 1;
			System.out.println("El resultado del dado es: " + resultado);
		}
	}

}

public class Main {

	public static void main(String[] args) {
		// Declaraciones de variables
		byte numeroPequeno;
		short numeroEntero;
		int numero;
		long numeroLargo;
		float numeroDecimales;
		double numeroDecimalesGrande;
		boolean estaCasado;
		char letra;
		int ladoCuadrado;
		int areaCuadrado;
		double radioCirculo;
		double numeroPi;
		double areaCirculo;
		int ladoRectangulo;
		int ladoRectangulo2;
		int perimetroRectangulo;

		// Asignaciones de valores
		numeroPequeno = 5;
		System.out.println(numeroPequeno);
		numeroPequeno = 10;
		System.out.println(numeroPequeno);

		numeroEntero = 350;
		System.out.println(numeroEntero);
		numero = 56_350;
		System.out.println(numero);
		numeroLargo = 56_000_000L;
		System.out.println(numeroLargo);
		numeroDecimales = 1_123.45F;
		System.out.println(numeroDecimales);
		numeroDecimalesGrande = 1_123_897.098F;
		System.out.println(numeroDecimalesGrande);
		estaCasado = false;
		System.out.println(estaCasado);
		letra = 'a';
		System.out.println(letra);

		ladoCuadrado = 6;
		areaCuadrado = ladoCuadrado * ladoCuadrado;
		System.out.println(areaCuadrado);

		radioCirculo = 3;
		numeroPi = 3.14;
		areaCirculo = radioCirculo * numeroPi;
		System.out.println(areaCirculo);

		ladoRectangulo = 6;
		ladoRectangulo2 = 3;
		perimetroRectangulo = ladoRectangulo * ladoRectangulo2;
		System.out.println(perimetroRectangulo);

		// Ejercicio 3: Calcular y mostrar el área de un círculo y un rectángulo
		double radioCirculoNuevo = 3;
		double baseRectanguloNuevo = 4;
		double alturaRectanguloNuevo = 5;

		double areaCirculoNuevo = Areas.areaCirculo(radioCirculoNuevo);
		double areaRectanguloNuevo = Areas.areaRectangulo(baseRectanguloNuevo, alturaRectanguloNuevo);

		System.out.println("Área del círculo nuevo: " + areaCirculoNuevo);
		System.out.println("Área del rectángulo nuevo: " + areaRectanguloNuevo);

		// Ejercicio 4: Incrementar y mostrar el valor de un campo
		Campos campo = new Campos(5);
		System.out.println("Valor inicial de x: " + campo.getX());
		campo.incrementa();
		System.out.println("Valor incrementado de x: " + campo.getX());

		// Ejercicio 5: Mostrar la tabla de multiplicar del número dado
		int numeroTabla = 7;
		TablaMultiplicar tabla = new TablaMultiplicar(numeroTabla);
		String tablaMultiplicar = tabla.generarTabla();
		System.out.println("Tabla de multiplicar del " + numeroTabla + ":\n" + tablaMultiplicar);

		// Ejercicio 6: Crear un objeto Alumno y mostrar su nombre y calificaciones
		TablaMultiplicar.Alumno alumno = new TablaMultiplicar.Alumno("Juan Perez", 3);
		int[] calificaciones = {85, 90, 75};
		alumno.asignarCalificaciones(calificaciones);
		alumno.mostrarInformacion();

		// Ejercicio 7: Lanzar un dado
		TablaMultiplicar.Dado dado = new TablaMultiplicar.Dado();
		dado.lanzar();
	}
}
