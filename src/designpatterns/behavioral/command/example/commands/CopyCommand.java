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
