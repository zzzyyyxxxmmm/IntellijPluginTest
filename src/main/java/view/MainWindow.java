package view;

import com.google.common.eventbus.EventBus;
import com.intellij.openapi.ui.SimpleToolWindowPanel;
import com.intellij.openapi.wm.ToolWindow;
import view.contextWindow.ContextWindow;
import view.myToolWindow.MyToolWindow;

import javax.swing.*;
import java.awt.*;

/**
 * @author jikangwang
 */
public class MainWindow {
    private JPanel mainContent = new JPanel(new GridBagLayout());
    private MyToolWindow myToolWindow;
    SimpleToolWindowPanel toolWindowContent = new SimpleToolWindowPanel(true, true);
    private ContextWindow contextWindow = new ContextWindow();

    public MainWindow(ToolWindow toolWindow) {
        EventBus eventBus = new EventBus();
        eventBus.register(contextWindow);
        myToolWindow = new MyToolWindow(eventBus);
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.gridwidth = GridBagConstraints.REMAINDER;

        c.weightx = 1.0;
        c.weighty = 3;
        c.anchor = GridBagConstraints.NORTH;
        mainContent.add(myToolWindow.getContent(), c);


        c.weighty = 1;
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.gridheight = GridBagConstraints.REMAINDER;
        c.anchor = GridBagConstraints.SOUTH;
        mainContent.add(contextWindow.getContent(), c);

        toolWindowContent.setContent(mainContent);
    }

    public JPanel getContent() {
        return toolWindowContent;
    }

}
