package homework4;

import java.util.Scanner;

public class Delenie_po_modulu {

	public static void main(String[] args) {

		/*
		 * 1. Ввести с клавиатуры два 3-значных числа и поменять у них средние
		 * цифры (например, ввести 357 и 702 – получить и вывести числа 307 и
		 * 752).
		 */
		perestanovka();

		/*
		 * 2. Ввести 4-значное число и подсчитать сумму первой и третьей цифры и
		 * разность второй и четвертой цифры.
		 */
		pereshet_cifr();

		/*
		 * 3. Ввести с клавиатуры 3-значное число и удалить из него среднюю
		 * цифру (например, ввести 3, 5, 7 – получить и вывести число 37).
		 */
		del_sred_cifr();

		/*
		 * 4. Написать программу, которая предлагает пользователю ввести сумму
		 * денежного вклада в гривнах, а также процент годовых, которые
		 * выплачивает банк. Определить сумму денег, выплачиваемых банком
		 * вкладчику каждый месяц.
		 */
		bank_viplati();

		/*
		 * 5. Сколько товара ценой Y можно купить на Х гривен и сколько получить
		 * сдачи?
		 */
		sdacha();
	}

	private static void perestanovka() {
		System.out.println("---Задача1------------------------------------");
		System.out.print("Введите первое трехзначное число - ");
		Scanner in1 = new Scanner(System.in);
		int chislo1 = in1.nextInt();
		System.out.print("Введите второе трехзначное число - ");
		Scanner in2 = new Scanner(System.in);
		int chislo2 = in2.nextInt();

		int dig11 = (chislo1 % 1000 / 100);
		int dig12 = (chislo1 % 100 / 10);
		int dig13 = (chislo1 % 10);

		int dig21 = (chislo2 % 1000 / 100);
		int dig22 = (chislo2 % 100 / 10);
		int dig23 = (chislo2 % 10);

		dig12 = dig12 + dig22;
		dig22 = dig12 - dig22;
		dig12 = dig12 - dig22;

		chislo1 = dig11 * 100 + dig12 * 10 + dig13;
		chislo2 = dig21 * 100 + dig22 * 10 + dig23;

		System.out.println("Меняем средние цифры местами - " + chislo1 + " " + chislo2);
	}

	private static void pereshet_cifr() {
		System.out.println("\n---Задача2------------------------------------");
		System.out.print("Введите четырехзачное число - ");
		Scanner in = new Scanner(System.in);
		int chislo = in.nextInt();
		int dig1 = (chislo % 10000 / 1000);
		int dig2 = (chislo % 1000 / 100);
		int dig3 = (chislo % 100 / 10);
		int dig4 = (chislo % 10);
		int res1 = dig1 + dig3;
		int res2 = dig2 - dig4;
		System.out.println("Сумма первого и третьего числа = " + res1 + ". Разность второго и четвертого числа = " + res2);
	}

	private static void del_sred_cifr() {
		System.out.println("\n---Задача3------------------------------------");
		System.out.print("Введите трехначное число - ");
		Scanner in = new Scanner(System.in);
		int chislo = in.nextInt();
		int dig1 = (chislo % 1000 / 100);
		int dig2 = (chislo % 100 / 10);
		int dig3 = (chislo % 10);
		System.out.println("Вырезаем среднюю цифру. Результат - " + dig1 + dig3);
	}

	private static void bank_viplati() {
		System.out.println("\n---Задача4------------------------------------");
		System.out.print("Введите сумму денег которую вы хотите вложить (грн) - ");
		Scanner in1 = new Scanner(System.in);
		double vklad = in1.nextDouble();
		System.out.print("Введите процент годовых - ");
		Scanner in2 = new Scanner(System.in);
		double procent = in2.nextDouble();
		double mes1 = Math.round(100.0 * (vklad * procent / 12 / 100.0)) / 100.0;
		System.out.println("Каждый месяц месяц по процентам вы будете получать по " + mes1 + " грн.");
	}

	private static void sdacha() {
		System.out.println("\n---Задача5------------------------------------");
		System.out.print("Покупка печенек по 8.75 грн за шт. Введите сумму денег (грн) - ");
		Scanner in = new Scanner(System.in);
		double dengi = in.nextDouble();
		double pechenki = 8.75;
		int kol = (int) (dengi / pechenki);
		double kol_temp = kol * pechenki;
		double sdacha = Math.round(100.0 * (dengi - kol_temp)) / 100.0;
		System.out.println("На " + dengi + " грн. вы можете купить - " + kol + " шт.\nВаша сдача - " + sdacha + " грн.");

	}

}
