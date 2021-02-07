package designpatterns.behavioral.command.example.commands;

import designpatterns.behavioral.command.example.editor.Editor;

public class CopyCommand extends Command{
    
    public CopyCommand(Editor editor) {
        super(editor);
    }
    
    @Override
    public boolean execute() {
        editor.clipboard = editor.textfield.getSelectedText();
        return false;
    }
}
