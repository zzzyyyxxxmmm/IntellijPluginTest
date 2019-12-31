package view;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import view.myToolWindow.MyToolWindow;

/**
 * @author jikangwang
 */
public class MainWindowFactory implements ToolWindowFactory {
    // Create the tool window content.
    public void createToolWindowContent(Project project, ToolWindow toolWindow) {
        MainWindow myToolWindow = new MainWindow(toolWindow);
        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        Content content = contentFactory.createContent(myToolWindow.getContent(), "", false);
        toolWindow.getContentManager().addContent(content);
    }
}
