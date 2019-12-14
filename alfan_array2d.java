/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mentoringpc;

/**
 *
 * @author Muhammad agus alfan salim hamid
 */
public class tugas {
    public static void main(String[] args) {
          String[][] data = {
        {"| 1  |" , "Muhammad Audi Pramudia \t\t " , "| 1    |"},
        {"| 2  |" , "Juniadi \t\t\t" , "| 2    |"},
        {"| 3  |" , "Muhammad Pandu Surya Pranata \t" , "| 3    |"},
        {"| 4  |" , "Beta Riadi \t\t\t" , "| 4    |"},
        {"| 5  |" , "Muhammad Yusuf Hijrah \t\t" , "| 5    |"},
        {"| 6  |" , "Crishtuaji Satrio Edi Mudjiatmiko", "| 6    |"},
        {"| 7  |" , "Muhammad Agus Alfan Salim Hamid\t", "| 7    |"},
        {"| 8  |" , "Gia Fergio\t\t\t", "| 11   |",},
        {"| 9  |" , "Rifal Hari Topan \t\t" , "| 12   |"},
        {"| 10  |" , "M.Obi Febrian Saputra \t\t" , "| 13   |"},
        {"| 11  |" , "Bangun Akmalul Hakim \t\t" , "| 14   |"},
        {"| 12  |" , "Ibjan Syarif H \t\t\t" , "| 15   |"},
        {"| 13  |" , "Imam Makbul \t\t\t" , "| 16   |"},
        {"| 14  |" , "Khairul Annas \t\t\t" , "| 17   |"},
        {"| 15  |" , "Wahyuddin \t\t\t" , "| 18   |"},
          };
          
        System.out.println("________________________________________________________");
        System.out.println("| No |\t" + "\t Nama" + "\t\t\t\t| Absen|");
        System.out.println("|______________________________________________________|");
        
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1] + "\t" + data[i][2] + "\t");
           System.out.println("|______________________________________________________|");  
        }
        
    }
    }
 

