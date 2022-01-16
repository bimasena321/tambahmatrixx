package tugas;
import java.util.*;
public class putra{
	public static void main(String[] args) {
		int [][] sena = {{2,4,6},{8,10,12},{14,16,18}};

		int [][] bima = {{6,6,6},{12,10,11},{1,3,8}};

		printarrays1(sena);
		printarrays1(bima);

		int baris1 = sena.length;
		int kolom2 = sena[0].length;

		int [][] hasil = new int[baris1][kolom2];
		for (int s =0;s<baris1 ;s++ ) {
			for (int w = 0;w<kolom2 ;w++ ) {
				hasil[s][w] = sena[s][w] + bima[s][w]; 
			}
			
		}
		printarrays1(hasil);




	}
	private static void printarrays1(int [][] arrays){
		int baris = arrays.length;
		int kolom = arrays[0].length;

		for (int a =0;a<baris ;a++ ) {
			System.out.print("[");
			for (int b =0;b<kolom ;b++ ) {
				System.out.print(arrays[a][b]);
				if (b < (kolom -1)) {
					System.out.print(",");
					
				}else{
					System.out.print("]");
				}
			}
			System.out.print("\n");
			
		}
		System.out.print("\n");
	}
}