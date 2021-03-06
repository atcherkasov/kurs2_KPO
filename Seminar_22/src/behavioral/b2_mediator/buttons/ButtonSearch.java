package behavioral.b2_mediator.buttons;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ButtonSearch extends JButton implements Command {

    Mediator mediator;

    ButtonSearch(ActionListener listener, Mediator mediator){
        super("Search");
        addActionListener(listener);
        this.mediator = mediator;
        mediator.registerSearch(this);
    }

    public void execute() {
        mediator.search();
    }
}
