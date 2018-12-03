package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PlayerController {
    @FXML
    Button gk,df1,df2,df3,df4,mf1,mf2,mf3,mf4,mf5,fw1,fw2,fw3,button442,button451,button433,button343;
    private Player player;
    private Position442 position442;
    private Position451 position451;
    private Position433 position433;
    private Position343 position343;
    public void initialize(){
        player = new Player();
        position442 = new Position442();
        position451 = new Position451();
        position433 = new Position433();
        position343 = new Position343();
    }
    @FXML
    public void button442OnAction(ActionEvent actionEvent){
        gk.setText(position442.positionGK());
        df1.setText(position442.positionDF());
        df2.setText(position442.positionDF());
        df3.setText(position442.positionDF());
        df4.setText(position442.positionDF());
        mf1.setText(position442.positionMF());
        mf2.setText(position442.positionMF());
        mf3.setText(position442.positionMF());
        mf4.setText(position442.positionMF());
        fw1.setText(position442.positionFW());
        fw2.setText(position442.positionFW());
        position442.clearDupPlayer();
        df1.setLayoutX(40);
        df1.setLayoutY(250);
        df2.setLayoutX(90);
        df2.setLayoutY(250);
        df3.setLayoutX(140);
        df3.setLayoutY(250);
        df4.setLayoutX(190);
        df4.setLayoutY(250);
        mf1.setLayoutX(20);
        mf1.setLayoutY(180);
        mf2.setLayoutX(70);
        mf2.setLayoutY(180);
        mf3.setLayoutX(120);
        mf3.setLayoutY(180);
        mf4.setLayoutX(170);
        mf4.setLayoutY(180);
        mf5.setLayoutX(999);
        mf5.setLayoutY(999);
        fw1.setLayoutX(80);
        fw1.setLayoutY(100);
        fw2.setLayoutX(160);
        fw2.setLayoutY(100);
        fw3.setLayoutX(999);
        fw3.setLayoutY(999);
    }
    @FXML
    public void button451OnAction(ActionEvent actionEvent){
        gk.setText(position451.positionGK());
        df1.setText(position451.positionDF());
        df2.setText(position451.positionDF());
        df3.setText(position451.positionDF());
        df4.setText(position451.positionDF());
        mf1.setText(position451.positionMF());
        mf2.setText(position451.positionMF());
        mf3.setText(position451.positionMF());
        mf4.setText(position451.positionMF());
        mf5.setText(position451.positionMF());
        fw1.setText(position451.positionFW());
        position451.clearDupPlayer();
//        gk.setText(player.pickGK());
        df1.setLayoutX(40);
        df1.setLayoutY(250);
        df2.setLayoutX(90);
        df2.setLayoutY(250);
        df3.setLayoutX(140);
        df3.setLayoutY(250);
        df4.setLayoutX(190);
        df4.setLayoutY(250);
        mf1.setLayoutX(20);
        mf1.setLayoutY(180);
        mf2.setLayoutX(70);
        mf2.setLayoutY(180);
        mf3.setLayoutX(120);
        mf3.setLayoutY(180);
        mf4.setLayoutX(170);
        mf4.setLayoutY(180);
        mf5.setLayoutX(220);
        mf5.setLayoutY(180);
        fw1.setLayoutX(80);
        fw1.setLayoutY(100);
        fw2.setLayoutX(999);
        fw2.setLayoutY(999);
        fw3.setLayoutX(999);
        fw3.setLayoutY(999);
    }
    @FXML
    public void button433OnAction(ActionEvent actionEvent){
        gk.setText(position433.positionGK());
        df1.setText(position433.positionDF());
        df2.setText(position433.positionDF());
        df3.setText(position433.positionDF());
        df4.setText(position433.positionDF());
        mf1.setText(position433.positionMF());
        mf2.setText(position433.positionMF());
        mf3.setText(position433.positionMF());
        fw1.setText(position433.positionFW());
        fw2.setText(position433.positionFW());
        fw3.setText(position433.positionFW());
        position433.clearDupPlayer();
        df1.setLayoutX(40);
        df1.setLayoutY(250);
        df2.setLayoutX(90);
        df2.setLayoutY(250);
        df3.setLayoutX(140);
        df3.setLayoutY(250);
        df4.setLayoutX(190);
        df4.setLayoutY(250);
        mf1.setLayoutX(20);
        mf1.setLayoutY(180);
        mf2.setLayoutX(70);
        mf2.setLayoutY(180);
        mf3.setLayoutX(120);
        mf3.setLayoutY(180);
        mf4.setLayoutX(999);
        mf4.setLayoutY(999);
        mf5.setLayoutX(999);
        mf5.setLayoutY(999);
        fw1.setLayoutX(40);
        fw1.setLayoutY(100);
        fw2.setLayoutX(100);
        fw2.setLayoutY(100);
        fw3.setLayoutX(160);
        fw3.setLayoutY(100);
    }
    @FXML
    public void button343OnAction(ActionEvent actionEvent){
        gk.setText(position343.positionGK());
        df1.setText(position343.positionDF());
        df2.setText(position343.positionDF());
        df3.setText(position343.positionDF());
        mf1.setText(position343.positionMF());
        mf2.setText(position343.positionMF());
        mf3.setText(position343.positionMF());
        mf4.setText(position343.positionMF());
        fw1.setText(position343.positionFW());
        fw2.setText(position343.positionFW());
        fw3.setText(position343.positionFW());
        position343.clearDupPlayer();
        df1.setLayoutX(40);
        df1.setLayoutY(250);
        df2.setLayoutX(90);
        df2.setLayoutY(250);
        df3.setLayoutX(140);
        df3.setLayoutY(250);
        df4.setLayoutX(999);
        df4.setLayoutY(999);
        mf1.setLayoutX(20);
        mf1.setLayoutY(180);
        mf2.setLayoutX(70);
        mf2.setLayoutY(180);
        mf3.setLayoutX(120);
        mf3.setLayoutY(180);
        mf4.setLayoutX(170);
        mf4.setLayoutY(180);
        mf5.setLayoutX(999);
        mf5.setLayoutY(999);
        fw1.setLayoutX(40);
        fw1.setLayoutY(100);
        fw2.setLayoutX(100);
        fw2.setLayoutY(100);
        fw3.setLayoutX(160);
        fw3.setLayoutY(100);
    }

}
