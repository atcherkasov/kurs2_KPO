package behavioral.b2_mediator.buttons;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ButtonBook extends JButton implements Command {

    Mediator mediator;

    ButtonBook(ActionListener listener, Mediator mediator) {
        super("Book");
        addActionListener(listener);
        this.mediator = mediator;
        mediator.registerBook(this);
    }

    public void execute() {
        mediator.book();
    }
}
