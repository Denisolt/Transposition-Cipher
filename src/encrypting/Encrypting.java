/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encrypting;
import java.util.*;
import java.io.*;
public class Encrypting 
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("text.txt");
        Scanner inFile = new Scanner(file);
        String line = "";
        for(int i =0; inFile.hasNextLine(); i++)
        {
            line = line + inFile.nextLine();
        }
        char[] cArray = line.toCharArray();
        

        char[] aplhabet = new char[27];
        aplhabet[0] = ' ';
        int index = 1;
        for (char c = 'a'; c <= 'z'; c++) 
        {
            aplhabet[index++] = c;
        }
        int index1 = 0;
        int[] step1 = new int[cArray.length];
        for(int i=0; i<cArray.length;i++)
        {
            
            for(int k=0; k<aplhabet.length;k++)
            {
                 if(cArray[i]==(aplhabet[k]))
                {
                    step1[index1] = k;
                    index1++;
                }
            }
        }
        
        //reading a key file
       File keyfile = new File("key.txt");
        Scanner Key = new Scanner(keyfile);
        String key = "";
        for(int index2 = 0; Key.hasNextLine(); index2++)
        {
            key = key + Key.nextLine();
        }
       char[] KeyArr = key.toCharArray();
       String encrypted="";
       for(int k=0; k<cArray.length; k++)
       {
           for(int l=0; l<KeyArr.length; l++)
           {
               if(step1[k]==l)
                   encrypted = encrypted + KeyArr[l];
           }
       }
       PrintWriter filesWrited = new PrintWriter("encryptedInfo.txt");
       filesWrited.print(encrypted);
       filesWrited.close();
       
       
    }
}