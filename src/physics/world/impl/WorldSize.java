package physics.world.impl;

import physics.world.api.WorldSizeApi;

public final class WorldSize implements WorldSizeApi {

    private final int x;
    private final int y;

    public WorldSize(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }
}
