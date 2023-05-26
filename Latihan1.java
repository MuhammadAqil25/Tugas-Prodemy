package LatihanProdemy;
import java.util.Scanner;

public class Latihan1 {
	public static void main(String[] args) {
		soalNomor1();
		System.out.print("\n");
		soalNomor2();
		System.out.print("\n");
		soalNomor3();
		System.out.print("\n");
		soalNomor4();
	}
	
	//Method Soal Nomor 1
	static void soalNomor1() {
		// 1A
		Scanner inputUser = new Scanner(System.in);
		System.out.println("== Soal Nomor 1A ==");
		System.out.print("Masukkan nilai n = ");
		int n = inputUser.nextInt();
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		
		// 1B
		System.out.println("\n== Soal Nomor 1B ==");
		System.out.print("Masukkan nilai n = ");
		n = inputUser.nextInt();
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if((i == j || i + j == n-1)) {
					System.out.print("* ");
				}else { 
					System.out.print("  ");
				}
			}
			System.out.print("\n");
		}
		
		// 1C
		System.out.println("\n== Soal Nomor 1C ==");
		System.out.print("Masukkan nilai n = ");
		n = inputUser.nextInt();
			for(int i = 0 ; i < n ; i++) {
				for(int j = 0 ; j < n ; j++) {
					System.out.print(j + " ");
			}
			System.out.print("\n");
		}
		
		// 1D
		System.out.println("\n== Soal Nomor 1D ==");
		System.out.print("Masukkan nilai n = ");
		int k;
		n = inputUser.nextInt();
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if(i == j) {
					k = i + j + 1;
					System.out.print(k + " ");
				}else if ((i + j == n-1) ){
					k = n - i + j;
					System.out.print(k + " ");
				}else { 
					System.out.print("  ");
				}
			}
			System.out.print("\n");
		}
	}
	
	//Method Soal Nomor 2
	static void soalNomor2() {
		// 2.1
		Scanner inputUser = new Scanner(System.in);
		System.out.println("== Soal Nomor 2.1 ==");
		System.out.print("Masukkan nilai n = ");
		int n = inputUser.nextInt();
		int fn, fn1, fn2;
		fn = 1;
		fn1 = 0;
		fn2 = 1;
		for(int i = 0 ; i < n ; i++) {
			if (i < n) {
				System.out.print(fn + " ");
				fn = fn1 + fn2;
				fn1 = fn2 ;
				fn2 = fn;
			}else {
				return;	
			}
		}
		
		// 2.2A
		System.out.println("\n\n== Soal Nomor 2.2A ==");
		System.out.print("Masukkan nilai n = ");
		n = inputUser.nextInt();
		for(int i = 0 ; i < n ; i++) {
			if (i <= n/2) {
				System.out.print(i + 1 + " ");
			}else if (i > n/2){
				System.out.print(n - i + " ");
			}else {
				return;	
			}
		}	
		
		// 2.2B
		System.out.println("\n\n== Soal Nomor 2.2B ==");
		System.out.print("Masukkan nilai n = ");
		n = inputUser.nextInt();
		fn = 1;
		fn1 = 0;
		fn2 = 1;
		for(int i = 0 ; i < n ; i++) {
			if (i <= n/2) {
				System.out.print(fn + " ");
				fn = fn1 + fn2;
				fn1 = fn2 ;
				fn2 = fn;
			}else if (i > n/2){
				fn = fn2-fn1;
				fn2 = fn1;
				fn1 = fn;
				System.out.print(fn + " ");
			}else {
				return;	
			}
		}
		// 2.3
		System.out.println("\n\n== Soal Nomor 2.3 ==");
		System.out.print("Masukkan nilai n = ");
		n = inputUser.nextInt();
		int fnx, fnx1, fnx2;
		fn = fnx = 1;
		fn1 = fnx1 = 0;
		fn2 = fnx2 = 1;
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if((i == j)) {
					if (i <= n / 2) {
						System.out.print(fn + " ");
						fn = fn1 + fn2;
						fn1 = fn2;
						fn2 = fn;
					}else if (i > n / 2) {
						fn = fn2 - fn1;
						fn2 = fn1;
						fn1 = fn;
						System.out.print(fn + " ");
					}else {
						return;
					} 
				}else if ( i + j == n-1){
					if (i <= n / 2) {
						System.out.print(fnx + " ");
						fnx = fnx1 + fnx2;
						fnx1 = fnx2;
						fnx2 = fnx;
					}else if (i > n / 2) {
						System.out.print(fnx + " ");
						fnx = fnx2 - fnx1;
						fnx2 = fnx1;
						fnx1 = fnx;
					}else {
						return;
					}
				}else { 
					System.out.print("  ");
				}
			}
			System.out.print("\n");
		}
		
	}
	
	static void soalNomor3() {
		// 3
		Scanner inputUser = new Scanner(System.in);
		System.out.println("\n== Soal Nomor 3 ==");
		System.out.print("Masukkan nilai n = ");
		int n = inputUser.nextInt();
		int fn, fn1, fn2, fn3;
		fn = 1;
		fn1 = 1;
		fn2 = 1;
		fn3 = 1;
		for(int i = 0 ; i < n ; i++) {
			if (i < 3) {
				System.out.print(fn + " ");
			}else if (i > 2 ){
				fn = fn1 + fn2 + fn3;
				fn1 = fn2;
				fn2 = fn3;
				fn3 = fn;
				System.out.print(fn + " ");
			}else {
				return;	
			}
		}
	}
	
	static void soalNomor4() {
		// 4
		Scanner inputUser = new Scanner(System.in);
		System.out.println("\n== Soal Nomor 4 ==");
		System.out.print("Masukkan nilai n = ");
		int n = inputUser.nextInt();
		int deretFibonacci[] = new int[n];
		int fn, fn1, fn2;
		fn = 1;
		fn1 = 0;
		fn2 = 1;
		for (int i = 0; i < deretFibonacci.length; i++) {
			deretFibonacci[i] = fn;
			fn = fn1 + fn2;
			fn1 = fn2;
			fn2 = fn;
		}
		for (int i = 0; i < deretFibonacci.length; i++) {
			for (int j = 0; j < deretFibonacci.length; j++) {
				if (i == j) {
					System.out.print(deretFibonacci[i] + " ");
				} else if (i + j == n - 1) {
					System.out.print(deretFibonacci[j] + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("\n");
		}
		return;
	}
}
