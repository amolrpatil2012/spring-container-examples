package com.example.app;

import com.example.beans.TextEditor;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        TextEditor textEditor = context.getBean(TextEditor.class);
        textEditor.getSpellChecker().checkSpell();

    }
}
