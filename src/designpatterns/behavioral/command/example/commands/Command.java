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
