package physics.world.impl;

import physics.gui.WorldGUI;

public class WorldObjectMove extends Thread {

    private final WorldObject obj;
    private final WorldGUI worldGUI;

    public WorldObjectMove(final WorldObject obj, final WorldGUI worldGUI) {
        this.obj = obj;
        this.worldGUI = worldGUI;
    }

    @Override
    public void run() {
        while (true) {
            try {
                if (this.obj.getLocation().getY() < (this.worldGUI.getSize().height - 50)) {
                    sleep(50);
                    this.obj.setLocation(this.obj.getLocation().x, this.obj.getLocation().y + 5);
                } else {
                    if (this.obj.getLocation().getY() > (this.worldGUI.getSize().height - 50)) {
                        sleep(10);
                        this.obj.setLocation(this.obj.getLocation().x, this.worldGUI.getSize().height - 50);
                    }
                }
                sleep(1);
            } catch (final InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
