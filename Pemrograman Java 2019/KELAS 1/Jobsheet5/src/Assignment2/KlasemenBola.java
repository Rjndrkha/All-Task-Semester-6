/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

/**
 *
 * @author Rajendra Rakha
 */
public class KlasemenBola {

    int indeks;
    Klasemen[] data = new Klasemen[20];

    void tambah(Klasemen m) {
        if (indeks < data.length) {
            data[indeks] = m;
            indeks++;
        } else {
            System.out.println("Data Sudah Penuh");
        }
    }

    void tampil() {
        for (Klasemen m : data) {
            m.tampil();
            System.out.println("	");
        }
    }

    void InsertionSortAscending() {
        int i, j;
        for (i = 1; i < data.length; i++) {
            Klasemen temp;
            temp = data[i];
            j = i;
            while ((j > 0) && (data[j - 1].ptsPoint > temp.ptsPoint)) {
                data[j] = data[j - 1];
                j--;
            }
            data[j] = temp;
        }
    }

    void InsertionSortDescending() {
        int i, j;
        for (i = 1; i < data.length; i++) {
            Klasemen temp;
            temp = data[i];
            j = i;
            while ((j > 0) && (data[j - 1].ptsPoint < temp.ptsPoint)) {
                data[j] = data[j - 1];
                j--;
            }
            data[j] = temp;
        }

    }

    void klubBola() {
        data[0] = new Klasemen();
        data[0].ClubName = "Liverpool";
        data[0].pPlay = 29;
        data[0].gdGoal = 45;
        data[0].ptsPoint = 82;
        data[1] = new Klasemen();
        data[1].ClubName = "Manchester City";
        data[1].pPlay = 27;
        data[1].gdGoal = 39;
        data[1].ptsPoint = 57;
        data[2] = new Klasemen();
        data[2].ClubName = "Leicester";
        data[2].pPlay = 28;
        data[2].gdGoal = 26;
        data[2].ptsPoint = 50;
        data[3] = new Klasemen();
        data[3].ClubName = "Chelsea";
        data[3].pPlay = 29;
        data[3].gdGoal = 9;
        data[3].ptsPoint = 48;
        data[4] = new Klasemen();
        data[4].ClubName = "Wolverhampton Wanderers";
        data[4].pPlay = 29;
        data[4].gdGoal = 7;
        data[4].ptsPoint = 43;
        data[5] = new Klasemen();
        data[5].ClubName = "Shelffield United";
        data[5].pPlay = 28;
        data[5].gdGoal = 5;
        data[5].ptsPoint = 43;
        data[6] = new Klasemen();
        data[6].ClubName = "Manchester United";
        data[6].pPlay = 28;
        data[6].gdGoal = 12;
        data[6].ptsPoint = 42;
        data[7] = new Klasemen();
        data[7].ClubName = "Tottenham Hotspur";
        data[7].pPlay = 29;
        data[7].gdGoal = 7;

        data[7].ptsPoint = 41;
        data[8] = new Klasemen();
        data[8].ClubName = "Arsenal";
        data[8].pPlay = 28;
        data[8].gdGoal = 4;
        data[8].ptsPoint = 40;
        data[9] = new Klasemen();
        data[9].ClubName = "Burnley";
        data[9].pPlay = 29;
        data[9].gdGoal = -6;
        data[9].ptsPoint = 39;
        data[10] = new Klasemen();
        data[10].ClubName = "Crystal Pallace";
        data[10].pPlay = 29;
        data[10].gdGoal = -6;
        data[10].ptsPoint = 39;
        data[11] = new Klasemen();
        data[11].ClubName = "Everton";
        data[11].pPlay = 29;
        data[11].gdGoal = -6;
        data[11].ptsPoint = 37;
        data[12] = new Klasemen();
        data[12].ClubName = "Newcastle United";
        data[12].pPlay = 29;
        data[12].gdGoal = -16;
        data[12].ptsPoint = 35;
        data[13] = new Klasemen();
        data[13].ClubName = "Southampton";
        data[13].pPlay = 29;
        data[13].gdGoal = -17;
        data[13].ptsPoint = 34;
        data[14] = new Klasemen();
        data[14].ClubName = "Brighton & Hove Albion";
        data[14].pPlay = 29;
        data[14].gdGoal = -8;
        data[14].ptsPoint = 29;
        data[15] = new Klasemen();
        data[15].ClubName = "West Ham United";
        data[15].pPlay = 29;
        data[15].gdGoal = -15;
        data[15].ptsPoint = 27;
        data[16] = new Klasemen();
        data[16].ClubName = "Wattford";
        data[16].pPlay = 29;
        data[16].gdGoal = -17;
        data[16].ptsPoint = 27;

        data[17] = new Klasemen();
        data[17].ClubName = "AFC Bournemouth";
        data[17].pPlay = 29;
        data[17].gdGoal = -18;
        data[17].ptsPoint = 27;

        data[18] = new Klasemen();
        data[18].ClubName = "Aston Villa";
        data[18].pPlay = 27;
        data[18].gdGoal = -18;
        data[18].ptsPoint = 25;

        data[19] = new Klasemen();
        data[19].ClubName = "Norwich City";
        data[19].pPlay = 29;
        data[19].gdGoal = -27;
        data[19].ptsPoint = 21;

        for (int i = 0; i < 20; i++) {
            System.out.println("Nama Klub Sepakbola = " + data[i].ClubName);
            System.out.println("Jumlah Bermain (kali) = " + data[i].pPlay);
            System.out.println("Jumlah Goal = " + data[i].gdGoal);
            System.out.println("Jumlah Point = " + data[i].ptsPoint);
            System.out.println();
        }
    }

}
