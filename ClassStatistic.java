
package Tugas;

import java.util.Scanner;


public class ClassStatistic {

    public ClassStatistic() {
      
        RataRata();
    }

    public static void main(String[] args) {
        
        ClassStatistic cs = new ClassStatistic();
        cs.RataRata();
    }
    
    public void StandarDeviasi(){
        int n;
        float[] x;
        float total=0;
        
        Scanner Baca = new Scanner(System.in);
        System.out.print("Banyaknya data");
        n=Baca.nextInt();
        x = new float[n];
        for (int i=0; i<n; i++){
            System.out.print("Data ke" +(i+1)+"=");
            x[i] = Baca.nextInt();
            total += x[i];
        }
        float xr = total/n;
        total = 0;
        for (int i=0; i<n; i++)
            total += (x[i]-xr)*(x[i]-xr);
        float sd = (float) Math.sqrt(total)/n;
        
        System.out.println("Standard Deviasi =" + sd);
    }
    
    public void PengurutanData()
    {
        int n, adr;
        float[] x;
        float min, temp;
    
        Scanner Baca = new Scanner(System.in);
        System.out.print("Banyaknya Data =");
        n = Baca.nextInt();
        x = new float[n];
        for (int i=0; i<n; i++){
            System.out.print("Data Ke "+(i+1)+" = ");
            x[i] = Baca.nextInt();
        }
        System.out.println("\n Data Sebelum Diurut :");
        for (int i=0; i<n; i++)
        System.out.print(x[i]+ " ");
        System.out.println(" ");
        for (int i=0; i<n; i++){
            min = x[i];
            adr = i;
            for (int j=i+1; j<n; j++)
            if (min > x[j]){
                min = x[j];
                adr = j;
            }
            temp = x[i];
            x[i] = x[adr];
            x[adr] = temp;
        }
        System.out.println("\n Data Sesudah Diurut :");
        for (int i=0; i<n; i++)
            System.out.print(x[i]+ " ");
            System.out.println(" ");
    }
    
    public void MaximumMinimumRange(){
        int Range;
        Scanner input=new Scanner (System.in);
        System.out.print("\n BERAPA DATA : ");
        int n= input.nextInt();
        int []a= new int [n];
        System.out.println("\n INPUT DATA =");
        for(int i=0;i<n;i++){ 
        a[i]=input.nextInt();}
        System.out.println ("");
        for(int j=0;j<n;j++){
        System.out.println(" Data ke "+(j+1)+": "+a[j]);}
        int iMaximum = a[0];
        for(int i=1;i<n;i++){
            if(iMaximum < a[i]){
                iMaximum=a[i];}}
        int iMinimum=a[0];
        for(int i=1;i<n;i++){
            if(iMinimum>a[i]){
                iMinimum=a[i];}}
        System.out.println("Nilai Maksimum\t: "+iMaximum+" ");
        System.out.println("Nilai Minimum\t: "+iMinimum+" ");
        System.out.println("");
        
        // Mencari Range
        
        Range = iMaximum - iMinimum;
        System.out.println("Range :" +Range+" ");
        System.out.println("");
    }
    
    public void RataRata(){
        
        //Inisialisasi
        Scanner input = new Scanner(System.in);
        int n, nilai[];
        float rata, jumlah = 0;
 
        //Input jumlah mahasiswa
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        n = input.nextInt();
 
        //Inisialisasi array
        nilai = new int[n];
 
        //Input nilai
        for(int i=0;i<= n-1;i++){
            System.out.print("Nilai Mahasiswa " + (i+1) + " : ");
            nilai[i] = input.nextInt();
            System.out.println();
        }
 
        //Hitung Jumlah
        for(int j=0;j<= n-1;j++){
            jumlah = jumlah + nilai[j];
        }
 
        //Hitung Rata-rata
        rata = jumlah/n;
 
        //Output
        System.out.println("Daftar Nilai :");
        System.out.println("----------------");
        System.out.println("Nilai rata-rata : " + rata);
    }
    }

