## Transposition cipher
Date Created: 09/18/2016

Wiki: In cryptography, a transposition cipher is a method of encryption by which the positions held by units of plaintext (which are commonly characters or groups of characters) are shifted according to a regular system, so that the ciphertext constitutes a permutation of the plaintext. That is, the order of the units is changed (the plaintext is reordered). Mathematically a bijective function is used on the characters' positions to encrypt and an inverse function to decrypt.

## Project Description:
Encrypting and decrypting information using specific generated key in Java.
Using class Keygen, generated key will be created and saved in a key.txt. 
Class Encrypting will read a txt file: "info.txt" and transfer information character by character into array. 
Later class will create an alphabet array and compare input array with the alphabet, 
creating a new array with the position of each character of the input text in the alphabet. 
After that class will read a key.txt file and compare to arrays and encrypt information. 
Decryption class uses the same concept as encryption class. 

## Execution:
Use any JAVA IDE (Netbeans, Eclipse, BlueJ) in order to run or command line:
```
cd Cesar-Cypher/src/encrypting/
javac Encrypting.java
java Encrypting.java
```

This project is an assignment for Graduate Cryptography Class
