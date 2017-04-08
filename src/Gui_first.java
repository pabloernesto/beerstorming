import java.awt.*;

class Gui_first extends Frame {

    Gui_first() {
        Button b = new Button("click me");
        b.setBounds(30,100,80,30);
        add(b);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String args[]) {
        Gui_first f = new Gui_first();
    }
}
