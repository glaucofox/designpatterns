/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.behavioral.command.example.commands;

import  designpatterns.behavioral.command.example.editor.Editor;

/**
 *
 * @author glaucofox
 */
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
