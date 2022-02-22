package main.lab3.SelectionPanel;

import main.lab3.main.DifficultyMode;

public class WeaponSelectionPanel implements SelectionPanel_IF {

    private DifficultyMode mode;

    public WeaponSelectionPanel(DifficultyMode mode) {
        this.mode = mode;
    }

    @Override
    public void paint() {
        switch (mode) {
            case BEGINNER -> paintBeginner();
            case INTERMEDIATE -> paintIntermediate();
            case ADVANCE -> paintAdvance();
        }
    }

    public void paintBeginner() {
        System.out.println("painting beginner weapon selection model");
    }

    public void paintIntermediate() {
        System.out.println("painting intermediate weapon selection model");
    }

    public void paintAdvance() {
        System.out.println("painting advance weapon selection model");
    }
}
