/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encrypting;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Decrypt 
{
    public static void main(String [] args) throws IOException
    {
        File keyfile = new File("key.txt");
        Scanner Key = new Scanner(keyfile);
        String key = "";
        for(int index2 = 0; Key.hasNextLine(); index2++)
        {
            key = key + Key.nextLine();
        }
       char[] KeyArr = key.toCharArray();
       File file = new File("encryptedInfo.txt");
       Scanner inFile = new Scanner(file);
       String line = "";
       for(int i =0; inFile.hasNextLine(); i++)
        {
            line = line + inFile.nextLine();
        }
       char[] cArray = line.toCharArray();
       int[] step1 = new int[cArray.length];
       
       
       for(int k=0; k<cArray.length; k++)
       {
           for(int l=0; l<KeyArr.length; l++)
           {
               if(cArray[k]==KeyArr[l])
                   step1[k] = l;
           }
       }
       
       
       
       //create alphabet
        char[] aplhabet = new char[27];
        aplhabet[0] = ' ';
        int index = 1;
        for (char c = 'a'; c <= 'z'; c++) 
        {
            aplhabet[index++] = c;
        }
       PrintWriter filesWrited = new PrintWriter("decryptedInfo.txt");
       char[] decrypted = new char[cArray.length];
       int index1=0;
       for(int i=0; i<step1.length;i++)
        {
            for(int k=0; k<aplhabet.length;k++)
            {
                 if(step1[i]==k)
                {
                    decrypted[index1] = aplhabet[k] ;
                    filesWrited.print(decrypted[index1]);
                    index1++;
                }
            }
        }
       
//create a txt file with decrypted info?
       filesWrited.close();
        
        
    }
}
