package LatihanProdemy;
import java.util.Scanner;
public class Latihan2 {

	public static void main(String[] args) {
		Scanner baca = new Scanner(System.in);
		String kata1 , kata2;
		int panjang;
		
		//Right Pad
		System.out.println("== Right Pad ==");
		System.out.print("Input Sebuah Kata = ");
		kata1 = baca.nextLine();
		System.out.print("Input Panjang Kata = ");
		panjang = baca.nextInt(); 
		System.out.println("Hasil Right Pad : ");
		RightPad(kata1 , panjang);
		
		
		//Left Pad
		System.out.println("\n== Left Pad ==");
		System.out.print("Input Sebuah Kata = ");
		baca.nextLine();
		kata2 = baca.nextLine();
		System.out.print("Input Panjang Kata = ");
		panjang = baca.nextInt(); 
		System.out.println("Hasil Right Pad : ");
		LeftPad(kata2 , panjang);
		
		baca.close();
		
	}
	
	static StringBuilder RightPad(String kata, int panjang) {
		StringBuilder builderKata = new StringBuilder();
		
		if(kata.length() < panjang) {
			builderKata.append(kata);
			for(int i = kata.length() ; i < panjang ; i++) {
				builderKata.append("_");
			}
			System.out.println(builderKata);
		}else {
			System.out.println(kata);
		}
		return builderKata;
	}
	
	static StringBuilder LeftPad(String kata, int panjang) {
		StringBuilder builderKata = new StringBuilder();
		
		if(kata.length() < panjang) {
			for(int i = kata.length() ; i < panjang ; i++) {
				builderKata.append("_");
			}
			builderKata.append(kata);
			System.out.println(builderKata);
		}else {
			System.out.println(kata);
		}
		return builderKata;
	}
}
