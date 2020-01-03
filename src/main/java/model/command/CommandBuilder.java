package model.command;


import java.util.ArrayList;
import java.util.List;

/**
 * @author jikangwang
 */
public class CommandBuilder {
    List<String> commands=new ArrayList<>();

    private CommandBuilder(){
        //add context command
    }
    public CommandBuilder Builder(){
        return new CommandBuilder();
    }

    public CommandBuilder addCommand(String s){
        commands.add(s);
        return this;
    }

    public String Build(){
        return String.join(" ",commands);
    }
}
