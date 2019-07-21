
package KalenderKabisat;

import java.util.Calendar;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class KalenderKabisat {

    public void kabisat(){
            
    String tahuns,tgl28,tgl29;
    int tahun;
        
    tahuns = JOptionPane.showInputDialog("2000 : ");
    tahun = Integer.parseInt(tahuns);
    tgl29= new String ("\nJumlah hari bulan februari adalah 29");
    tgl28= new String ("\nJumlah hari bulan februari adalah 28");


    //tahun habis dibagi 400 = kabisat
    if(tahun%400==0)
    {
    //tahun tidak habis dibagi 400 tetapi habis dibagi 100 = bukan kabisat.
    if(tahun%400!=0 && tahun%100 ==0)
    JOptionPane.showMessageDialog(null,tahun + " Adalah Bukan Tahun Kabisat" + " "+ tgl28);
    else
    {
    JOptionPane.showMessageDialog(null,tahun + " Adalah Tahun Kabisat"+ " " + tgl29);
    }


    } 
    //tahun tidak habis dibagi 400, tidak habis dibagi 100 tetapi habis dibagi 4 = kabisat.
    else if (tahun%400!=0 && tahun%100!=0 && tahun%4 == 0)
    {
    JOptionPane.showMessageDialog(null,tahun + "Adalah Tahun Kabisat" + " " + tgl29);
    }
    else //tahun tidak habis dibagi 400, tidak habis dibagi 100, dan tidak habis dibagi 4 = bukan tahun kabisat
    JOptionPane.showMessageDialog(null,tahun + "Adalah Bukan Tahun Kabisat" + " " + tgl28);
    }
    
    public static void main(String[] args) {
        
        KalenderKabisat obj = new KalenderKabisat();
        obj.kabisat();
        
        Scanner s=new Scanner(System.in);

 
        System.out.print("YEAR : ");
        int year=s.nextInt();

        System.out.println();

        System.out.println("FIRST DAY OF THE YEAR");
        System.out.println("1 for MONDAY");
        System.out.println("2 for TUESDAY");
        System.out.println("3 for WEDNESDAY");
        System.out.println("4 for THURSDAY");
        System.out.println("5 for FRIDAY");
        System.out.println("6 for SATURDAY");
        System.out.println("7 for SUNDAY");
        System.out.print("FIRST DAY : ");
        int firstDay=s.nextInt();

        System.out.println();

        boolean leapYear=false;
        if(year%4==0)
        {
        leapYear=true;
        }

        for(int i=1;i<=12;i++)
        {
        System.out.println("***********************");
        System.out.println("MONTH : "+i);
        System.out.println("***********************");

        if(i==1||i==3||i==5||i==7||i==8||i==10||i==12)
        {
        System.out.println("M T W TH F S SU");
        boolean firstRound=true;
        for(int j=1;j<=31;j++)
        {
        String temp=Integer.toString(j);
        if(temp.length()==1)
        {
        System.out.print(" ");
        }
        if(firstDay==1)
        {
        if(firstRound==true&&j==1)
        {
        for(int k=1;k<=1;k++)
        {
        System.out.print("");
        }
        System.out.print(j+" ");
        }
        else
        {
        System.out.print(j+" ");
        }
        }
        else if(firstDay==2)
        {
        if(firstRound==true&&j==1)
        {
        for(int k=1;k<=3;k++)
        {
        System.out.print("-");
        }
        System.out.print(j+" ");
        }
        else
        {
        System.out.print(j+" ");
        }

        }
        else if(firstDay==3)
        {
        if(firstRound==true&&j==1)
        {
        for(int k=1;k<=6;k++)
        {
        System.out.print("-");
        }
        System.out.print(j+" ");
        }
        else
        {
        System.out.print(j+" ");
        }
        }
        else if(firstDay==4)
        {
        if(firstRound==true&&j==1)
        {
        for(int k=1;k<=9;k++)
        {
        System.out.print("-");
        }
        System.out.print(j+" ");
        }
        else
        {
        System.out.print(j+" ");
        }
        }
        else if(firstDay==5)
        {
        if(firstRound==true&&j==1)
        {
        for(int k=1;k<=12;k++)
        {
        System.out.print("-");
        }
        System.out.print(j+" ");
        }
        else
        {
        System.out.print(j+" ");
        }
        }
        else if(firstDay==6)
        {
        if(firstRound==true&&j==1)
        {
        for(int k=1;k<=15;k++)
        {
        System.out.print("-");
        }
        System.out.print(j+" ");
        }
        else
        {
        System.out.print(j+" ");
        }
        }
        else if(firstDay==7)
        {
        if(firstRound==true&&j==1)
        {
        for(int k=1;k<=18;k++)
        {
        System.out.print("-");
        }
        System.out.println(j+" ");
        }
        else
        {
        System.out.println(j+" ");
        }
        firstDay=0;
        firstRound=false;
        }
        firstDay++;
        }
        System.out.println("\n");
        }
        else if(i==2)
        {
        if(leapYear==true)
        {
        System.out.println("M T W TH F S SU");
        boolean firstRound=true;
        for(int j=1;j<=29;j++)
        {
        String temp=Integer.toString(j);
        if(temp.length()==1)
        {
        System.out.print(" ");
        }
        if(firstDay==1)
        {
        if(firstRound==true&&j==1)
        {
        for(int k=1;k<=1;k++)
        {
        System.out.print("");
        }
        System.out.print(j+" ");
        }
        else
        {
        System.out.print(j+" ");
        }
        }
        else if(firstDay==2)
        {
        if(firstRound==true&&j==1)
        {
        for(int k=1;k<=3;k++)
        {
        System.out.print("-");
        }
        System.out.print(j+" ");
        }
        else
        {
        System.out.print(j+" ");
        }

        }
        else if(firstDay==3)
        {
        if(firstRound==true&&j==1)
        {
        for(int k=1;k<=6;k++)
        {
        System.out.print("-");
        }
        System.out.print(j+" ");
        }
        else
        {
        System.out.print(j+" ");
        }
        }
        else if(firstDay==4)
        {
        if(firstRound==true&&j==1)
        {
        for(int k=1;k<=9;k++)
        {
        System.out.print("-");
        }
        System.out.print(j+" ");
        }
        else
        {
        System.out.print(j+" ");
        }
        }
        else if(firstDay==5)
        {
        if(firstRound==true&&j==1)
        {
        for(int k=1;k<=12;k++)
        {
        System.out.print("-");
        }
        System.out.print(j+" ");
        }
        else
        {
        System.out.print(j+" ");
        }
        }
        else if(firstDay==6)
        {
        if(firstRound==true&&j==1)
        {
        for(int k=1;k<=15;k++)
        {
        System.out.print("-");
        }
        System.out.print(j+" ");
        }
        else
        {
        System.out.print(j+" ");
        }
        }
        else if(firstDay==7)
        {
        if(firstRound==true&&j==1)
        {
        for(int k=1;k<=18;k++)
        {
        System.out.print("-");
        }
        System.out.println(j+" ");
        }
        else
        {
        System.out.println(j+" ");
        }
        firstDay=0;
        firstRound=false;
        }
        firstDay++;
        }
        System.out.println("\n");
        }
        else
        {
        System.out.println("M T W TH F S SU");
        boolean firstRound=true;
        for(int j=1;j<=28;j++)
        {
        String temp=Integer.toString(j);
        if(temp.length()==1)
        {
        System.out.print(" ");
        }
        if(firstDay==1)
        {
        if(firstRound==true&&j==1)
        {
        for(int k=1;k<=1;k++)
        {
        System.out.print("");
        }
        System.out.print(j+" ");
        }
        else
        {
        System.out.print(j+" ");
        }
        }
        else if(firstDay==2)
        {
        if(firstRound==true&&j==1)
        {
        for(int k=1;k<=3;k++)
        {
        System.out.print("-");
        }
        System.out.print(j+" ");
        }
        else
        {
        System.out.print(j+" ");
        }

        }
        else if(firstDay==3)
        {
        if(firstRound==true&&j==1)
        {
        for(int k=1;k<=6;k++)
        {
        System.out.print("-");
        }
        System.out.print(j+" ");
        }
        else
        {
        System.out.print(j+" ");
        }
        }
        else if(firstDay==4)
        {
        if(firstRound==true&&j==1)
        {
        for(int k=1;k<=9;k++)
        {
        System.out.print("-");
        }
        System.out.print(j+" ");
        }
        else
        {
        System.out.print(j+" ");
        }
        }
        else if(firstDay==5)
        {
        if(firstRound==true&&j==1)
        {
        for(int k=1;k<=12;k++)
        {
        System.out.print("-");
        }
        System.out.print(j+" ");
        }
        else
        {
        System.out.print(j+" ");
        }
        }
        else if(firstDay==6)
        {
        if(firstRound==true&&j==1)
        {
        for(int k=1;k<=15;k++)
        {
        System.out.print("-");
        }
        System.out.print(j+" ");
        }
        else
        {
        System.out.print(j+" ");
        }
        }
        else if(firstDay==7)
        {
        if(firstRound==true&&j==1)
        {
        for(int k=1;k<=18;k++)
        {
        System.out.print("-");
        }
        System.out.println(j+" ");
        }
        else
        {
        System.out.println(j+" ");
        }
        firstDay=0;
        firstRound=false;
        }
        firstDay++;
        }
        System.out.println("\n");
        }
        }
        else
        {
        System.out.println("M T W TH F S SU");
        boolean firstRound=true;
        for(int j=1;j<=30;j++)
        {
        String temp=Integer.toString(j);
        if(temp.length()==1)
        {
        System.out.print(" ");
        }
        if(firstDay==1)
        {
        if(firstRound==true&&j==1)
        {
        for(int k=1;k<=1;k++)
        {
        System.out.print("");
        }
        System.out.print(j+" ");
        }
        else
        {
        System.out.print(j+" ");
        }
        }
        else if(firstDay==2)
        {
        if(firstRound==true&&j==1)
        {
        for(int k=1;k<=3;k++)
        {
        System.out.print("-");
        }
        System.out.print(j+" ");
        }
        else
        {
        System.out.print(j+" ");
        }

        }
        else if(firstDay==3)
        {
        if(firstRound==true&&j==1)
        {
        for(int k=1;k<=6;k++)
        {
        System.out.print("-");
        }
        System.out.print(j+" ");
        }
        else
        {
        System.out.print(j+" ");
        }
        }
        else if(firstDay==4)
        {
        if(firstRound==true&&j==1)
        {
        for(int k=1;k<=9;k++)
        {
        System.out.print("-");
        }
        System.out.print(j+" ");
        }
        else
        {
        System.out.print(j+" ");
        }
        }
        else if(firstDay==5)
        {
        if(firstRound==true&&j==1)
        {
        for(int k=1;k<=12;k++)
        {
        System.out.print("-");
        }
        System.out.print(j+" ");
        }
        else
        {
        System.out.print(j+" ");
        }
        }
        else if(firstDay==6)
        {
        if(firstRound==true&&j==1)
        {
        for(int k=1;k<=15;k++)
        {
        System.out.print("-");
        }
        System.out.print(j+" ");
        }
        else
        {
        System.out.print(j+" ");
        }
        }
        else if(firstDay==7)
        {
        if(firstRound==true&&j==1)
        {
        for(int k=1;k<=18;k++)
        {
        System.out.print("-");
        }
        System.out.println(j+" ");
        }
        else
        {
        System.out.println(j+" ");
        }
        firstDay=0;
        firstRound=false;
        }
        firstDay++;
        }
        System.out.println("\n");
            }
        }
    }
}
