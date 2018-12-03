package sample;

import java.util.ArrayList;

public class Position433 implements Playable {

    private Player player = new Player();
    private ArrayList dupPlayer = new ArrayList();


    @Override
    public String positionGK() {
        player.shufflePlayerList();
        for (int i = 0; i < player.getPlayerList().size(); i++) {
            if (player.getPlayerList().get(i).getPosition().contains("GK")){
                return player.getPlayerList().get(i).getName();
            }
        }
        return "-";
    }

    @Override
    public String positionDF() {
        player.shufflePlayerList();
        for (int i = 0; i < player.getPlayerList().size(); i++) {
            if (player.getPlayerList().get(i).getPosition().contains("DF")){
                if (!dupPlayer.contains(player.getPlayerList().get(i).getName())){
                    dupPlayer.add(player.getPlayerList().get(i).getName());
                    return player.getPlayerList().get(i).getName();
                }

            }
        }
        return "-";
    }

    @Override
    public String positionMF() {
        player.shufflePlayerList();
        for (int i = 0; i < player.getPlayerList().size(); i++) {
            if (player.getPlayerList().get(i).getPosition().contains("MF")){
                if (!dupPlayer.contains(player.getPlayerList().get(i).getName())){
                    dupPlayer.add(player.getPlayerList().get(i).getName());
                    return player.getPlayerList().get(i).getName();
                }

            }
        }
        return "-";
    }

    @Override
    public String positionFW() {
        player.shufflePlayerList();
        for (int i = 0; i < player.getPlayerList().size(); i++) {
            if (player.getPlayerList().get(i).getPosition().contains("FW")){
                if (!dupPlayer.contains(player.getPlayerList().get(i).getName())){
                    dupPlayer.add(player.getPlayerList().get(i).getName());
                    return player.getPlayerList().get(i).getName();
                }

            }
        }
        return "-";
    }
    public void clearDupPlayer(){
        dupPlayer.clear();
    }
}
