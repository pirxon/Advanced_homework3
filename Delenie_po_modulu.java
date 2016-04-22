package homework4;

import java.util.Scanner;

public class Delenie_po_modulu {

	public static void main(String[] args) {

		/*
		 * 1. ������ � ���������� ��� 3-������� ����� � �������� � ��� �������
		 * ����� (��������, ������ 357 � 702 � �������� � ������� ����� 307 �
		 * 752).
		 */
		perestanovka();

		/*
		 * 2. ������ 4-������� ����� � ���������� ����� ������ � ������� ����� �
		 * �������� ������ � ��������� �����.
		 */
		pereshet_cifr();

		/*
		 * 3. ������ � ���������� 3-������� ����� � ������� �� ���� �������
		 * ����� (��������, ������ 3, 5, 7 � �������� � ������� ����� 37).
		 */
		del_sred_cifr();

		/*
		 * 4. �������� ���������, ������� ���������� ������������ ������ �����
		 * ��������� ������ � �������, � ����� ������� �������, �������
		 * ����������� ����. ���������� ����� �����, ������������� ������
		 * ��������� ������ �����.
		 */
		bank_viplati();

		/*
		 * 5. ������� ������ ����� Y ����� ������ �� � ������ � ������� ��������
		 * �����?
		 */
		sdacha();
	}

	private static void perestanovka() {
		System.out.println("---������1------------------------------------");
		System.out.print("������� ������ ����������� ����� - ");
		Scanner in1 = new Scanner(System.in);
		int chislo1 = in1.nextInt();
		System.out.print("������� ������ ����������� ����� - ");
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

		System.out.println("������ ������� ����� ������� - " + chislo1 + " " + chislo2);
	}

	private static void pereshet_cifr() {
		System.out.println("\n---������2------------------------------------");
		System.out.print("������� ������������� ����� - ");
		Scanner in = new Scanner(System.in);
		int chislo = in.nextInt();
		int dig1 = (chislo % 10000 / 1000);
		int dig2 = (chislo % 1000 / 100);
		int dig3 = (chislo % 100 / 10);
		int dig4 = (chislo % 10);
		int res1 = dig1 + dig3;
		int res2 = dig2 - dig4;
		System.out.println("����� ������� � �������� ����� = " + res1 + ". �������� ������� � ���������� ����� = " + res2);
	}

	private static void del_sred_cifr() {
		System.out.println("\n---������3------------------------------------");
		System.out.print("������� ���������� ����� - ");
		Scanner in = new Scanner(System.in);
		int chislo = in.nextInt();
		int dig1 = (chislo % 1000 / 100);
		int dig2 = (chislo % 100 / 10);
		int dig3 = (chislo % 10);
		System.out.println("�������� ������� �����. ��������� - " + dig1 + dig3);
	}

	private static void bank_viplati() {
		System.out.println("\n---������4------------------------------------");
		System.out.print("������� ����� ����� ������� �� ������ ������� (���) - ");
		Scanner in1 = new Scanner(System.in);
		double vklad = in1.nextDouble();
		System.out.print("������� ������� ������� - ");
		Scanner in2 = new Scanner(System.in);
		double procent = in2.nextDouble();
		double mes1 = Math.round(100.0 * (vklad * procent / 12 / 100.0)) / 100.0;
		System.out.println("������ ����� ����� �� ��������� �� ������ �������� �� " + mes1 + " ���.");
	}

	private static void sdacha() {
		System.out.println("\n---������5------------------------------------");
		System.out.print("������� ������� �� 8.75 ��� �� ��. ������� ����� ����� (���) - ");
		Scanner in = new Scanner(System.in);
		double dengi = in.nextDouble();
		double pechenki = 8.75;
		int kol = (int) (dengi / pechenki);
		double kol_temp = kol * pechenki;
		double sdacha = Math.round(100.0 * (dengi - kol_temp)) / 100.0;
		System.out.println("�� " + dengi + " ���. �� ������ ������ - " + kol + " ��.\n���� ����� - " + sdacha + " ���.");

	}

}
