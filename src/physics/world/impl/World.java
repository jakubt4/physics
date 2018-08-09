package physics.world.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import physics.common.api.Mass;
import physics.world.api.AtmosphereApi;
import physics.world.api.EnvironmentApi;
import physics.world.api.StructureApi;
import physics.world.api.WeatherApi;
import physics.world.api.WorldApi;
import physics.world.api.WorldObjectListenerApi;
import physics.world.api.WorldSizeApi;

public final class World implements WorldApi {

    private final WorldSizeApi worldSize;
    private final Map<String, WorldObject> worldObjects;
    private final WorldObjectListenerApi listener;

    public World(final WorldSizeApi worldSize, final WorldObjectListenerApi listener) {
        this.worldSize = worldSize;
        this.listener = listener;
        this.worldObjects = new HashMap<>();
    }

    @Override
    public WorldSizeApi getSize() {
        return this.worldSize;
    }

    @Override
    public List<EnvironmentApi> getEnvironments() {
        return null;
    }

    @Override
    public List<WeatherApi> getWeathers() {
        return null;
    }

    @Override
    public AtmosphereApi getAtmosphere() {
        return null;
    }

    @Override
    public StructureApi getStructure() {
        return null;
    }

    @Override
    public Mass getMass() {
        return null;
    }

    @Override
    public void addWorldObject(final WorldObject worldObject) {
        this.worldObjects.put(worldObject.getName(), worldObject);
        this.listener.onAddingWorldObject(worldObject);
    }

    @Override
    public Map<String, WorldObject> getWorldObjects() {
        return this.worldObjects;
    }
}
