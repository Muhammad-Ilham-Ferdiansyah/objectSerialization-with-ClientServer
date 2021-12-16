/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package uts_sisbar_1193019;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;


public class Client {

    public static void main(String args[]) {
      try {
          String fileName = "f:/UTSNo1.txt";
          
            InputStream input = System.in;
        
            InputStreamReader reader = new InputStreamReader(input);
            BufferedReader bufReader = new BufferedReader (reader);

            String nim = "";
            String nama = "";
            String asal = "";
            String kelas = "";
            
            int i = 0;
            System.out.println("\nMasukkan Data anda : ");
            
            System.out.print("Masukkan NIM : ");
                nim = bufReader.readLine();
            System.out.print("Masukkan Nama : ");
                nama = bufReader.readLine();
            System.out.print("Masukkan Asal : ");
                asal = bufReader.readLine();
            System.out.print("Masukkan Kelas : ");
                kelas = bufReader.readLine();
          
		 Mahasiswa mhs = new Mahasiswa(nim, nama, asal,kelas);

                 System.out.println("=======================================");
                 System.out.println("Review Data :");
                 
		 System.out.println("Nim = "
		            + mhs .getMhsNim());
		 System.out.println("Nama = "
		            + mhs .getMhsNama());
                 System.out.println("Asal = "
		            + mhs .getMhsAsal());
                 System.out.println("Kelas Praktikum = "
		            + mhs .getMhsKelasPraktikum());

 		Socket socketConnection = new Socket("127.0.0.1", 11111);


		ObjectOutputStream clientOutputStream = new
                    ObjectOutputStream(socketConnection.getOutputStream());
                ObjectInputStream clientInputStream = new 
                    ObjectInputStream(socketConnection.getInputStream());

		clientOutputStream.writeObject(mhs);

                mhs = (Mahasiswa)clientInputStream.readObject();
                
                FileWriter tulisFile= new FileWriter(fileName);
                tulisFile.write((nim)+ "\n");
                tulisFile.write((nama)+ "\n");
                tulisFile.write((asal)+ "\n");
                tulisFile.write(kelas);
                tulisFile.close();
                
                System.out.println("=======================================");

		System.out.println("Nim = "
		          + mhs .getMhsNim());
		System.out.println("Nama = "
		          + mhs .getMhsNama());
                System.out.println("Asal = "
		          + mhs .getMhsAsal());
                System.out.println("Kelas Praktikum = "
		          + mhs .getMhsKelasPraktikum());
                
                System.out.println("\nData sudah di kirimkan ke file UTSNo1.txt");
                

		clientOutputStream.close();
		clientInputStream.close();

            } catch (Exception e) {
                System.err.println(e); }  
    }
    
}
