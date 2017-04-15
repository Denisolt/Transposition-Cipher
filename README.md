## Cesar-Cypher
Date Created: 09/18/2016

Cesar-Cypher is a tool to decrypt/encrypt information. Caesar cipher (or Caesar code) is a shift cipher, one of the most easy and most famous encryption systems. It uses the substitution of a letter by another one further in the alphabet.

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
