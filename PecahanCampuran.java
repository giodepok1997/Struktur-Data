/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pecahancampuran;

/**
 *
 * @author Lenovo
 */
public class PecahanCampuran {

    int bulat, penyebut, pembilang;
    
    PecahanCampuran()
    {
        bulat=0;
        pembilang=0;
        penyebut=1;
    }
    
    PecahanCampuran(int x)
    {
        bulat=x;
        pembilang=0;
        penyebut=1;
    }
    
    PecahanCampuran(int x, int y)
    {
        bulat=0;
        pembilang=x;
        penyebut=y;
    }
    
    PecahanCampuran(int x, int y, int z)
    {
        bulat=x;
        pembilang=y;
        penyebut=z;
    }
    
    int fpb(int x, int y)
    {
        if(y==0)
        {
            return(x);
        }
        else
        {
            return(fpb(y,x%y));
        }
    }
    
    void reduksi()
    {
        int temp=fpb(pembilang, penyebut);
        pembilang=pembilang/temp;
        penyebut=penyebut/temp;
        if(pembilang>=penyebut)
        {
            bulat=pembilang/penyebut;
            pembilang=pembilang%penyebut;
        }
        else
        {
            bulat=0;
        }
    }
    
    PecahanCampuran tambah(PecahanCampuran X)
    {
        PecahanCampuran T = new PecahanCampuran();
        T.bulat = 0;
        T.pembilang =(bulat*penyebut+pembilang)*X.penyebut+penyebut*(X.bulat*X.penyebut*X.pembilang);
        T.penyebut=penyebut*X.penyebut;
        T.reduksi();
        return T;
    }
    
    PecahanCampuran kurang(PecahanCampuran X)
    {
        PecahanCampuran T = new PecahanCampuran();
        T.bulat = 0;
        T.pembilang=(bulat*penyebut+pembilang)*X.penyebut;
        T.penyebut=penyebut*(X.bulat*X.penyebut+X.pembilang);
        T.reduksi();
        return T;
    }
    
    PecahanCampuran kali(PecahanCampuran X)
    {
        PecahanCampuran T = new PecahanCampuran();
        T.bulat = 0;
        T.pembilang=(bulat*penyebut+pembilang)*(X.bulat*X.penyebut+X.pembilang);
        T.penyebut=penyebut*X.penyebut;
        T.reduksi();
        return T;
    }
    
    PecahanCampuran bagi(PecahanCampuran X)
    {
        PecahanCampuran T = new PecahanCampuran();
        T.bulat = 0;
        T.pembilang=(bulat*penyebut+pembilang)*X.penyebut;
        T.penyebut=penyebut*(X.bulat*X.penyebut+X.pembilang);
        T.reduksi();
        return T;
    }
    
    String toStr()
    {
        String T = " ";
        if(penyebut==1)
        {
            if(pembilang==0)
            {
                T=T+bulat;
            }
            else
            {
                T=T+(bulat+pembilang);
                pembilang=0;
            }
        }
        else if(bulat==0)
        {
            T=T+pembilang+"/"+penyebut;
        }
        else
        {
            T=T+bulat+" "+pembilang+"/"+penyebut;
        }
        return(T);
    }
    
    
    public static void main(String[] args) {
        PecahanCampuran p = new PecahanCampuran(2,3);
        PecahanCampuran p1 = new PecahanCampuran();
        PecahanCampuran p2 = new PecahanCampuran(2);
        PecahanCampuran p3 = new PecahanCampuran(2,7,9);
        p2=p2.tambah(p3.kali(p.bagi(p2)));
        
        System.out.println("Program operasi penjumlahan pecahan");
        System.out.println(p.toStr()+" + "+p3.toStr()+" = "+p.tambah(p3).toStr());
        System.out.println(" ");
        System.out.println("Program operasi gabungan pecahan");
        System.out.println(p.toStr()+" : "+p2.toStr()+" X "+p3.toStr()+" + "+p2.toStr()+" = "+p2.toStr());          
    }    
}
