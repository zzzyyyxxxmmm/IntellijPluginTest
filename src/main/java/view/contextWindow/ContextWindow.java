package view.contextWindow;

import com.google.common.eventbus.Subscribe;
import com.intellij.openapi.wm.ToolWindow;

import javax.swing.*;
import com.intellij.openapi.ui.SimpleToolWindowPanel;

/**
 * @author jikangwang
 */
public class ContextWindow{
    private JPanel myContextWindowContent;
    private JTextArea jTextArea;

    public ContextWindow() {
    }



    public void currentDateTime() {

    }

    public JPanel getContent() {
        return myContextWindowContent;
    }

    @Subscribe
    public void task(String s) {
       jTextArea.setText(s);
    }
}
