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
    SimpleToolWindowPanel toolWindowContent =new SimpleToolWindowPanel(true, true);
    private ContextWindow contextWindow = new ContextWindow();

    public MainWindow(ToolWindow toolWindow) {
        EventBus eventBus=new EventBus();
        eventBus.register(contextWindow);
        myToolWindow=new MyToolWindow(eventBus);
        mainContent.add(contextWindow.getContent(),new GridBagConstraintsBuilder().fillHorizontal().gridx(0).gridy(0).weightx(1.0).gridwidth(2).build());
        mainContent.add(myToolWindow.getContent(),new GridBagConstraintsBuilder().fillBoth().weightx(1.0).weighty(0.0).gridx(0).gridy(1).build());
        toolWindowContent.setContent(mainContent);
    }

    public JPanel getContent() {
        return toolWindowContent;
    }

}
