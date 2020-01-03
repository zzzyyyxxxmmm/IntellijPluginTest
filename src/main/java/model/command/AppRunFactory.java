package model.command;

import com.sun.jna.platform.win32.ShellAPI;

/**
 * @author jikangwang
 */
public class AppRunFactory implements AppFactory {
    @Override
    public Command getCommand() {
        return new AppRunCommand();
    }
}
