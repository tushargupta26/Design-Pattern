package lld.behavioualPattern.commandPattern;

import java.util.Stack;

public class MyRemoteControl {

    Stack<ICommand> acCommandHist = new Stack<>();
    ICommand iCommand;

    MyRemoteControl(){}

    public void setCommand(ICommand iCommand){
        this.iCommand = iCommand;
    }

    public void pressButtion(){
        iCommand.execute();
        acCommandHist.push(iCommand);
    }

    public void undo(){
        while (!acCommandHist.empty()){
            ICommand lasCommand = acCommandHist.pop();
            lasCommand.undo();
        }
    }
}
