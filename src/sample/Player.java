package sample;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Player {
    private String name, number, position;
    private PrintWriter printWriter;
    private ArrayList<Player> playerList = new ArrayList<>();


    public Player(String name, String number, String position) {
        this.name = name;
        this.number = number;
        this.position = position;
    }

    File file = new File("team.csv");

    //    private Player player;
    public Player() {
        try {
//            Scanner scanner = new Scanner(new File("/src/team.csv"));
//            scanner.useDelimiter(",");
//            while(scanner.hasNext()){
//                System.out.print(scanner.next());
//                playerList.add(scanner.next());
//            }
//            scanner.close();
//        } catch (FileNotFoundException e1) {
//            e1.printStackTrace();
//        }
            String line = "";
//            printWriter = new PrintWriter(new FileWriter(file, true));
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
//                playerList.add(line.split(","));
                String[] arr = line.split(",");
                addPlayer(arr[0],arr[1],arr[2]);

            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        printWriter.close();

    }

    public void addPlayer(String name, String number, String position) {
        playerList.add(new Player(name,number,position));
    }
    public void shufflePlayerList(){
        Collections.shuffle(playerList);
    }

//    public String pickGK() {
////        System.out.println(playerList);

    public ArrayList<Player> getPlayerList() {
        return playerList;
    }
////        Collections.shuffle(playerList);
//        System.out.println(playerList);
//        if (playerList.contains("GK")) {
//            return playerList.get(1);
//        }
//        return playerList.get(1);
//    }
//
//    public String pickDF() {
//        Collections.shuffle(playerList);
//        System.out.println(playerList);
//        if (playerList.contains("DF")) {
//            return playerList.get(0);
//        }
//        return playerList.get(0);
//    }
//
//    public String pickMF() {
//        Collections.shuffle(playerList);
//        System.out.println(playerList);
//        if (playerList.contains("MF")) {
//            return playerList.get(0);
//        }
//        return playerList.get(0);
//    }
//
//    public String pickFW() {
//        Collections.shuffle(playerList);
//        System.out.println(playerList);
//        if (playerList.contains("FW")) {
//            return playerList.get(0);
//        }
//        return playerList.get(0);
//    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getPosition() {
        return position;
    }
}
