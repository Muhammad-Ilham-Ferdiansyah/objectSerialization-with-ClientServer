/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package uts_sisbar_1193019;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.InetAddress;

public class Server {

    public static void main(String args[]) {
        Mahasiswa mhs = null;

	      try {

	         ServerSocket socketConnection = new ServerSocket(11111);

	         System.out.println("Server Is ON..");

	         Socket pipe = socketConnection.accept();

	         ObjectInputStream serverInputStream = new    
	            ObjectInputStream(pipe.getInputStream());

	         ObjectOutputStream serverOutputStream = new 
	            ObjectOutputStream(pipe.getOutputStream());

	         mhs = (Mahasiswa)serverInputStream.readObject();

	         serverOutputStream.writeObject(mhs);
                 
                 System.out.println("Packet Received from " + pipe.getInetAddress());
                 System.out.println("Packet Sending to f:/UTSNo1.txt from " + pipe.getLocalAddress());

	         serverInputStream.close();
	         serverOutputStream.close();


	      }  catch(Exception e) {System.out.println(e); 
	      }
	   }
    }

