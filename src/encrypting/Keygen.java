/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encrypting;


import java.util.Random;
import java.util.*;
import java.io.*;

/**
 *
 * @author admin
 */
public class Keygen 
{
    public static void main(String [] args)  throws IOException
    {
        //Create a char array of the alphabet
        char[] aplhabet = new char[27];
        char[] key = new char[27];
        int index = 1;
        for (char c = 'a'; c <= 'z'; c++) 
        {
            aplhabet[index++] = c;
        }
        aplhabet[0]= ' ';
        //Shuffling the array
        for(int i=0; i<aplhabet.length;i++)
        {
            key[i] = aplhabet[i];
        }
        Random rgen = new Random();		
            for (int i=0; i<key.length; i++)
              {
	int randomPosition = rgen.nextInt(key.length);
	char temp = key[i];
	key[i] = key[randomPosition];
                  key[randomPosition] = temp;
                }
        //array Key is generated and shuffled 
        PrintWriter filesWrited = new PrintWriter("key.txt");
        for(int i=0; i<key.length;i++)//for debugging purposes
        {
            filesWrited.print(key[i]);
        }
        filesWrited.close();
        
    }
    
}
