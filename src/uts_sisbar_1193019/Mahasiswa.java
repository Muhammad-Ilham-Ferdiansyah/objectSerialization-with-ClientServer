/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts_sisbar_1193019;

import java.io.*;
import java.util.*;

public class Mahasiswa implements Serializable{

private String mhsNim;
private String mhsNama;
private String mhsAsal;
private String mhsKelasPraktikum;

	   Mahasiswa(String nim, String nama, String asal, String kelasPraktikum) {
	      mhsNim = nim;
	      mhsNama= nama;
              mhsAsal = asal;
              mhsKelasPraktikum = kelasPraktikum;
	   }

	    public String getMhsNim() {
	      return mhsNim ;
	   }

	   public void setMhsNim(String nim) {
	      mhsNim = nim;
	   }

	   public String getMhsNama() {
	      return mhsNama ;
	   }

	   public void setMhsNama(String nama) {
	      mhsNama = nama;
	   }
           
           public String getMhsAsal() {
	      return mhsAsal ;
	   }

	   public void setMhsAsal(String asal) {
	      mhsAsal = asal;
	   }
           
           public String getMhsKelasPraktikum() {
	      return mhsKelasPraktikum ;
	   }

	   public void setMhsKelasPraktikum(String kelasPraktikum) {
	      mhsKelasPraktikum = kelasPraktikum;
	   }
    
}


