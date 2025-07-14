package com.prashast.fileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) {

        String filepath = "C:\\Users\\HP\\Desktop\\OOPS\\file.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(filepath))){

            String line ;
            while((line = br.readLine())!= null){
                System.out.println(line);
            }
        } catch(FileNotFoundException e){
            System.out.println("Could not locate file");
        } catch(IOException e){
            System.out.println("Something went wrong");
        }
    }
}