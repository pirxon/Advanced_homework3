package homework4;

import java.util.Scanner;

public class Arifm_op {

	public static void main(String[] args) {

		System.out.println("\t\t---Арифметические операторы ввод данных---");

		/*
		 * 1. Написать программу, которая находит среднее арифметическое
		 * значение трёх вещественных чисел.
		 */
		sr_arifm();
		
		/*
		 * 2. Написать программу, которая находит корень линейного уравнения ax + b = 0.
		 */
		koren_lin();
		
		/*
		 * 3. Пользователь вводит число и степень. Программа вычисляет указанную
		 * степень этого числа.
		 */
		stepen_chisla();
		
		/*
		 * 4. Написать программу, которая предлагает пользователю ввести радиус
		 * окружности, а затем считает площадь и длину этой окружности. Число Pi
		 * задать в программе как вещественную константу.
		 */
		ploshad_kruga();
		
		/*
		 * 5. Написать программу, которая предоставляет пользователю возможность
		 * ввести с клавиатуры количество гривен, и переводит его в доллары,
		 * евро и рубли.
		 */
		obmenka();
		
		/*
		 * 6. Написать программу, которая переводит километры в сухопутные и
		 * морские мили.
		 */
		mili();
		
		/* 7. Написать программу, которая находит процент P от суммы S. */
		procent();
		
		/*
		 * 8. Написать программу для определения диаметра окружности, которую
		 * можно получить из отрезка проволоки длиной Х (X задает пользователь с
		 * клавиатуры).
		 */
		diametr_kruga();
		
		/*
		 * 9. Написать программу, которая переводит указанное количество
		 * градусов по Цельсию в градусы по шкале Фаренгейта, Кельвина, Реомюра
		 * и Делиля. Затем реализовать перевод из градусов по Фаренгейту в
		 * градусы по Цельсию.
		 */
		konv_gradusov();
		
		/*
		 * 10. Поменять местами значения переменных a и b, сначала с
		 * использованием дополнительной третьей переменной, а затем – без.
		 */
		perestanovka();
		
		
	}	
	
	public static void sr_arifm() {
		System.out.println("\n---Задача1------------------------------------");
		int a1 = 2;
		int a2 = 1;
		int a3 = 5;
		double sr = (a1 + a2 + a3) / 3.0;
		System.out.println("Среднее арифметическое чисел " + a1 + "," + a2 + "," + a3 + " - " + sr);
		// System.out.printf("%.2f", sr);
	}

	public static void koren_lin() {
		System.out.println("\n---Задача2------------------------------------");
		int a1 = 3;
		int a2 = 16;
		double a3 = (double)-a2 / a1;
		System.out.println("Решение уравления ax + b = 0, где a = " + a1 + ", b = " + a2 + " Результат = " + a3);
	}

		
	public static void stepen_chisla() {
		System.out.println("\n---Задача3------------------------------------");
		System.out.print("Введите любое число - ");
		Scanner sc1 = new Scanner(System.in);
		int a1 = sc1.nextInt();
		System.out.print("Введите степень в которую надо возвести это число - ");
		Scanner sc2 = new Scanner(System.in);
		int a2 = sc2.nextInt();
		int a3 = (int) Math.pow(a1, a2);
		System.out.println("Возведение числа - " + a1 + " в степень - " + a2 + ". Результат = " + a3);
	}
	
	public static void ploshad_kruga() {
		System.out.println("\n---Задача4------------------------------------");
		System.out.print("Введите радиус окружности - ");
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		double a2 = Math.round(100.0 * (Math.PI * a1 * a1)) / 100.0;
		double a3 = Math.round(100.0 * (2 * Math.PI * a1 * a1)) / 100.0;
		System.out.println("Площадь окружности = " + a2);
		System.out.println("Длина окружности = " + a3);
	}
	
	public static void obmenka() {
		System.out.println("\n---Задача5------------------------------------");
		System.out.print("Введите количество гривен - ");
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		double a2 = Math.round(100.0 * (a1 / 25.1954)) / 100.0;
		double a3 = Math.round(100.0 * (a1 / 28.5696)) / 100.0;
		double a4 = Math.round(100.0 * (a1 / 0.38321)) / 100.0;
		System.out.println("Переведем гривны в доллары = " + a2 + "\nПереведем гривны в евро = " + a3
				+ "\nПереведем гривны в рубли = " + a4);
	}
	
	public static void mili() {
		System.out.println("\n---Задача6------------------------------------");
		System.out.print("Введите количество километров - ");
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		double a2 = Math.round(100.0 * (a1 / 0.621371)) / 100.0;
		double a3 = Math.round(100.0 * (a1 / 0.5399566364038877)) / 100.0;
		System.out.println("Переведем километры в сухопутные мили = " + a2 + "\nПереведем километры в морские мили = " + a3);
	}

	public static void procent() {
		System.out.println("\n---Задача7------------------------------------");
		System.out.print("Введите процент который нужно получить отсуммы 32+21 - ");
		Scanner sc = new Scanner(System.in);
		double a1 = sc.nextInt();
		double a2 = (53 * a1 / 100);
		System.out.println("32+21=53   " + a1 + "% от 53 = " + a2);
	}

	public static void diametr_kruga() {
		System.out.println("\n---Задача8------------------------------------");
		System.out.print("Введите длину проволоки - ");
		Scanner sc = new Scanner(System.in);
		double a1 = sc.nextInt();
		double a2 = Math.round(100.0 * (a1 / Math.PI)) / 100.0;
		System.out.println("Если длина проволоки - " + a1 + ", Диаметр её окружности = " + a2);
	}

	public static void konv_gradusov() {
		System.out.println("\n---Задача9------------------------------------");
		System.out.print("Введите градусы по Цельсию - ");
		Scanner sc1 = new Scanner(System.in);
		double a1 = sc1.nextInt();
		double a3 = (double) (((a1 * 9) / 5) + 32); // в фаренгейтах
		double a4 = (double) (a1 + 273.15); // в Кельвинах
		double a5 = (double) (a1 * 0.8); // в Реомюрах
		double a6 = (double) (((100 - a1) * 3) / 2); // в Делилях
		System.out.println(a1 + " градуса(ов) Цельсия \n" + "это " + a3 + " градусов Фаренгейта\n" + "это " + a4
				+ " градусов Кельвина\n" + "это " + a5 + " градусов Реомюра\n" + "это " + a6 + " градусов Делиля");
		System.out.print("Введите градусы по Фаренгейту - ");
		Scanner sc2 = new Scanner(System.in);
		double a2 = sc2.nextInt();
		double a7 = Math.round(100.0 * ((a2 - 32) * 5) / 9) / 100.0;
		System.out.println(a2 + " градуса(ов) Фаренгейта - это " + a7 + " градуса Цельсия");
	}
		
	public static void perestanovka() {
		System.out.println("\n---Задача10------------------------------------");
		int a = 12;
		int b = 34;
		int c;
		System.out.println("---Вариант перестновки через доп. переменную ---");
		System.out.println("Задано a = " + a + ", b = " + b);
		c = a; 
		a = b; 
		b = c; 
		System.out.println("Теперь a = " + a + ", b = " + b);
		System.out.println("\n---Перестановка через суммирование и вычитание---");
		int a1 = 13;
		int a2 = 35;
		System.out.println("Задано a = " + a1 + ", b = " + a2);
		a1 = a1 + a2;
		a2 = a1 - a2;
		a1 = a1 - a2;
		System.out.println("Теперь a = " + a1 + ", b = " + a2);
		System.out.println("---------------------------------------");
	}

}
