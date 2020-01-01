package view.myToolWindow;

import com.google.common.eventbus.EventBus;

import javax.swing.*;

public class MyToolWindow {
    private JButton refreshToolWindowButton;
    private JButton hideToolWindowButton;
    private JPanel myToolWindowContent;
    EventBus eventBus;
    public MyToolWindow(EventBus bus) {
        this.eventBus=bus;
        refreshToolWindowButton.addActionListener(e -> clearText());
    }

    private void clearText(){
        System.out.println("");
    }
    public JPanel getContent() {
        return myToolWindowContent;
    }
}