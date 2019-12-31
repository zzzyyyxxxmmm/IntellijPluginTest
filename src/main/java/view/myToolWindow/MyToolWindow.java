package view.myToolWindow;

import com.google.common.eventbus.EventBus;
import com.intellij.openapi.wm.ToolWindow;
import view.contextWindow.ContextWindow;

import javax.naming.Context;
import javax.swing.*;
import com.intellij.openapi.ui.SimpleToolWindowPanel;

import java.awt.*;

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
        eventBus.post("!!!!!!!!!");
    }
    public JPanel getContent() {
        return myToolWindowContent;
    }
}