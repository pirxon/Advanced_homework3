package homework4;

import java.util.Scanner;

public class Arifm_op {
	
	public static void main(String[] args) {
		
		System.out.println("\t\t---�������������� ��������� ���� ������---");

		System.out.println("\n---������1------------------------------------");
/*		1.	�������� ���������, ������� ������� ������� �������������� 
		�������� ��� ������������ �����.*/				
		int a1 = 2;
		int a2 = 1;
		int a3 = 4;
		double sr = (double)(a1 + a2 + a3) / 3;
		System.out.println("������� �������������� ����� "+a1+","+a2+","+a3+" - "+Math.round(100.0 * sr) / 100.0);
		
		System.out.println("\n---������2------------------------------------");
/*	    2.	�������� ���������, ������� ������� ������ ��������� 
	    ��������� ax + b = 0.*/
		double b1=3;
		double b2=16;
		double b3;
		b3 = Math.round(100.0 * ((-b2)/b1)) / 100.0;
		System.out.println("������� ��������� ax + b = 0, ��� a = "+(int)b1+", b = "+(int)b2+" ��������� = "+b3);
		
		System.out.println("\n---������3------------------------------------");
/*		3.	������������ ������ ����� � �������. ��������� ��������� 
		��������� ������� ����� �����. */		 
		System.out.print("������� ����� ����� - ");
		Scanner sc1= new Scanner(System.in);
        int c1=sc1.nextInt();
        System.out.print("������� ������� � ������� ���� �������� ��� ����� - ");
		Scanner sc2= new Scanner(System.in);
        int c2=sc2.nextInt();
        int c3 = (int)Math.pow(c1, c2);
        System.out.println("���������� ����� - "+c1+" � ������� - "+c2+". ��������� = "+c3);
        
        System.out.println("\n---������4------------------------------------");
/*      4.	�������� ���������, �������  ���������� ������������ 
        ������ ������ ����������, � ����� ������� ������� � ����� 
        ���� ����������. ����� Pi ������ � ��������� ��� ������������ 
        ���������.*/         
        final double Pi = 3.1415926536;
    	System.out.print("������� ������ ���������� - ");
		Scanner sc3= new Scanner(System.in);
        int d1=sc3.nextInt();
        double d2 = Math.round(100.0 * (Pi * d1 * d1)) / 100.0;
        double d3 = Math.round(100.0 * (2* Pi * d1 * d1)) / 100.0;
        System.out.println("������� ���������� = "+d2);
        System.out.println("����� ���������� = "+d3);
        
        System.out.println("\n---������5------------------------------------");
/*      5.	�������� ���������, �������  ������������� ������������ 
        ����������� ������ � ���������� ���������� ������, � ���������
        ��� � �������, ���� � �����.*/         
    	System.out.print("������� ���������� ������ - ");
		Scanner sc4= new Scanner(System.in);
        int e1=sc4.nextInt();
        double e2 = Math.round(100.0 * (e1 / 25.1954)) / 100.0; 
        double e3 = Math.round(100.0 * (e1 / 28.5696)) / 100.0;
        double e4 = Math.round(100.0 * (e1 / 0.38321)) / 100.0;
        System.out.println("��������� ������ � ������� = "+e2
        					+"\n��������� ������ � ���� = "+e3
        					+"\n��������� ������ � ����� = "+e4);
        
        System.out.println("\n---������6------------------------------------");
/*      6. �������� ���������, ������� ��������� ��������� � ���������� 
           � ������� ����. */
        System.out.print("������� ���������� ���������� - ");
		Scanner sc5= new Scanner(System.in);
        int f1=sc5.nextInt();
        double f2 = Math.round(100.0 * (f1 / 0.621371)) / 100.0; 
        double f3 = Math.round(100.0 * (f1 / 0.5399566364038877)) / 100.0;
        System.out.println("��������� ��������� � ���������� ���� = "+f2
        					+"\n��������� ��������� � ������� ���� = "+f3);
        
        System.out.println("\n---������7------------------------------------");
/*      7. �������� ���������, ������� ������� ������� P �� ����� S.*/
    	System.out.print("������� ������� ������� ����� �������� ������� 32+21 - ");
		Scanner sc6= new Scanner(System.in);
        double g1=sc6.nextInt();
        double g2 = (53 * g1 / 100); 
        System.out.println("32+21=53   "+g1+"% �� 53 = "+g2);
        
        System.out.println("\n---������8------------------------------------");
/*      8.	�������� ��������� ��� ����������� �������� ����������, ������� 
        ����� �������� �� ������� ��������� ������ � (X ������ ������������ 
        � ����������). */
    	System.out.print("������� ����� ��������� - ");
		Scanner sc7= new Scanner(System.in);
		double x1=sc7.nextInt();
        double x2 = Math.round(100.0 * (x1 / Pi)) / 100.0;
        System.out.println("���� ����� ��������� - "+x1+", ������� � ���������� = "+x2);
        
        System.out.println("\n---������9------------------------------------");
/*      9.	�������� ���������, ������� ��������� ��������� ���������� 
        �������� �� ������� � ������� �� ����� ����������, ��������, 
        ������� � ������. ����� ����������� ������� �� �������� �� 
        ���������� � ������� �� �������.*/    	
    	System.out.print("������� ������� �� ������� - ");
		Scanner sc8 = new Scanner(System.in);
		double y1 = sc8.nextInt();
		double y3 = (double)(((y1 * 9) / 5) + 32); // � �����������
		double y4 = (double)(y1 + 273.15); // � ���������
		double y5 = (double)(y1 * 0.8); // � ��������
		double y6 = (double)(((100 - y1) * 3) / 2); // � �������
        System.out.println(y1+" �������(��) ������� \n"+
        				   "��� "+y3+" �������� ����������\n"+
        				   "��� "+y4+" �������� ��������\n"+
        				   "��� "+y5+" �������� �������\n"+
        				   "��� "+y6+" �������� ������");
		System.out.print("������� ������� �� ���������� - ");
		Scanner sc9 = new Scanner(System.in);
		double y2 = sc9.nextInt();
		double y7 = Math.round(100.0 * ((y2 - 32) * 5) / 9) / 100.0;
        System.out.println(y2+" �������(��) ���������� - ��� "+y7+" ������� �������");

        System.out.println("\n---������10------------------------------------");
/*		10.	�������� ������� �������� ���������� a � b, ������� 
		� �������������� �������������� ������� ����������, � 
		����� � ���.*/
		int m1 = 12;
		int m2 = 34;
		int m3;
		System.out.println("---������� ������� ������������---");
		System.out.println("������ a = "+m1+", b = "+m2);
		m3 = m1; //12
		m1 = m2; //34
		m2 = m3; //12
		System.out.println("������ a = "+m1+", b = "+m2);
		System.out.println("---������ ������� ������������---");
		int z1 = 13;
		int z2 = 35;
		System.out.println("������ a = "+z1+", b = "+z2);
		z1 = z1 + z2;
		z2 = z1 - z2;
		z1 = z1 - z2;
		System.out.println("������ a = "+z1+", b = "+z2); 
		System.out.println("---------------------------------------");
	}
}
