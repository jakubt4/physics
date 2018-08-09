package physics.world.api;

import java.util.List;
import java.util.Map;

import physics.common.api.Mass;
import physics.world.impl.WorldObject;

public interface WorldApi {

    /**
     * Size of the world.
     *
     * @return size
     */
    WorldSizeApi getSize();

    /**
     * List of all environments in the world
     *
     * @return environments
     */
    List<EnvironmentApi> getEnvironments();

    /**
     * List of all weathers in the world.
     *
     * @return weathers
     */
    List<WeatherApi> getWeathers();

    /**
     * Atmosphere of the world.
     *
     * @return atmosphere
     */
    AtmosphereApi getAtmosphere();

    /**
     * Structure of the world.
     *
     * @return structure
     */
    StructureApi getStructure();

    /**
     * Mass of the world.
     *
     * @return mass
     */
    Mass getMass();

    void addWorldObject(WorldObject worldObject);

    Map<String, WorldObject> getWorldObjects();
}
