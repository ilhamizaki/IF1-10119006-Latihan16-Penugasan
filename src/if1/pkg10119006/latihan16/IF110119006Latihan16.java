/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119006.latihan16;

/**
 *
 * @author 
 * NAMA     : Ilham zaki
 * Kelas    : IF1
 * NIM      : 10119006
 * Deskripsi Program : Tampil Penugasan
 */
public class IF110119006Latihan16 {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 0;
        
        System.out.println("Nilai a = " + a);
        System.out.println("Nilai b = " + b);
        System.out.println("Nilai c = " + c+"\n");
        
        c = a + b;
        System.out.println("c = a + b = " + c);
        c += a;
        System.out.println("c += a = " + c);
        c -= a;
        System.out.println("c -= a = " + c);
        c *= a;
        System.out.println("c *= a = " + c);
        a = 10;
        c = 15;
        c /= a;
        System.out.println("c /= a = " + c);
        a = 10;
        c = 15;
        c %= a;
        System.out.println("c %= a = " + c);
        c <<= 2;
        System.out.println("c <<= 2 = " + c);
        c >>= 2;
        System.out.println("c >>= 2 = " + c);
        c >>= 2;
        System.out.println("c >>= a = " + c);
        c &= a;
        System.out.println("c &= 2 = " + c);
        c ^= a;
        System.out.println("c ^= a = " + c);
        c |= a;
        System.out.println("c |= a = " + c);
    }
    
}
