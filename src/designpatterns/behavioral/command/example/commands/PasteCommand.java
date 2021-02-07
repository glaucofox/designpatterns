package designpatterns.behavioral.command.example.commands;

import  designpatterns.behavioral.command.example.editor.Editor;

public class PasteCommand extends Command {

    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.clipboard == null || editor.clipboard.isEmpty()) return false;

        backup();
        editor.textfield.insert(editor.clipboard, editor.textfield.getCaretPosition());
        return true;
    }
}
