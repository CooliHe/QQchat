package View;

import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * ���д��ڵĸ���
 */
public abstract class Window extends Stage {
    Parent root;
    private double xOffset;
    private double yOffset;

    /**
     * ����ͼ�귽��
     */
    public void setIcon(){

        getIcons().add(new Image(getClass().getResourceAsStream("/View/Fxml/CSS/Image/Icon/qq.gif")));

    }

    /**
     *�����ƶ�����
     */
    public void move() {
        root.setOnMousePressed(event -> {
            xOffset = getX() - event.getScreenX();
            yOffset = getY() - event.getScreenY();
            getRoot().setCursor(Cursor.CLOSED_HAND);

        });
        root.setOnMouseDragged(event -> {

            setX(event.getScreenX() + xOffset);
            setY(event.getScreenY() + yOffset);


        });
        root.setOnMouseReleased(event -> {
            root.setCursor(Cursor.DEFAULT);

        });
    }

    /**
     * ��ȡroot
     *
     * @return
     */
    public Parent getRoot() {
        return root;
    }

    /**
     * ѡ�����Ԫ��
     *
     * @param id
     * @return
     */
    public Object $(String id) {
        return (Object) root.lookup("#" + id);
    }

}