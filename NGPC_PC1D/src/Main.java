
import java.util.Scanner;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test>0)
        {
            TreeSet<Integer> ts = new TreeSet<Integer>();
            for(int i=0;i<5;i++)
                ts.add(sc.nextInt());
           int max_one = ts.last();
           ts.remove(max_one);
           int max_two = ts.last();
            System.out.println(max_one*max_two);
            test-=1;
        }
    }
}
