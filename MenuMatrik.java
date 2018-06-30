import java.util.Scanner;

public class MenuMatrik {
	private static Scanner sc = new Scanner(System.in);
	private static int input_menu, loop_a, loop_b, loop_c, a_col, a_row, b_col, b_row;
//	private static int matrik_a [][], matrik_b[][];
//	private static int hasil_jumlah [][], hasil_kurang[][], hasil_kali[][];

	public static void main(String[] args) {
		System.out.println("===== Menghitung 2 Matrik =====");
		System.out.println("1. Penjumlahan");
		System.out.println("2. Pengurangan");
		System.out.println("3. Perkalian");
		System.out.print("\n* Masukkan pilihan Anda : ");
		
		input_menu = sc.nextInt();
		
		switch (input_menu) {
		case 1:
			jumlah_matrik();
			break;
			
		case 2:
			kurangi_matrik();
			break;
			
		case 3:
			perkalian_matrik();
			break;
			
		default:
			System.out.println("- Maaf, menu tidak ada");
			break;
		}

	}
	
	
	private static boolean cek_jumlahkurang(int a_col, int a_row, int b_col, int b_row)
	{
		if((a_col == b_col) && (a_row == b_row))
		{
			return true;
		} else 
		{
			return false;
		}
		
	}
	
	
	private static void jumlah_matrik()
	{
		System.out.println("\n- Penjumlahan Matrik -");
		System.out.println("--- ORDO MATRIK A ---");
		System.out.print("** Jumlah Baris = "); a_row = sc.nextInt();
		System.out.print("** Jumlah Kolom = "); a_col = sc.nextInt();
		
		System.out.println("\n--- ORDO MATRIK B ---");
		System.out.print("** Jumlah Baris = "); b_row = sc.nextInt();
		System.out.print("** Jumlah Kolom = "); b_col = sc.nextInt();
		
		System.out.println();
		
		if(cek_jumlahkurang(a_col, a_row, b_col, b_row))
		{
			int matrik_a[][] = new int[a_col][a_row];
			int matrik_b[][] = new int[b_col][b_row];
			int hasil_jumlah[][] = new int[a_col][a_row];
			
			System.out.println("\n-- INPUT MATRIK A --");
			for(loop_a = 0; loop_a < a_col; loop_a++)
			{
				for(loop_b = 0; loop_b < a_row; loop_b++)
				{
					System.out.print("- Matrik A baris ke-"+(loop_a+1)+" kolom ke-"+(loop_b+1)+" : ");
					matrik_a[loop_a][loop_b] = sc.nextInt();
				}
			}
			
			System.out.println("\n-- INPUT MATRIK B --");
			for(loop_a = 0; loop_a < b_col; loop_a++)
			{
				for(loop_b = 0; loop_b < b_row; loop_b++)
				{
					System.out.print("- Matrik B baris ke-"+(loop_a+1)+" kolom ke-"+(loop_b+1)+" : ");
					matrik_b[loop_a][loop_b] = sc.nextInt();
				}
			}
			
			// PRINT MATRIK A
			System.out.println("\n- MATRIK A -");
			for(loop_a = 0; loop_a < a_col; loop_a++)
			{
				for(loop_b = 0; loop_b < a_row; loop_b++)
				{
					System.out.print(matrik_a[loop_a][loop_b]+" ");
				}
				System.out.println();
			}
			
			// PRINT MATRIK B
			System.out.println("\n- MATRIK B -");
			for(loop_a = 0; loop_a < b_col; loop_a++)
			{
				for(loop_b = 0; loop_b < b_row; loop_b++)
				{
					System.out.print(matrik_b[loop_a][loop_b]+" ");
				}
				System.out.println();
			}
			
			// HITUNG PENJUMLAHAN
			for(loop_a = 0; loop_a < a_col; loop_a++)
			{
				for(loop_b = 0; loop_b < a_row; loop_b++)
				{
					hasil_jumlah[loop_a][loop_b] = matrik_a[loop_a][loop_b] + matrik_b[loop_a][loop_b];
				}
			}
			
			// PRINT HASIL PENJUMLAHAN
			System.out.println("\n- Matrk A . Matrik B -");
			for(loop_a = 0; loop_a < a_col; loop_a++)
			{
				for(loop_b = 0; loop_b < a_row; loop_b++)
				{
					System.out.print(hasil_jumlah[loop_a][loop_b]+" ");
				}
				System.out.println();
			}
			
			
		} else 
		{
			System.out.println("-- Maaf, matrik A dan B tidak bisa dijumlahkan");
		}
				
	}
	
	private static void kurangi_matrik()
	{
		System.out.println("\n- Pengurangan Matrik -");
		System.out.println("--- ORDO MATRIK A ---");
		System.out.print("** Jumlah Baris = "); a_row = sc.nextInt();
		System.out.print("** Jumlah Kolom = "); a_col = sc.nextInt();
		
		System.out.println("\n--- ORDO MATRIK B ---");
		System.out.print("** Jumlah Baris = "); b_row = sc.nextInt();
		System.out.print("** Jumlah Kolom = "); b_col = sc.nextInt();
		
		System.out.println();
		
		if(cek_jumlahkurang(a_col, a_row, b_col, b_row))
		{
			int matrik_a[][] = new int[a_col][a_row];
			int matrik_b[][] = new int[b_col][b_row];
			int hasil_kurang[][] = new int[a_col][a_row];
			
			System.out.println("\n-- INPUT MATRIK A --");
			for(loop_a = 0; loop_a < a_col; loop_a++)
			{
				for(loop_b = 0; loop_b < a_row; loop_b++)
				{
					System.out.print("- Matrik A baris ke-"+(loop_a+1)+" kolom ke-"+(loop_b+1)+" : ");
					matrik_a[loop_a][loop_b] = sc.nextInt();
				}
			}
			
			System.out.println("\n-- INPUT MATRIK B --");
			for(loop_a = 0; loop_a < b_col; loop_a++)
			{
				for(loop_b = 0; loop_b < b_row; loop_b++)
				{
					System.out.print("- Matrik B baris ke-"+(loop_a+1)+" kolom ke-"+(loop_b+1)+" : ");
					matrik_b[loop_a][loop_b] = sc.nextInt();
				}
			}
			
			// PRINT MATRIK A
			System.out.println("\n- MATRIK A -");
			for(loop_a = 0; loop_a < a_col; loop_a++)
			{
				for(loop_b = 0; loop_b < a_row; loop_b++)
				{
					System.out.print(matrik_a[loop_a][loop_b]+" ");
				}
				System.out.println();
			}
			
			// PRINT MATRIK B
			System.out.println("\n- MATRIK B -");
			for(loop_a = 0; loop_a < b_col; loop_a++)
			{
				for(loop_b = 0; loop_b < b_row; loop_b++)
				{
					System.out.print(matrik_b[loop_a][loop_b]+" ");
				}
				System.out.println();
			}
			
			// HITUNG PENGURANGAN
			for(loop_a = 0; loop_a < a_col; loop_a++)
			{
				for(loop_b = 0; loop_b < a_row; loop_b++)
				{
					hasil_kurang[loop_a][loop_b] = matrik_a[loop_a][loop_b] + matrik_b[loop_a][loop_b];
				}
			}
			
			// PRINT HASIL PENGURANGAN
			System.out.println("\n- Matrk A . Matrik B -");
			for(loop_a = 0; loop_a < a_col; loop_a++)
			{
				for(loop_b = 0; loop_b < a_row; loop_b++)
				{
					System.out.print(hasil_kurang[loop_a][loop_b]+" ");
				}
				System.out.println();
			}
			
			
		} else 
		{
			System.out.println("-- Maaf, matrik A dan B tidak bisa dikurangkan");
		}
	}
	
	private static void perkalian_matrik()
	{
		
	}

}
