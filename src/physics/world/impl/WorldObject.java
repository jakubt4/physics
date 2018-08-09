package physics.world.impl;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class WorldObject extends JLabel {

    public WorldObject(final String name, final int x, final int y) {
        this.setName(name);
        this.setText("O");
        this.setLocation(x, y);
    }
}
