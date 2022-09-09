import java.util.Scanner;

//import java.io.*;
public class FormulaGerona {
	public static void main(String[] args) 
	{	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Координаты точки А: ");
		String str_A = scanner.nextLine();
		System.out.println("Координаты точки B: ");
		String str_B = scanner.nextLine();
		System.out.println("Координаты точки C: ");
		String str_C = scanner.nextLine();
		scanner.close();
		
		String[] coords_A = str_A.split(" ");
		String[] coords_B = str_B.split(" ");
		String[] coords_C = str_C.split(" ");
		
			Double.parseDouble(coords_A[0].replace(",","."));
			Point3d A = new Point3d(Double.parseDouble(coords_A[0].replace(",",".")), (double)Double.parseDouble(coords_A[1].replace(",",".")), 
					(double)Double.parseDouble(coords_A[2].replace(",",".")));
			Point3d B = new Point3d(Double.parseDouble(coords_B[0].replace(",",".")), (double)Double.parseDouble(coords_B[1].replace(",",".")), 
					(double)Double.parseDouble(coords_B[2].replace(",","."))); 
			Point3d C = new Point3d(Double.parseDouble(coords_C[0].replace(",",".")), (double)Double.parseDouble(coords_C[1].replace(",",".")), 
					(double)Double.parseDouble(coords_C[2].replace(",",".")));
			System.out.println("Площадь треугольника равна: "+countPerimeter(A, B, C));		
	
			
	}
	
	private static double countPerimeter(Point3d A, Point3d B, Point3d C)
	{
		double p = (A.distanceTo(B)+ A.distanceTo(C)+ B.distanceTo(C))/2;
		double square = Math.sqrt(p*(p-A.distanceTo(B))*(p-A.distanceTo(C))*(p-B.distanceTo(C)));
		return square;
	}
	

}
//A -2.0 1.0 2.0
//B 3.0 -3.0 4.0
//C 1.0 0.0 9.0