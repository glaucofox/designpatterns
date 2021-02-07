package designpatterns.behavioral.command.example.commands;

import designpatterns.behavioral.command.example.editor.Editor;

public abstract class Command {

    public Editor editor;
    private String backup;
    
    Command(Editor editor) {
        this.editor = editor;
    }
    
    void backup() {
        backup = editor.textfield.getText();
    }
    
    public void undo() {
        editor.textfield.setText(backup);
    }
    
    public abstract boolean execute();
    
}
