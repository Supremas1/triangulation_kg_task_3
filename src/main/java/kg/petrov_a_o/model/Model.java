package kg.petrov_a_o.model;

import kg.petrov_a_o.math.Vector2f;
import kg.petrov_a_o.math.Vector3f;

import java.util.*;

public class Model {
    public String modelName = "";

    public List<Vector3f> vertices = new ArrayList<>();
    public List<Vector2f> textureVertices = new ArrayList<>();
    public List<Vector3f> normals = new ArrayList<>();
    public List<Polygon> polygons = new ArrayList<>();

    public Map<Integer, String> comments = new HashMap<>();
    public Map<Integer, String> materials = new HashMap<>();

    public String mtlFileName = "";
}
