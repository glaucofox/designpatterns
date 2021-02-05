/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.behavioral.command.example.commands;

import designpatterns.behavioral.command.example.editor.Editor;

/**
 *
 * @author glauc
 */
public class CutCommand extends Command {

    public CutCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.textfield.getSelectedText().isEmpty()) return false;

        backup();
        String source = editor.textfield.getText();
        editor.clipboard = editor.textfield.getSelectedText();
        editor.textfield.setText(cutString(source));
        return true;
    }

    private String cutString(String source) {
        String start = source.substring(0, editor.textfield.getSelectionStart());
        String end = source.substring(editor.textfield.getSelectionEnd());
        return start + end;
    }
}
